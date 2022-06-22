package com.google.test;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/home/abirbhattachary/tmpFiles/image.png");
		file.createNewFile();

	}

}
