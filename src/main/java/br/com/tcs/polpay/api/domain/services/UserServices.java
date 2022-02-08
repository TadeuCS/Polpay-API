package br.com.tcs.polpay.api.domain.services;

import org.springframework.stereotype.Service;

@Service
public class UserServices {

	public String findById(Long id) {
		return id.toString();
	}
	
}
