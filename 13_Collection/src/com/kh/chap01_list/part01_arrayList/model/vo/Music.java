package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music {
	private String title;
	private String artist;
	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	public void setTitle(String title) {
		this.title=title;
	} 
	public String getTitle() {
		return title;
	}
	public void setArtist(String artist) {
		this.artist=artist;
		
	}
	
	public String getArtist() {
		return artist;
	}
	@Override
	public String toString() {
		return "Music title :"+title+"ArtistName : "+artist;
	}

	
}
