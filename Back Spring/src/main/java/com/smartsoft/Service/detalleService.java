package com.smartsoft.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsoft.Model.Detalle;
import com.smartsoft.Repository.idetalleRepository;

@Service
public class detalleService implements idetalleService{
	
	@Autowired 
	private idetalleRepository repo; 

	@Override
	public boolean agregarDetalle(Detalle det) {
		
		repo.save(det);
		return true;
	}

}
