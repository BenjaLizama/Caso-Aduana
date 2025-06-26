package com.caso_aduana.tramites.repository;

import com.caso_aduana.tramites.model.VehiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<VehiculoModel,Long> {
    


}
