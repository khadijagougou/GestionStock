package com.example.gestiondestock.dao;

import com.example.gestiondestock.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  extends JpaRepository <User,Long>{
}
