package com.example.complaint_list_community.ComplainModel;

import com.example.complaint_list_community.ComplainModel.AssignedToItem;
import com.example.complaint_list_community.ComplainModel.CommentsItem;
import com.example.complaint_list_community.ComplainModel.ComplaintImagesItem;
import com.example.complaint_list_community.ComplainModel.NotifyToItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StroringData {
    public StroringData(int complaintId, int commentCount, int viewCount, String complaintTypeName, String complaintDescription, String categoryName, String createdByName, String reason, String timeStamp, String rasiedResidentBlock, String rasiedResidentFlatId) {
        this.complaintId = complaintId;
        this.commentCount = commentCount;
        this.viewCount = viewCount;
        this.complaintTypeName = complaintTypeName;
        this.complaintDescription = complaintDescription;
        this.categoryName = categoryName;
        this.createdByName = createdByName;
        this.reason = reason;
        this.timeStamp = timeStamp;
        this.rasiedResidentBlock = rasiedResidentBlock;
        this.rasiedResidentFlatId = rasiedResidentFlatId;
    }


    //I have took selected fileds

    private int complaintId;
    private int commentCount;
    private int viewCount;
    private String complaintTypeName;
    private String complaintDescription;
    private String categoryName;
    private String createdByName;
    private String reason;
    private String timeStamp;
    private String rasiedResidentBlock;
    private String rasiedResidentFlatId;


    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getComplaintTypeName() {
        return complaintTypeName;
    }

    public void setComplaintTypeName(String complaintTypeName) {
        this.complaintTypeName = complaintTypeName;
    }

    public String getComplaintDescription() {
        return complaintDescription;
    }

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getRasiedResidentBlock() {
        return rasiedResidentBlock;
    }

    public void setRasiedResidentBlock(String rasiedResidentBlock) {
        this.rasiedResidentBlock = rasiedResidentBlock;
    }

    public String getRasiedResidentFlatId() {
        return rasiedResidentFlatId;
    }

    public void setRasiedResidentFlatId(String rasiedResidentFlatId) {
        this.rasiedResidentFlatId = rasiedResidentFlatId;
    }
}


