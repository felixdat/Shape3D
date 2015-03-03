/* File: Cylinder.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

/**
 * 3D Cylinder object, subclass of Shapes superclass by Inheritance.
 * Constructor takes parameters for the x, y, z coordinates of the center and
 * the radius and the height. Implements the methods that compute/return the
 * surface area and the volume. Overrides the toString to return a string
 * containing the class name, coordinates of the center, and radius and the
 * height.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class Cylinder extends Shape
{

    //instance variables
    private int radius, height;

    /**
     * Cylinder constructor taking parameters for the x, y, z coordinates of the
     * center and the radius and height.
     *
     * @param x X axis value.
     * @param y Y axis value.
     * @param z Z axis value.
     * @param r Radius value of Cylinder.
     * @param h Height value of Cylinder.
     */
    public Cylinder(int x, int y, int z, int r, int h)
    {
        //call the superclass constructor
        super(x, y, z);
        radius = r;
        height = h;
    }

    /**
     * Overridden toString method. Returns data of the Cylinder object.
     *
     * @return Returns the 3D Cylinder's name, center point, radius and height.
     */
    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "\nCenter point: "
                + super.toString() + "\nRadius: " + radius
                + "\nHeight: " + height;
    }

    /**
     * Overridden getArea method from the inherited Shape superclass. 2 ∏ r2 + 2
     * ∏ r h
     *
     * @return Returns the area of the Cylinder.
     */
    @Override
    public double getArea()
    {
        return (2 * Math.PI * Math.pow(radius, 2))
                + (2 * Math.PI * radius * height);
    }

    /**
     * Overridden getVolume from the inherited Shape superclass. ∏ r2 h
     *
     * @return Returns the volume of the Cylinder.
     */
    @Override
    public double getVolume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}//end of Cylinder.java
