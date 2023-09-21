package modelo;

import java.time.LocalDate;

public class Reserva {
	private Integer Id;
	private LocalDate dataE;
	private LocalDate dataS;
	private String Valor;
	private String formaPago;
	
	public Reserva(LocalDate dataE, LocalDate dataS, String valor, String formaPago) {
		this.dataE = dataE;
		this.dataS = dataS;
		this.Valor = valor;
		this.formaPago = formaPago;
	}

	public Reserva(Integer id, LocalDate dataE, LocalDate dataS, String valor, String formaPago) {
		this.Id = id;
		this.dataE = dataE;
		this.dataS = dataS;
		this.Valor = valor;
		this.formaPago = formaPago;
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}

	public LocalDate getDataE() {
		return dataE;
	}
	public void setDataE(LocalDate dataE) {
		this.dataE = dataE;
	}

	public LocalDate getDataS() {
		return dataS;
	}
	public void setDataS(LocalDate dataS) {
		this.dataS = dataS;
	}

	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}

	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
}
