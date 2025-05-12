package com.unla.tp_ing_sw_3_grupo_6.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ing_sw_3_grupo_6_sube.entity.Transaccion;
import com.example.ing_sw_3_grupo_6_sube.repository.TransaccionRepository;
import com.example.ing_sw_3_grupo_6_sube.service.TransaccionService;

@Service
@Transactional(readOnly = true)
public class TransaccionServiceImplementation implements TransaccionService {

	private final TransaccionRepository transaccionRepository;

	public TransaccionServiceImplementation(TransaccionRepository repo) {
		this.transaccionRepository = repo;
	}

	@Override
	@Transactional
	public Transaccion crear(Transaccion t) {
		return transaccionRepository.save(t);
	}

	@Override
	public List<Transaccion> listarTodas() {
		return transaccionRepository.findAll();
	}

	@Override
	public Transaccion obtenerPorId(Long id) {
		return transaccionRepository.findById(id).orElse(null);
	}
}
