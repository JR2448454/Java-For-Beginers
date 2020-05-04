public class Operators {
    // Relational Operator
    // Equals to ==
    // Greater than >
    // Less than <
    // Greater than equalto >=
    // Less than equalto <=
    // Not equal to !=

    // Logical Operator
    // and &&   double amm percent
    // or ||    pipe symbol
    // not !    exclamation not is used as !(condition) i.e not first and then condition

    // Algebric Operators
    // Addition +
    // Subraction -
    // Multiply *
    // Divide /
    // Modulus %  i..e Remainder




    public static void main(String[] args) {

        AlgebricOperator();
        LogicalOperator();
        RelationalOperator();

    }

    static void AlgebricOperator() {
        int x = 5;
        int y = 10;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y); // Here y is divisor and x is divident
    }

    static void RelationalOperator() {
        String x = "Rathod";
        String y = "Jay";

        System.out.println(x==y);
        System.out.println(x!=y);

        // We cannot compare strings as greater than or less than in java

    }

    static void LogicalOperator() {
        boolean x=  true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!(x && y));



    }






}
