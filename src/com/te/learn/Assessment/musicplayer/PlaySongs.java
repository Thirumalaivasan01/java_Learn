package com.te.learn.Assessment.musicplayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PlaySongs {

	public void playAllSongs(ArrayList<MusicFiles> files) throws InterruptedException {
		System.out.println("Playing...");
		for (MusicFiles musicFiles : files) {
			System.out.println(musicFiles);
			Thread.sleep(1000);
			// thread.start();
			// Thread thread1=new Thread(PlaySongs());
		}

	}

	public void playSongsRandomly(ArrayList<MusicFiles> files) throws InterruptedException {
		// Random random = new Random();
		// int id = random.nextInt(6);
		ArrayList<MusicFiles> arrayList1 = new ArrayList<MusicFiles>(files);
		Collections.shuffle(arrayList1);
		// System.out.println(id);
		// System.out.println("Playing...");
		for (MusicFiles musicFiles : arrayList1) {
			System.out.println("Playing...");
			System.out.println(musicFiles);
			Thread.sleep(1000);
		}

	}

	public void playParticularSong(ArrayList<MusicFiles> files) throws InterruptedException {
		for (int i = 0; i < files.size(); i++) {
			System.out.format("%5d %20s %20s %20s %20s %10s", files.get(i).getSongId(), files.get(i).getSongTitle(),
					files.get(i).getArtistName(), files.get(i).getAlbumName(), files.get(i).getSongLocation(),
					files.get(i).getDescription());
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song Id that to be played: ");
		int song = sc.nextInt();
		for (MusicFiles musicFiles : files) {
			if (musicFiles.getSongId() == song) {
				System.out.println("Playing...");
				System.out.println(musicFiles);
				Thread.sleep(1000);
			}
		}
	}

}
