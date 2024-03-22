package com.supermarket.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.supermarket.ENTITY.ChungLoai;
import com.supermarket.UTILS.JdbcHelper;

public class ChungLoaiDAOTest {

    private static Connection connection;
    private ChungLoaiDAO chungLoaiDAO;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        connection = JdbcHelper.getConnection();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        connection.close();
    }

    @Before
    public void setUp() throws Exception {
        chungLoaiDAO = new ChungLoaiDAO();
    }

    @After
    public void tearDown() throws Exception {
        // Clean up any test data added to the database
        connection.prepareStatement("DELETE FROM CHUNGLOAI WHERE TENCL LIKE 'Test%'").executeUpdate();
        connection.commit();
    }

    @Test
    public void testInsert() {
        ChungLoai chungLoai = new ChungLoai("TestCL", "Test Chung loai", "Test Mieu ta");
        chungLoaiDAO.insert(chungLoai);
        
        ChungLoai inserted = chungLoaiDAO.selectById("TestCL");
        
        assertNotNull("Chung loai was not inserted", inserted);
        assertEquals("Inserted Chung loai has incorrect TENCL", "Test Chung loai", inserted.getTenCL());
    }

    @Test
    public void testUpdate() {
        ChungLoai chungLoai = new ChungLoai("CL001", "Updated Ten CL", "Updated Mieu Ta");
        chungLoaiDAO.update(chungLoai);
        
        ChungLoai updated = chungLoaiDAO.selectById("CL001");
        
        assertNotNull("Chung loai was not updated", updated);
        assertEquals("Updated Chung loai has incorrect TENCL", "Updated Ten CL", updated.getTenCL());
        assertEquals("Updated Chung loai has incorrect MIEUTA", "Updated Mieu Ta", updated.getMieuTa());
    }

    @Test
    public void testDelete() {
        ChungLoai chungLoai = new ChungLoai("TestCL", "Test Chung loai", "Test Mieu ta");
        chungLoaiDAO.insert(chungLoai);
        
        ChungLoai inserted = chungLoaiDAO.selectById("TestCL");
        assertNotNull("Chung loai was not inserted", inserted);
        
        chungLoaiDAO.delete("TestCL");
        
        ChungLoai deleted = chungLoaiDAO.selectById("TestCL");
        assertNull("Chung loai was not deleted", deleted);
    }

    @Test
    public void testSelectAll() {
        List<ChungLoai> allChungLoai = chungLoaiDAO.selectAll();
        assertNotNull("List of Chung loai is null", allChungLoai);
        assertEquals("Number of Chung loai is incorrect", 10, allChungLoai.size());
    }

    @Test
    public void testSelectById() {
        ChungLoai chungLoai = chungLoaiDAO.selectById("CL001");
        assertNotNull("Chung loai not found", chungLoai);
        assertEquals("Incorrect TENCL for selected Chung loai", "Sữa", chungLoai.getTenCL());
    }
}
