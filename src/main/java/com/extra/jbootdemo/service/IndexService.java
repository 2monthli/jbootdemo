package com.extra.jbootdemo.service;

import javax.inject.Singleton;

import com.extra.jbootdemo.entity.User;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

@Singleton
public class IndexService {
	public User getUser(){
		Record r=Db.findFirst("select * from user where id='1'");
		User u=new User();
		u.setName(r.getStr("Name"));
		u.setAge(r.getStr("Age"));
		return u;
	}
}
