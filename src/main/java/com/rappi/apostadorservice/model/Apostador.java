package com.rappi.apostadorservice.model;

import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString



@Document(collection="Apostador")
public class Apostador {

	@Id
	private  String id;	
	private String nombres;
	private String apellidos;
	private String correo;
	private Date fecha_nacimiento;
	private ArrayList<Destacado> destacado;   
	private ArrayList<Preferencia> preferencia;
	
	
	
	
	
	
	
	

}
