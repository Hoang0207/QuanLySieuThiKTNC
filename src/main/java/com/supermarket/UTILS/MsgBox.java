package com.supermarket.UTILS;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MsgBox {

	private static Thread t;

	public static void alert(Component parent, String message) {
		t = null;
		t = new Thread() {
			@Override
			public void run() {
				JOptionPane.showMessageDialog(parent, message, "Hệ thống quản lí siêu thị",
						JOptionPane.INFORMATION_MESSAGE);
			}
		};
		t.start();
	}

	public static boolean confirm(Component parent, String message) {
		int result = JOptionPane.showConfirmDialog(parent, message, "Hệ thống quản lý siêu thị",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		return result == JOptionPane.YES_NO_OPTION;
	}

	public static String prompt(Component parent, String message) {
		return JOptionPane.showInputDialog(parent, message, "Hệ thống quản lí siêu thị",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
