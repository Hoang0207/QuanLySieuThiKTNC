package com.supermarket.UI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Admin_FrameTest {

	private Admin_Frame dialog;
	private Thread t1;
	private Thread t2;
	private Thread t3;

	@BeforeMethod
	public void beforeMethod() {
		dialog = new Admin_Frame();
		System.out.println("Bắt đầu test");
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

	@BeforeTest
	public void beforeTest() {
		System.out.println("Bắt đầu quá trình test Admin_FrameTest.java");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Kết thúc quá trình test DangNhapJDialog.java \n\n\n");
	}

	@Test
	public void testBtnTim_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTxtTim_SP().setText("Diếp Cá");
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
					dialog.getBtnTim_SP().doClick();
					System.out.println("testBtnTim_SP: Pass");
				} catch (IllegalArgumentException e) {
					System.out.println("testBtnTim_SP: Fail");
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(1000);
		t3.start();
		t3.sleep(1000);
	}

	@Test
	public void testBtnReset_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTxtTim_SP().setText("Diếp Cá");

					try {
						sleep(1000);
						dialog.getBtnTim_SP().doClick();
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					dialog.getBtnReset_SP().doClick();
					System.out.println("getBtnReset_SP: Pass");
				} catch (IllegalArgumentException e) {
					System.out.println("getBtnReset_SP: Fail");
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
	}

	@Test
	public void testBtnDieuHuong_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getBtnFirst_SP().doClick();
					System.out.println("BtnFirst_SP: Pass");
					sleep(1000);
					dialog.getBtnNext_SP().doClick();
					System.out.println("BtnNext_SP: Pass");
					sleep(1000);
					dialog.getBtnLast_Sp().doClick();
					System.out.println("BtnLast_Sp: Pass");
					sleep(1000);
					dialog.getBtnPrevious_SP().doClick();
					System.out.println("BtnPrevious_SP: Pass");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(5000);

	}

	@Test
	public void testClickOnTable_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTbl_SP().setRowSelectionInterval(1, 2);
				try {
					System.out.println("testClickOnTable_SP: PASS");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(1000);
	}

	@Test
	public void testBtnMoi_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTbl_SP().setRowSelectionInterval(1, 2);

				try {
					sleep(1000);
					dialog.getBtnMoi_SP().doClick();
					try {
						sleep(1000);
						System.out.println("testBtnMoi_SP: PASS");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(2000);

	}

	@Test
	public void testBtnThem_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getBtnMoi_SP().doClick();
				dialog.getTxtMa_SP().setText("SP0031");
				dialog.getTxtTen_SP().setText("cam");
				dialog.getTxtSoLuong_SP().setText("30");
				dialog.getTxtGia_SP().setText("10.3");
				dialog.getCboChungLoai_SP().setSelectedIndex(5);

				try {
					sleep(1000);
					dialog.getBtnThem_SP().doClick();
					System.out.println("BtnThem_SP: Pass");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(5000);

	}

	@Test
	public void testBtnXoa_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getBtnFirst_SP().doClick();
				try {
					sleep(2000);
					dialog.getBtnXoa_SP().doClick();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_SP: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(5000);
		t3.start();
		t3.sleep(5000);
	}

	@Test
	public void testBtnSua_SP() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getBtnFirst_SP().doClick();
				try {
					sleep(2000);
					dialog.getTxtTen_SP().setText("Mận");
					dialog.getCboChungLoai_SP().setSelectedIndex(2);
					sleep(2000);
					dialog.getBtnSua_SP().doClick();
					System.out.println("TestBtnSua_SP: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_NV: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);
		t3.start();
		t3.sleep(2000);

	}

	@Test
	public void testBtnDieuHuong_CL() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(1);
					sleep(2000);
					dialog.getBtnFirst_CL().doClick();
					System.out.println("BtnFirst_CL: Pass");
					sleep(1000);
					dialog.getBtnNext_CL().doClick();
					System.out.println("BtnNext_CL: Pass");
					sleep(1000);
					dialog.getBtnLast_CL().doClick();
					System.out.println("BtnLast_CL: Pass");
					sleep(1000);
					dialog.getBtnPrevious_CL().doClick();
					System.out.println("BtnPrevious_CL: Pass");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);

	}

	@Test
	public void testClickOnTable_CL() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTabs().setSelectedIndex(1);

				try {

					sleep(1000);
					dialog.getTbl_CL().setRowSelectionInterval(1, 2);
					System.out.println("testClickOnTable_CL: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
	}

	@Test
	public void testBtnMoi_CL() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTabs().setSelectedIndex(1);

				try {

					dialog.getTbl_CL().setRowSelectionInterval(1, 2);
					sleep(1000);
					dialog.getBtnMoi_CL().doClick();
					try {
						sleep(1000);
						System.out.println("testBtnMoi_CL: PASS");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(4000);

	}

	@Test
	public void testBtnThem_CL() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTabs().setSelectedIndex(1);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				dialog.getBtnMoi_CL().doClick();
				dialog.getTxtMa_CL().setText("CL011");
				dialog.getTxtTen_CL().setText("Nến Thơm");
				dialog.getTxtMieuTa_CL().setText("Sản phẩm nến Thắp sáng có mùi thơm");
				try {
					sleep(1000);
					dialog.getBtnThem_CL().doClick();
					System.out.println("BtnThem_CL: Pass");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(5000);

	}

	@Test
	public void testBtnXoa_CL() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(1);
					sleep(2000);
					dialog.getBtnFirst_CL().doClick();
					dialog.getBtnXoa_CL().setEnabled(true);
					sleep(2000);
					dialog.getBtnXoa_CL().doClick();
					System.out.println("testBtnXoa_CL: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);

	}

	@Test
	public void testBtnSua_CL() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {

				try {
					dialog.getTabs().setSelectedIndex(1);
					sleep(2000);
					dialog.getBtnFirst_CL().doClick();
					dialog.getBtnSua_CL().setEnabled(true);
					sleep(2000);
					dialog.getTxtTen_CL().setText("Nến");
					sleep(2000);
					dialog.getBtnSua_CL().doClick();
					System.out.println("TestBtnSua_CL: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_NV: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(8000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testBtnDieuHuong_NV() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(2);
					sleep(2000);
					dialog.getBtnFirst_NV().doClick();
					System.out.println("BtnFirst_NV: Pass");
					sleep(1000);
					dialog.getBtnNext_NV().doClick();
					System.out.println("BtnNext_NV: Pass");
					sleep(1000);
					dialog.getBtnLast_NV().doClick();
					System.out.println("BtnLast_NV: Pass");
					sleep(1000);
					dialog.getBtnPrevious_NV().doClick();
					System.out.println("BtnPrevious_NV: Pass");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);

	}

	@Test
	public void testClickOnTable_NV() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(2);
					sleep(1000);
					try {
						Robot robot = new Robot();
						robot.mouseMove(700, 600);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(5000);
					} catch (AWTException e) {
						e.printStackTrace();
					}
					System.out.println("testClickOnTable_NV: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(3000);
	}

	@Test
	public void testBtnMoi_NV() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTabs().setSelectedIndex(2);
				try {
					sleep(1000);
					dialog.getTbl_NV().setRowSelectionInterval(1, 2);
					sleep(1000);
					dialog.getBtnMoi_NV().doClick();
					try {
						sleep(1000);
						System.out.println("testBtnMoi_NV: PASS");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(4000);

	}

	@Test
	public void testBtnThem_NV() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				dialog.getTabs().setSelectedIndex(2);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				dialog.getBtnMoi_NV().doClick();
				dialog.getTxtMa_NV().setText("NV01");
				dialog.getTxtHoTen_NV().setText("LE THINH PHAT");
				dialog.getTxtMatKhau_NV().setText("123456");
				dialog.getTxtNgaySinh_NV().setText("08/08/2003");
				dialog.getRdoNam_NV().setSelected(true);
				try {
					sleep(1000);
					dialog.getBtnThem_NV().doClick();
					System.out.println("BtnThem_NV: Pass");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(5000);
	}

	@Test
	public void testBtnXoa_NV() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(2);
					sleep(2000);
					dialog.getBtnLast_NV().doClick();
					dialog.getBtnXoa_NV().setEnabled(true);
					sleep(2000);
					dialog.getBtnXoa_NV().doClick();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_NV: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(5000);
		t3.start();
		t3.sleep(3000);

	}

	@Test
	public void testBtnSua_NV() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(2);
					sleep(2000);
					dialog.getBtnFirst_NV().doClick();
					dialog.getBtnSua_NV().setEnabled(true);
					sleep(2000);
					dialog.getTxtMa_NV().setText("NV00");
					dialog.getTxtHoTen_NV().setText("Nguyễn Văn B");
					dialog.getTxtMatKhau_NV().setText("123456");
					dialog.getTxtNgaySinh_NV().setText("08/08/2003");
					sleep(2000);
					dialog.getBtnSua_NV().doClick();
					System.out.println("TestBtnSua_NV: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_NV: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(8000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testBtnDieuHuong_KH() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(3);
					sleep(2000);
					dialog.getBtnFirst_KH().doClick();
					System.out.println("BtnFirst_KH: Pass");
					sleep(1000);
					dialog.getBtnNext_KH().doClick();
					System.out.println("BtnNext_KH: Pass");
					sleep(1000);
					dialog.getBtnLast_KH().doClick();
					System.out.println("BtnLast_KH: Pass");
					sleep(1000);
					dialog.getBtnPrevioust_KH().doClick();
					System.out.println("BtnPrevious_KH: Pass");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);

	}

	@Test
	public void testClickOnTable_KH() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(3);
					sleep(1000);
					try {
						Robot robot = new Robot();
						robot.mouseMove(700, 600);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(5000);
					} catch (AWTException e) {
						e.printStackTrace();
					}
					System.out.println("testClickOnTable_KH: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(2000);
	}

	@Test
	public void testBtnSua_KH() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(3);
					sleep(2000);
					dialog.getBtnFirst_KH().doClick();
					dialog.getBtnSua_KH().setEnabled(true);
					sleep(2000);
					dialog.getTxtMa_KH().setText("NV00");
					dialog.getTxtTen_KH().setText("Nguyễn Văn B");
					dialog.getTxtMatKhau_KH().setText("123456");
					dialog.getTxtNgaySinh_KH().setText("08/08/2003");
					dialog.getTxtNgayDangKy_KH().setText("08/08/2023");
					sleep(2000);
					dialog.getBtnSua_KH().doClick();
					System.out.println("TestBtnSua_KH: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_NV: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testBtnDieuHuong_HD() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(4);
					sleep(2000);
					dialog.getBtnFirst_HD().doClick();
					System.out.println("BtnFirst_HD: Pass");
					sleep(1000);
					dialog.getBtnNext_HD().doClick();
					System.out.println("BtnNext_HD: Pass");
					sleep(1000);
					dialog.getBtnLast_HD().doClick();
					System.out.println("BtnLast_HD: Pass");
					sleep(1000);
					dialog.getBtnPrevioust_HD().doClick();
					System.out.println("BtnPrevious_HD: Pass");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);

	}

	@Test
	public void testClickOnTable_HD() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(4);
					sleep(1000);
					try {
						Robot robot = new Robot();
						robot.mouseMove(700, 600);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(5000);
					} catch (AWTException e) {
						e.printStackTrace();
					}
					System.out.println("testClickOnTable_HD: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(2000);
	}

	@Test
	public void testBtnXoa_HD() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(4);
					sleep(2000);
					dialog.getBtnFirst_HD().doClick();
					dialog.getBtnXoa_HD().setEnabled(true);
					sleep(2000);
					dialog.getBtnXoa_HD().doClick();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_NV: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(5000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testDoubleClickOnTable_HD() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(4);
					sleep(1000);
					try {
						Robot robot = new Robot();
						robot.mouseMove(700, 600);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						robot.delay(200);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(2000);
						robot.mouseMove(250, 150);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(2000);

					} catch (AWTException e) {
						e.printStackTrace();
					}
					System.out.println("testClickOnTable_HD: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(4000);

	}

	@Test
	public void testBtnDieuHuong_DH() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(5);
					sleep(2000);
					dialog.getBtnFirst_DH().doClick();
					System.out.println("BtnFirst_DH: Pass");
					sleep(1000);
					dialog.getBtnNext_DH().doClick();
					System.out.println("BtnNext_DH: Pass");
					sleep(1000);
					dialog.getBtnLast_DH().doClick();
					System.out.println("BtnLast_DH: Pass");
					sleep(1000);
					dialog.getBtnPrevious_DH().doClick();
					System.out.println("BtnPrevious_DH: Pass");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);

	}

	@Test
	public void testClickOnTable_DH() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(5);
					sleep(1000);
					try {
						Robot robot = new Robot();
						robot.mouseMove(700, 600);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(5000);
					} catch (AWTException e) {
						e.printStackTrace();
					}
					System.out.println("testClickOnTable_DH: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(2000);
	}

	@Test
	public void testBtnXoa_DH() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(5);
					sleep(2000);
					dialog.getBtnFirst_DH().doClick();
					dialog.getBtnXoa_DH().setEnabled(true);
					sleep(1000);
					dialog.getBtnXoa_DH().doClick();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3 = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1000);
					dialog.requestFocus();
					Robot robot;
					try {
						robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						System.out.println("testBtnXoa_NV: PASS");
					} catch (AWTException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);
		t3.start();
		t3.sleep(2000);
	}

	@Test
	public void testDoubleClickOnTable_DH() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(5);
					sleep(1000);
					try {
						Robot robot = new Robot();
						robot.mouseMove(700, 600);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						robot.delay(200);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(2000);
						robot.mouseMove(200, 170);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(2000);
					} catch (AWTException e) {
						e.printStackTrace();
					}
					System.out.println("testClickOnTable_DH: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(4000);
	}

	@Test
	public void testBtnDieuHuong_TK() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(6);
					sleep(2000);
					dialog.getBtnFirst_TK().doClick();
					System.out.println("BtnFirst_TK: Pass");
					sleep(1000);
					dialog.getBtnNext_TK().doClick();
					System.out.println("BtnNext_TK: Pass");
					sleep(1000);
					dialog.getBtnLast_TK().doClick();
					System.out.println("BtnLast_TK: Pass");
					sleep(1000);
					dialog.getBtnPrevious_TK().doClick();
					System.out.println("BtnPrevious_TK: Pass");
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(6000);

	}

	@Test
	public void testClickOnTable_TK() throws InterruptedException {
		t1 = new Thread() {
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				try {
					dialog.getTabs().setSelectedIndex(6);
					sleep(1000);
					try {
						Robot robot = new Robot();
						robot.mouseMove(700, 550);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						sleep(5000);
					} catch (AWTException e) {
						e.printStackTrace();
					}
					System.out.println("testClickOnTable_TK: PASS");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t1.sleep(1000);
		t2.start();
		t2.sleep(2000);
	}
}
