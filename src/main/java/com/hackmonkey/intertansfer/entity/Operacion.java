package com.hackmonkey.intertansfer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operacion")
public class Operacion implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1377819083020407762L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_operacion", nullable = false, updatable = false)
	private Long idOperacion;
	
	private double monto;

	public Operacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(Long idOperacion) {
		this.idOperacion = idOperacion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	
}
