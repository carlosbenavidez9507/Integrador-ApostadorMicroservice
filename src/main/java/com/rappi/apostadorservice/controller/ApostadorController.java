package com.rappi.apostadorservice.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.rappi.apostadorservice.model.Apostador;
import com.rappi.apostadorservice.model.Destacado;
import com.rappi.apostadorservice.model.Preferencia;
import com.rappi.apostadorservice.repository.ApostadorRepository;
import com.rappi.apostadorservice.repository.DestacadoRepository;
import com.rappi.apostadorservice.repository.PreferenciaRepository;



@RestController
@RequestMapping("/")

public class ApostadorController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	 @Autowired
	 private ApostadorRepository repository;
	 
	 @Autowired
	 private DestacadoRepository destacadoRepository;
	 
	 @Autowired
	 private PreferenciaRepository preferenciaRepository;
	 
	 @GetMapping(value = "/apostador")
		public Iterable<Apostador> all (){
			return repository.findAll();
		}
	 
	 
	 @GetMapping(value = "/apostador/{apostadorId}")
		public Apostador findByApostadortId (@PathVariable String apostadorId){
			 
		     return repository.findApostadorById(apostadorId);
		}
	 
	 
	 	 
	 @PostMapping(value = "/apostador")
		public Apostador save (@RequestBody Apostador apostador){
			return repository.save(apostador);
		}
	 
	 @PutMapping(value = "/apostador")
		public Apostador update (@RequestBody Apostador apostador){
			return repository.save(apostador);
		    
		}
	 
	 @DeleteMapping(value = "/apostador")
		public void delete (@RequestBody Apostador apostador){
			repository.delete(apostador);
			
		}
	
	 
	 @PostMapping(value = "/preferencia")
		public Preferencia save (@RequestBody Preferencia preferencia){			
		 return preferenciaRepository.save(preferencia);
		     
		}
	 
	 
	 @GetMapping(value = "/preferencia/{preferenciaId}")
		public Preferencia findByPreferenciaId (@PathVariable String preferenciaId){
			 
		     return preferenciaRepository.findPreferenciaById(preferenciaId);
		}
	 
	 @GetMapping(value = "/preferencia")
		public List<Preferencia> findAllPreferencias (){
			 
		     return preferenciaRepository.findAll();
		}
	 
	 
	 @PutMapping(value = "/preferencia")
		public Preferencia updatePreferencia (@RequestBody Preferencia preferencia){
			return preferenciaRepository.save(preferencia);
		    
		}
	 
	 @DeleteMapping(value = "/preferencia")
		public void deletePreferencia (@RequestBody Preferencia preferencia){
			 preferenciaRepository.delete(preferencia);
			
		}
	 
	 
	 @PostMapping(value = "/destacado")
		public Destacado save (@RequestBody Destacado destacado){			
		 return destacadoRepository.save(destacado);
		     
		}
	 
	 @GetMapping(value = "/destacado")
		public List<Destacado> findAllDestacados (){
			 
		     return destacadoRepository.findAll();
		}
	 
	 
	 
	 @GetMapping(value = "/destacado/{destacadoId}")
		public Destacado findByDestacadoId (@PathVariable String preferenciaId){
			 
		     return destacadoRepository.findDestacadoById(preferenciaId);
		}
	 
	 
	 @PutMapping(value = "/destacado")
		public Destacado updateDestacado (@RequestBody Destacado destacado){
			return destacadoRepository.save(destacado);
		    
		}
	 
	 @DeleteMapping(value = "/destacado")
		public void deleteDestacado (@RequestBody Destacado destacado){
		 destacadoRepository.delete(destacado);
			
		}
	
	 @GetMapping(value="/apostador/{aspostadorId}/preferencia")
	 public ArrayList<Preferencia> listaPreferencia(@PathVariable String aspostadorId)
	 {   
	     ArrayList<Preferencia> preferencias=preferenciaRepository.findPreferenciaByIdApostador(aspostadorId);
	     return preferencias;
		 
	    
	 }
	 
	 @GetMapping(value="/apostador/{apostadorId}/destacado")
	 public ArrayList<Destacado> listarDestacado(@PathVariable String apostadorId){
		 
		 ArrayList<Destacado> destacados=destacadoRepository.findDestacadotByIdApostador(apostadorId);
		 return destacados;
	 }
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	
	 
	
	

}
