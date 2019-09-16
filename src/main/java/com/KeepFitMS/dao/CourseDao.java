package com.KeepFitMS.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.KeepFitMS.entity.Course;
import com.KeepFitMS.entity.Course_type;

/**
 * 	课程管理持久层
 * @author zsz
 *
 */
@Mapper
public interface CourseDao {
	
	/**
	 * 	按分页要求显示课程
	 * @param map
	 * @return
	 */
	List<Course> findCourse(Map<String,Object> map);
	
	/**
	 * 	查询查询所有满足要求的总条数
	 * @param map
	 * @return
	 */
	long getTotalCourse(Map<String,Object> map);
	
	/**
	 * 查询所有的课程
	 * @return
	 */
	List<Course> findAllCourse();
	
	/**
	 * 	添加一条课程
	 * @param course
	 * @return
	 */
	int addCourse(Course course);
	
	/**
	 * 	删除一条课程
	 * @param id
	 * @return
	 */
	int deleteCourse(int id);
	
	/**
	 * 	修改课程信息
	 * @param course
	 * @return
	 */
	int updateCourse(Course course);
	
	/**
	 * 查询所有的课程分类
	 * @return
	 */
	List<Course_type> getAllCourse_type();
	
}
