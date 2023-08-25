package View;

import javax.swing.*;

public class MyWindow extends JFrame{
	public MyWindow() {
		
	}
	
	public void showWindow() {
		this.setVisible(true);
	}
	
	public void showWindow(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void showWindow(String title, int width, int height) {
		this.setTitle(title);
		this.setLocation(width, height);
		this.setVisible(true);
	}
	
	public void showWindow(String title, int width, int height, int x, int y) {
		this.setTitle(title);
		this.setSize(x,y);
		this.setLocation(width, height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		m1.showWindow();
		
		MyWindow m2 = new MyWindow();
		m2.showWindow("MyWindow 2");
		
		MyWindow m3 = new MyWindow();
		m3.showWindow("MyWindow 3", 400, 200);
		
		MyWindow m4 = new MyWindow();
		m4.showWindow("MyWindow 4", 400, 200, 700, 500);
	}
}
