package com.unla.tp_ing_sw_3_grupo_6.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ing_sw_3_grupo_6_sube.entity.MedioTransporte;
import com.example.ing_sw_3_grupo_6_sube.repository.MedioTransporteRepository;
import com.example.ing_sw_3_grupo_6_sube.service.MedioTransporteService;

@Service
@Transactional(readOnly = true)
public class MedioTransporteServiceImplementation implements MedioTransporteService {

	private final MedioTransporteRepository medioTransporteRepository;

	public MedioTransporteServiceImplementation(MedioTransporteRepository repo) {
		this.medioTransporteRepository = repo;
	}

	@Override
	@Transactional
	public MedioTransporte crear(MedioTransporte m) {
		return medioTransporteRepository.save(m);
	}

	@Override
	public List<MedioTransporte> findAll() {
		return medioTransporteRepository.findAll();
	}

	@Override
	public MedioTransporte findById(Long id) {
		return medioTransporteRepository.findById(id).orElse(null);
	}
}
