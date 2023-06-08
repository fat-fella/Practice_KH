package com.kh.practice.list.music.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Music implements Comparable<Object>, Serializable{
	private static final long serialVersionUID = 3446753800283017526L;
	
	private String title;
	private String singer;
	
	public Music() {}
	public Music(String title, String singer) {
		this.title=title;
		this.singer=singer;
	}
	
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}

	
	public int compareTo(Object o) {
		int result = this.singer.compareTo(((Music)o).getSinger());
		System.out.println("compare To 정렬확인 : " + result + "-" + ((Music)o).getSinger());
		return result*-1;
		
	}
	
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void saveFile() {
		
	}
	
	
	
	
	
}
