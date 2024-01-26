package com.example.reto.service;

import java.util.List;

import com.example.reto.model.Divisa;
import com.example.reto.model.TipoCambio;


public interface ITipoCambioService {

	List<Divisa> listarDivisas();
    Divisa registrarDivisa(Divisa request);
    TipoCambio registrarCambio(TipoCambio request);
    
}
