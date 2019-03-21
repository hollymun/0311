package practice;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Layout extends JFrame {


	

	public Layout() {
		setTitle("할 수 있을까..?");
		setSize(500, 500);
		setLocation(10, 10);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		panel.add(label);
		add(panel);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenu menu = new JMenu("음악(M)");
		menu.setMnemonic('M');
		menuBar.add(menu);
		
		JMenuItem search = new JMenuItem("찾아보기");
		JMenuItem play = new JMenuItem("재생");
		
		JTextField txt = new JTextField(30);
		panel.add(txt);
		
		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//파일 경로를 가지고 File 객체 생성 
					File f = new File(txt.getText());
					//파일의 경로를 url로 생성
					URL url = new URL("file:///" + f.getAbsolutePath());
					//오디오 재생기 생성 
					AudioClip audioClip = Applet.newAudioClip(url);
					audioClip.play();
					
					JFileChooser fc = new JFileChooser();
					FileNameExtensionFilter filter = new FileNameExtensionFilter("사운드 파일", "wav", "mp3");
					fc.setFileFilter(filter);

					int result = fc.showOpenDialog(null);
					if(result == JFileChooser.APPROVE_OPTION) {
						File f2 = fc.getSelectedFile();
						txt.setText(f2.getAbsolutePath());
					}	
				} catch (Exception e1) {
					System.out.printf("%s\n", e1.getMessage());
					e1.printStackTrace();
				}
			}
		};
		search.addActionListener(action);
		menu.add(search);

		menu.add(play);
		play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//파일 경로를 가지고 File 객체 생성 
					File f = new File(txt.getText());
					//파일의 경로를 url로 생성
					URL url = new URL("file:///" + f.getAbsolutePath());
					//오디오 재생기 생성 
					AudioClip audioClip = Applet.newAudioClip(url);
					audioClip.play();
				}
				catch(Exception e1) {
					System.out.printf("%s\n", e1.getMessage());
					e1.getStackTrace();
				}
			}
			
		});
		
		
		add(panel);
		//menu.add(play);
/*		

		
		JMenuItem search = new JMenuItem("찾아보기");
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//파일 경로를 가지고 File 객체 생성 
					File f = new File(txt.getText());
					//파일의 경로를 url로 생성
					URL url = new URL("file:///" + f.getAbsolutePath());
					//오디오 재생기 생성 
					AudioClip audioClip = Applet.newAudioClip(url);
					audioClip.play();
				}
				catch(Exception e1) {
					System.out.printf("%s\n", e1.getMessage());
					e1.getStackTrace();
				}
			}
		};
		search.addActionListener(action);
		menu.add(search);
		
		

		
		JButton loadUrl = new JButton("찾아보기");
		panel.add(loadUrl);
		
		loadUrl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser fc = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("mp3");
				int result = fc.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					txt.setText(f.getAbsolutePath());
				}	
			}
		});
		
		JButton play = new JButton(">>>");
		panel.add(play);
		play.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//파일 경로를 가지고 File 객체 생성 
					File f = new File(txt.getText());
					//파일의 경로를 url로 생성
					URL url = new URL("file:///" + f.getAbsolutePath());
					//오디오 재생기 생성 
					AudioClip audioClip = Applet.newAudioClip(url);
					audioClip.play();
				}
				catch(Exception e1) {
					System.out.printf("%s\n", e1.getMessage());
					e1.getStackTrace();
				}
			}
		});
		
*/		
		

		add(panel);
		setVisible(true);
	}

}
