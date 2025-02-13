package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public static Connection getConexion() {
		Connection conexion = null;
		String baseDatos = "zona_fit_db";
		String url = "jdbc:mysql://localhost:5542/" + baseDatos;
		String password = "1234";
		String user = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, user, password);
			
		}catch (Exception e) {
			System.out.println("Error al conectarnos a la BD: " + e.getMessage());
		}
		return conexion;
		
	}
	public static void main(String[] args) {
		Connection conexion = Conexion.getConexion();
		if(conexion!= null) {
			System.out.println("Estamos conectados : "+ conexion);
		
		}else {
			System.out.println("No se conecto a nada  : "+ conexion);

		}
	}
}
