package com.test.demoProject.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demoProject.Model.Login;

public interface LoginDao extends JpaRepository<Login, String> {
}
