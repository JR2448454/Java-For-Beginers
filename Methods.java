public class Methods {
    // Methods are same as functions in python
    //They help in reducing complexity
    public static void main(String[] args) {

        // How to call a method
        // In this we are calling the method hello world that we have created below
        HelloWorld();

        // Here we are calling the method R5
        // Which will return the value 5 and stored in a variable x
        int x = R5();
        System.out.println(x);

        //calling method with out given input
        Takename("Jay");


    }

    // This is how we create a Method
    static void HelloWorld() {
        System.out.println("Hello World!!!");
    }

    // We use int in place of void when we want the function or method to return some value
    static int R5() {
        return 5;
    }

    // How to give values within a funciton
    // Here the paramater given inside the method is a variable having data type of string and named as name
    static void Takename(String name) {
        System.out.println("Hello " + name);
    }
}
