package com.example.complaint_list_community.ComplainModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("totalRecords")
	private int totalRecords;

	@SerializedName("complaints")
	public List<ComplaintsItem> complaints;

	public void setTotalRecords(int totalRecords){
		this.totalRecords = totalRecords;
	}

	public int getTotalRecords(){
		return totalRecords;
	}

	public void setComplaints(List<ComplaintsItem> complaints){
		this.complaints = complaints;
	}

	public List<ComplaintsItem> getComplaints(){
		return complaints;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"totalRecords = '" + totalRecords + '\'' + 
			",complaints = '" + complaints + '\'' + 
			"}";
		}
}