package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.example.ing_sw_3_grupo_6_sube.entity.Tarjeta;

public interface TarjetaService {
	Tarjeta crear(Tarjeta t);

	List<Tarjeta> findAll();

	Tarjeta findById(Long id);
	
	Tarjeta findByCodigo(String codigo);
}
