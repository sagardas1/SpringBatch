package com.springBatch.dummy;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserInterface extends CrudRepository<UserDetails,Long>{
	
	

}
