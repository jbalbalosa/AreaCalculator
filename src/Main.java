public class Main {
    public static void main(String[] args) {

       System.out.println( Area(5.0));
       System.out.println( Area(-1));
       System.out.println( Area(5.0,4.0));
       System.out.println( Area(-1.0,4.0));
    }

    public static double Area(double radius){
        if (radius < 0){
            return -1;
        }
        return radius * 3.141592653589793;
    }

    public static double Area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }

        return x * y;
    }
}
