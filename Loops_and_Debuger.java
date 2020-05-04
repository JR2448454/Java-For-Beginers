import javax.swing.*;

public class Loops_and_Debuger {

    // The most basic loop is the while loop
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("Program one :\n\n");
        while (counter < 10) {
            System.out.println(counter);
            counter = counter +1;
        }
        counter = 1;
        System.out.println("\n\nProgram two :\n\n");
        while (counter < 10) {
            counter = counter + 1;
            System.out.println(counter);

        dowhileloop();
        forloop();

        }
    }
// In this program we expected both code to print numbers till 10
    // but we got numbers till 9 in the  first program
    // coz the value printed and then the counter increased

    // To make this explain in a clear way we would use debuger
    // How to use the debuger
    // first click on the index number at one
    // find the bug icon and press it
    // then find an jump down arrow named step over
    // press on clicking it and it will show how the program is actually working


    // for loop
    static void forloop() {
        System.out.println("\n\nfor loop\n\n");
        // for (initialize counter ; condition ; counter increment) { statements to be executed }
        for (int forcounter = 0; forcounter < 10; forcounter = forcounter + 1) {
            System.out.println(forcounter);
            //here the steps are conducted in the following manner
            // int for conter =0
            // forcounter < 10
            // System.out.println(forcounter)
            // forcounter = forcounter + 1
        }
    }


    // do while loop
    static void dowhileloop() {
        // this is the loop that executes at least once even if it dosen't passes the condition
        //coz the condition gets checked after executing executing the statements
        int docounter = 0;
        System.out.println("\n\ndo while loop\n\n");
        do {
            docounter = docounter + 1;
            System.out.println(docounter);
        } while (docounter < 10);
    }
}
