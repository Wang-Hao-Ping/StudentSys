package com.seecen.classes.dao;

import java.util.List;

import com.seecen.classes.po.Classes;
import com.seecen.utils.PageUtils;

public interface classesDao {
	public List<Classes> findClassByPage(PageUtils page);
	public boolean addClasses(Classes calsses);
	public boolean updateClasses(Classes calsses);
	public boolean delClasses(int calssesId);
	public boolean getClassesById(int calssesId);
	
}
