package com.java158.hrclient.controller;

import com.java158.hr.entity.Permissions;
import com.java158.hr.entity.TreeNode;
import com.java158.hrclient.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

	@Autowired
	private PermissionsService service;

	@RequestMapping("/test")
	public String test(){

		return "success";
	}

	@RequestMapping("/tree")
	public List<TreeNode>  testTree(){
		// 准备一个集合
		List<TreeNode> treeNodeList = new ArrayList<>();
		List<Permissions> list = service.findAll();
		for(Permissions pes:list){
			// 保存到对象中
			TreeNode node = new TreeNode();
				node.setId(pes.getMentId());
				node.setpName(pes.getMentName());
				node.setpUrl(pes.getMentUrl());
			//找一级节点
			if(pes.getSuperMentId()==null){
				treeNodeList.add(node); // 放入集合  :一级节点
			}else {
				TreeNode pernode = findPernode(pes, treeNodeList);
				if(pernode!=null){
					pernode.getList().add(node);
				}
			}
		}

		return treeNodeList;
	}

	private TreeNode findPernode(Permissions pes,List<TreeNode> treeNodeList){
		for(TreeNode nod:treeNodeList){
			//二级节点
			if(nod.getId().equals(pes.getSuperMentId())){
				return nod;
			}else {
				//接着找
				TreeNode pernode = findPernode(pes, nod.getList());
				if(pernode!=null){
					return pernode;
				}else {
					//三级节点
					for (TreeNode tres:nod.getList()){

						findPernode(pes, tres.getList());

					}
				}
			}
		}
		return null;
	}
}
