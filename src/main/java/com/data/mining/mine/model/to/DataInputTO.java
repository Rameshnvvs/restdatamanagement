package com.data.mining.mine.model.to;

import java.io.Serializable;

public class DataInputTO implements Serializable{

	
	private static final long serialVersionUID = 2372362433220046491L;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHeadOfDept() {
		return headOfDept;
	}
	public void setHeadOfDept(String headOfDept) {
		this.headOfDept = headOfDept;
	}
	private String deptName;
	private String location;
	private String headOfDept;
}
