package com.supermarket.DAO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SanPhamExtendDaoTest {

	private SanPhamExtendDao dao;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Bắt đầu quá trình test DonHangDAOTest");
	}
	
	@Before
	public void init() {
		dao = new SanPhamExtendDao();
		System.out.println("Chuẩn bị test");
	}
	
	@Test
	public void selectAllTest() {
		assertNotNull(dao.selectAll());
		System.out.println("Testcase selectAllTest thực hiện thành công");
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
