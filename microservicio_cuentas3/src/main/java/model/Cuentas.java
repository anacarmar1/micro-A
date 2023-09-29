package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cuentas database table.
 * 
 */
@Entity
@Table(name="cuentas")
@NamedQuery(name="Cuentas.findAll", query="SELECT c FROM Cuentas c")
public class Cuentas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcuenta;

	private String banco;

	private int cuentaclabe;

	private int numerocuenta;

	private int sucursal;

	private int idcliente;

	public Cuentas() {
	}

	public int getIdcuenta() {
		return this.idcuenta;
	}

	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}

	public String getBanco() {
		return this.banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getCuentaclabe() {
		return this.cuentaclabe;
	}

	public void setCuentaclabe(int cuentaclabe) {
		this.cuentaclabe = cuentaclabe;
	}

	public int getNumerocuenta() {
		return this.numerocuenta;
	}

	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public int getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setTitular(int idcliente) {
		this.idcliente = idcliente;
	}

}