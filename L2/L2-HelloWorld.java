// We can write JAVA code in JSHELL --> 
//     Termina --> jshell 
//     System.out.print("Hello World");

class Hello{
    public static void main(String a[]){
        System.out.println("Hello world");
    }
}


// Steps to Write Java codes- 
//     user writes java codes in .java files
//     .java file code is compiled by javac compiler to bytecode as .class files which is machine independent
//     .class file is converted to .exe file by JVM which is machine dependent.
//     JRE executes .exe files 

//     JVM + Liabraries == JRE 
//     JRE + Java Compiler + Java debuggers == JDK

// Rules for every .java file
//     Java is OOP based hence every file must have a class, further the class can have methods or properties.
//     The initial file for execution must have a --> public static void main(String a[]) function, this is the starting point for execution.