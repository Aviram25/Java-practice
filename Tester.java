package day5;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

// Main class to demonstrate operations on a collection of Songs
public class Jaruri {

    // Main method to execute various operations like sorting, searching, and filtering songs
    public static void main(String[] args) {
        // Retrieve the list of songs from SongsCollection
        List<Songs> songlist = SongsCollection.getSongsData();
        // Print the initial list of songs
        SongsCollection.printList(songlist);
        
        // Sort songs by title using TitleComparator
        System.out.println("------Sort by Song title--------");
        Collections.sort(songlist, new TitleComparator());
        // Print the sorted list
        SongsCollection.printList(songlist);
        
        // Search for a song by title using binary search
        System.out.println("------Search by Song title--------");
        // Note: Binary search requires the list to be sorted by title, which was done above
        // Searching for a song with title "Sundar" (other attributes are dummy values)
        int found = Collections.binarySearch(songlist, new Songs(0, "Sundar", null, 0, 0));
        // Print the list again (though this may be redundant)
        SongsCollection.printList(songlist);
        // Print the index where the song was found (or negative value if not found)
        System.out.println("Data found at index: " + found);
        
        // Filter songs by release year
        System.out.println("-----------Filter by Release Year-------");
        List<Songs> filtered = SongsCollection.filterByYear(songlist, 2025);
        // Print the filtered list of songs released in 2025
        System.out.println(filtered);
        
        // Filter songs by artist
        System.out.println("-----------Filter by Artists-------");
        List<Songs> filtered1 = SongsCollection.filterByArtist(songlist, "AR Rahman");
        // Print the filtered list of songs by artist "AR Rahman"
        System.out.println(filtered1);
        
        // Display songs by title and year
        System.out
