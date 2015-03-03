/* File: Cone.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

/**
 * 3D Cone object, subclass of Shapes superclass by Inheritance. Constructor
 * takes parameters for the x, y, z coordinates of the center and the radius and
 * the height. Implements the methods that compute/return the surface area and
 * the volume. Overrides the toString to return a string containing the class
 * name, coordinates of the center, and radius and the height.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class Cone extends Shape
{

    //instance variables
    private int radius, height;

    /**
     * Cone constructor taking parameters for the x, y, z coordinates of the
     * center and the radius and height.
     *
     * @param x X axis value.
     * @param y Y axis value.
     * @param z Z axis value.
     * @param r Radius value of Cone.
     * @param h Height value of Cone.
     */
    public Cone(int x, int y, int z, int r, int h)
    {
        //call the superclass constructor
        super(x, y, z);
        radius = r;
        height = h;
    }

    /**
     * Overridden toString method. Returns data of the Cone object.
     *
     * @return Returns 3D Cone's name, center point, radius and height.
     */
    @Override
    public String toString()
    {
        return getClass().getSimpleName()
                + "\nCenter point: " + super.toString()
                + "\nRadius: " + radius + "\nHeight: "
                + height;
    }

    /**
     * Overridden getArea method from the inherited Shape superclass. ∏ r(r +√
     * r2 + h2)
     *
     * @return Returns the area of the Cone.
     */
    @Override
    public double getArea()
    {
        return Math.PI * radius * (radius + (Math.sqrt(Math.pow(radius, 2)
                + Math.pow(height, 2))));
    }

    /**
     * Overridden getVolume from the inherited Shape superclass. ∏ r2 h/3
     *
     * @return Returns the volume of the Cone.
     */
    @Override
    public double getVolume()
    {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }
}//end of Cone.java
