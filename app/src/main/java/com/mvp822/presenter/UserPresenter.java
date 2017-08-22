package com.mvp822.presenter;

import com.mvp822.base.BasePresenter;
import com.mvp822.contract.UserContract;
import com.mvp822.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by app on 2017/8/22.
 */
public class UserPresenter extends UserContract.Presenter{

    private UserContract.IUserView iUserView;

    public UserPresenter(UserContract.IUserView iUserView){
        this.iUserView=iUserView;
    }

    @Override
    public void getUsers() {
        // 加载数据
        List<User> list=new ArrayList<User>();
        User user=null;
        for(int i=0;i<10;i++){
            user=new User();
            user.setUserId(i+"");
            user.setUserName("USER"+i);
            user.setUserPhone("1502222332"+i);
            list.add(user);
        }
        iUserView.showUserList(list);
    }

    @Override
    public void getUser(String userId) {

    }

    @Override
    public void saveUser(User user) {

    }
}
