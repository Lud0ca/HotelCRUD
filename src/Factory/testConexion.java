package Factory;

import java.sql.Connection;
import java.sql.SQLException;

public class testConexion {
	public static void main(String[] args) throws SQLException {
		ConexionBase con = new ConexionBase();
		Connection conec = con.conectarBase();
		
		System.out.println("conexion exitosa");
		conec.close();
		System.out.println("cerrando conexion");
	}
}
