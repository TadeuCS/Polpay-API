package br.com.tcs.polpay.api.domain.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import br.com.tcs.polpay.api.domain.entities.UserEntity;

@Service
public class UserServices {
	@Autowired(required = false)
	private PagingAndSortingRepository<UserEntity, String> userRepository;

	public UserEntity findById(String id) throws Exception {
		return userRepository.findById(id)
				.orElseThrow(()->new Exception("Erro ao retornar o usuário pelo id informado!"));
	}

	public Collection<UserEntity> listAll() throws Exception {
		return (Collection<UserEntity>) userRepository.findAll();
	}
	
	public UserEntity save(UserEntity userRequest) throws Exception {
		return userRepository.save(userRequest);
	}
	
	public void delete(String id) throws Exception {
		userRepository.deleteById(id);
	}
	
}
