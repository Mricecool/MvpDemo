package com.mvp822.contract;

import com.mvp822.base.BasePresenter;
import com.mvp822.model.User;

import java.util.List;

/**
 * Created by app on 2017/8/22.
 */
public interface UserContract {

    interface IUserView{
        void showUserList(List<User> list);
    }

    abstract class Presenter extends BasePresenter<IUserView> {
        public abstract void getUsers();
        public abstract void getUser(String userId);
        public abstract void saveUser(User user);
    }
}
