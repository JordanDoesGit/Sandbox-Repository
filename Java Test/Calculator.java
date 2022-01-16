public class Calculator {
    public static void main(String[] args) {
        //circumference and area of a circle
        //perimeter and area of a rectangle

        //CIRCLE
        double radius = 10;
        double PI = 3.14;

        // circle circumference (2*PI*radius)
        double cirCir = 2 * PI * radius;
        // circle area (PI*radius*radius
        double cirArea = PI * radius * radius;

        // RECTANGLE
        double length = 17;
        double width = 14;
        // rectangle perimeter 2 * length + 2 * width
        double recPerim = 2 * length + 2 * width;
        // double recPerim = 2 * (length + width)
        // rectangle area (length 8 width)
        double recArea = length * width;

        // PRINT STATEMENTS
        // System.out.print vs System.out.println (line)
        System.out.print("Circle Circumference: " + cirCir);
        System.out.println("CircleArea: " + cirArea);
        System.out.println("Rectangle Perimeter: " + recPerim);
        System.out.println("Rectangle Area: " +recArea);
    }
}
