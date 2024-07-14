package com.example.complaint_list_community.ComplainModel;

import com.google.gson.annotations.SerializedName;

public class ComplaintImagesItem{

	@SerializedName("complaintImgId")
	private int complaintImgId;

	@SerializedName("complaintId")
	private int complaintId;

	@SerializedName("compliantImagePath")
	private Object compliantImagePath;

	public void setComplaintImgId(int complaintImgId){
		this.complaintImgId = complaintImgId;
	}

	public int getComplaintImgId(){
		return complaintImgId;
	}

	public void setComplaintId(int complaintId){
		this.complaintId = complaintId;
	}

	public int getComplaintId(){
		return complaintId;
	}

	public void setCompliantImagePath(Object compliantImagePath){
		this.compliantImagePath = compliantImagePath;
	}

	public Object getCompliantImagePath(){
		return compliantImagePath;
	}

	@Override
 	public String toString(){
		return 
			"ComplaintImagesItem{" + 
			"complaintImgId = '" + complaintImgId + '\'' + 
			",complaintId = '" + complaintId + '\'' + 
			",compliantImagePath = '" + compliantImagePath + '\'' + 
			"}";
		}
}