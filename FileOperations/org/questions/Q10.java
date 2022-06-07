package org.questions;

import java.io.File;
import java.io.IOException;

public class Q10 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Admin\\Desktop\\Green Tech Class");

		String[] lt = f.list();
		for (String fl : lt) {
			System.out.println(fl);

		}

	}
}
