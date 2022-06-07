package org.questions;

import java.io.File;

public class Q8 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\java1");
		boolean dr = f.isDirectory();

		if (dr == true) {

			System.out.println("The direcotry is available");
		} else {

			boolean md = f.mkdir();
			System.out.println("New directory created");

		}

	}

}
