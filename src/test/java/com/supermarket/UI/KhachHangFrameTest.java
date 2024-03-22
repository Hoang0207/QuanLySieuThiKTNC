package com.supermarket.UI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class KhachHangFrameTest {
	private KhachHangFrame frame;
	private Thread t1;
	private Thread t2;
	private Thread t3;
	private DonHangDaDatKH DHDDframe;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Bắt đầu quá trình test KhachHangFrame.java");
	}

	@BeforeMethod
	public void beforeMethod() throws AWTException {
		frame = new KhachHangFrame();
		DHDDframe = new DonHangDaDatKH("KH001");
		System.out.println("Bắt đầu test");
	}
	@Test
	public void testBtnThemDonHang_1() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getTblDSSP().setRowSelectionInterval(0, 0);
				frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(0, 1));
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getTxtSoLuong().setText("0");
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
					frame.getBtnThem().doClick();
					Assert.fail("Dự đoán trước: Sai thông tin đặt hàng _ testBtnThemDonHang_1 pass");
				} catch (IllegalArgumentException e) {
					System.out.println("Không dự đoán được sai thông tin đặt hàng _ testBtnThemDonHang_1 fail");
					
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
	public void testBtnThemDonHang_2() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getTblDSSP().setRowSelectionInterval(0, 0);
				frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(0, 1));
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getTxtSoLuong().setText("ấdsasd");
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
					frame.getBtnThem().doClick();
					Assert.fail("Dự đoán trước: Sai thông tin đặt hàng _ testBtnThemDonHang_2 pass");
				} catch (IllegalArgumentException e) {
					System.out.println("Không dự đoán được sai thông tin đặt hàng _ testBtnThemDonHang_2 fail");
					
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
	public void testBtnThemDonHang_3() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getTblDSSP().setRowSelectionInterval(0, 0);
				frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(0, 1));
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getTxtSoLuong().setText("10");
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
					frame.getBtnThem().doClick();
					System.out.println("Testcase testBtnThemDonHang_3 pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnThemDonHang_3 fail");
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
	public void testBtnThemDonHang_4() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getTblDSSP().setRowSelectionInterval(5, 5);
				frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(5, 1));
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getTxtSoLuong().setText("10");

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
					frame.getBtnThem().doClick();
					frame.getTblDSSP().setRowSelectionInterval(0, 0);
					frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(0, 1));
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					frame.getTxtSoLuong().setText("10");

					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					frame.getBtnThem().doClick();
					System.out.println("Testcase testBtnThemDonHang_4 pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnThemDonHang_4 fail");
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
	public void testBtnLamMoiDonHang() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getTblDSSP().setRowSelectionInterval(0, 0);
				frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(0, 1));
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getTxtSoLuong().setText("10");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getBtnThem().doClick();
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					frame.getBtnLamMoiDH().doClick();
					System.out.println("Testcase testBtnLamMoiDonHang pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnLamMoiDonHang fail");
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
	public void testBtnLamMoiSanPham() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getTblDSSP().setRowSelectionInterval(0, 0);
				frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(0, 1));
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getTxtSoLuong().setText("10");

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
					frame.getBtnLamMoiSP().doClick();
					System.out.println("Testcase testBtnLamMoiSanPham pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnLamMoiSanPham fail");
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testBtnDanhSachDatHang() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getBtnDSDatHang().doClick();
//				DHDDframe.getTblDSDHDD().setRowSelectionInterval(0, 0);
//				String maDHString = (String) DHDDframe.getTblDSDHDD().getValueAt(0, 0);
//				System.out.println(maDHString);
//				DHDDframe.getTxtMaDH().setText((String)DHDDframe.getTblDSDHDD().getValueAt(0, 0));
//				DHDDframe.getTxtNgayDatHang().setText((String)DHDDframe.getTblDSDHDD().getValueAt(0, 1));
//				DHDDframe.getTxtMaKH().setText((String)DHDDframe.getTblDSDHDD().getValueAt(0, 2));
//				DHDDframe.getTxtTongTien().setText(String.valueOf(DHDDframe.getTblDSDHDD().getValueAt(0, 3)));
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					DHDDframe.getBtnMHChinh().doClick();
					System.out.println("Testcase testBtnDanhSachDatHang pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnDanhSachDatHang fail");
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testCboChungLoai() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getCboCL().setSelectedIndex(2);

				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getCboCL().setSelectedIndex(5);

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
					frame.getCboCL().setSelectedIndex(0);
					System.out.println("Testcase testCboChungLoai pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testCboChungLoai fail");
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testBtnDatHang() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				frame.getTblDSSP().setRowSelectionInterval(0, 0);
				frame.getTxtTenSP().setText((String) frame.getTblDSSP().getValueAt(0, 1));
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getTxtSoLuong().setText("10");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				frame.getBtnThem().doClick();
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
					frame.getBtnDatHang().doClick();
					System.out.println("Testcase testBtnDatHang pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnDatHang fail");
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
	public void testBtnDangXuat() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					frame.getBtnDangXuat().doClick();
					System.out.println("Testcase testBtnDangXuat pass");
				} catch (IllegalArgumentException e) {
					Assert.fail("Testcase testBtnDangXuat fail");
				}
			}
		};
		t1.start();
		t1.sleep(2000);
		t3.start();
		t3.sleep(1000);
	}
	@AfterMethod
	public void afterMethod() {
		frame.setVisible(false);
		frame = null;
		t1 = null;
		t2 = null;
		t3 = null;
		System.out.println("Kết thúc test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Kết thúc quá trình test KhachHangFrame.java \n\n\n");
	}

}
			
			