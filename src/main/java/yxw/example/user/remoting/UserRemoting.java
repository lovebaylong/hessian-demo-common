package yxw.example.user.remoting;

import yxw.example.user.entity.User;

import java.util.List;

public interface UserRemoting {
    User findById(Long id);

    List<User> findAll();

}
