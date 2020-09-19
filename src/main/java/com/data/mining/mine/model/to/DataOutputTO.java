package com.data.mining.mine.model.to;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
public class DataOutputTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5275892114624519937L;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
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
	private int deptId;
	private String deptName;
	private String location;
	private String headOfDept;
}
