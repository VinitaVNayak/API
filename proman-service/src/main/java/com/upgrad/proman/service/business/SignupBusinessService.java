package com.upgrad.proman.service.business;

import com.upgrad.proman.service.dao.UserDao;
import com.upgrad.proman.service.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class SignupBusinessService {
    private UserDao userDao;

    public UserEntity signup(UserEntity userentity){
        return userDao.createUser(userentity);

    }
}
