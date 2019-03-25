package com.douzone.springcontainer.videosystem;

public class VideoSystemConfig {
	
	private DigitalVideoDisc dvd;
	
	public VideoSystemConfig(DigitalVideoDisc dvd) {
		this.dvd=dvd;
	}
	
	@Override
	public String toString() {
		return "DVDPlayer [dvd=" + dvd + "]";
	}

	public VideoSystemConfig() {
		
	}
	
	public void play() {
		dvd.play();
	}
	
	public void setDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.dvd=dvd;
	}
}
