import java.util.Scanner;
public class Circle_Area {
    public static void main(String[] args) {

    //Get radius
        double radius = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter value for radius: ");
        radius = kb.nextDouble();

    //Calculate area
        final double PI = 3.14159 ;
        double area = PI * radius * radius ;

    //Output result
        System.out.print("The area is " + area);

        kb.close();
    }
}
