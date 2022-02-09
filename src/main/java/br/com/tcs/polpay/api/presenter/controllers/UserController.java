package br.com.tcs.polpay.api.presenter.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tcs.polpay.api.domain.entities.UserEntity;
import br.com.tcs.polpay.api.domain.services.UserServices;

@Controller
@RequestMapping(value = "user")
public class UserController {
	@Autowired(required = true)
	private UserServices userServices;

	@GetMapping
	public ResponseEntity<Collection<UserEntity>> listAll() {
		try {
			System.out.println("listAll");
			return new ResponseEntity<Collection<UserEntity>>(userServices.listAll(), HttpStatus.OK);			
		} catch(Exception e) {
			return new ResponseEntity<Collection<UserEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserEntity> findOne(@PathVariable String id) {
		try {
			System.out.println("findOne:"+id);
			return new ResponseEntity<UserEntity>(userServices.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<UserEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
