package com.rappi.apostadorservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.rappi.apostadorservice.model.Apostador;
import com.rappi.apostadorservice.model.Destacado;
import com.rappi.apostadorservice.model.Preferencia;


public interface PreferenciaRepository extends MongoRepository<Preferencia,String> {
	
	
	ArrayList<Preferencia> findPreferenciaByIdApostador(String ApostadorId);
	Preferencia findPreferenciaById(String preferenciaId);

}
