package com.arnawajuan.rumah_makan_cilik.api;

import com.arnawajuan.rumah_makan_cilik.makanan.FoodResponse;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {
        @GET("user")
        Call<UserResponse> getAllUser();

        @POST("login")
        @FormUrlEncoded
        Call<UserResponse> loginUser(@Field("email") String email,
                                     @Field("password") String password);

        @POST("register")
        @FormUrlEncoded
        Call<UserResponse> register     (@Field("name") String name,
                                         @Field("email") String email,
                                         @Field("phone_number") String phone_number,
                                         @Field("password") String password);

        @GET("profile/{id}")
        Call<UserResponse> showUser     (@Path("id")String id);

        @PUT("update/{id}")
        Call<UserResponse> updateUser   (@Path("id")String id,
                                         @Field("name") String name,
                                         @Field("email") String email,
                                         @Field("phone_number") String phone_number);


        @GET("food")
        Call<FoodResponse> getAllFood();

        @POST("food")
        @FormUrlEncoded
        Call<FoodResponse> addFood (@Field("food_name") String food_name,
                                    @Field("price") double price,
                                    @Field("desc") String desc,
                                    @Field("image_food") String image_food);

        @PUT("food/{id}")
        @FormUrlEncoded
        Call<FoodResponse> updateFood(@Path("id")String id,
                                      @Field("food_name") String food_name,
                                      @Field("price") double price,
                                      @Field("desc") String desc,
                                      @Field("image_food") String image_food);
        @DELETE("food/{id}")
        Call<FoodResponse> deleteFood(@Path("id")String id);
}
