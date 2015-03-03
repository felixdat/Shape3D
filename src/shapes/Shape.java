/* File: Shape.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

/**
 * Shape is an abstract class to represent a 3D Shape. Has a private member
 * object that stores the center of the shape. Overrides the toString method.
 * Has concrete method that computes and returns the distance of the center of
 * the shape from the origin, 0, 0, 0. Has two abstract methods that compute and
 * return the surface area. Implements Java's Comparable interface so that Shape
 * objects are ordered by ascending volume.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public abstract class Shape implements Comparable<Shape>
{

    //instance variables
    private Point3D point;

    /**
     * Shape constructor taking parameters for the x, y, z coordinates of the
     * center.
     *
     * @param x X axis value.
     * @param y Y axis value.
     * @param z Z axis value.
     */
    public Shape(int x, int y, int z)
    {
        point = new Point3D(x, y, z);
    }

    /**
     * Overridden toString method. Returns the coordinates of the center point
     * as a string.
     *
     * @return Returns the point's coordinates by going to the Point3D's
     * toString method.
     */
    @Override
    public String toString()
    {
        return point.toString();
    }

    /**
     * Overridden compareTo method from the Comparable Interface. Compares this
     * shape with the specified shape for order. Returns a negative integer,
     * zero, or a positive integer as this shape is less than, equal to, or
     * greater than the specified shape by ascending volume.
     *
     * @param s1 Shape object to compare to.
     * @return Returns a negative integer, zero, or a positive integer.
     */
    @Override
    public int compareTo(Shape s1)
    {

        if (this.getVolume() < s1.getVolume())
        {
            return -1;
        }
        if (this.getVolume() > s1.getVolume())
        {
            return 1;
        } 
        else
        {
            return 0;
        }
    }

    /**
     * Concrete method that computes and returns the distance of the center of
     * the shape from the origin.
     *
     * @return Returns the distance of the center from the origin.
     */
    public double getDistance()
    {
        //Uses the Pythagorean Theorem to solve for the distance.
        return Math.sqrt((Math.pow(point.getX(), 2))
                + (Math.pow(point.getY(), 2)) + Math.pow(point.getZ(), 2));
    }

    /**
     * Abstract method for finding the surface area of a shape object.
     *
     * @return Returns the surface area for a shape.
     */
    public abstract double getArea();

    /**
     * Abstract method for finding the volume of a shape object.
     *
     * @return Returns the volume for a shape.
     */
    public abstract double getVolume();
}//end of Shape.java
