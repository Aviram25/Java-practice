package day5;

import java.util.Set;
import java.util.TreeSet;

// Represents a Song with attributes like serial number, title, artists, release year, and rating
public class Songs implements Comparable<Songs> {
    
    // Unique identifier for the song
    int sno;
    // Title of the song
    String title;
    // Set of artists associated with the song, stored in a TreeSet for sorted order
    Set<String> artists = new TreeSet<>();
    // Year the song was released
    int releaseYear;
    // Rating of the song (e.g., on a scale)
    int rating;
    
    // Constructor to initialize a Song with all attributes
    public Songs(int sno, String title, Set<String> artists, int releaseYear, int rating) {
        this.sno = sno;
        this.title = title;
        this.artists = artists;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Constructor to initialize a Song with only title and release year
    public Songs(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // Getter for serial number
    public int getSno() {
        return sno;
    }

    // Setter for serial number
    public void setSno(int sno) {
        this.sno = sno;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for artists
    public Set<String> getArtists() {
        return artists;
    }

    // Setter for artists
    public void setArtists(Set<String> artists) {
        this.artists = artists;
    }

    // Getter for release year
    public int getReleaseYear() {
        return releaseYear;
    }

    // Setter for release year
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    // Getter for rating
    public int getRating() {
        return rating;
    }

    // Setter for rating
    public void setRating(int rating) {
        this.rating = rating;
    }

    // Returns a string representation of the Song object for debugging or display
    @Override
    public String toString() {
        return "Songs [sno=" + sno + ", title=" + title + ", artists=" + artists + ", releaseYear=" + releaseYear
                + ", rating=" + rating + "]";
    }

    // Compares Songs objects for sorting purposes, currently returns 0 (no sorting logic)
    @Override
    public int compareTo(Songs o) {
        // TODO: Implement comparison logic (e.g., by title, year, or rating)
        return 0;
    }
}
