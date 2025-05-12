package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.example.ing_sw_3_grupo_6_sube.entity.Transaccion;

public interface TransaccionService {
	Transaccion crear(Transaccion t);

	List<Transaccion> listarTodas();

	Transaccion obtenerPorId(Long id);
}
