package com.example.complaint_list_community.ComplainModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CommentsItem{

	@SerializedName("commentCreatedBy")
	private int commentCreatedBy;

	@SerializedName("commentTimeStamp")
	private String commentTimeStamp;

	@SerializedName("createdOn")
	private Object createdOn;

	@SerializedName("commentCreatedByName")
	private String commentCreatedByName;

	@SerializedName("complaintId")
	private int complaintId;

	@SerializedName("flatNo")
	private String flatNo;

	@SerializedName("isDeleted")
	private Object isDeleted;

	@SerializedName("roleName")
	private String roleName;

	@SerializedName("commentId")
	private int commentId;

	@SerializedName("comment")
	private String comment;

	@SerializedName("residentId")
	private int residentId;

	@SerializedName("block")
	private String block;

	@SerializedName("attachmentPath")
	private String attachmentPath;

	@SerializedName("commentReplies")
	private List<Object> commentReplies;

	public void setCommentCreatedBy(int commentCreatedBy){
		this.commentCreatedBy = commentCreatedBy;
	}

	public int getCommentCreatedBy(){
		return commentCreatedBy;
	}

	public void setCommentTimeStamp(String commentTimeStamp){
		this.commentTimeStamp = commentTimeStamp;
	}

	public String getCommentTimeStamp(){
		return commentTimeStamp;
	}

	public void setCreatedOn(Object createdOn){
		this.createdOn = createdOn;
	}

	public Object getCreatedOn(){
		return createdOn;
	}

	public void setCommentCreatedByName(String commentCreatedByName){
		this.commentCreatedByName = commentCreatedByName;
	}

	public String getCommentCreatedByName(){
		return commentCreatedByName;
	}

	public void setComplaintId(int complaintId){
		this.complaintId = complaintId;
	}

	public int getComplaintId(){
		return complaintId;
	}

	public void setFlatNo(String flatNo){
		this.flatNo = flatNo;
	}

	public String getFlatNo(){
		return flatNo;
	}

	public void setIsDeleted(Object isDeleted){
		this.isDeleted = isDeleted;
	}

	public Object getIsDeleted(){
		return isDeleted;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getRoleName(){
		return roleName;
	}

	public void setCommentId(int commentId){
		this.commentId = commentId;
	}

	public int getCommentId(){
		return commentId;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

	public void setResidentId(int residentId){
		this.residentId = residentId;
	}

	public int getResidentId(){
		return residentId;
	}

	public void setBlock(String block){
		this.block = block;
	}

	public String getBlock(){
		return block;
	}

	public void setAttachmentPath(String attachmentPath){
		this.attachmentPath = attachmentPath;
	}

	public String getAttachmentPath(){
		return attachmentPath;
	}

	public void setCommentReplies(List<Object> commentReplies){
		this.commentReplies = commentReplies;
	}

	public List<Object> getCommentReplies(){
		return commentReplies;
	}

	@Override
 	public String toString(){
		return 
			"CommentsItem{" + 
			"commentCreatedBy = '" + commentCreatedBy + '\'' + 
			",commentTimeStamp = '" + commentTimeStamp + '\'' + 
			",createdOn = '" + createdOn + '\'' + 
			",commentCreatedByName = '" + commentCreatedByName + '\'' + 
			",complaintId = '" + complaintId + '\'' + 
			",flatNo = '" + flatNo + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",roleName = '" + roleName + '\'' + 
			",commentId = '" + commentId + '\'' + 
			",comment = '" + comment + '\'' + 
			",residentId = '" + residentId + '\'' + 
			",block = '" + block + '\'' + 
			",attachmentPath = '" + attachmentPath + '\'' + 
			",commentReplies = '" + commentReplies + '\'' + 
			"}";
		}
}