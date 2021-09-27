package com.smartsoft.Model;

import java.io.Serializable;
//import java.sql.Date;
import java.util.Date;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "CLIENTE")	
public class Cliente implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name= "ID_CLIENTE")
	private int id_cliente;
	@Column(name= "NOMBRE")
	private String nombre;
	@Column(name= "APELLIDO")
	private String apellido;
	@Column(name= "DIRECCION")
	private String direccion;	
	@Temporal(TemporalType.DATE)
	@Column(name= "FECHA_NACIMIENTO")
	private Date fecha_nacimiento;
	@Column(name= "TELEFONO")
	private int telefono;
	@Column(name= "EMAIL")
	private String email;

////////////////// Getter and Setter //////////////////////////	

	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	



	
	
}
