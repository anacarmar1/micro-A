package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Clientes;
import model.Cuentas;
import model.Cuentasdetalle;
import service.ClienteService;

@RestController
@RequestMapping("/cuenta")
public class CuentasController {
	@Autowired
	ClienteService cliente;
	//@Autowired
	//CuentaService cuenta;
	
	@GetMapping(value="/cliente/{idcliente}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Clientes devuelveCliente(@PathVariable("idcliente") int idcliente) {
		Clientes clienteDevuelto = cliente.devuelveCliente(idcliente);
		
		
		
		return clienteDevuelto;
		
	}
	
	@GetMapping(value="/cuentacliente/{idcliente}")
    public List<Cuentas> devuelveCuentaCliente(@PathVariable("idcliente") int idcliente){
		List<Cuentas> cuentaClienteDevuelto = cliente.devuelveCuentaCliente(idcliente);
		
		
		
		return cuentaClienteDevuelto;
		
	}
	
	@GetMapping(value="cuentadetalle/{idcuenta}")
	public List<Cuentasdetalle> devuelveDetalleCuenta(@PathVariable("idcuenta") int idcuenta) {
       List<Cuentasdetalle> detalleCuentaDevuelto = cliente.devuelveDetalleCuenta(idcuenta);
		
		
		return detalleCuentaDevuelto;
		
	}

}
