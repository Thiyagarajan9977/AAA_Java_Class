package org.questions;

import java.io.File;

public class Q9 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\Java\\Selenium\\Material");
		boolean dr = f.isDirectory();
		
		if (dr == true) {

			System.out.println("The direcotry is available");
		} else {

			boolean md = f.mkdirs();
			System.out.println("New directory created");

		}

	}

}
