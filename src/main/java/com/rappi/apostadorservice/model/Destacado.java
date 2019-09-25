package com.rappi.apostadorservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Document(collection="Destacado")
public class Destacado {
	
	@Id
	private  String id;	
	private String idApostador;
	private String idPartido;
	private ArrayList<String> partido;
	
	

	
	
	

}
