package com.example.reto.model;


import jakarta.persistence.*;

@Entity
@Table(name = "cambio")
public class TipoCambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "moneda_destino")
    private String monedaDestino;
    
    @Column(name = "moneda_origen")
    private String monedaOrigen;
    
    @Column(name = "monto_destino")
    private Double montoDestino;
    
    @Column(name = "monto_origen")
    private Double montoOrigen;
    
    @Column(name = "tipo_cambio")
    private Double tipoCambio;

	public TipoCambio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoCambio(Integer id, String monedaDestino, String monedaOrigen, Double montoDestino, Double montoOrigen,
			Double tipoCambio) {
		super();
		this.id = id;
		this.monedaDestino = monedaDestino;
		this.monedaOrigen = monedaOrigen;
		this.montoDestino = montoDestino;
		this.montoOrigen = montoOrigen;
		this.tipoCambio = tipoCambio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public Double getMontoDestino() {
		return montoDestino;
	}

	public void setMontoDestino(Double montoDestino) {
		this.montoDestino = montoDestino;
	}

	public Double getMontoOrigen() {
		return montoOrigen;
	}

	public void setMontoOrigen(Double montoOrigen) {
		this.montoOrigen = montoOrigen;
	}

	public Double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", monedaDestino=" + monedaDestino + ", monedaOrigen=" + monedaOrigen
				+ ", montoDestino=" + montoDestino + ", montoOrigen=" + montoOrigen + ", tipoCambio=" + tipoCambio
				+ "]";
	}

  

}
