package com.supermarket.DAO;

import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.supermarket.ENTITY.HoaDon;

public class HoaDonDAOTest {
	private HoaDonDAO dao;
	
	@Before
	public void init() {
		dao = new HoaDonDAO();
	}
	
	@After
	public void tearDown() {
		dao = null;
	}
	
	
	@Test
	public void testDelete1() {
		HoaDonDAO hddao = new HoaDonDAO();
		 String maHD = "HD002";
	        hddao.delete(maHD);
	        HoaDon hd = hddao.selectById(maHD);
	        assertNull(hd);
	        System.out.println("TestCase testDelete1 thực hiện thành công");
	}
	
	@Test
	public void testDelete2() {
		HoaDonDAO hddao = new HoaDonDAO();
		 String maHD = "HD003";
	        hddao.delete(maHD);
	        HoaDon hd = hddao.selectById(maHD);
	        assertNull(hd);
	        System.out.println("TestCase testDelete2 thực hiện thành công");
	}
	
	@Test
	public void testSelectById1() {
		HoaDonDAO hddao = new HoaDonDAO();
		 String maHD = "HD002";
	        hddao.selectById(maHD);
	        HoaDon hd = hddao.selectById(maHD);
	        assertNull(hd);
	        System.out.println("TestCase testSelectById1 thực hiện thành công");
	}
	
	@Test
	public void testSelectById2() {
		HoaDonDAO hddao = new HoaDonDAO();
		 String maHD = "HD002";
	        hddao.selectById(maHD);
	        HoaDon hd = hddao.selectById(maHD);
	        assertNull(hd);
	        System.out.println("TestCase testSelectById2 thực hiện thành công");
	}
	
	@Test
	public void testInsert1() {
		HoaDonDAO hddao = new HoaDonDAO();
		HoaDon hdtest = new HoaDon("HDTest1",new Date(),"HDTest1");
		hddao.insert(hdtest);
		HoaDon hd = hddao.selectById("HDTest1");
		assertNull(hd);
		System.out.println("TestCase testInsert1 thực hiện thành công");
	}
	
	@Test
	public void testInsert2() {
		HoaDonDAO hddao = new HoaDonDAO();
		HoaDon hdtest = new HoaDon("HDTest2",new Date(),"HDTest2");
		hddao.insert(hdtest);
		HoaDon hd = hddao.selectById("HDTest2");
		assertNull(hd);
		System.out.println("TestCase testInsert2 thực hiện thành công");
	}
	
}
