package com.smartsoft.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartsoft.Model.Cliente;
import com.smartsoft.Model.Detalle;
import com.smartsoft.Model.Factura;
import com.smartsoft.Repository.iclienteRepository;
import com.smartsoft.Service.detalleService;
import com.smartsoft.Service.facturaService;

@RestController
@RequestMapping("/agregarFactura")
public class Control {
	
	
	@Autowired 
	private facturaService serviceFactura;
	@Autowired 
	private detalleService serviceDetalle;
	@Autowired 
	private iclienteRepository repoClient;
	
	
	
	@PostMapping("/insertarFactura")
	public void insertarFactura (@RequestBody Factura fac) {
		
		serviceFactura.agregarFactura(fac);
	}
	
	@PostMapping("/insertarDetalle")
	public void insertarDetalle(@RequestBody Detalle det) {
		serviceDetalle.agregarDetalle(det);
	}
	
	@GetMapping("/listarCliente")
	public List<Cliente> listar (){
		return repoClient.findAll();
	}
	
}
