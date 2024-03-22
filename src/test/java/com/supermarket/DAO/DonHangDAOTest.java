package com.supermarket.DAO;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.supermarket.ENTITY.DonHang;
import com.supermarket.UTILS.JdbcHelper;
import com.supermarket.UTILS.XDate;

public class DonHangDAOTest {
	
	private DonHangDAO dao;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Bắt đầu quá trình test DonHangDAOTest");
	}
	
	@Before
	public void init() {
		dao = new DonHangDAO();
		System.out.println("Chuẩn bị test");
	}
	
	@Test
	public void selectAllTest() {
		List<DonHang> list = dao.selectAll();
		assertNotNull(list);
		System.out.println("TestCase selectAllTest thực hiện thành công");
	}
	
	@Test
	public void selectByIdTest() {
		DonHang dh = dao.selectById("DH001");
		assertNotNull(dh);
		System.out.println("TestCase selectById thực hiện thành công");
	}
	
	@Test
	public void insertTest1() {
		DonHang dh = new DonHang();
		dh.setNgayDatHang(XDate.toDate("2024-2-3", "yyyy-MM-dd"));
		dh.setMaKH("KH001");
		dao.insert(dh);
		String maDH = (String)JdbcHelper.value("SELECT TOP 1  MADH FROM DONHANG ORDER BY MADH DESC ");
		assertNotNull(dao.selectById_2(maDH));
		System.out.println("TestCase insertTest1 thực hiện thành công");
	}
	
	@Test
	public void insertTest2() {
		DonHang dh = new DonHang();
		dh.setNgayDatHang(XDate.toDate("2023-4-5", "yyyy-MM-dd"));
		dh.setMaKH("KH003");
		dao.insert(dh);
		String maDH = (String)JdbcHelper.value("SELECT TOP 1  MADH FROM DONHANG ORDER BY MADH DESC ");
		assertNotNull(dao.selectById_2(maDH));
		System.out.println("TestCase insertTest2 thực hiện thành công");
	}
	
	@Test
	public void deleteTest1() {
        String maDH = "DH002";
        dao.delete(maDH);
        DonHang dh = dao.selectById(maDH);
        assertNull(dh);  
        System.out.println("TestCase deleteTest1 thực hiện thành công");
	}
	
	@Test
	public void deleteTest2() {
        String maDH = "DH003";
        dao.delete(maDH);
        DonHang dh = dao.selectById(maDH);
        assertNull(dh);   
        System.out.println("TestCase deleteTest2 thực hiện thành công");
	}
	
	@After
	public void tearDown() {
		dao = null;
		System.out.println("Kết thúc test");
	}
	
	@AfterClass
	public static void m2() {
		System.out.println("Kết thúc quá trình test DonHangDAOTest \n\n\n");
	}

}
