package com.example.complaint_list_community.ComplainModel;

import com.google.gson.annotations.SerializedName;

public class AssignedToItem{

	@SerializedName("complaintId")
	private int complaintId;

	@SerializedName("roleId")
	private int roleId;

	@SerializedName("assignedName")
	private String assignedName;

	public void setComplaintId(int complaintId){
		this.complaintId = complaintId;
	}

	public int getComplaintId(){
		return complaintId;
	}

	public void setRoleId(int roleId){
		this.roleId = roleId;
	}

	public int getRoleId(){
		return roleId;
	}

	public void setAssignedName(String assignedName){
		this.assignedName = assignedName;
	}

	public String getAssignedName(){
		return assignedName;
	}

	@Override
 	public String toString(){
		return 
			"AssignedToItem{" + 
			"complaintId = '" + complaintId + '\'' + 
			",roleId = '" + roleId + '\'' + 
			",assignedName = '" + assignedName + '\'' + 
			"}";
		}
}