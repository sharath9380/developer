package com.xworkz;

import com.xworkz.boot.Song;

public class SongRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song music=new Song();
		
		System.out.println(music.name);
		System.out.println(music.language);
		System.out.println(music.singer);
		System.out.println(music.lyricst);
		System.out.println(music.type);
		
		music.name="hale patre hale kabuna hale paper";
		music.language="kannada";
		music.singer="vijay prakash";
		music.lyricst="yogaraj bhat";
		music.type="item song";
		
		System.out.println(music.name);
		System.out.println(music.language);
		System.out.println(music.singer);
		System.out.println(music.lyricst);
		System.out.println(music.type);
		
		
		
		
		
		
		
		
		

	}

}
