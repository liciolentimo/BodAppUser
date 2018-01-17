package com.lentimosystems.bodappuser.Remote;

import com.lentimosystems.bodappuser.Model.FCMResponse;
import com.lentimosystems.bodappuser.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by LICIO on 1/15/2018.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAAIVKeNk:APA91bFk5fLngVvnoQVBQiOoKdR49K4RbFKkfcuwkpOQ_QE0dPFCp5ldlBQsu7NFEzcyf8_blf3ztxcz_gWSRlqHYYYY7-cAMgqcZOMZsOSzQAHU4BTKybAE5tCbd50CcdwzPgnKM8G3"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
