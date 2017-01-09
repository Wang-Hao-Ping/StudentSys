package com.seecen.classes.dao;

import java.util.List;

import com.seecen.classes.po.Classes;
import com.seecen.utils.PageUtils;

public class classDaoImpl implements classesDao {
     public boolean addClasses(Classes calsses){
    	 String sql="insert into t_classes(year,subject,name,status) values(?,?,?,?)";
    	 boolean result=true;
    	 
		return result;
     }

	public List<Classes> findClassByPage(PageUtils page) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateClasses(Classes calsses) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delClasses(int calssesId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean getClassesById(int calssesId) {
		// TODO Auto-generated method stub
		return false;
	}
	public int countClasses(){
		
		return 0;
		
	}
}
