package org.questions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Q5 {

	public static void main(String[] args) throws IOException {

		System.out.println("Program 5 : Print the odd  lines from the file");
		System.out.println("---------------------------------------------");
		File f2 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\Questions1.txt");
		List<String> rl3 = FileUtils.readLines(f2);
		for (int i = 1; i < rl3.size(); i++) {
			String tr = rl3.get(i);
			if (i % 2 == 0) {
				System.out.println(tr);
			}
		}
	}
}
