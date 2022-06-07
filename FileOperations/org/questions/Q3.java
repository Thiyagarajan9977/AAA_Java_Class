package org.questions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Q3 {

	public static void main(String[] args) throws IOException {

		System.out.println("Program 3 : ");
		System.out.println("------------");
		File f = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\Questions1.txt");
		List<String> rl = FileUtils.readLines(f);
		System.out.println("The size of the row count is :" + rl.size());
		System.out.println("");
		
	}
}
	

