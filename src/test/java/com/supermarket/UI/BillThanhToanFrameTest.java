package com.supermarket.UI;

import org.testng.annotations.Test;

import com.supermarket.ENTITY.BillThanhToan;

import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BillThanhToanFrameTest {
	public BillThanhToanFrame framebill;
	private Robot robot;
	private Thread t1,t2,t3;
	
  @BeforeTest
  public static void beforeClass() throws AWTException{
	  System.out.println("Start Test");
  }

  @BeforeMethod
  public void beforeMethod() throws AWTException {
	  framebill = new BillThanhToanFrame(null, false);
	  robot = new Robot();
	  System.out.println("Starting test");
  }

  
  @Test
  public void getDataBill() throws Exception{
	  t1 = new Thread() {
		  @Override
		  public void run() {
			  framebill.setVisible(true);
		  }
	  };
	  t2= new Thread() {
		  @Override
		  public void run() {
			  try {
				  List<BillThanhToan> list = framebill.billThanhToan;
				  if(list.size()<=0) {
					  fail("Not Data");
				  }
				  else {
					  assertTrue(list.size()>1);
					  System.out.println("Pass");
				  }
			  }
			  catch(Exception e) {
				  e.printStackTrace();
			  }
			  
		  }
	  };
	  t1.start();
	  t1.sleep(3000);
	  t2.start();
	  t2.sleep(3000);
	  
  }
  
  @Test
  public void getDataBill1() throws Exception{
	  t1 = new Thread() {
		  @Override
		  public void run() {
			  framebill.setVisible(true);
		  }
	  };
	  t2= new Thread() {
		  @Override
		  public void run() {
			  try {
				  List<BillThanhToan> list = framebill.billThanhToan;
				  if(list.size()<=0) {
					  fail("Not Data");
				  }
				  else {
					  assertTrue(list.size()>1);
					  System.out.println("Pass");
				  }
			  }
			  catch(Exception e) {
				  e.printStackTrace();
			  }
			  
		  }
	  };
	  t1.start();
	  t1.sleep(3000);
	  t2.start();
	  t2.sleep(3000);
	  
  }
  
  @Test
  public void getDataBill2() throws Exception{
	  t1 = new Thread() {
		  @Override
		  public void run() {
			  framebill.setVisible(true);
		  }
	  };
	  t2= new Thread() {
		  @Override
		  public void run() {
			  try {
				  List<BillThanhToan> list = framebill.billThanhToan;
				  if(list.size()<=0) {
					  fail("Not Data");
				  }
				  else {
					  assertTrue(list.size()>1);
					  System.out.println("Pass");
				  }
			  }
			  catch(Exception e) {
				  e.printStackTrace();
			  }
			  
		  }
	  };
	  t1.start();
	  t1.sleep(3000);
	  t2.start();
	  t2.sleep(3000);
	  
  }
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  framebill.setVisible(false);
	  framebill = null;
	  t1=null;
	  t2=null;
	  t3=null;
	  System.out.println("Finish");
  }
  
  

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Finish Test");
  }

}
