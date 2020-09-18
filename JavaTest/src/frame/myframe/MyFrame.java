package frame.myframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	private JPanel jp1;
	private JPanel jp2;
	
	private JButton loginBtn;
	private JButton cancelBtn;
	private JButton registerBtn;
	
	private String title;
	
	public MyFrame() {
		init(title);
	}
	
	public MyFrame(String title) {
		this();
		this.title = title;
	}
	
	public void init(String title) {
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		this.setLayout(new GridLayout(2, 1));
		loginBtn = new JButton("µÇÂ¼");
		registerBtn = new JButton("×¢²á");
		cancelBtn = new JButton("È¡Ïû");
		
		this.setBounds(100, 0, 200, 200);
		
		jp1.add(loginBtn);
		jp1.add(cancelBtn);
		jp2.add(registerBtn);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.black);
		this.setTitle(title);
		this.setVisible(true);
	}
	
}
