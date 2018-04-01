package com.anand.mvvm.network;


import com.anand.mvvm.model.UserResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface UsersService {

    @GET
    Observable<UserResponse> fetchUsers(@Url String url);
}
