package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import model.Clientes;
import model.Cuentas;
import model.Cuentasdetalle;

public interface ClientesJpaSpring extends JpaRepository<Clientes,Integer> {
	

	Clientes findById(int idcliente);
}
