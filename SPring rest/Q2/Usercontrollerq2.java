package com.Mongodb.Examples;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontrollerq2 {
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> details(@RequestBody Usercredintialsq2 obj) {
		if (obj.getUsername().equals("Kanshi") && obj.getPswd().equals("test"))
			return new ResponseEntity<String>("Valid User", HttpStatus.OK);
		else {
			return new ResponseEntity<String>("Invalid User", HttpStatus.OK);
		}
	}
}
