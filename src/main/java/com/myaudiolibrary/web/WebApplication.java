package com.myaudiolibrary.web;

import com.myaudiolibrary.web.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
@Component
@SpringBootApplication
public class WebApplication {
//mettre ces entites ici
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		System.out.println("hello");

	}

}
