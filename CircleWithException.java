import java.util.Scanner;

public class CircleWithException {
    private double radius;

    public CircleWithException(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("Input not a positive number");
        }
        else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw new IllegalArgumentException("Input not a positive number");
        }
        else {
            this.radius = radius;
        }
    }

    public double getArea() throws Exception {
        double area = Math.PI * Math.pow(this.radius, 2);
        if(area > 1000){
            throw new Exception("Area is larger than 1000");
        }
        else{
            return area;
        }
    }

    public double getDiameter(){
        return 2 * this.radius;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter radius: ");
            double radius = input.nextDouble();
            CircleWithException circle1 = new CircleWithException(radius);
            double area = circle1.getArea();
            double diameter = circle1.getDiameter();
            System.out.println("Area: " + area);
            System.out.println("Diameter: " + diameter);
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal Argument: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
