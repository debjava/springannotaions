package com.ddlab.spring.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({"/users"})
class FileUploadController
{
  @RequestMapping(value={"/photo"}, method={RequestMethod.POST})
  @ResponseBody
  String writeUserProfilePhoto(@RequestParam("file") MultipartFile file)
    throws Exception
  {
    System.out.println("File Name : "+file.getName());
    System.out.println("Original File Name : "+file.getOriginalFilename());
    
    String fileName = file.getOriginalFilename();
    String filePath = "D:/temp"+File.separator+fileName;
//    byte[] bytesForProfilePhoto = FileCopyUtils.copyToByteArray(file.getInputStream());
//    MediaType mt = MediaType.parseMediaType(file.getContentType());
    OutputStream out = new FileOutputStream(filePath);
    FileCopyUtils.copy(file.getInputStream(), out);
    HttpHeaders httpHeaders = new HttpHeaders();
    String responseStr = fileName+" has been uploaded successfully ...";

    return responseStr;
  }
}