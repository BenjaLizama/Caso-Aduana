package com.caso_aduana.tramites.repository;

import com.caso_aduana.tramites.model.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo,Long> {
}
