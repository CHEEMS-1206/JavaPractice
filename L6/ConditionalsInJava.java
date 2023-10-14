class ConditionalsInJava {
    public static void main(String a[]){
        // Conditionals if, else, else if
        int condition = 2;

        if(condition == 1){
            System.out.println("True");
        }else if(condition == 2){
            System.out.println("2");
        }else{
            System.out.println("False");
        }

        int dayNum = 3;
        // Switch case in java
        switch(dayNum){
            case 1: 
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default :
                System.out.println("Other");
        }

        // new switch case in advanced java
        // --> Earlier before JAVA5 only int were supported in switch, but after JAVA5 Strings are also supportde. 
        // --> Earlier we had to put break statements else all blocks of code beyond case match gets executed
        // --> now we dont have to do write breaks after JAVA12 as we can use the arrow (->) operator. 
        String day = "Monday";

        switch(day){
            case "Sunday", "Tuesday" -> System.out.println("Todays is either Sunday or Tuesday");
            case "Wednesday", "Monday" -> System.out.println("Todays is either Wednesday or Monday");
            // Case statement can be provided comma separated multiple values for comparision
            // by using -> operator we dont have to write break statements
        }

        // Switch as an expression -> internal assignment, -> extrenal assignment, ->yield keyword and : or -> operator.
        String grade = "A";
        int result1, result2, result3;

        switch(grade){
            case "A" -> result1 = 90; // using switch as expressions
            case "B" -> result1 = 75; // updating variables inside
            default -> result1 = 50;
        }
        result2 = switch(grade){
            case "A" -> 90; // using switch as expressions
            case "B" -> 75; // returning the value for outside var updation
            default -> 50; // no return keyword required
        }; // as its now an expression hence ; is used here

        result3 = switch(grade){
            case "A" : yield 90; // using switch as expressions
            case "B" : yield 75; // returning the value for outside var updation
            default : yield 50; // yield keyword required as we using : operator
        }; // as its now an expression hence ; is used here

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}