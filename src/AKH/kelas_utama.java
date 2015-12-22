package AKH;
import java.awt.Toolkit;

import javax.swing.*;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class kelas_utama {
	public static void main(String[]args)
	{
		try
		{
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			
		}catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		
		kelas_login objekUtama = new kelas_login();
		objekUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objekUtama.setVisible(true);
		objekUtama.setSize(174,232);
		objekUtama.setResizable(false);
		objekUtama.setLocationRelativeTo(null);
		
	}
}
