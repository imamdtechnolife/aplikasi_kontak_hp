package AKH;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.table.DefaultTableModel;

import java.io.FileOutputStream;

import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;


public class kelas_frmUtama extends JFrame{
	private JLabel lblJudul,lblnoSeri_kontak,lblNama_kontak,lbl_no_kontak,lblKeterangan;
	private JTextField txtSeri_kontak,txtNama_kontak,txtNo_kontak,txtKeterangan,txtPencarian;
	private JButton simpan,ubah,hapus,tambah,batal,laporan,jumlah_data,cari,refresh;
	String fieldKontak[] = {"No. Seri","Nama Kontak","No. HP","Keterangan"};
	private DefaultTableModel modelTabel_kontak = new DefaultTableModel(null, fieldKontak);
	private JTable tabelKontak;
	
	public kelas_frmUtama()
	{
		
		super("AKHI");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500,708);
		setResizable(false);
		setLocationRelativeTo(null);
		
		try{
			//label
			lblJudul = new JLabel("         APLIKASI KONTAK HP IMAM       ");
			lblJudul.setForeground(Color.GREEN);
			lblJudul.setFont(new Font("Bookman Old Style",Font.BOLD,23));
			lblnoSeri_kontak = new JLabel("No. Seri");
			lblNama_kontak = new JLabel("Nama Kontak");
			lbl_no_kontak = new JLabel("No. HP");
			lblKeterangan = new JLabel("Keterangan");
			
			//field
			txtSeri_kontak = new JTextField(5);
			txtSeri_kontak.setEditable(false);
			txtNama_kontak = new JTextField(35);
			txtNama_kontak.setEditable(false);
			txtNo_kontak = new JTextField(15);
			txtNo_kontak.setEditable(false);
			txtKeterangan = new JTextField(20);
			txtKeterangan.setEditable(false);
			txtPencarian = new JTextField("Kolom Pencarian",15);
			txtPencarian.setEditable(true);	
			txtPencarian.setToolTipText("Kolom pencarian");
						
			//Icon
			Icon iconSimpan = new ImageIcon(getClass().getResource("Image Simpan.png"));
			Icon iconUbah = new ImageIcon(getClass().getResource("Image Ubah.png"));
			Icon iconHapus = new ImageIcon(getClass().getResource("Image Hapus.png"));
			Icon iconTambah = new ImageIcon(getClass().getResource("Image Tambah.png"));
			Icon iconBatal = new ImageIcon(getClass().getResource("Image Batal.png"));
			Icon iconLaporan = new ImageIcon(getClass().getResource("Image Laporan.png"));
			Icon iconJumlah = new ImageIcon(getClass().getResource("Image Jumlah.png"));
			Icon iconCari = new ImageIcon(getClass().getResource("Image Search.png"));
			Icon iconRefresh = new ImageIcon(getClass().getResource("Image Refresh.png"));
			
			//tombol
			simpan = new JButton("Simpan",iconSimpan);
			simpan.setEnabled(false);
			simpan.setToolTipText("Tekan tombol untuk menyimpan data ke Tabel");
			ubah = new JButton("Ubah",iconUbah);
			ubah.setToolTipText("Tekan tombol untuk mengubah data yang ada di Tabel");
			ubah.setEnabled(false);
			hapus = new JButton("Hapus",iconHapus);
			hapus.setToolTipText("Tekan tombol untuk menghapus data yang ada di Table");
			hapus.setEnabled(false);
			tambah = new JButton("Tambah",iconTambah);
			tambah.setToolTipText("Tekan untuk menambah inputan baru ke Tabel");
			batal = new JButton("Batal",iconBatal);
			batal.setEnabled(false);
			batal.setToolTipText("Tekan tombol untuk membatalkan proses penyimpanan");
			laporan = new JButton("Cetak",iconLaporan);
			laporan.setToolTipText("Tekan tombol untuk mencetak Laporan");
			jumlah_data = new JButton("Total Data",iconJumlah);
			jumlah_data.setToolTipText("Tekan tombol untuk mengecek total kontak yang sudah masuk ke Tabel");
			cari = new JButton(iconCari);
			cari.setEnabled(true);
			refresh = new JButton(iconRefresh);
			refresh.setToolTipText("Refresh");
			refresh.setEnabled(false);
								
			//tabel
			tabelKontak = new JTable();
			tabelKontak.setModel(modelTabel_kontak);
			tabelKontak.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tabelKontak.setToolTipText("Klik salah satu field jika ingin mengubah / menghapus data");
			tabelKontak.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent e)
				{
					ambil_data();
				}
			});
	
			//memasukkan komponen
			add(lblJudul);
			add(lblnoSeri_kontak);add(txtSeri_kontak);
			add(lblNama_kontak);add(txtNama_kontak);
			add(lbl_no_kontak);add(txtNo_kontak);
			add(lblKeterangan);add(txtKeterangan);
			add(tambah);
			add(simpan);
			add(batal);
			add(ubah);
			add(hapus);
			add(laporan);
			add(jumlah_data);
			add(txtPencarian);add(cari);
			add(refresh);
			add(new JScrollPane(tabelKontak));
						
			//hendel
			penghendel hendel = new penghendel();
			simpan.addActionListener(hendel);
			ubah.addActionListener(hendel);
			hapus.addActionListener(hendel);
			tambah.addActionListener(hendel);
			batal.addActionListener(hendel);
			laporan.addActionListener(hendel);
			jumlah_data.addActionListener(hendel);
			cari.addActionListener(hendel);
			refresh.addActionListener(hendel);
			txtPencarian.addActionListener(hendel);
			
			JOptionPane.showMessageDialog(null, "Selamat Datang","Pesan",JOptionPane.INFORMATION_MESSAGE);
			tampil_tabelKontak();
						
			}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Konstruktor: "+e.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
		
		}		
	}
	
	private class penghendel implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{			
			
			if(e.getSource()==tambah)
			{
				tambah.setEnabled(false);
				txtKeterangan.setEditable(true);
				txtNama_kontak.setEditable(true);
				txtNo_kontak.setEditable(true);
				simpan.setEnabled(true);
				batal.setEnabled(true);
				hapus.setEnabled(false);
				ubah.setEnabled(false);
				txtSeri_kontak.setText("");
				txtNama_kontak.setText("");
				txtNo_kontak.setText("");
				txtKeterangan.setText("");
				tabelKontak.setEnabled(false);
				laporan.setEnabled(false);
				jumlah_data.setEnabled(false);
				txtPencarian.setEditable(false);
				cari.setEnabled(false);
				txtNama_kontak.requestFocus();
				
				kodeOtomatis();
				
				
			}else if(e.getSource()==simpan)
			{
				String a = txtNama_kontak.getText();
				String b = txtNo_kontak.getText();
				String c = txtKeterangan.getText();
				
				if(a.equals("") || b.equals("") || c.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Inputan masih ada yang kosong, silahkan lengkapi duhulu inputan yang kosong tersebut :)");
				}else 
				{
					try
					{
						Connection koneksi = Koneksi.getKoneksi();
						PreparedStatement ps = koneksi.prepareStatement("insert into kontak_samsung (nama_kontak,no_hp,keterangan) values (?,?,?)");
						
						ps.setString(1, txtNama_kontak.getText());
						ps.setString(2,txtNo_kontak.getText());
						ps.setString(3, txtKeterangan.getText());
						
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data Berhasail Tersimpan","Pesan",JOptionPane.INFORMATION_MESSAGE);
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada tombol simpan : "+ex.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
					}
					finally
					{
						tampil_tabelKontak();
						kembali();
					}
				}
			}
			else if(e.getSource()==batal)
			{
				JOptionPane.showMessageDialog(null, "Anda telah membatalkan proses penginputan","Pesan",JOptionPane.INFORMATION_MESSAGE);
				kembali();
			}		
			else if(e.getSource()==ubah)
			{
							
				String a = txtNama_kontak.getText();
				String b = txtNo_kontak.getText();
				String c = txtKeterangan.getText();
				
				if(a.equals("") || b.equals("") || c.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Inputan masih ada yang kosong, silahkan lengkapi duhulu inputan yang kosong tersebut :)");
				}else
				{

					try
					{									
						Connection koneksi = Koneksi.getKoneksi();
						PreparedStatement ps = koneksi.prepareStatement("update kontak_samsung set nama_kontak=?, no_hp=?, keterangan=? where no_seri=?");
						
						ps.setString(1, txtNama_kontak.getText());
						ps.setString(2, txtNo_kontak.getText());
						ps.setString(3, txtKeterangan.getText());
						ps.setInt(4, Integer.parseInt(txtSeri_kontak.getText()));
						
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data berhasil diubah");
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Terjadi Kesalahan : "+ex.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
					}
					finally
					{
						tampil_tabelKontak();
						kembali();
					}
				}
			}else if(e.getSource()==hapus)
			{
				String a = txtNama_kontak.getText();
				String b = txtNo_kontak.getText();
				String c = txtKeterangan.getText();
				
				if(a.equals("") || b.equals("") || c.equals("") )
				{
					JOptionPane.showMessageDialog(null, "Anda belum memilih data yang ingin dihapus");
					JOptionPane.showMessageDialog(null, "Silahkan pilih terlebih dahulu :)");
				}else
				{
					try
					{
						
						Connection koneksi = Koneksi.getKoneksi();
						PreparedStatement ps = koneksi.prepareStatement("delete from kontak_samsung where no_seri=?");
						
						ps.setInt(1, Integer.parseInt(txtSeri_kontak.getText()));
						
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data berhasil dihapus","Pesan",JOptionPane.INFORMATION_MESSAGE);
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada tombol hapus: "+ex.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
					}
					finally
					{
						tampil_tabelKontak();
						kembali();
					}
				}
			}else if(e.getSource()==laporan)
			{
				FileOutputStream i = null;
				
				JasperReportBuilder report = DynamicReports.report();
				report.columns(Columns.column("No. Seri","no_seri", DataTypes.integerType()),
						Columns.column("Nama Kontak","nama_kontak", DataTypes.stringType()),
						Columns.column("No. HP","no_hp", DataTypes.stringType()),
						Columns.column("Keterangan","keterangan", DataTypes.stringType())
						);
				report.title(
						Components.text("List Kontak HP IMAM")
						.setHorizontalAlignment(HorizontalAlignment.CENTER))
						.pageFooter(Components.pageXofY())
						.setDataSource("select no_seri, nama_kontak, no_hp, keterangan from kontak_samsung",Koneksi.getKoneksi());
						
				try
				{
					report.show();	
					//report.toPdf(i);
					
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada pembuatan report: "+ex.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
				}finally
				{
					
				}
				
			}else if(e.getSource()==jumlah_data)
			{
				try{
					Connection koneksi = Koneksi.getKoneksi();
					Statement statement = koneksi.createStatement();
					ResultSet result = statement.executeQuery("select count(*) from kontak_samsung");
					
					while(result.next())
					{
						Object obj[] = new Object[1];
						obj[0] = result.getInt(1);
						
						JOptionPane.showMessageDialog(null, obj,"Total Data Masuk",JOptionPane.INFORMATION_MESSAGE);
					}	
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada tombol total data: "+ex.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
				}			
			}else if(e.getSource()==cari)
			{
				modelTabel_kontak.getDataVector().removeAllElements();
				try
				{
					Connection koneksi = Koneksi.getKoneksi();
					Statement state = koneksi.createStatement();
					ResultSet result = state.executeQuery("select * from kontak_samsung where nama_kontak like '%"+txtPencarian.getText()+"%'");
					
					if(result==null){
						JOptionPane.showMessageDialog(null, "Data tidak ditemukan","Pesan",JOptionPane.INFORMATION_MESSAGE);
					}else
					{
						
						while(result.next())
						{
							Object obj[] = new Object[4];
							obj[0] = result.getInt(1);
							obj[1] = result.getString(2);
							obj[2] = result.getString(3);
							obj[3] = result.getString(4);
							
							modelTabel_kontak.addRow(obj);
						}
					}
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada tombol cari foto: "+ex.getMessage(),"Warning",JOptionPane.INFORMATION_MESSAGE);
				}finally
				{
					refresh.setEnabled(true);
				}
			}else if(e.getSource()==refresh)
			{
				kembali();
				tampil_tabelKontak();
				refresh.setEnabled(false);
			}
			
		}
	}

	public void tampil_tabelKontak()
	{
		modelTabel_kontak.getDataVector().removeAllElements();
		modelTabel_kontak.fireTableDataChanged();
		
		
		try
		{
			
			Connection koneksi = Koneksi.getKoneksi();
			Statement statement = koneksi.createStatement();
			ResultSet result = statement.executeQuery("select * from kontak_samsung");
			
			while(result.next())
			{
				Object obj[] = new Object[4];
				obj[0] = result.getInt(1);
				obj[1] = result.getString(2);
				obj[2] = result.getString(3);
				obj[3] = result.getString(4);
				
				modelTabel_kontak.addRow(obj);
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada Tabel: "+ex.getMessage(),"Pesan Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void ambil_data()
	{
		int i = tabelKontak.getSelectedRow();
		
		if(i==-1)
		{
			return;
		}
		
		int ambilserikontak = (int) modelTabel_kontak.getValueAt(i, 0);
		txtSeri_kontak.setText(""+ambilserikontak);
		
		String ambilnamakontak = (String) modelTabel_kontak.getValueAt(i, 1);
		txtNama_kontak.setText(ambilnamakontak);
		txtNama_kontak.setEditable(true);
		
		String ambilnohp = (String) modelTabel_kontak.getValueAt(i, 2);
		txtNo_kontak.setText(ambilnohp);
		txtNo_kontak.setEditable(true);
		
		String ambilketerangan = (String) modelTabel_kontak.getValueAt(i, 3);
		txtKeterangan.setText(ambilketerangan);
		txtKeterangan.setEditable(true);

		ubah.setEnabled(true);
		hapus.setEnabled(true);
		refresh.setEnabled(true);
		
	}
	
	public void kembali()
	{
		tambah.setEnabled(true);
		txtKeterangan.setEditable(false);
		txtNama_kontak.setEditable(false);
		txtNo_kontak.setEditable(false);
		simpan.setEnabled(false);
		hapus.setEnabled(false);
		ubah.setEnabled(false);
		batal.setEnabled(false);
		txtSeri_kontak.setText("");
		txtNama_kontak.setText("");
		txtNo_kontak.setText("");
		txtKeterangan.setText("");
		tabelKontak.enable(true);
		txtPencarian.setEditable(true);
		cari.setEnabled(true);
		jumlah_data.setEnabled(true);
		laporan.setEnabled(true);
		txtPencarian.setText("");
	}
	
	
	public void kodeOtomatis()
	{
		try
		{
			Connection connect = Koneksi.getKoneksi();
			Statement state = connect.createStatement();
			ResultSet result = state.executeQuery("select no_seri from kontak_samsung order by no_seri desc ");
			
			if(result.next())
			{
				int i = Integer.parseInt(result.getString(1)) + 1;
				txtSeri_kontak.setText(Integer.toString(i));
			}
			
		}catch(Exception e)
		{
			
		}

	}
}


