package com.smartsoft.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsoft.Model.Factura;
import com.smartsoft.Repository.ifacturaRepository;

@Service
public class facturaService implements ifacturaService {

	@Autowired
	private ifacturaRepository repo;
	
	@Override
	public boolean agregarFactura(Factura fac) {
		
		repo.save(fac);
		return true;
	}
	
}
