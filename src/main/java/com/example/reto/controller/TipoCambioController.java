package com.example.reto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reto.model.Divisa;
import com.example.reto.model.TipoCambio;
import com.example.reto.service.ITipoCambioService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TipoCambioController {
  
  @Autowired
  private ITipoCambioService divisaService;
  
  @GetMapping("/divisa")
  public ResponseEntity<List<Divisa>> listarDivisas() {
      return new ResponseEntity<List<Divisa>>(divisaService.listarDivisas(), HttpStatus.OK);
  }
  
  @PostMapping("/divisa")
  public ResponseEntity<Divisa> registrarDivisa(@RequestBody Divisa request) {
      
  	return new ResponseEntity<Divisa>(divisaService.registrarDivisa(request), HttpStatus.OK);

  }

  @PostMapping(value = "/cambio", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody()
  public ResponseEntity<TipoCambio> registrarCambio(@RequestBody TipoCambio request) {
      
  	return new ResponseEntity<TipoCambio>(divisaService.registrarCambio(request), HttpStatus.OK);

  }

}
