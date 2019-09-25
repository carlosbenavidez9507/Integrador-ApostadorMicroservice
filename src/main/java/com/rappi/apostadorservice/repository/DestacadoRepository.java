package com.rappi.apostadorservice.repository;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.rappi.apostadorservice.model.Apostador;
import com.rappi.apostadorservice.model.Destacado;


public interface DestacadoRepository extends  MongoRepository<Destacado,String> {
	
	ArrayList<Destacado>findDestacadotByIdApostador(String ApostadorId);
	Destacado findDestacadoById(String DestacadoId);
	

}
