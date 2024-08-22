package com.senac.empresa.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.empresa.entities.Empresa;
import com.senac.empresa.service.EmpresaService;

@RestController
@RequestMapping (value="/empresa")
public class EmpresaController {
	private EmpresaService empresaService;
	
	@GetMapping
	public ResponseEntity<List<Empresa>> getAllEmpresa(){
		List<Empresa> empresas = empresaService.getAllEmpresa();
		if(empresas.isEmpty())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(empresas);
	}
}

