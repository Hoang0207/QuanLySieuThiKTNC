package com.supermarket.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.supermarket.ENTITY.ChiTietHoaDon;

public class ChiTietHoaDonDAOTest {
	private ChiTietHoaDonDAO dao;

	@Before
	public void init() {
		dao = new ChiTietHoaDonDAO();
	}

	@After
	public void tearDown() {
		dao = null;
	}
	
	@Test
	public void testInsert1() {
		ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
		ChiTietHoaDon cthdtest = new ChiTietHoaDon(1,608.000,"SP0016","HDTest1");
		cthddao.insert(cthdtest);
		ChiTietHoaDon cthd = cthddao.selectById("HDTest1");
		assertNull(cthd);
		System.out.println("TestCase testInsert1 thực hiện thành công");
	}
	
	@Test
	public void testInsert2() {
		ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
		ChiTietHoaDon cthdtest = new ChiTietHoaDon(1,608.000,"SP0017","HDTest2");
		cthddao.insert(cthdtest);
		ChiTietHoaDon cthd = cthddao.selectById("HDTest2");
		assertNull(cthd);
		System.out.println("TestCase testInsert2 thực hiện thành công");
	}
	
	@Test
	public void selectByIdTest1() {
		ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
		String mahd = "HD002";
		ChiTietHoaDon cthd = cthddao.selectById(mahd);
		assertEquals(mahd, cthd.getMaHD());
		System.out.println("TestCase selectByIdTest1 thực hiện thành công");
	}
	
	@Test
	public void selectByIdTest2() {
		ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
		String mahd = "HD003";
		ChiTietHoaDon cthd = cthddao.selectById(mahd);
		assertEquals(mahd, cthd.getMaHD());
		System.out.println("TestCase selectByIdTest2 thực hiện thành công");
	}
	
	@Test
	public void selectALLTest() {
		ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
		List<ChiTietHoaDon> cthd = cthddao.selectAll();
		assertNotNull(cthd);
		System.out.println("TestCase selectALLTest thực hiện thành công");
	}
}
