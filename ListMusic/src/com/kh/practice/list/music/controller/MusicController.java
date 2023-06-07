package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	
	
	
	
	public int addList(Music music) {
		int result = 0; //  0: 추가실패, 1: 추가 성공;
		if (list.add(music)) {
			result = 1;  
		}
		return result;
	}
	public int addAtZero(Music music) {
		int result = 0;  // 0: 추가실패, 1: 추가 성공;
		int cnt = list.size();
		((ArrayList<Music>)list).add(0, music); 
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter-cnt;
		}
			return result;
		
	}
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if(vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		
		return result;
	}
	public Music removeMusic(String title) {
		//TODO
		Music result = null;
		return result;
	}
	public Music setMusic(String title, Music music) {
		//TODO
		Music result = null;
		return result;
	}
	public int ascTitle() {
		//TODO
		int result = 0;
		return result;
	}
	public int descSinger() {
		int result = 0;
		return result;
	}
	
}






















