package com.example.effectivenavigation;


import com.example.effectivenavigation.models.Message;
import com.example.effectivenavigation.models.User;

/**
 * Created by User on 1/24/2018.
 */

public interface IMainActivity {

    void inflateViewProfileFragment(User user);
    void onMessageSelected(Message message);
    void onBackPressed();

}
