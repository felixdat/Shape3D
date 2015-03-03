/* File: Point3D.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

/**
 * Represent a point in Three-Dimensional space. Point3D class has private int
 * instance variables x, y, and z, to store the coordinates of the point, a
 * constructor, an overridden toString() method to return the coordinates as a
 * String, and “get” methods that return the values of each of the instance
 * variables.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class Point3D
{

    //instance variables
    private int x, y, z;

    /**
     * Point3D constructor taking parameters for the x, y, z coordinates of the
     * center.
     *
     * @param x
     * @param y
     * @param z
     */
    public Point3D(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Overridden toString method. Returns the coordinates of the center point
     * as a string.
     *
     * @return Returns the point's coordinates as a string.
     */
    @Override
    public String toString()
    {
        return x + ", " + y + ", " + z;
    }

    /**
     * Accessor method to return the value of X axis.
     *
     * @return Returns the value of X.
     */
    public int getX()
    {
        return x;
    }

    /**
     * Accessor method to return the value of Y axis.
     *
     * @return Returns the value of Y.
     */
    public int getY()
    {
        return y;
    }

    /**
     * Accessor method to return the value of Z axis.
     *
     * @return Returns the value of Z.
     */
    public int getZ()
    {
        return z;
    }
}//end of Point3D.java
