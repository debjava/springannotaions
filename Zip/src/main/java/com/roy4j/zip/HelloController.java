package com.roy4j.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
	public static String ZIP_FILE_PATH = "C:\\F.zip";
	public static String FILE_PATH = "C:\\sample.txt";

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	@ResponseBody
	public void download(HttpServletResponse response) {
		System.out.println("Start");
		try {
//			ZipFile zipFile = new ZipFile(ZIP_FILE_PATH);
			File f = new File(FILE_PATH);

//			ZipParameters parameters = new ZipParameters();
//			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
//			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
//			parameters.setEncryptFiles(true);
//			parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
//			parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
//			parameters.setPassword("f");
//			zipFile.addFile(f, parameters);

			response.setHeader("Content-Disposition", "attachment; filename=sample.txt");

			InputStream is = new FileInputStream(f.getAbsolutePath());
			FileCopyUtils.copy(is, response.getOutputStream());
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}