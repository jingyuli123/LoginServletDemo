package com.lijy.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lijy.user.model.DepartmentBean;
import com.lijy.user.util.DBUtil;

/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-6-17
 */
public class DepartmentDao {
	
	public void addDepartment(DepartmentBean bean){
		Connection conn = DBUtil.getConnection();
		String sql = "insert department(deptname,description)" +
				" values(?,?)";
		PreparedStatement ptmt = null;
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, bean.getDeptName());
			ptmt.setString(2, bean.getDescription());
			ptmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ptmt != null){
				try {
					ptmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public List<DepartmentBean> queryDepartmentList(){
		Connection conn = DBUtil.getConnection();
		String sql = "select deptname,description from department";
		Statement stmt = null;
		ResultSet rs = null;
		List<DepartmentBean> dbn = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			dbn = new ArrayList<DepartmentBean>();
			DepartmentBean bean = null;
			while(rs.next()) {
				bean = new DepartmentBean();
				bean.setDeptName(rs.getString("deptname"));
				bean.setDescription(rs.getString("description"));
				dbn.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		return dbn;
	}
	
	public void deleteOne(String deptName) {
		Connection conn = DBUtil.getConnection();
		String sql = "delete from department where deptname = ?";
		PreparedStatement ptmt = null;
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, deptName);
			ptmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ptmt != null) {
				try {
					ptmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DepartmentDao departmentDao = new DepartmentDao();
//		DepartmentBean bean = new DepartmentBean();
//		bean.setDeptName("JAVA½ÌÑ§²¿");
//		bean.setDescription("C209");
//		departmentDao.addDepartment(bean);
		
//		List list = departmentDao.queryDepartmentList();
//		System.out.println(list);
		
		departmentDao.deleteOne("222222");
	}
}

