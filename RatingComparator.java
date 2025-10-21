/**
 * Title: RatingComparator.java
 * Description: Comparator class used to compare Song objects based on their rating.
 * This class implements the Comparator interface to define a custom sorting logic.
 *
 * Author: Auto-commented by ChatGPT Innovation Coach
 */

import java.util.Comparator;

/**
 * RatingComparator provides a comparison mechanism for sorting Song objects
 * in descending order of rating. It is typically used with collections that
 * require custom sort logic, like Collections.sort() or TreeSet.
 */
public class RatingComparator implements Comparator<Song> {  

    /**
     * Compares two Song objects based on their rating.
     * @param s1 The first Song to compare
     * @param s2 The second Song to compare
     * @return a negative integer, zero, or a positive integer as the first argument
     *         is greater than, equal to, or less than the second.
     */
    @Override
    public int compare(Song s1, Song s2) {
        // Compare in descending order (higher rating first)
        return Double.compare(s2.getRating(), s1.getRating());
    }
}
