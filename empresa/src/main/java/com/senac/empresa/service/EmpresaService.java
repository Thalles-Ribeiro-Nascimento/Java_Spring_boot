package com.senac.empresa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senac.empresa.entities.Empresa;
import com.senac.empresa.repository.EmpresaRepository;

import jakarta.transaction.Transactional;

@Service
public class EmpresaService {
	private EmpresaRepository empresaRepository;
	
	public EmpresaService(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository;
	}
	
	@Transactional
	public List<Empresa> getAllEmpresa() {
		return empresaRepository.findAll();
	}
}
