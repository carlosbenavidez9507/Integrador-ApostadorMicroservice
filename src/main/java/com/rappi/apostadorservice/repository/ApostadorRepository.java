package com.rappi.apostadorservice.repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.rappi.apostadorservice.model.Apostador;



public interface ApostadorRepository extends MongoRepository<Apostador,String>  {
	
	Apostador findApostadorById(String ApostadorId);
	
	
	
}
