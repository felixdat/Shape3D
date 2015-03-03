/* File: Sphere.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

/**
 * 3D Sphere object, subclass of Shapes superclass by Inheritance. Constructor
 * takes parameters for the x, y, z coordinates of the center and the radius.
 * Implements the methods that compute/return the surface area and the volume.
 * Overrides the toString to return a string containing the class name,
 * coordinates of the center, and radius.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class Sphere extends Shape
{

    //instance variables
    private int radius;

    /**
     * Sphere constructor taking parameters for the x, y, z coordinates of the
     * center and the radius.
     *
     * @param x X axis value.
     * @param y Y axis value.
     * @param z Z axis value
     * @param r Radius for sphere 3D object.
     */
    public Sphere(int x, int y, int z, int r)
    {
        //call the superclass constructor
        super(x, y, z);
        this.radius = r;
    }

    /**
     * Overridden toString method. Returns data of the sphere object.
     *
     * @return Returns 3D Sphere's name, center point, and radius.
     */
    @Override
    public String toString()
    {
        return getClass().getSimpleName()
                + "\nCenter point: " + super.toString()
                + "\nRadius: " + radius;
    }

    /**
     * Overridden getArea method from the inherited Shape superclass. 4 ∏ r2
     *
     * @return Returns the area of the sphere.
     */
    @Override
    public double getArea()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Overridden getVolume from the inherited Shape superclass. 4/3 ∏ r3
     *
     * @return Returns the volume of the sphere.
     */
    @Override
    public double getVolume()
    {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}//end of Sphere.java
