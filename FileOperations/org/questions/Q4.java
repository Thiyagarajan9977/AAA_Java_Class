package org.questions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Q4 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Program 4 : Print the last 5 lines from the file.");
		System.out.println("--------------------------------------------------");
		
		File f1 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\Questions1.txt");
		List<String> rl2 = FileUtils.readLines(f1);
		for (int i = 0; i < rl2.size(); i++) {
			String tr = rl2.get(i);
			if (i >= 6) {
				System.out.println(tr);
				}
			}

	}

}
