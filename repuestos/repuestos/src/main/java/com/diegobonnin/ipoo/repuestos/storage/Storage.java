package com.diegobonnin.ipoo.repuestos.storage;

import com.diegobonnin.ipoo.repuestos.datos.cliente.Cliente;

// declaración de interface
public interface Storage {
	
	Cliente obtCliente(String tipoDoc, String nroDoc, String password);

}
