package com.douzone.springcontainer.videosystem;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DVDPlayer {
private DigitalVideoDisc dvd;
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd=dvd;
	}
	
	@Override
	public String toString() {
		return "DVDPlayer [dvd=" + dvd + "]";
	}

	public DVDPlayer() {
		
	}
	
	public void play() {
		dvd.play();
	}
	
	public void setDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.dvd=dvd;
	}
}
