package com.smartsoft.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartsoft.Model.Detalle;
import com.smartsoft.Model.DetallePK;
import com.smartsoft.Service.detalleService;

@RestController
@RequestMapping("/agregarFactura")
public class Control {
	
	
	@Autowired 
	//facturaService serviceFactura;
	detalleService serviceDetalle;
	
	
//	@PostMapping
//	public void InsertarFactura (@RequestBody Factura fac) {
//		
//		serviceFactura.agregarFactura(fac);
//	}
	
	@PostMapping
	public void InsertarDetalle(@RequestBody Detalle det) {
		
		//DetallePK detpk = new DetallePK();
//		
//		System.out.println(det.getCantidad());
//		System.out.println(det.getPrecio());
//		System.out.println(det.getDetallepk().getNum_detalle());
//		System.out.println(det.getDetallepk().getFactura().getNum_factura());
//		System.out.println(det.getProducto().getId_producto());
		
		serviceDetalle.agregarDetalle(det);
	}
	
	

}
