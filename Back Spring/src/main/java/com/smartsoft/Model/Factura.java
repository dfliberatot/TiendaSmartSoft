package com.smartsoft.Model;

import java.io.Serializable;

//import java.sql.Date;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table(name = "FACTURA")	

public class Factura implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name= "NUM_FACTURA")
	private int num_factura;
	

	@JoinColumn(name="ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.PERSIST)
	@ToString.Exclude
	private Cliente cliente;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name= "FECHA")
	private Date fecha;


//////////////////Getter and Setter ////////////////////////	
	
	public int getNum_factura() {
		return num_factura;
	}


	public void setNum_factura(int num_factura) {
		this.num_factura = num_factura;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
