package day5;

import java.util.Set;
import java.util.TreeSet;

public class Songs implements Comparable<Songs>{

	int sno;
	String title;
	Set<String> artists = new TreeSet<>();
	int releaseYear;
	int rating;
	
	public Songs(int sno, String title, Set<String> artists, int releaseYear, int rating) {
		
		this.sno = sno;
		this.title = title;
		this.artists = artists;
		this.releaseYear = releaseYear;
		this.rating = rating;
		
	}

	public Songs(String title, int releaseYear) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<String> getArtists() {
		return artists;
	}

	public void setArtists(Set<String> artists) {
		this.artists = artists;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Songs [sno=" + sno + ", title=" + title + ", artists=" + artists + ", releaseYear=" + releaseYear
				+ ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Songs o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
