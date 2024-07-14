package com.example.complaint_list_community.ComplainModel;

import com.google.gson.annotations.SerializedName;

public class ComplainModel{

	@SerializedName("data")
	public Data data;

	@SerializedName("message")
	public String message;

	@SerializedName("statusCode")
	public int statusCode;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	public int getStatusCode(){
		return statusCode;
	}

	@Override
 	public String toString(){
		return 
			"ComplainModel{" + 
			"data = '" + data + '\'' + 
			",message = '" + message + '\'' + 
			",statusCode = '" + statusCode + '\'' + 
			"}";
		}
}