public class DTandVariables {
    public static void main(String[] args) {
        // Declaration of variable is in the format datatype and then variable name
        // int data type
        int Var1; // You could also comment after the code
        // Declaring value to the variable
        Var1 = 25;
        // you could also create and declare variable in a single line
        int var2 = 50;

        //printing variables value
        System.out.println(Var1);
        System.out.println(Var1+var2);

        // double data type
        // double means float
        // You can convert int to double but not  double to int

        double var3 = 2.54;
        System.out.println(var3 + var2);
        // we can add a double and an int
        // Remember to end every statement with semi colon;

        //string data type
        // Remember the S in String is capital
        String var4 = "Hello ";
        String var5 = "Jay";

        System.out.println(var4);
        System.out.println(var5);

        System.out.print(var4);
        System.out.print(var5+"\n");  //string concat and escape sequence in one line
        //\n is for new line
        // Its called Escape sequence




        System.out.println(var4+var5); //string concatenation

        // Boolean data type
        // t and f are small

        boolean x = true;
        System.out.println(x);

        boolean y = false;
        System.out.println(y);


        // you can print each thing on same line by using
        //System.out.print();
        // and each thing on new line
        //System.out.println();


        //Difference Between Double and float
        // double is more precise than float
        // i.e double can store an longer length of number after the decimal point
        // but there is a point that double takes more size than float almost double the size of bits of float
        // double is of 64 bits
        // float is of 32 bits
        // Thats why we have to choose wisely what to use
        // i.e mostly use double when you want more precision

    }
}
