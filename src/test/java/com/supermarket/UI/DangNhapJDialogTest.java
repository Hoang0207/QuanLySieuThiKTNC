package com.supermarket.UI;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DangNhapJDialogTest {

	private DangNhapJDialog dialog;
	private Thread t1;
	private Thread t2;
	private Thread t3;
	
	@BeforeTest
	public static void beforeClass() throws AWTException {
		System.out.println("Bắt đầu quá trình test DangNhapJDialog.java");		
	}
	
	@BeforeMethod
	public void setUp() {
		dialog = new DangNhapJDialog(null, true);
		System.out.println("Bắt đầu test");
	}
		
	@Test
	public void testBtnDangNhap_1() throws InterruptedException {		
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTxtTenDangNhap().setText("hoang0207");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				dialog.getTxtMatKhau().setText("020720");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getBtnDangNhap().doClick();
					Assert.fail("Không dự đoán được sai thông tin đăng nhập _ testBtnDangNhap_1 fail");
				} catch (IllegalArgumentException e) {
					System.out.println("Dự đoán trước: Sai thông tin đăng nhập _ testBtnDangNhap_1 pass");
				}
				
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
		t3.start();
		t3.sleep(4000);
	}
	
	@Test
	public void testBtnDangNhap_2() throws InterruptedException {		
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTxtTenDangNhap().setText("hoang0207");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				dialog.getTxtMatKhau().setText("02072003");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getBtnDangNhap().doClick();
					System.out.println("Testcase testBtnDangNhap_2 pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnDangNhap_2 fail");
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
		t3.start();
		t3.sleep(4000);
	}	
	
	@AfterMethod
	public void tearDown() {
		dialog.setVisible(false);
		dialog = null;
		t1 = null;
		t2 = null;
		t3 = null;
		System.out.println("Kết thúc test");
	}
	
	@AfterTest
	public static void afterClass() {
		System.out.println("Kết thúc quá trình test DangNhapJDialog.java \n\n\n");	
	}

}
