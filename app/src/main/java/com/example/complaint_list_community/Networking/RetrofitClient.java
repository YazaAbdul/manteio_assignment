package com.example.complaint_list_community.Networking;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://qa.msafehome.com/api/complaint/";
    private static final String AUTH_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI5OTg5NDU2NDU2IiwiZW1haWwiOiJhZG1pbkB5b3BtYWlsLmNvbSIsImp0aSI6IjM2NWYxMWM1LWEyZTAtNDdjNS04OTMwLTEyZmI1YTYyOTE0OCIsInJvbGUiOlsiQWRtaW4iLCJSZXNpZGVudCJdLCJjb21tdW5pdHlJZCI6ImxSalZPSTM5SzQxdktnc0lUYzVWT3c9PSIsImNvbW11bml0eUFsaWFzIjoiY0N0bk11NWwzb01rbDlyREtuYjZWUnY5TmpRVVNUVWRBSDcxTU1HQXBuUkV5Q21LcHQvZUtNK3NJcEJWTDlhQiIsImNvbW11bml0eU5hbWUiOiIrQW1oSEx2ZEl5Ym5qTklZYnBBRlJOSkhNaTMxM29wRDdZSTVoeXRUenBPYmlVbk9qWnVndVdjNHlXZnZCUWt4IiwiZmlyc3ROYW1lIjoiSDVkTU4xMUJNU21xTS8zaERNTzg3QT09IiwibGFzdE5hbWUiOiJuNEZwNEdVSE9MUGJwdGJNdWpVTi9BPT0iLCJ1c2VySWQiOiIxIiwibmJmIjoxNzA0Mjk5NTg2LCJleHAiOjE3MzU4MzU1ODYsImlhdCI6MTcwNDI5OTU4NiwiaXNzIjoiU2FmZUhvbWUuY29tIiwiYXVkIjoiU2FmZUhvbWUuY29tIn0.Hp9XHRrwhpMafLw-LcKo5B_Nt7t_Yj97prKhdShQPEI";

    private static Retrofit retrofit = null;

    private RetrofitClient() {
        // Private constructor to prevent instantiation
    }

    public static Retrofit getClient() {
        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request original = chain.request();
                            Request request = original.newBuilder()
                                    .header("Authorization", "Bearer " + AUTH_TOKEN)
                                    .method(original.method(), original.body())
                                    .build();
                            return chain.proceed(request);
                        }
                    }).build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }





}
