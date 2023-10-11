class Variables {
    public static void main(String a[]){

        System.out.println("All Data Types --> ");

        // Integers
        byte byt = 2;
        short sh = 23;
        int in = 567;
        long lng = 456l; // use l as suffix 

        // Floats
        float flt = 5.23f; // use f as suffix
        double dbl = 45.568;

        // Characters
        char ch = 't'; // string in "" and char in ''

        // Booleans
        boolean bl = true; // either true or false, true != 1/0 and false != 1/0 

        // Storing binary(0b) or hex(0x) 
        int bin = 0b101, hex = 0x12;
        System.out.println(hex);
        System.out.println(bin);

        // storing value by dintinguishing
        int bigVal = 1_00_00_000;
        double biggerVal = 12E5; // scintific notation on the go support
        System.out.println(bigVal);
        System.out.println(biggerVal);

        // literals - every value in java is treated as literals.
    }
}

// Java is a strongly typed language 

// for creating variables -->
//     datatype varName = value;

// Some datatypes are --> 
//     Primitive -->
//         Integer --> byte(1), short(2), int(4), long(8)
//         Floats --> double(8), float(4)
//             doubles have more precision than floats hence java supports doubles by default.
//         Character --> char(2), ' Single qoutes used '
//             chars in java follow UNICODE and not the ASCII and hence it takes 2 bytes of storage.
//         Boolean --> boolean(1)
//             java supports only two keywords True / False for bools
//     
//      User Defined --> 

