package com.hackmonkey.intertansfer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maestra")
public class Maestra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3129356226538829656L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_maestra")
	private Long idMaestra;
	
	@Column(name="codigo_registro")
	private Long codigoRegistro;
	
	@Column(name="nombre_corto")
	private String nombreCorto;
	
	@Column(name="nombre_largo")
	private String nombreLargo;
	
	@Column(name="orden")
	private Integer orden;
	
	@Column(name="valor1")
	private String valor1;
	
	@Column(name="valor2")
	private String valor2;
	
	@Column(name="valor3")
	private String valor3;
	
	@Column(name="valor4")
	private String valor4;
	
	@Column(name="valor5")
	private String valor5;
	
	@Column(name="estado")
	private boolean estado;
	
	@Column(name="sweditable")
	private boolean sweditable;

	public Maestra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdMaestra() {
		return idMaestra;
	}

	public void setIdMaestra(Long idMaestra) {
		this.idMaestra = idMaestra;
	}

	public Long getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setCodigoRegistro(Long codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getNombreLargo() {
		return nombreLargo;
	}

	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public String getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}

	public String getValor2() {
		return valor2;
	}

	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}

	public String getValor3() {
		return valor3;
	}

	public void setValor3(String valor3) {
		this.valor3 = valor3;
	}

	public String getValor4() {
		return valor4;
	}

	public void setValor4(String valor4) {
		this.valor4 = valor4;
	}

	public String getValor5() {
		return valor5;
	}

	public void setValor5(String valor5) {
		this.valor5 = valor5;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean isSweditable() {
		return sweditable;
	}

	public void setSweditable(boolean sweditable) {
		this.sweditable = sweditable;
	}
	
	
	
}
