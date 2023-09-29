package service;

import java.util.List;

import model.Clientes;
import model.Cuentas;
import model.Cuentasdetalle;

public interface ClienteService {
	Clientes devuelveCliente(int idcliente);
	
	List<Cuentas> devuelveCuentaCliente(int idcliente);
	
	List<Cuentasdetalle> devuelveDetalleCuenta(int idcuenta);
}
