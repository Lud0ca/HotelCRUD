package modelo;

import java.time.LocalDate;

public class Huespedes {
	private Integer Id;
	private String Nombre;
	private String Apellido;
	private LocalDate fechaNacimiento;
	private String Nacionalidad;
	private String Telefono;
	private Integer IdReserva;
	
	public Huespedes(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String telefono,Integer idReserva) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.Nacionalidad = nacionalidad;
		this.Telefono = telefono;
		this.IdReserva = idReserva;
	}

	public Huespedes(Integer id, String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad,
		String telefono, Integer idReserva) {
		this.Id = id;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.Nacionalidad = nacionalidad;
		this.Telefono = telefono;
		this.IdReserva = idReserva;
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Integer getIdReserva() {
		return IdReserva;
	}
	public void setIdReserva(Integer idReserva) {
		IdReserva = idReserva;
	}
}
