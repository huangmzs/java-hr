package com.java158.hr.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TreeNode implements Serializable {

	private Integer id;

	private String pName;

	private String pUrl;

	private List<TreeNode> list=new ArrayList<TreeNode>();

	public String getpUrl() {
		return pUrl;
	}

	public void setpUrl(String pUrl) {
		this.pUrl = pUrl;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<TreeNode> getList() {
		return list;
	}

	public void setList(List<TreeNode> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "TreeNode{" +
						"id=" + id +
						", pName='" + pName + '\'' +
						", pUrl='" + pUrl + '\'' +
						", list=" + list +
						'}';
	}
}
