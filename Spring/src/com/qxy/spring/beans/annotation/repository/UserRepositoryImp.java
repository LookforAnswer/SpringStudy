package com.qxy.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImp implements UserRepository{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepository save...");
	}
	
}
