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
			throw new NullPointerException("�������Ʋ���Ϊ�գ�");
		}
		dao.addDepartment(bean);
	}

	public List<DepartmentBean> queryDepartmentList() {
		DepartmentDao dao = new DepartmentDao();
		return dao.queryDepartmentList();
	}

	// ɾ������
	public void deleteOne(String deptName) {
		if (deptName == null || "".equals(deptName)) {
			throw new NullPointerException("��������Ϊ�գ�");
		}
		DepartmentDao dao = new DepartmentDao();
		dao.deleteOne(deptName);
	}

}
