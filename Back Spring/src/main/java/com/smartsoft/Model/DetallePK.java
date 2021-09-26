package com.smartsoft.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Embeddable
@Data
public class DetallePK implements Serializable{
	
	
	@Column(name= "NUM_DETALLE")
	private int num_detalle;
	

	
	@JoinColumn(name="ID_FACTURA", referencedColumnName = "NUM_FACTURA")
	@ManyToOne(fetch = FetchType.LAZY)
	private Factura factura;



	public int getNum_detalle() {
		return num_detalle;
	}



	public void setNum_detalle(int num_detalle) {
		this.num_detalle = num_detalle;
	}



	public Factura getFactura() {
		return factura;
	}



	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
	

}
