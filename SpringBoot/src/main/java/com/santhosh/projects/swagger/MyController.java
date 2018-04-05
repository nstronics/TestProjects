package com.santhosh.projects.swagger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.api.PetApi;
import io.swagger.model.Pet;

@RestController
public class MyController implements PetApi {

	@Override
	public ResponseEntity<Void> addPet(Pet body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> updatePet(Pet body) {
		// TODO Auto-generated method stub
		return null;
	}

}
