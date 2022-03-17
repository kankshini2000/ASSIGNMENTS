package com.Mongodb.Examples;


import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Assignq3controller {
	Ziprepos zips1 = new Ziprepos();

	@RequestMapping(value = "/zipcodes", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<Zipcodes> zipcodes() {
		return zips1.getZips();
	}

	@RequestMapping(value = "/zipcode/{zipcode}", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Zipcodes zipcode(@PathVariable("zipcode") long zip) {
		return zips1.getzipslist(zip);

	}
}
