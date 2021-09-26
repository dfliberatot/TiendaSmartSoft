package com.smartsoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartsoft.Model.Detalle;
import com.smartsoft.Model.DetallePK;

public interface idetalleRepository extends JpaRepository<Detalle, DetallePK>{

}
