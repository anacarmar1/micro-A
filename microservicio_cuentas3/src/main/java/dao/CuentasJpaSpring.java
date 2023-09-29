package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import model.Cuentas;
import model.Cuentasdetalle;

public interface CuentasJpaSpring extends JpaRepository<Cuentas,Integer> {
	@Transactional
	@Modifying
	@Query("select c from Cuentas c where c.idcliente = :idcliente")
	List<Cuentas> findCuentasByIdCliente(int idcliente);
	
	@Transactional
	@Modifying
	@Query("select cd from Cuentasdetalle cd where cd.idcuenta = :idcuenta")
	List<Cuentasdetalle> findCuentasDetalleByIdCuenta(int idcuenta);
	

	//List<Cuentas> findById(int idcliente);
}
