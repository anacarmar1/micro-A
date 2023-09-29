package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Clientes;
import model.Cuentas;
import model.Cuentasdetalle;

@Repository
public class ClientesDaoImpl implements ClientesDao {
	
	
	@Autowired
	ClientesJpaSpring cliente;
	
	@Autowired
	CuentasJpaSpring cuenta;
	


	@Override
	public Clientes devuelveCliente(int idcliente) {
		// TODO Auto-generated method stub
		return cliente.findById(idcliente);
	}
	
	@Override
	public List<Cuentas> devuelveCuentaCliente(int idcliente) {
		// TODO Auto-generated method stub
		return cuenta.findCuentasByIdCliente(idcliente);
	}
	
	@Override
	public List<Cuentasdetalle> devuelveDetalleCuenta(int idcuenta){
		// TODO Auto-generated method stub
		return cuenta.findCuentasDetalleByIdCuenta(idcuenta);
	}

}
