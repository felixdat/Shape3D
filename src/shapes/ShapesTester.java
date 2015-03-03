/* File: ShapesTester.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

import java.util.Arrays;

/**
 * Create 3D objects and create point in 3D space. Define an Abstract class to
 * represent a 3D shape. Derive Concrete Subclasses for Sphere, Parallelepiped,
 * Cylinder, and Cone Shapes. Write a Driver class to test Shape Hierarchy.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class ShapesTester
{

    /**
     * Create an array of 3D shaped object passing a x, y, z coordinates and
     * other input data such as radius and height, depending on the object.
     * Tranverse the array printing information about each object in the shapes
     * array. Sort array in ascending order by volume. Tranverse the array,
     * printing the shape and its volume. Sort the array again but by descending
     * order by the distance from the origin. Tranverse the array, printing the
     * shape and its distance from the origin.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        //Creating array of Shape objects, loading 3D shapes with parameters.
        Shape[] shapes = new Shape[]
        {
            new Sphere(2, -5, 8, 13),
            new Parallelepiped(7, 9, 2, 37, 12, 9),
            new Cylinder(3, 4, -5, 11, 13),
            new Cone(-5, -2, 1, 10, 14)
        };

        //Printing inital array in a visual array style.
        System.out.print("Unsorted array: ");
        for (Shape shape : shapes)
        {
            System.out.print("|" + shape.getClass().getSimpleName());
        }
        System.out.println("|\n");

        //Tranverse array, printing input data, surface area, and volume.
        for (Shape shape : shapes)
        {
            System.out.println(shape + "\n" + "Surface area: "
                    + shape.getArea() + "\nVolume: "
                    + shape.getVolume() + "\n");
        }

        //Sort the array by ascending volume.
        Arrays.sort(shapes);

        //Printing sorted array in a visual array style.
        System.out.print("Sorted array by ascending volume: ");
        for (Shape shape : shapes)
        {
            System.out.print("|" + shape.getClass().getSimpleName());
        }
        System.out.println("|\n");

        //Tranverse array, printing shape's name and volume.
        for (Shape shape : shapes)
        {
            System.out.println(shape.getClass().getSimpleName()
                    + "\nVolume: " + shape.getVolume());
        }

        //Sort the array by descending distance from the origin via Comparator.
        Arrays.sort(shapes, new ShapeComparator());

        //Printing sorted array in a visual array style.
        System.out.print("\nSorted array by descending distance from the"
                + " origin: ");
        for (Shape shape : shapes)
        {
            System.out.print("|" + shape.getClass().getSimpleName());
        }
        System.out.println("|\n");

        //Tranverse array, printing shape's name and distance from the origin.
        for (Shape shape : shapes)
        {
            System.out.println(shape.getClass().getSimpleName()
                    + "\nDistance from Origin: " + shape.getDistance());
        }
    }//end of main
}//end of ShapesTester.java
