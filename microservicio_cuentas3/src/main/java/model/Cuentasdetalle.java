package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cuentasdetalle database table.
 * 
 */
@Entity
@NamedQuery(name="Cuentasdetalle.findAll", query="SELECT c FROM Cuentasdetalle c")
public class Cuentasdetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcuentadetalle;

	private int categoria;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private float importe;

	private float saldo;
	
	private int idcuenta;

	public Cuentasdetalle() {
	}

	public int getIdcuentadetalle() {
		return this.idcuentadetalle;
	}

	public void setIdcuentadetalle(int idcuentadetalle) {
		this.idcuentadetalle = idcuentadetalle;
	}

	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getImporte() {
		return this.importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getIdcuenta() {
		return idcuenta;
	}

	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}
	
	

}