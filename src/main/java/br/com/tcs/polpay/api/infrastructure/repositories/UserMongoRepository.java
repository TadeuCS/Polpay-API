package br.com.tcs.polpay.api.infrastructure.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.tcs.polpay.api.infrastructure.models.UserMongoModel;

@Repository
public interface UserMongoRepository extends PagingAndSortingRepository<UserMongoModel, String>{

}
