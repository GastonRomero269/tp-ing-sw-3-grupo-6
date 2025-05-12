package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.example.ing_sw_3_grupo_6_sube.entity.Estacion;

public interface EstacionService {
	Estacion crear(Estacion e);

	List<Estacion> findAll();

	Estacion findById(Long id);
}
