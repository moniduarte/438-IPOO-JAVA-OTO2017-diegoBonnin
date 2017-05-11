package com.diegobonnin.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import com.diegobonnin.ipoo.repuestos.datos.cliente.Cliente;

public class DummyStorage implements Storage{
	
	// lista de clientes de "guau"
	private List<Cliente> clientes;
	
	public DummyStorage(){
		
		// variable para simular un autonumerico de base de datos
		int id=0;
		
		// inicializo mi vector
		clientes=new ArrayList<>();
		
		Cliente c=new Cliente();
		c.setId(++id);
		c.setNombre("Diego Bonnin");
		c.setNroDoc("9999999");
		c.setTipoDoc("CI");
		c.setPassword("123");
		
		clientes.add(c);
		
		
	}
	

	@Override
	public Cliente obtCliente(String tipoDoc, String nroDoc, String password) {
		// por cada cliente en el vector de clientes
		for(Cliente c: clientes){
			// si el tipo de documento del cliente es igual 
			// al tipo de documento recibido
			// y el nro. de documento es igual al recibido
			// etc.
			if(
					c.getTipoDoc().equals(tipoDoc) &&
					c.getNroDoc().equals(nroDoc) &&
					c.getPassword().equals(password)
			){
				// Entonces retorno ese cliente
				return c;
			}
		}
		// si no encontro, retorno null
		return null;
	}
	
	public static void main(String[] args){
		
		Storage s=new DummyStorage();
		Cliente c=s.obtCliente("CI", "9999999", "123");
		System.out.println("Cliente es null: " + c);
		System.out.println("Nombre Cliente: " + c.getNombre());
		
	}

}
