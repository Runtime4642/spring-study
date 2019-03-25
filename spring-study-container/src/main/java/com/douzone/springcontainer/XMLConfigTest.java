package com.douzone.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.douzone.springcontainer.soundsystem.CDPlayer;
import com.douzone.springcontainer.soundsystem.CompactDisc;
import com.douzone.springcontainer.videosystem.Avengers;
import com.douzone.springcontainer.videosystem.DVDPack;
import com.douzone.springcontainer.videosystem.VideoSystemConfig;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

public class XMLConfigTest {

	public static void main(String[] args) {
		//testXMLConfig01();
		testXMLConfig02();
	}
	
	// XML Config01
	// annotation config
	public static void testXMLConfig01() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("config/soundsystem/cdplayerconfig.xml");
		CompactDisc cd = appCtx.getBean(CompactDisc.class);
		System.out.println(cd);
		cd.play();
		System.out.println("@@@@@@@");
		CDPlayer cdPlayer = appCtx.getBean(CDPlayer.class);
		cdPlayer.play();
		((ConfigurableApplicationContext)appCtx).close();
	}
	
		// XML Config02
		// bean config
		public static void testXMLConfig02() {
			ApplicationContext appCtx = new ClassPathXmlApplicationContext("config/videosystem/VideoSystemConfig.xml");
			DigitalVideoDisc dvd = appCtx.getBean(Avengers.class);
			dvd.play();
			
			//id로 가져오기
			dvd =(DigitalVideoDisc)appCtx.getBean("digitalVideoDisc");
			dvd.play();
			
			VideoSystemConfig dvdPlayer = (VideoSystemConfig)appCtx.getBean("dvdPlayer3");
			dvdPlayer.play();
			
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc1");
			System.out.println(dvd);
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc2");
			System.out.println(dvd);
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc3");
			System.out.println(dvd);
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc4");
			System.out.println(dvd);
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc5");
			System.out.println(dvd);
			
			DVDPack dvdPack = appCtx.getBean(DVDPack.class);
			System.out.println(dvdPack);
			
			dvdPlayer = (VideoSystemConfig)appCtx.getBean("dvdPlayer5");
			System.out.println(dvdPlayer);
			
			dvdPlayer = (VideoSystemConfig)appCtx.getBean("dvdPlayer6");
			System.out.println(dvdPlayer);
			
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc6");
			System.out.println(dvd);
			
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc7");
			System.out.println(dvd);
			
			System.out.println("@@@@");
			dvd = (DigitalVideoDisc)appCtx.getBean("digitalBlankDisc8");
			System.out.println(dvd);
			
			((ConfigurableApplicationContext)appCtx).close();
		}

}
