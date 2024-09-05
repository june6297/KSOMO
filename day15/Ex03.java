import java.awt.Frame;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ex03 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setTitle("����");
//		Image img2=Toolkit.getDefaultToolkit().createImage("log.jpg");
		ImageIcon icon=new ImageIcon("log.jpg");
		Image img=icon.getImage();
		f.setIconImage(img);
		
		MenuBar mb=new MenuBar();
		Menu m2=new Menu("�޴�2");
		Menu mi4=new Menu("2ù��°");
		
		MenuItem mi5=new MenuItem("2�ι�°");
		MenuItem mi6=new MenuItem("2����°");
		Menu m1=new Menu("�޴�1");
		MenuItem mi1=new MenuItem("1ù��°");
		MenuItem mi2=new MenuItem("1�ι�°");
		MenuItem mi3=new MenuItem("1����°");
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�޴� ����");
			}
		});
		m1.add(mi1);
		m1.add(mi2);
		m1.addSeparator();
		m1.add(mi3);
		m2.add(mi4);
		mi4.add(mi5);
		mi4.add(mi6);
		mb.add(m1);
		mb.add(m2);
		f.setMenuBar(mb);

		f.setSize(500,300);
		f.setLocation(-3840,50);
		f.setVisible(true);
	}

	
	
	
	
	
	
}
