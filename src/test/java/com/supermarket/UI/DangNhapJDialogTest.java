package com.supermarket.UI;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DangNhapJDialogTest {

	private DangNhapJDialog dialog;
	private Thread t1;
	private Thread t2;
	private Thread t3;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Bắt đầu quá trình test DangNhapJDialog.java");		
	}
	
	@Before
	public void setUp() {
		dialog = new DangNhapJDialog(null, true);
		System.out.println("Bắt đầu test");
	}
	
	@Test
	public void testDangNhap_1() throws InterruptedException {		
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
				dialog.getBtnDangNhap().doClick();
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
		t3.start();
		t3.sleep(5000);
		dialog.setVisible(false);
		System.out.println("Testcase testDangNhap_1 có kết quả là fail");
		fail();
	}
	
	@Test
	public void testDangNhap_2() throws InterruptedException {		
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
				dialog.getBtnDangNhap().doClick();
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
		t3.start();
		t3.sleep(5000);
		dialog.setVisible(false);
		System.out.println("Testcase testDangNhap_2 có kết quả là pass");
	}
	
	@After
	public void tearDown() {
		dialog = null;
		t1 = null;
		t2 = null;
		t3 = null;
		System.out.println("Kết thúc test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Kết thúc quá trình test DangNhapJDialog.java \n\n\n");	
	}

}
