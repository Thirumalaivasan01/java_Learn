package com.te.learn.basic.Assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {

		// FileReader file=new
		// FileReader("/home/onebill/eclipse-workspace/core-java-8/src/com/te/learn/basic/Assignments/ex.txt");
		String s;
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"/home/onebill/eclipse-workspace/core-java-8/src/com/te/learn/basic/Assignments/ex.txt"));
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
