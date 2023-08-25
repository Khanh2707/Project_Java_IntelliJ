package View;

import javax.swing.*;

public class Demo {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		// kích cỡ
		jf.setSize(700, 500);
		
		//tên
		jf.setTitle("DemoWindow");
		
		// set vị trí hiển thị
		jf.setLocation(400, 200);
		
		// thoát chương trình khi đóng cửa sổ JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// DO_NOTHING_ON_CLOSE: ko đóng đc cửa sổ
		// .....
			
		// ko cho chỉnh kéo thả để chỉnh kích thước
		jf.setResizable(false);
		
		// cho phép hiển thị
		jf.setVisible(true);
	}
}
