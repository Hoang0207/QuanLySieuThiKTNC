package com.supermarket.UI;

import org.testng.annotations.Test;

import com.supermarket.ENTITY.BillThanhToan;
import com.supermarket.ENTITY.SanPham;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;

import javax.swing.JLabel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NhanVienBanHangTest {
	NhanVienBanHang nvbh;
	private Robot robot;
	Thread t1,t2,t3;
 
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  nvbh = new NhanVienBanHang();
	  robot = new Robot();
	  System.out.println("Start test");
  }
  
  
  @Test
  public void btnAddBill() throws InterruptedException {
	  t1= new Thread() {
		  @Override
		  public void run() {
			  nvbh.setVisible(true);
		  }
	  };
	  t2= new Thread() {
		  @Override
		  public void run() {
			  nvbh.getTxtSoLuong().setText("4");
			  try {sleep(1000);}catch(Exception e) {e.printStackTrace();}
			  nvbh.getTxtTenSP().setText("abc");
			  try {sleep(1000);}catch(Exception e) {e.printStackTrace();}
			  nvbh.getBtnThemHD();
			  try {sleep(1000);}catch(Exception e) {e.printStackTrace();}
		  } 
	  };
	  t3 = new Thread() {
		@Override
		public void run() {
			try {
				nvbh.getBtnThemHD().doClick();
				Assert.fail("KHong du doan duoc");
			}catch(Exception e) {
				System.out.println("Dự đoán trước: sai tt");
			};
			
		}
	  };
	  t1.sleep(1000);
	  t1.start();
	  t2.sleep(3000);
	  t2.start();
	  t3.sleep(6000);
	  t3.start();
  }
  
  @Test
  public void btnAddBill1() throws InterruptedException {
	  t1= new Thread() {
		  @Override
		  public void run() {
			  nvbh.setVisible(true);
		  }
	  };
	  t2= new Thread() {
		  @Override
		  public void run() {
			  nvbh.getTxtSoLuong().setText("10");
			  try {sleep(1000);}catch(Exception e) {e.printStackTrace();}
			  nvbh.getTxtTenSP().setText("MILO");
			  try {sleep(1000);}catch(Exception e) {e.printStackTrace();}
			  nvbh.getBtnThemHD();
			  try {sleep(1000);}catch(Exception e) {e.printStackTrace();}
		  } 
	  };
	  t3 = new Thread() {
		@Override
		public void run() {
			try {
				nvbh.getBtnThemHD().doClick();
				Assert.fail("KHong du doan duoc");
			}catch(Exception e) {
				System.out.println("Dự đoán trước: sai tt");
			};
			
		}
	  };
	  t1.sleep(1000);
	  t1.start();
	  t2.sleep(3000);
	  t2.start();
	  t3.sleep(6000);
	  t3.start();
  }
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  nvbh.setVisible(false);
	  nvbh= null;
	  t1=null;
	  t2=null;
	  t3=null;
	  System.out.println("Finish");
  }
  
  


  @AfterTest
  public void afterTest() {
	  System.out.println("Finish Test");
  }

}
