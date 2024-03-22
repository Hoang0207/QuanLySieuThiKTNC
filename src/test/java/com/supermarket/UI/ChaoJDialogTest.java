package com.supermarket.UI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ChaoJDialogTest {
	private ChaoJDialog dialog;
	private Thread t1;
	private Thread t2;
	private Thread t3;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Bắt đầu quá trình test ChaoJDialog.java");
	}

	@BeforeMethod
	public void beforeMethod() {
		dialog = new ChaoJDialog(null, true);
		System.out.println("Bắt đầu test");
	}

	@Test
	public void testChaoJDialogLoading() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.setVisible(true);
					System.out.println("Testcase testChaoJDialogLoading pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testChaoJDialogLoading fail");
				}
			}
		};
		t1.start();
		t1.sleep(4000);	
	}
	@AfterMethod
	public void afterMethod() {
		dialog.setVisible(false);
		dialog = null;
		t1 = null;
		t2 = null;
		t3 = null;
		System.out.println("Kết thúc test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Kết thúc quá trình test ChaoJDialog.java \n\n\n");
	}

}