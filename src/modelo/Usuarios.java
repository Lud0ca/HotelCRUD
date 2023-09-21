package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Factory.ConexionBase;

public class Usuarios {
	private String Nombre;
	private String Contrasena;
	
	public Usuarios(String nombre, String contrasena) {
		this.Nombre = nombre;
		this.Contrasena = contrasena;
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasenia(String contrasena) {
		Contrasena = contrasena;
	}
	
	public static boolean validarUsuario(String nombre,String contrasena) {
		ConexionBase con = new ConexionBase();
		Connection connec = null;
		PreparedStatement state = null;
		ResultSet result = null;
		try {
			connec = con.conectarBase();
			state = connec.prepareStatement(" SELECT * FROM usuarios WHERE nombre=? AND contrasenia =? ");
			state.setString(1, nombre);
			state.setString(2, contrasena);
			result = state.executeQuery();
			return result.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(result != null) {
					result.close();
				}
				if(state != null) {
					state.close();
				}
				if(connec != null) {
					connec.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
