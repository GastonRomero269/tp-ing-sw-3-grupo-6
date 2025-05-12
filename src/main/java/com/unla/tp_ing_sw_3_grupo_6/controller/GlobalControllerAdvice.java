package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.ing_sw_3_grupo_6_sube.entity.Usuario;
import com.example.ing_sw_3_grupo_6_sube.service.UsuarioService;

import jakarta.servlet.http.HttpSession;

@ControllerAdvice
public class GlobalControllerAdvice {

	@Autowired
	private UsuarioService usuarioService;

	@ModelAttribute
	public void addUserToModel(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");

		if (userId != null) {
			Usuario user = usuarioService.findById(userId);
			model.addAttribute("currentUser", user);

			if (user.getRole() == "USUARIO") {
				model.addAttribute("isHost", true);
			}
		}
	}
}
