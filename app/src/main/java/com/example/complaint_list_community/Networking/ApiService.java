package com.example.complaint_list_community.Networking;


import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface  ApiService {


    @GET("GetAllUserComplaintDetails")
    Call<JsonObject> getProtectedData(@Header("Authorization") String authtoken ,
                                      @Header("resultsPerPage") int resultsPerPage,
                                      @Header("pageNumber") int pagenumber,
                                      @Header("complaintTypeId") int complaintTypeId

                                      );









}
