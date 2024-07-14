package com.example.complaint_list_community.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.complaint_list_community.R;
import com.example.complaint_list_community.ComplainModel.StroringData;

import java.util.ArrayList;
import java.util.List;

public class Complaint_Adapter extends RecyclerView.Adapter<Complaint_Adapter.Viewholder>{

    private List<StroringData> stroringData;
    private List<StroringData> complaintListFull;

    public Complaint_Adapter(List<StroringData> stroringData) {
        this.stroringData = stroringData;
        this.complaintListFull = new ArrayList<>(stroringData);
    }

    public void setData(List<StroringData> newData) {
        this.stroringData = newData;
        this.complaintListFull = newData;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.complain_item,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        StroringData stroringData1 = stroringData.get(position);
        holder.username_TV_ID.setText(stroringData1.getCreatedByName());
        holder.time_TV_ID.setText(stroringData1.getTimeStamp());
        holder.complainname_TV_ID.setText(stroringData1.getCategoryName());
        holder.viewnumberID.setText(String.valueOf(stroringData1.getViewCount()));
        holder.numbercommentID.setText(String.valueOf(stroringData1.getCommentCount()));
        holder.complaindecription_TV_ID.setText(stroringData1.getComplaintDescription());
        holder.block_TV_ID.setText("Block " + stroringData1.getRasiedResidentBlock() + "-" + stroringData1.getRasiedResidentFlatId());
    }

    @Override
    public int getItemCount() {
        return stroringData.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        TextView username_TV_ID, block_TV_ID, time_TV_ID, complainname_TV_ID, complaindecription_TV_ID, viewnumberID, numbercommentID, username2_TV_ID, userdecription_TV_ID;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            username_TV_ID = itemView.findViewById(R.id.username_TV_ID);
            block_TV_ID = itemView.findViewById(R.id.block_TV_ID);
            time_TV_ID = itemView.findViewById(R.id.time_TV_ID);
            complainname_TV_ID = itemView.findViewById(R.id.complainname_TV_ID);
            complaindecription_TV_ID = itemView.findViewById(R.id.complaindecription_TV_ID);
            viewnumberID = itemView.findViewById(R.id.viewnumberID);
            numbercommentID = itemView.findViewById(R.id.numbercommentID);
            username2_TV_ID = itemView.findViewById(R.id.username2_TV_ID);
            userdecription_TV_ID = itemView.findViewById(R.id.userdecription_TV_ID);
        }
    }




}
