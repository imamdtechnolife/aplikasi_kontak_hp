package AKH;
import java.sql.DriverManager;
import java.sql.Connection;

import javax.swing.JOptionPane;

public class Koneksi {
	
	private static Connection koneksi;
	
	public static Connection getKoneksi()
	{
		if(koneksi==null)
			try
			{
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/kontak","root","");
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "terjadi kesalahan pada method getkoneksi"+e.getMessage(),"Pesan",JOptionPane.INFORMATION_MESSAGE);
			}
			
				return koneksi;
			
	}
}
