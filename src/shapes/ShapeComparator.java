/* File: ShapeComparator.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package shapes;

import java.util.Comparator;

/**
 * ShapeComparator class that implements the Comparator interface. Used to sort
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class ShapeComparator implements Comparator<Shape>
{

    /**
     * Overridden compare method from the Comparator Interface. Compares two
     * shapes for order. Returns a positive integer, zero, or a negative integer
     * as this shape is less than, equal to, or greater than the specified
     * shape by descending distance from the origin.
     *
     * @param s1 First Shape object to compare to.
     * @param s2 Second Shape object to compare to.
     * @return Returns a positive integer, zero, or a negative integer.
     */
    @Override
    public int compare(Shape s1, Shape s2)
    {

        if (s1.getDistance() < s2.getDistance())
        {
            return 1;
        } else if (s1.getDistance() > s2.getDistance())
        {
            return -1;
        } 
        else
        {
            return 0;
        }
    }
}//end of ShapeComparator.java
