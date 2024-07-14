package com.example.complaint_list_community;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.complaint_list_community.Adapter.Complaint_Adapter;

import com.example.complaint_list_community.ComplainModel.ComplaintsItem;

import com.example.complaint_list_community.ComplainModel.StroringData;
import com.example.complaint_list_community.Networking.ApiService;
import com.example.complaint_list_community.Networking.RetrofitClient;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {
    RelativeLayout backRLID;
    RecyclerView rvId;
        String TAG="APIResponse";

        Complaint_Adapter complaintAdapter;


    EditText searchET;

    LinearLayout LL_search1,LL_search2;
    RelativeLayout filter_ID,search_short_Id;

    private static final String AUTH_TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI5OTg5NDU2NDU2IiwiZW1haWwiOiJhZG1pbkB5b3BtYWlsLmNvbSIsImp0aSI6IjM2NWYxMWM1LWEyZTAtNDdjNS04OTMwLTEyZmI1YTYyOTE0OCIsInJvbGUiOlsiQWRtaW4iLCJSZXNpZGVudCJdLCJjb21tdW5pdHlJZCI6ImxSalZPSTM5SzQxdktnc0lUYzVWT3c9PSIsImNvbW11bml0eUFsaWFzIjoiY0N0bk11NWwzb01rbDlyREtuYjZWUnY5TmpRVVNUVWRBSDcxTU1HQXBuUkV5Q21LcHQvZUtNK3NJcEJWTDlhQiIsImNvbW11bml0eU5hbWUiOiIrQW1oSEx2ZEl5Ym5qTklZYnBBRlJOSkhNaTMxM29wRDdZSTVoeXRUenBPYmlVbk9qWnVndVdjNHlXZnZCUWt4IiwiZmlyc3ROYW1lIjoiSDVkTU4xMUJNU21xTS8zaERNTzg3QT09IiwibGFzdE5hbWUiOiJuNEZwNEdVSE9MUGJwdGJNdWpVTi9BPT0iLCJ1c2VySWQiOiIxIiwibmJmIjoxNzA0Mjk5NTg2LCJleHAiOjE3MzU4MzU1ODYsImlhdCI6MTcwNDI5OTU4NiwiaXNzIjoiU2FmZUhvbWUuY29tIiwiYXVkIjoiU2FmZUhvbWUuY29tIn0.Hp9XHRrwhpMafLw-LcKo5B_Nt7t_Yj97prKhdShQPEI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        backRLID=findViewById(R.id.backRLID);
        rvId=findViewById(R.id.rvId);
        LL_search1=findViewById(R.id.LL_search1);
        LL_search2=findViewById(R.id.LL_search2);
        filter_ID=findViewById(R.id.filter_ID);
        search_short_Id=findViewById(R.id.search_short_Id);

        rvId.setLayoutManager(new LinearLayoutManager(this));

        backRLID.setOnClickListener(new View.OnClickListener() {
            @Override   
            public void onClick(View v) {
                finish();
            }
        });
        complaintAdapter = new Complaint_Adapter(new ArrayList<>());
        rvId.setAdapter(complaintAdapter);

        fetchAllUserComplainDetails3();
        filter_ID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LL_search1.setVisibility(View.GONE);
                LL_search2.setVisibility(View.VISIBLE);
            }
        });
        search_short_Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LL_search1.setVisibility(View.VISIBLE);
                LL_search2.setVisibility(View.GONE);
            }
        });






    }


    private void fetchAllUserComplainDetails3() {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        Call<JsonObject> call = apiService.getProtectedData(AUTH_TOKEN, 10, 1, 1);
        Log.e("api==>", call.request().toString());

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.body() != null && response.code() == 200) {
                    JsonObject jsonResponse = response.body();
                    Log.d(TAG, jsonResponse.toString());
                    List<StroringData> storingData = new ArrayList<>();
                    JsonObject jsonElements_ = jsonResponse.getAsJsonObject("data");
                    JsonArray jsonElements = jsonElements_.getAsJsonArray("complaints");
                  Log.d("api==>", "jsonarray==>" + jsonElements);

                    if (jsonElements != null) {
                      Log.d("api==>", "jsonarray==>" + jsonElements);
                        ComplaintsItem[] complaintsItems = new Gson().fromJson(jsonElements, ComplaintsItem[].class);

                        if (complaintsItems != null) {
                          Log.d(TAG, "complaintsItems size==> " + complaintsItems.length);

                            for (ComplaintsItem complaintsItem : complaintsItems) {
                                Log.d(TAG, "CHECKING DATA==>" + complaintsItem.getComplaintId());
                                storingData.add(new StroringData(
                                        complaintsItem.getComplaintId(),
                                        complaintsItem.getCommentCount(),
                                        complaintsItem.getViewCount(),
                                        complaintsItem.getComplaintTypeName(),
                                        complaintsItem.getComplaintDescription(),
                                        complaintsItem.getCategoryName(),
                                        complaintsItem.getCreatedByName(),
                                        complaintsItem.getReason(),
                                        complaintsItem.getTimeStamp(),
                                        complaintsItem.getRasiedResidentBlock(),
                                        complaintsItem.getRasiedResidentFlatNo()
                                ));
                            }
                            Log.d(TAG, "Storing List Size: " + storingData.size());
                          /*  Complaint_Adapter complaintAdapter = new Complaint_Adapter(storingData);
                            rvId.setAdapter(complaintAdapter);*/
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    complaintAdapter.setData(storingData);
                                }
                            });
                        }
                    }
                  Log.d(TAG, "Response: " + jsonResponse);
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.d(TAG, "onFailure");
            }
        });
    }


  /*  private void fetchAllUserComplaintDetails() {
        ApiService apiService = RetrofitClient.getClient(MainActivity2.this).create(ApiService.class);
        Call<GetAllUserComplaintDetailsResponse> call = apiService.getProtectedData(AUTH_TOKEN);
        Log.e("api==>", call.request().toString());
        call.enqueue(new Callback<GetAllUserComplaintDetailsResponse>() {
            @Override
            public void onResponse(Call<GetAllUserComplaintDetailsResponse> call, Response<GetAllUserComplaintDetailsResponse> response) {
                if (response.isSuccessful()) {
                    // Handle successful response
                    Toast.makeText(MainActivity2.this, "Success: Complaints fetched", Toast.LENGTH_SHORT).show();
                } else {
                    // Handle unsuccessful response
                    Toast.makeText(MainActivity2.this, "Failed to fetch complaints: " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetAllUserComplaintDetailsResponse> call, Throwable t) {
                // Handle network errors or unexpected failures
                Toast.makeText(MainActivity2.this, "Failed to fetch complaints: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }*/






}