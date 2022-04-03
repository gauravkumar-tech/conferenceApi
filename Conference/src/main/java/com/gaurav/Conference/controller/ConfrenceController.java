package com.gaurav.Conference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.Conference.service.ConfrenceService;

@CrossOrigin(origins = "*")
@RestController
public class ConfrenceController {
	
	@Autowired
	private ConfrenceService confrenceservice;
	
	@SuppressWarnings({ "rawtypes", "static-access" })
	@GetMapping("/confrence")
	public ResponseEntity<?> getAllList(){
		try {
			return new ResponseEntity(HttpStatus.OK).ok(confrenceservice.getData());
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.BAD_GATEWAY).internalServerError().build();
		}
	}
	
	@SuppressWarnings({ "rawtypes", "static-access" })
	@DeleteMapping("/deleteConfrence/{id}")
	public ResponseEntity<?> delete(@PathVariable String id){
		try {
			confrenceservice.deleteData(id);
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.BAD_GATEWAY).internalServerError().build();
		}
	}

}
