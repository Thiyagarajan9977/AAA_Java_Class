package org.questions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Q2 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\Questions1.txt");
		String rs = FileUtils.readFileToString(f);

		if (rs.contains("Java"))

			System.out.println("java word found in text file");

	}

}
