package org.questions;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Q7 {

	public static void main(String[] args) {

		// Check directory D:\Java is available or not.

		File f = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations");
		boolean dr = f.isDirectory();
		if (dr == true) {
			System.out.println("The direcotry is available");

		} else {
			System.out.println("The direcotry is not available");
		}

	}

}
