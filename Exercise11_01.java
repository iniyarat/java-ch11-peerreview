/*
Program: Chapter 11 Peer Review
Programmer: Iniya Rathinakumar
Date: October 27, 2026
Purpose: Creates a Triangle object and displays its area, perimeter, color, and filled status.
*/

public class Exercise11_01 {
    /**
     * Runs the program and tests the Triangle class.
     * @param args command-line arguments
    */
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);

        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("Is the triangle filled? " + triangle.isFilled());
        System.out.println(triangle);
    }
}

/**
 * Represents a geometric object with a color and filled status.
*/
class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Constructs a default geometric object.
     */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Constructs a geometric object with the specified color and filled status.
     * @param color the object's color
     * @param filled whether the object is filled
     */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Returns the object's color.
     * @return the object's color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the object's color.
     * @param color the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns whether the object is filled.
     * @return true if the object is filled; otherwise, false
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Sets whether the object is filled.
     * @param filled true if the object should be filled; otherwise, false
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Returns the date the object was created.
     * @return the creation date
     */