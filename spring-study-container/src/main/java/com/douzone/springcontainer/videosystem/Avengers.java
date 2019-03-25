package com.douzone.springcontainer.videosystem;

public class Avengers implements DigitalVideoDisc {
	private String title ="Avengers";
	private String studio ="MARVEL";
	
	
	public void play() {
		System.out.println("Playing Movie"+studio+"'s "+title);
	}


	@Override
	public String toString() {
		return "Avengers [title=" + title + ", studio=" + studio + "]";
	}

}
