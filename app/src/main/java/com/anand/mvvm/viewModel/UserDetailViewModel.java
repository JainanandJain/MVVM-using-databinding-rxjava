package com.anand.mvvm.viewModel;


import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.anand.mvvm.model.User;
import com.bumptech.glide.Glide;

import java.util.Observable;

/*
** This Class as ViewModel to exposes streams of data relevant to the View (UserDetailActivity).
 */

public class UserDetailViewModel extends Observable {

    private User user;

    public UserDetailViewModel(User user) {this.user = user;}

    public String getFullUserName(){
        user.fullName = user.name.title + "." + user.name.first + " " + user.name.last ;
        return user.fullName;
    }

    public String getUserName(){return user.login.username;}

    public String getEmail() { return user.email; }

    public int getEmailVisibility() {return user.hasEmail() ? View.VISIBLE : View.GONE ;}

    public String getCell() { return user.cell; }

    public String getProfileThumb() { return user.picture.large ;}

    public String getAddress() {
        return user.location.street
                + " "
                + user.location.city
                + " "
                + user.location.state;
    }

    public String getGender() { return user.gender;}

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl){
        Glide.with(view.getContext()).load(imageUrl).into(view);
    }


}
