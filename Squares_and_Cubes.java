public class Squares_and_Cubes {

    // Calculating square and cube using methods
    // Calculating Simple Intrest

    public static void main(String[] args) {

        Square(5);

        Cube(3);

        System.out.println(Si(10000,2,0.07));


    }

    static void Square(int x) {
        int sq = x*x;
        System.out.println("The Squaer of "+ x +" is :" + sq);
    }

    static void Cube(int y) {
        int cub = y*y*y;
        System.out.println("The Cube of "+ y +" is :" + cub);
    }

    // We used double here coz if we use int there would be an error of showing conversion error from doubel to int
    // Cox the return type will be double in this case and it would be int in int case

    // This is how you can take multiple inputs in a single method...
    static double Si(double p,double t ,double r) {
        return p*t*r;
    }

    // whenever you use int or double you should necessary the respective type of data at the end

}
