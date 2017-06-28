package com.lijy.user.service;

import java.util.List;

import com.lijy.user.dao.DepartmentDao;
import com.lijy.user.model.DepartmentBean;

/**
 * @description:
 * 
 * @author : lijy
 * @date : 2017-6-17
 */
public class DepartmentService {

	public void addDepartment(DepartmentBean bean) {
		DepartmentDao dao = new DepartmentDao();
		if (bean.getDeptName() == null) {
			throw new NullPointerException("部门名称不能为空！");
		}
		dao.addDepartment(bean);
	}

	public List<DepartmentBean> queryDepartmentList() {
		DepartmentDao dao = new DepartmentDao();
		return dao.queryDepartmentList();
	}

	// 删除部门
	public void deleteOne(String deptName) {
		if (deptName == null || "".equals(deptName)) {
			throw new NullPointerException("部门名称为空！");
		}
		DepartmentDao dao = new DepartmentDao();
		dao.deleteOne(deptName);
	}

}
