package com.example.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reto.model.Divisa;


public interface DivisaRepository extends JpaRepository<Divisa, Long> {

    Divisa findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);

}
