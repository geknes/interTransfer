package com.hackmonkey.intertansfer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cuentas")
public class CuentasPropias implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -988492310463395210L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cuenta", nullable = false, updatable = false)
	private Long idCuenta;
	
	private String numeroCuenta;

	public CuentasPropias() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	
	
	
}
