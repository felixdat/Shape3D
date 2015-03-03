/* File: Parallelepiped.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

/**
 * 3D Parallelepiped object, subclass of Shapes superclass by Inheritance.
 * Constructor takes parameters for the x, y, z coordinates of the center and
 * the length, the width, and the height. Implements the methods that
 * compute/return the surface area and the volume. Overrides the toString to
 * return a string containing the class name, coordinates of the center, and
 * length, the width, and the height.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class Parallelepiped extends Shape
{

    //instance variables
    private int length, width, height;

    /**
     * Parallelepiped constructor taking parameters for the x, y, z coordinates
     * of the center and the length, the width, and the height.
     *
     * @param x X axis value.
     * @param y Y axis value.
     * @param z Z axis value.
     * @param l Length for Parallelepiped 3D object.
     * @param w Width for Parallelepiped 3D object.
     * @param h Height for Parallelepiped 3D object.
     */
    public Parallelepiped(int x, int y, int z, int l, int w, int h)
    {
        //call the superclass constructor
        super(x, y, z);
        length = l;
        width = w;
        height = h;
    }

    /**
     * Overridden toString method. Returns data of the Parallelepiped object.
     *
     * @return Returns 3D Parallelepiped's name, center point, length, width,
     * and height.
     */
    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "\nCenter point: "
                + super.toString() + "\nLength: " + length
                + "\nWidth: " + width + "\nHeigth: " + height;
    }

    /**
     * Overridden getArea method from the inherited Shape superclass. 2lw + 2lh
     * + 2wh
     *
     * @return Returns the area of the Parallelepiped.
     */
    @Override
    public double getArea()
    {
        return (2 * length * width) + (2 * length * height)
                + (2 * width * height);
    }

    /**
     * Overridden getVolume from the inherited Shape superclass. L*W*H
     *
     * @return Returns the volume of the Parallelepiped.
     */
    @Override
    public double getVolume()
    {
        return length * width * height;
    }
}//end of Parallelepiped.java
