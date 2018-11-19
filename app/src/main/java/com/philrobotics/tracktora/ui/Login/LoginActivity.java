package com.philrobotics.tracktora.ui.Login;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.philrobotics.tracktora.R;
import com.philrobotics.tracktora.databinding.ActivityLoginBinding;

public class LoginActivity extends MvpActivity<LoginView, LoginPresenter> implements LoginView {

    private ActivityLoginBinding binding;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        View decor_view = getWindow().getDecorView();
        decor_view.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE |
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_FULLSCREEN
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setView(getMvpView());
    }

    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void switch_immersive() {

    }

    @Override
    public void start_loading() {

    }

    @Override
    public void stop_loading() {

    }

    @Override
    public void login_success() {

    }

    @Override
    public void login_clicked() {

    }
}
