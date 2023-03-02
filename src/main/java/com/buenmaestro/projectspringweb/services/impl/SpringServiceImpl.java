/**
 * 
 */
package com.buenmaestro.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buenmaestro.projectspringweb.dao.EmpleadoDAO;
import com.buenmaestro.projectspringweb.services.SpringService;

/**
 * @author heber
 *
 */
@Service
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

	@Override
	public String mostrarNombreEmpresa() {
		
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
