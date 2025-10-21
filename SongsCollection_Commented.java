/**
 * Title: SongsCollection.java
 * Description: Maintains a collection of Song objects and provides operations
 * like sorting, listing, and adding songs. Designed for clean, modular handling
 * of song-related data in the application.
 *
 * Author: Auto-commented by ChatGPT Innovation Coach
 */

import java.util.*;

/**
 * SongsCollection manages a list of Song objects with utility methods
 * to add, sort, and display songs. The class uses composition to organize
 * Song entities rather than relying on external data structures directly.
 */
public class SongsCollection {

    // Internal list to hold all Song objects in memory
    private List<Song> songs = new ArrayList<>();

    /**
     * Adds a new Song to the collection.
     * @param song The Song object to be added
     */
    public void addSong(Song song) {
        songs.add(song);
    }

    /**
     * Sorts the songs alphabetically by title using a TitleComparator.
     */
    public void sortByTitle() {
        Collections.sort(songs, new TitleComparator());
    }

    /**
     * Sorts the songs by artist name using an ArtistComparator.
     */
    public void sortByArtist() {
        Collections.sort(songs, new ArtistComparator());
    }

    /**
     * Sorts the songs based on rating using the RatingComparator.
     */
    public void sortByRating() {
        Collections.sort(songs, new RatingComparator());
    }

    /**
     * Displays all songs in the collection in a clean tabular format.
     */
    public void displaySongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
