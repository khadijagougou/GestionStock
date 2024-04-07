package com.example.gestiondestock.Service.authentication;

import com.example.gestiondestock.bean.User;
import com.example.gestiondestock.dao.UserDao;
import com.example.gestiondestock.enums.UserRole;
import com.example.gestiondestock.ws.dto.SignupDto;
import com.example.gestiondestock.ws.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserDao userDao;
    public UserDto signupEmployee(SignupDto signupDto){
        User user = new User();
        user.setEmail(signupDto.getEmail());
        user.setPassword(signupDto.getPassword());
        user.setTelephone(signupDto.getTelephone());
        user.setRole((UserRole.EMPLOYEE));
        return userDao.save(user).getDto();
    }

}
