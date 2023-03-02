/**
 * 
 */
package com.buenmaestro.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.buenmaestro.projectspringweb.dao.EmpleadoDAO;

/**
 * @author heber
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		
		return "Heber Mauricio Medina Miranda";
	}

}
