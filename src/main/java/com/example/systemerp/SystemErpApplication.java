package com.example.systemerp;

import com.example.systemerp.entity.Empleado;
import com.example.systemerp.entity.Empresa;
import com.example.systemerp.entity.Transaccion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemErpApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SystemErpApplication.class, args);
		//Instanciar Clase Empleado
		Empleado empleado1 = new Empleado();
		empleado1.setName("Javier");
		empleado1.setEmail("javier@hotmail");
		empleado1.setCreatedAt(1);
		empleado1.setUpdateAt(2);
		//Instanciar Clase Empresa
		Empresa empresa1 = new Empresa();
		empresa1.setName("System");
		empresa1.setDocument("1");
		empresa1.setPhone("55555");
		empresa1.setAddress("1");
		empresa1.setUpdatedAt(1);
		empresa1.setCreatedAt(2);
		//Instanciar Clase Transaccion
		Transaccion transaccion1 = new Transaccion();
		transaccion1.setAmount(10000);
		transaccion1.setConcept("Retiro");
		transaccion1.setUpdatedAt(1);
		transaccion1.setCreatedAt(2);
		System.out.println("Nombre "+ empleado1.getName()+" email: "+ empleado1.getEmail()+" creacion "+ empleado1.getCreatedAt()+" actualizacion "+empleado1.getUpdateAt());
		System.out.println("Nombre "+ empresa1.getName()+" Documento: "+ empresa1.getDocument()+" Telefono: "+ empresa1.getPhone()+" creacion"+ empresa1.getCreatedAt()+" actualizacion "+empresa1.getUpdatedAt());
		System.out.println("Monto "+ transaccion1.getAmount()+" concepto: "+ transaccion1.getConcept()+" creacion"+transaccion1.getCreatedAt()+" actualizacion "+transaccion1.getUpdatedAt());
	}

}
