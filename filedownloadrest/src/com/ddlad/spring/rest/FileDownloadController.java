package com.ddlad.spring.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/file")
public class FileDownloadController {
	
	public static String FILE_PATH = "D:"+File.separator+"myfile.txt";//Hard coded file, it can be dynamic as per the requirement

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	@ResponseBody
	public void download(HttpServletResponse response) {
		try {
			File file = new File(FILE_PATH);
			String attachment = "attachment; filename="+file.getName();
			response.setHeader("Content-Disposition", attachment);
//			response.setHeader("Content-Disposition", "attachment; filename=myfile.txt");
			InputStream inStream = new FileInputStream(file.getAbsolutePath());
			FileCopyUtils.copy(inStream, response.getOutputStream());
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Hopefully file will be downloaded successfully .....");
	}
}