package com.hackmonkey.intertansfer.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Maestra {

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
	
}
