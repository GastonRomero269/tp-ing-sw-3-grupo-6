package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.example.ing_sw_3_grupo_6_sube.entity.Viaje;

public interface ViajeService {
	Viaje crear(Viaje v);

	List<Viaje> findAll();

	Viaje findById(Long id);
}
