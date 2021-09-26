package com.smartsoft.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE")	
public class Detalle implements Serializable {

	@EmbeddedId
	protected DetallePK detallepk;
	
	
	@JoinColumn(name="ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO")
	@ManyToOne(fetch = FetchType.LAZY)
	private Producto producto;
	
	@Column(name= "CANTIDAD")
	private int cantidad;
	@Column(name= "PRECIO")
	private double precio;
	
	
	
	public DetallePK getDetallepk() {
		return detallepk;
	}
	public void setDetallepk(DetallePK detallepk) {
		this.detallepk = detallepk;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	


	
	
}
