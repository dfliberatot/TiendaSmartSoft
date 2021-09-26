package com.smartsoft.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUCTO")	
public class Producto {
	@Id
	@Column(name = "ID_PRODUCTO")
	private int id_producto;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "PRECIO")
	private double precio;
	@Column(name = "STOCK")
	private String stock;
	
	

//////////////////Getter and Setter //////////////////////////		
	
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}

	
	
	
}
