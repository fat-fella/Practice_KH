package com.kh.practice.list.music.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

	public MusicController() {
		String filePath = "music.txt";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		BufferedInputStream bis = null;
		int result = 0;
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			bis = new BufferedInputStream(ois);
			try {
				list = (List<Music>) ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bis != null)
					bis.close();
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

//		list.add(new Music("aa", "aaa"));
//		list.add(new Music("bb", "bbb"));
//		list.add(new Music("cc", "ccc"));
//		list.add(new Music("dd", "ddd"));
//		list.add(new Music("ee", "aaa"));
//		list.add(new Music("ff", "bbb"));
//		list.add(new Music("gg", "ccc"));
	}

	public int addList(Music music) {
		int result = 0; // 0: 추가실패, 1: 추가 성공;
		if (list.add(music)) {
			result = 1;
		}
		return result;
	}

	public int addAtZero(Music music) {
		int result = 0; // 0: 추가실패, 1: 추가 성공;
		int cnt = list.size();
		((ArrayList<Music>) list).add(0, music);
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter - cnt;
		}
		return result;

	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}

		return result;
	}

	public Music removeMusic(String title) {
		// TODO
		Music result = null;
		return result;
	}

	public Music setMusic(String title, Music music) {
		// TODO
		Music result = null;
		return result;
	}

	public int ascTitle() {
		// TODO
		int result = 0;
		return result;
	}

	public int descSinger() {
		int result = 1;
		try {
			Collections.sort(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int saveFile(String filePath) {
		int result = 0;// 0 = 실패 , 1 = 성공
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			bos = new BufferedOutputStream(oos);

			oos.writeObject(list);
			oos.flush();
			result = 1;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();

				return result;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
