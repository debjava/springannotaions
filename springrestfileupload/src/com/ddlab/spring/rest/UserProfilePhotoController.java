package com.ddlab.spring.rest;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Collections;

@Controller
@RequestMapping (value = "/users")
class UserProfilePhotoController {


	@RequestMapping (value="/photo",method = RequestMethod.POST)
	@ResponseBody
//	HttpEntity writeUserProfilePhoto(@RequestParam MultipartFile file) throws Exception {
	String writeUserProfilePhoto(@RequestParam MultipartFile file) throws Exception {
		System.out.println("***************************************");
		// write it
		byte bytesForProfilePhoto[] = FileCopyUtils.copyToByteArray(file.getInputStream());
		MediaType mt = MediaType.parseMediaType(file.getContentType());
		OutputStream out = new FileOutputStream("D:/temp/a.jpg");
		FileCopyUtils.copy(file.getInputStream(), out);

		// tell the client what happened
		HttpHeaders httpHeaders = new HttpHeaders() ;
//		URI uriOfUser = ServletUriComponentsBuilder.fromCurrentContextPath()
//			.pathSegment( "/users/{user}" )
//			
//			.buildAndExpand(Collections.singletonMap("user", user))
//		.toUri();
//		httpHeaders.setLocation( uriOfUser );
		return "finally OK.";
		//return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
	}

}