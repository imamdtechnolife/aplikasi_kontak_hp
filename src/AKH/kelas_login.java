package AKH;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class kelas_login extends JFrame{
	private JLabel judul,username, password;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	Connection koneksi = null;
		
	public kelas_login()
	{
		super("Login");
		setLayout(new FlowLayout());
		
		try{
		//Label
		judul = new JLabel("       Login       ");
		judul.setForeground(Color.GREEN);
		judul.setFont(new Font("Bookman Old Style",Font.BOLD, 20));
		username = new JLabel("Username");
		password = new JLabel("Password");
		
		//Field
		txtUsername = new JTextField(15);
		txtPassword = new JPasswordField(15);
		
		//icon
		Icon iconLogin = new ImageIcon(getClass().getResource("Image Login.png"));
		
		//Tombol
		btnLogin = new JButton("Masuk", iconLogin);
		
		//hendler
		penghendel hendel = new penghendel();
		btnLogin.addActionListener(hendel);
		
		//Masukkan Komponen
		add(judul);
		add(username);add(txtUsername);
		add(password);add(txtPassword);
		add(btnLogin);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada konstruktor : "+e.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	private class penghendel implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String i = txtUsername.getText();
			String o = txtPassword.getText();
				
			if(e.getSource()==btnLogin)
				{
					if(i.equals("imamdtechnolife") && o.equals("imamafriyadi"))
					{
						new kelas_frmUtama().show();
						dispose();
					}else
					{
						JOptionPane.showMessageDialog(null, "Username dan Password belum tepat! ","Pesan Error",JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Silahkan Ulangi Kembali :)","Pesan Error",JOptionPane.INFORMATION_MESSAGE);
					}
				}																		
			}				
		}
	}
