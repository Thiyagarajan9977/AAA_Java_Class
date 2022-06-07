package org.fileoperations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations {

	public static void main(String[] args) throws IOException {

		// Create a Folder

		File f = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations");
		boolean mkdir = f.mkdir();
		System.out.println("Create a new Folder");
		System.out.println(mkdir);
		System.out.println("");

		// Create Sub Folders

		File f1 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\A\\B\\C");
		System.out.println("Create a new sub Folders");
		boolean mkdirs = f1.mkdirs();
		System.out.println(mkdirs);
		System.out.println("");

		// Create a file

		File f2 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		boolean cn = f2.createNewFile();
		System.out.println("Create a new file");
		System.out.println(cn);
		System.out.println("");

		// is a file or not

		File f3 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		boolean file = f3.isFile();
		System.out.println("Checking is it file? ");
		System.out.println(file);
		System.out.println("");

		// is directory or not

		File f4 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		File f41 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations");
		boolean directory1 = f4.isDirectory();
		System.out.println("Checking is it directory? File Not found");
		System.out.println(directory1);
		System.out.println("Checking is it directory? File found");
		boolean directory2 = f41.isDirectory();
		System.out.println(directory2);
		System.out.println("");

		// Can Read or not
		File f5 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		System.out.println("Can Read or not?");
		boolean canRead = f5.canRead();
		System.out.println(canRead);
		System.out.println("");

		// Can Write or not
		File f6 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		System.out.println("Can write of not?");
		boolean canWrite = f6.canWrite();
		System.out.println(canWrite);
		System.out.println("");

		// Can Execute/accessible or not

		File f7 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		System.out.println("Can execute or not?");
		boolean canExecute = f7.canExecute();
		System.out.println(canExecute);
		System.out.println("");

		// File Exists or not

		File f8 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		System.out.println("File exists or not?");
		boolean exists = f8.exists();
		System.out.println(exists);
		System.out.println("");

		// Hidden or not

		File f9 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		System.out.println("Is Hidden or not?");
		boolean hidden = f9.isHidden();
		System.out.println(hidden);
		System.out.println("");

		// List out the files with path

		File f10 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations");
		System.out.println("List out the files with path");
		File[] listFiles = f10.listFiles();
		for (File x2 : listFiles) {
			System.out.println(x2);
		}
		System.out.println("");

		// get path or files

		File f11 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations");
		String absolutePath = f11.getAbsolutePath();
		System.out.println("Find the path");
		System.out.println(absolutePath);
		System.out.println("");

		// Write the file
		File f12 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		System.out.println("Write the File");
		FileUtils.write(f12, "Welcome to Java \n", false); //false denotes to delete the existing line
		FileUtils.write(f12, "Java class over", true); // True denote to print the line,  
		System.out.println("Done... Check the path");				//it will not delete previous line
		System.out.println("");

		// Copy the file
		File f13 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Others\\Green Technology Class.txt");
		File f14 = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class\\Fileoperations\\writefile.txt");
		System.out.println("Copy the File");
		FileUtils.copyFile(f13, f14);
		System.out.println("Done... Check the File");

		// Read the file

		List<String> rl = FileUtils.readLines(f14);
		for (String x : rl) {
			System.out.println(x);
		}
		System.out.println("");

		// print all the lines

		List<String> pr = FileUtils.readLines(f14);
		for (int i = 0; i < rl.size(); i++) {
			String st = pr.get(i);
			System.out.println(st);
		}

	}

}
