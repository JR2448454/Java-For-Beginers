public class Scope {

    // Lets understand why we are writing this program
    // If we create or declare any variable instide a method it is specific to that method only
    // But what if we want to use that variabel throughout the class
    // So we create a variable like this

    static int x; //declaring a variabel to be used throughout the class
    // Now this variabel can be used throughout the class without declaring it again and again

    public static void main(String[] args) {
        // Here we have used x without declaring x
        x = 5; // calling the declared variable
        System.out.println(x);

        valu();
    }

    static void valu() {
        // Here we have used x without declaring x
        x = 10;
        System.out.println(x);
    }
}

