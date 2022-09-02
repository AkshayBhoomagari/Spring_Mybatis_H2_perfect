package com.example.springmybatish2.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.springmybatish2.entity.Employee;

@Mapper
public interface EmployeeMapper {
	
	 @Select("select * from employees")
	 @Results({
		 @Result(property="id", column="id"),
		 @Result(property="firstName", column="first_name"),
		 @Result(property="lastName", column="last_name"),
		 @Result(property="emailId", column="email_address")
	 })
	 public List < Employee > getAllEmployees();
	 
	 @Insert("INSERT INTO employees(id, first_name, last_name,email_address) " +
		        " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
	 public int insert(Employee employee);

	 @Select("select count(*) from employees")
	 public int count();
	 
	 @Delete("DELETE from employees where id= #{id}")
	 public int delete(int id);
	 
	 @Update("UPDATE employees"
	 		+ "	set email_address= #{email}"
	 		+ "where id=#{id}")
	 public int updateEmail(int id, String email);
}
