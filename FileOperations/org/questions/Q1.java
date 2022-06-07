package org.questions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Q1 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\Questions1.txt");
		boolean cn = f.createNewFile();
		System.out.println(cn);
		
		File f1 = new File ("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\Questions1.txt");
		
		FileUtils.write(f1, "Welcome to Java \n", false);
		FileUtils.write(f1, "Welcome to Java 1 \n", true);
		FileUtils.write(f1, "Welcome to Java 2 \n", true);
		FileUtils.write(f1, "Welcome to Java 3 \n", true);
		FileUtils.write(f1, "Welcome to Java 4 \n", true);
		FileUtils.write(f1, "Welcome to Java 5 \n", true);
		FileUtils.write(f1, "Welcome to Java 6 \n", true);
		FileUtils.write(f1, "Welcome to Java 7 \n", true);
		FileUtils.write(f1, "Welcome to Java 8 \n", true);
		FileUtils.write(f1, "Welcome to Java 9 \n ",true);
		FileUtils.write(f1, "Welcome to Java 10\n", true);
				
	}

}
