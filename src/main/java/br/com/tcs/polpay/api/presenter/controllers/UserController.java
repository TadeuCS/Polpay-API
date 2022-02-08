package br.com.tcs.polpay.api.presenter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tcs.polpay.api.domain.services.UserServices;

@Controller
@RequestMapping(value = "user")
public class UserController {
	private UserServices userServices;

	public UserController(UserServices userServices) {
		this.userServices = userServices;
	}
	
	@GetMapping
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello world!!!", HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<String> findOne(@PathVariable Long id) {
		return new ResponseEntity<String>(userServices.findById(id), HttpStatus.OK);
	}

}
