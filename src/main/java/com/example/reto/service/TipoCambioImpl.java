package com.example.reto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto.model.Divisa;
import com.example.reto.model.TipoCambio;
import com.example.reto.repository.DivisaRepository;
import com.example.reto.repository.TipoCambioRepository;

@Service
public class TipoCambioImpl implements ITipoCambioService {

	@Autowired
    private DivisaRepository divisaRepository;

    @Autowired
    private TipoCambioRepository cambioRepository;

	@Override
	public List<Divisa> listarDivisas() {
		return divisaRepository.findAll();
	}

	@Override
	public Divisa registrarDivisa(Divisa request) {
		return divisaRepository.save(request);
	}

	@Override
	public TipoCambio registrarCambio(TipoCambio request) {
		Divisa divisa = divisaRepository.findByMonedaOrigenAndMonedaDestino(request.getMonedaOrigen(), request.getMonedaDestino());

        Double montoDestino = request.getMontoOrigen() * divisa.getTipoCambio();

        request.setTipoCambio(divisa.getTipoCambio());
        request.setMontoDestino(montoDestino);
        
        
        return cambioRepository.save(request);
	}
}
