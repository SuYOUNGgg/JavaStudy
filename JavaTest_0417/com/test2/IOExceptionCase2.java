package com.test2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;


class IOExceptionCase2 {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('Z');
		
		if(writer != null)
			writer.close();

	}

}
