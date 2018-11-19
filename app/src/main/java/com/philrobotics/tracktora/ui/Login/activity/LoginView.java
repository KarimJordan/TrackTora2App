package com.philrobotics.tracktora.ui.Login.activity;

import com.hannesdorfmann.mosby.mvp.MvpView;

public  interface LoginView extends MvpView {

    void switch_immersive();

    void start_loading();

    void stop_loading();

    void login_success();

    void login_clicked();

}
