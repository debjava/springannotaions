package com.ddlab.rnd.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * The Class FileUtil is used as utility class to read the file.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class FileUtil {

	/**
	 * Read file as string.
	 * 
	 * @param filePath
	 *            the file path
	 * @return the string
	 */
	public static String readFileAsString(String filePath) {
		String fileContents = null;
		InputStream inStream = null;
		File file = new File(filePath);
		byte[] fileBytes = new byte[(int) file.length()];
		try {
			inStream = new FileInputStream(file);
			inStream.read(fileBytes);
			fileContents = new String(fileBytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return fileContents;
	}

}
