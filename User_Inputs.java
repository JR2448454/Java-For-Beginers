import java.util.Scanner;

public class User_Inputs {
    public static void main(String[] args) {

        // To take inputs from user we need to import java.util.Scanner;
        LearnInput();


    }

    static void LearnInput() {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter second number- ");
        int b= sc.nextInt();
        System.out.print("Enter third number- ");
        int c= sc.nextInt();
        int d=a+b+c;
        System.out.println("Total= " + d);
    }

}
