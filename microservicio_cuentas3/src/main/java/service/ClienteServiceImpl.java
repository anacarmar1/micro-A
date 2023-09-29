package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ClientesDao;
import model.Clientes;
import model.Cuentas;
import model.Cuentasdetalle;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClientesDao clientesDao;

	@Override
	public Clientes devuelveCliente(int idcliente) {
		// TODO Auto-generated method stub
		return clientesDao.devuelveCliente(idcliente);
		
		
	}
	
	@Override
	public List<Cuentas> devuelveCuentaCliente(int idcliente) {
		// TODO Auto-generated method stub
		return clientesDao.devuelveCuentaCliente(idcliente);
		
		
	}
	
	@Override
	public List<Cuentasdetalle> devuelveDetalleCuenta(int idcuenta) {
		// TODO Auto-generated method stub
		return clientesDao.devuelveDetalleCuenta(idcuenta);
		
		
	}
	
	

}
