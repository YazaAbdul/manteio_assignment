package com.example.complaint_list_community.ComplainModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ComplaintsItem{

	@SerializedName("priorityName")
	private String priorityName;

	@SerializedName("createdByName")
	private String createdByName;

	@SerializedName("reason")
	private String reason;

	@SerializedName("complaintStatusName")
	private String complaintStatusName;

	@SerializedName("specificResidentBlockId")
	private Object specificResidentBlockId;

	@SerializedName("isDisCloseDetails")
	private Object isDisCloseDetails;

	@SerializedName("assignedRoleID")
	private int assignedRoleID;

	@SerializedName("complaintsStatusId")
	private int complaintsStatusId;

	@SerializedName("rasiedResidentFlatNo")
	private String rasiedResidentFlatNo;

	@SerializedName("priorityId")
	private int priorityId;

	@SerializedName("assignedRoleName")
	private String assignedRoleName;

	@SerializedName("onbehalfOfResidentBlockId")
	private Object onbehalfOfResidentBlockId;

	@SerializedName("escalateToID")
	private int escalateToID;

	@SerializedName("complaintDescription")
	private String complaintDescription;

	@SerializedName("onbehalfOfResidentId")
	private Object onbehalfOfResidentId;

	@SerializedName("rasiedResidentId")
	private int rasiedResidentId;

	@SerializedName("specificResidentFlatId")
	private Object specificResidentFlatId;

	@SerializedName("rasiedBy")
	private String rasiedBy;

	@SerializedName("commentCount")
	private int commentCount;

	@SerializedName("complaintTypeId")
	private int complaintTypeId;

	@SerializedName("isAnonymous")
	private boolean isAnonymous;

	@SerializedName("isComplaintResolved")
	private Object isComplaintResolved;

	@SerializedName("complaintId")
	private int complaintId;

	@SerializedName("complaintImages")
	private List<ComplaintImagesItem> complaintImages;

	@SerializedName("commentList")
	private Object commentList;

	@SerializedName("isbehalfofResident")
	private Object isbehalfofResident;

	@SerializedName("specificResidentFlatNo")
	private Object specificResidentFlatNo;

	@SerializedName("categoryName")
	private String categoryName;

	@SerializedName("createdOn")
	private String createdOn;

	@SerializedName("assignedTo")
	private List<AssignedToItem> assignedTo;

	@SerializedName("complaintTypeName")
	private String complaintTypeName;

	@SerializedName("complintExpenses")
	private Object complintExpenses;

	@SerializedName("modifiedOn")
	private String modifiedOn;

	@SerializedName("specificResidentName")
	private Object specificResidentName;

	@SerializedName("rasiedResidentBlockId")
	private int rasiedResidentBlockId;

	@SerializedName("isReinitiateComplaint")
	private Object isReinitiateComplaint;

	@SerializedName("onbehalfofResidentName")
	private Object onbehalfofResidentName;

	@SerializedName("onbehalfOfResidentFlatNo")
	private Object onbehalfOfResidentFlatNo;

	@SerializedName("modifiedBy")
	private int modifiedBy;

	@SerializedName("notifyTo")
	private List<NotifyToItem> notifyTo;

	@SerializedName("onbehalfOfResidentBlock")
	private Object onbehalfOfResidentBlock;

	@SerializedName("viewCount")
	private int viewCount;

	@SerializedName("specificResidentId")
	private Object specificResidentId;

	@SerializedName("complaintNotifyToUserID")
	private int complaintNotifyToUserID;

	@SerializedName("comments")
	private List<CommentsItem> comments;

	@SerializedName("roleId")
	private int roleId;

	@SerializedName("postedTime")
	private String postedTime;

	@SerializedName("userId")
	private int userId;

	@SerializedName("rasiedResidentFlatId")
	private int rasiedResidentFlatId;

	@SerializedName("specificResidentBlock")
	private Object specificResidentBlock;

	@SerializedName("escalateToName")
	private String escalateToName;

	@SerializedName("timeStamp")
	private String timeStamp;

	@SerializedName("reAssignedToID")
	private Object reAssignedToID;

	@SerializedName("rasiedResidentBlock")
	private String rasiedResidentBlock;

	@SerializedName("createdBy")
	private int createdBy;

	@SerializedName("isGettingDeloyed")
	private String isGettingDeloyed;

	@SerializedName("onbehalfOfResidentFlatId")
	private Object onbehalfOfResidentFlatId;

	@SerializedName("categoryId")
	private int categoryId;

	@SerializedName("reassignName")
	private Object reassignName;

	public void setPriorityName(String priorityName){
		this.priorityName = priorityName;
	}

	public String getPriorityName(){
		return priorityName;
	}

	public void setCreatedByName(String createdByName){
		this.createdByName = createdByName;
	}

	public String getCreatedByName(){
		return createdByName;
	}

	public void setReason(String reason){
		this.reason = reason;
	}

	public String getReason(){
		return reason;
	}

	public void setComplaintStatusName(String complaintStatusName){
		this.complaintStatusName = complaintStatusName;
	}

	public String getComplaintStatusName(){
		return complaintStatusName;
	}

	public void setSpecificResidentBlockId(Object specificResidentBlockId){
		this.specificResidentBlockId = specificResidentBlockId;
	}

	public Object getSpecificResidentBlockId(){
		return specificResidentBlockId;
	}

	public void setIsDisCloseDetails(Object isDisCloseDetails){
		this.isDisCloseDetails = isDisCloseDetails;
	}

	public Object getIsDisCloseDetails(){
		return isDisCloseDetails;
	}

	public void setAssignedRoleID(int assignedRoleID){
		this.assignedRoleID = assignedRoleID;
	}

	public int getAssignedRoleID(){
		return assignedRoleID;
	}

	public void setComplaintsStatusId(int complaintsStatusId){
		this.complaintsStatusId = complaintsStatusId;
	}

	public int getComplaintsStatusId(){
		return complaintsStatusId;
	}

	public void setRasiedResidentFlatNo(String rasiedResidentFlatNo){
		this.rasiedResidentFlatNo = rasiedResidentFlatNo;
	}

	public String getRasiedResidentFlatNo(){
		return rasiedResidentFlatNo;
	}

	public void setPriorityId(int priorityId){
		this.priorityId = priorityId;
	}

	public int getPriorityId(){
		return priorityId;
	}

	public void setAssignedRoleName(String assignedRoleName){
		this.assignedRoleName = assignedRoleName;
	}

	public String getAssignedRoleName(){
		return assignedRoleName;
	}

	public void setOnbehalfOfResidentBlockId(Object onbehalfOfResidentBlockId){
		this.onbehalfOfResidentBlockId = onbehalfOfResidentBlockId;
	}

	public Object getOnbehalfOfResidentBlockId(){
		return onbehalfOfResidentBlockId;
	}

	public void setEscalateToID(int escalateToID){
		this.escalateToID = escalateToID;
	}

	public int getEscalateToID(){
		return escalateToID;
	}

	public void setComplaintDescription(String complaintDescription){
		this.complaintDescription = complaintDescription;
	}

	public String getComplaintDescription(){
		return complaintDescription;
	}

	public void setOnbehalfOfResidentId(Object onbehalfOfResidentId){
		this.onbehalfOfResidentId = onbehalfOfResidentId;
	}

	public Object getOnbehalfOfResidentId(){
		return onbehalfOfResidentId;
	}

	public void setRasiedResidentId(int rasiedResidentId){
		this.rasiedResidentId = rasiedResidentId;
	}

	public int getRasiedResidentId(){
		return rasiedResidentId;
	}

	public void setSpecificResidentFlatId(Object specificResidentFlatId){
		this.specificResidentFlatId = specificResidentFlatId;
	}

	public Object getSpecificResidentFlatId(){
		return specificResidentFlatId;
	}

	public void setRasiedBy(String rasiedBy){
		this.rasiedBy = rasiedBy;
	}

	public String getRasiedBy(){
		return rasiedBy;
	}

	public void setCommentCount(int commentCount){
		this.commentCount = commentCount;
	}

	public int getCommentCount(){
		return commentCount;
	}

	public void setComplaintTypeId(int complaintTypeId){
		this.complaintTypeId = complaintTypeId;
	}

	public int getComplaintTypeId(){
		return complaintTypeId;
	}

	public void setIsAnonymous(boolean isAnonymous){
		this.isAnonymous = isAnonymous;
	}

	public boolean isIsAnonymous(){
		return isAnonymous;
	}

	public void setIsComplaintResolved(Object isComplaintResolved){
		this.isComplaintResolved = isComplaintResolved;
	}

	public Object getIsComplaintResolved(){
		return isComplaintResolved;
	}

	public void setComplaintId(int complaintId){
		this.complaintId = complaintId;
	}

	public int getComplaintId(){
		return complaintId;
	}

	public void setComplaintImages(List<ComplaintImagesItem> complaintImages){
		this.complaintImages = complaintImages;
	}

	public List<ComplaintImagesItem> getComplaintImages(){
		return complaintImages;
	}

	public void setCommentList(Object commentList){
		this.commentList = commentList;
	}

	public Object getCommentList(){
		return commentList;
	}

	public void setIsbehalfofResident(Object isbehalfofResident){
		this.isbehalfofResident = isbehalfofResident;
	}

	public Object getIsbehalfofResident(){
		return isbehalfofResident;
	}

	public void setSpecificResidentFlatNo(Object specificResidentFlatNo){
		this.specificResidentFlatNo = specificResidentFlatNo;
	}

	public Object getSpecificResidentFlatNo(){
		return specificResidentFlatNo;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setCreatedOn(String createdOn){
		this.createdOn = createdOn;
	}

	public String getCreatedOn(){
		return createdOn;
	}

	public void setAssignedTo(List<AssignedToItem> assignedTo){
		this.assignedTo = assignedTo;
	}

	public List<AssignedToItem> getAssignedTo(){
		return assignedTo;
	}

	public void setComplaintTypeName(String complaintTypeName){
		this.complaintTypeName = complaintTypeName;
	}

	public String getComplaintTypeName(){
		return complaintTypeName;
	}

	public void setComplintExpenses(Object complintExpenses){
		this.complintExpenses = complintExpenses;
	}

	public Object getComplintExpenses(){
		return complintExpenses;
	}

	public void setModifiedOn(String modifiedOn){
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedOn(){
		return modifiedOn;
	}

	public void setSpecificResidentName(Object specificResidentName){
		this.specificResidentName = specificResidentName;
	}

	public Object getSpecificResidentName(){
		return specificResidentName;
	}

	public void setRasiedResidentBlockId(int rasiedResidentBlockId){
		this.rasiedResidentBlockId = rasiedResidentBlockId;
	}

	public int getRasiedResidentBlockId(){
		return rasiedResidentBlockId;
	}

	public void setIsReinitiateComplaint(Object isReinitiateComplaint){
		this.isReinitiateComplaint = isReinitiateComplaint;
	}

	public Object getIsReinitiateComplaint(){
		return isReinitiateComplaint;
	}

	public void setOnbehalfofResidentName(Object onbehalfofResidentName){
		this.onbehalfofResidentName = onbehalfofResidentName;
	}

	public Object getOnbehalfofResidentName(){
		return onbehalfofResidentName;
	}

	public void setOnbehalfOfResidentFlatNo(Object onbehalfOfResidentFlatNo){
		this.onbehalfOfResidentFlatNo = onbehalfOfResidentFlatNo;
	}

	public Object getOnbehalfOfResidentFlatNo(){
		return onbehalfOfResidentFlatNo;
	}

	public void setModifiedBy(int modifiedBy){
		this.modifiedBy = modifiedBy;
	}

	public int getModifiedBy(){
		return modifiedBy;
	}

	public void setNotifyTo(List<NotifyToItem> notifyTo){
		this.notifyTo = notifyTo;
	}

	public List<NotifyToItem> getNotifyTo(){
		return notifyTo;
	}

	public void setOnbehalfOfResidentBlock(Object onbehalfOfResidentBlock){
		this.onbehalfOfResidentBlock = onbehalfOfResidentBlock;
	}

	public Object getOnbehalfOfResidentBlock(){
		return onbehalfOfResidentBlock;
	}

	public void setViewCount(int viewCount){
		this.viewCount = viewCount;
	}

	public int getViewCount(){
		return viewCount;
	}

	public void setSpecificResidentId(Object specificResidentId){
		this.specificResidentId = specificResidentId;
	}

	public Object getSpecificResidentId(){
		return specificResidentId;
	}

	public void setComplaintNotifyToUserID(int complaintNotifyToUserID){
		this.complaintNotifyToUserID = complaintNotifyToUserID;
	}

	public int getComplaintNotifyToUserID(){
		return complaintNotifyToUserID;
	}

	public void setComments(List<CommentsItem> comments){
		this.comments = comments;
	}

	public List<CommentsItem> getComments(){
		return comments;
	}

	public void setRoleId(int roleId){
		this.roleId = roleId;
	}

	public int getRoleId(){
		return roleId;
	}

	public void setPostedTime(String postedTime){
		this.postedTime = postedTime;
	}

	public String getPostedTime(){
		return postedTime;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setRasiedResidentFlatId(int rasiedResidentFlatId){
		this.rasiedResidentFlatId = rasiedResidentFlatId;
	}

	public int getRasiedResidentFlatId(){
		return rasiedResidentFlatId;
	}

	public void setSpecificResidentBlock(Object specificResidentBlock){
		this.specificResidentBlock = specificResidentBlock;
	}

	public Object getSpecificResidentBlock(){
		return specificResidentBlock;
	}

	public void setEscalateToName(String escalateToName){
		this.escalateToName = escalateToName;
	}

	public String getEscalateToName(){
		return escalateToName;
	}

	public void setTimeStamp(String timeStamp){
		this.timeStamp = timeStamp;
	}

	public String getTimeStamp(){
		return timeStamp;
	}

	public void setReAssignedToID(Object reAssignedToID){
		this.reAssignedToID = reAssignedToID;
	}

	public Object getReAssignedToID(){
		return reAssignedToID;
	}

	public void setRasiedResidentBlock(String rasiedResidentBlock){
		this.rasiedResidentBlock = rasiedResidentBlock;
	}

	public String getRasiedResidentBlock(){
		return rasiedResidentBlock;
	}

	public void setCreatedBy(int createdBy){
		this.createdBy = createdBy;
	}

	public int getCreatedBy(){
		return createdBy;
	}

	public void setIsGettingDeloyed(String isGettingDeloyed){
		this.isGettingDeloyed = isGettingDeloyed;
	}

	public String getIsGettingDeloyed(){
		return isGettingDeloyed;
	}

	public void setOnbehalfOfResidentFlatId(Object onbehalfOfResidentFlatId){
		this.onbehalfOfResidentFlatId = onbehalfOfResidentFlatId;
	}

	public Object getOnbehalfOfResidentFlatId(){
		return onbehalfOfResidentFlatId;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public void setReassignName(Object reassignName){
		this.reassignName = reassignName;
	}

	public Object getReassignName(){
		return reassignName;
	}

	@Override
 	public String toString(){
		return 
			"ComplaintsItem{" + 
			"priorityName = '" + priorityName + '\'' + 
			",createdByName = '" + createdByName + '\'' + 
			",reason = '" + reason + '\'' + 
			",complaintStatusName = '" + complaintStatusName + '\'' + 
			",specificResidentBlockId = '" + specificResidentBlockId + '\'' + 
			",isDisCloseDetails = '" + isDisCloseDetails + '\'' + 
			",assignedRoleID = '" + assignedRoleID + '\'' + 
			",complaintsStatusId = '" + complaintsStatusId + '\'' + 
			",rasiedResidentFlatNo = '" + rasiedResidentFlatNo + '\'' + 
			",priorityId = '" + priorityId + '\'' + 
			",assignedRoleName = '" + assignedRoleName + '\'' + 
			",onbehalfOfResidentBlockId = '" + onbehalfOfResidentBlockId + '\'' + 
			",escalateToID = '" + escalateToID + '\'' + 
			",complaintDescription = '" + complaintDescription + '\'' + 
			",onbehalfOfResidentId = '" + onbehalfOfResidentId + '\'' + 
			",rasiedResidentId = '" + rasiedResidentId + '\'' + 
			",specificResidentFlatId = '" + specificResidentFlatId + '\'' + 
			",rasiedBy = '" + rasiedBy + '\'' + 
			",commentCount = '" + commentCount + '\'' + 
			",complaintTypeId = '" + complaintTypeId + '\'' + 
			",isAnonymous = '" + isAnonymous + '\'' + 
			",isComplaintResolved = '" + isComplaintResolved + '\'' + 
			",complaintId = '" + complaintId + '\'' + 
			",complaintImages = '" + complaintImages + '\'' + 
			",commentList = '" + commentList + '\'' + 
			",isbehalfofResident = '" + isbehalfofResident + '\'' + 
			",specificResidentFlatNo = '" + specificResidentFlatNo + '\'' + 
			",categoryName = '" + categoryName + '\'' + 
			",createdOn = '" + createdOn + '\'' + 
			",assignedTo = '" + assignedTo + '\'' + 
			",complaintTypeName = '" + complaintTypeName + '\'' + 
			",complintExpenses = '" + complintExpenses + '\'' + 
			",modifiedOn = '" + modifiedOn + '\'' + 
			",specificResidentName = '" + specificResidentName + '\'' + 
			",rasiedResidentBlockId = '" + rasiedResidentBlockId + '\'' + 
			",isReinitiateComplaint = '" + isReinitiateComplaint + '\'' + 
			",onbehalfofResidentName = '" + onbehalfofResidentName + '\'' + 
			",onbehalfOfResidentFlatNo = '" + onbehalfOfResidentFlatNo + '\'' + 
			",modifiedBy = '" + modifiedBy + '\'' + 
			",notifyTo = '" + notifyTo + '\'' + 
			",onbehalfOfResidentBlock = '" + onbehalfOfResidentBlock + '\'' + 
			",viewCount = '" + viewCount + '\'' + 
			",specificResidentId = '" + specificResidentId + '\'' + 
			",complaintNotifyToUserID = '" + complaintNotifyToUserID + '\'' + 
			",comments = '" + comments + '\'' + 
			",roleId = '" + roleId + '\'' + 
			",postedTime = '" + postedTime + '\'' + 
			",userId = '" + userId + '\'' + 
			",rasiedResidentFlatId = '" + rasiedResidentFlatId + '\'' + 
			",specificResidentBlock = '" + specificResidentBlock + '\'' + 
			",escalateToName = '" + escalateToName + '\'' + 
			",timeStamp = '" + timeStamp + '\'' + 
			",reAssignedToID = '" + reAssignedToID + '\'' + 
			",rasiedResidentBlock = '" + rasiedResidentBlock + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",isGettingDeloyed = '" + isGettingDeloyed + '\'' + 
			",onbehalfOfResidentFlatId = '" + onbehalfOfResidentFlatId + '\'' + 
			",categoryId = '" + categoryId + '\'' + 
			",reassignName = '" + reassignName + '\'' + 
			"}";
		}
}