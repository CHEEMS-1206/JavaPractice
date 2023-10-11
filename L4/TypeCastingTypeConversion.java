class TypeCastingTypeConversion {
    public static void main(String a[]){
        // Explicit -- Casting
        int a4  = 234;
        byte b = (byte)a4;
        System.out.println(b);

        float fl = 23.56f;
        int flTi = (int)fl;
        System.out.println(flTi);

        // Type promotion
        int var1_5 = 23456789, var2_5 = 234567899;
        long ans = var1_5 * var2_5;
        System.out.println(ans);
    }
}

// Explicit conversion is called casting
// It can be done by 
//      varName2 = (dataTypeToWhichCasting)varName1;
//      Downsides are that --> we lose decimal portions when converting float/double to int.
                            // We can only store value as modulous by range of the datatype.

// Implicit conversion is called conversion 
// It is done automatically by java when we assign larger data type var to smaller data type var.
//      byte a = 12;
//      int b = 234;
//      b = a; --> larger space can accomodate smaller spaces.
//      a = b; --> error as smaller space cant accomodate the larger value.
//      a = (byte)b; --> explicit conversion takes place and b%range of data type to which converted is stored in other var.

// Type promotions - if the value after operations on 2 smaller datatypes exceed their range we can store the result in larger data types.
//      byte a=22, b=29;
//      int result = a*b; --> type promoion