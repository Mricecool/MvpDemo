package com.mvp822;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.mvp822.base.BaseActivity;
import com.mvp822.contract.UserContract;
import com.mvp822.model.User;
import com.mvp822.presenter.UserPresenter;

import java.util.List;

public class MainActivity extends BaseActivity<UserContract.IUserView,UserContract.Presenter> implements UserContract.IUserView{

    private Gson gson=new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.getUsers();
    }

    @Override
    protected UserContract.Presenter createPresenter() {
        mPresenter=new UserPresenter(this);
        return mPresenter;
    }

    @Override
    public void showUserList(List<User> list) {
        ((TextView)findViewById(R.id.txt)).setText(gson.toJson(list));
    }
}
