package com.caso_aduana.tramites.service;

import com.caso_aduana.tramites.model.VehiculoModel;
import com.caso_aduana.tramites.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;
    public List<VehiculoModel> findAll(){return vehiculoRepository.findAll();}
    public VehiculoModel findById(Long id){return vehiculoRepository.findById(id).get();}
    public VehiculoModel save(VehiculoModel vehiculo){return vehiculoRepository.save(vehiculo);}
    public void delete(Long id) {vehiculoRepository.deleteById(id);}

}
