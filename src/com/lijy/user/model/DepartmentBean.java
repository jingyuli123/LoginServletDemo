package com.lijy.user.model;
/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-6-17
 */
public class DepartmentBean {
	/**
	 * ��������
	 */
	private String deptName;
	/**
	 * ��������
	 */
	private String description;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "DepartmentBean [deptName=" + deptName + ", description="
				+ description + "]";
	}
	
}

