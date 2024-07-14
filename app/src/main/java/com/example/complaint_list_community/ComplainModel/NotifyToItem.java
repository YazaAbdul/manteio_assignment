package com.example.complaint_list_community.ComplainModel;

import com.google.gson.annotations.SerializedName;

public class NotifyToItem{

	@SerializedName("complaintId")
	private int complaintId;

	@SerializedName("roleId")
	private int roleId;

	@SerializedName("name")
	private String name;

	@SerializedName("notifyToId")
	private int notifyToId;

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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setNotifyToId(int notifyToId){
		this.notifyToId = notifyToId;
	}

	public int getNotifyToId(){
		return notifyToId;
	}

	@Override
 	public String toString(){
		return 
			"NotifyToItem{" + 
			"complaintId = '" + complaintId + '\'' + 
			",roleId = '" + roleId + '\'' + 
			",name = '" + name + '\'' + 
			",notifyToId = '" + notifyToId + '\'' + 
			"}";
		}
}