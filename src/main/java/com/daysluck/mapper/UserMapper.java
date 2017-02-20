package com.daysluck.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.daysluck.domain.User;

@Mapper
public interface UserMapper {

	@Select("select * from user where name = #{name}")
	public User findByName(@Param("name") String name);
	
	@Insert("insert into user(name,age) values(#{name},#{age})")
	public int insert(@Param("name") String name, @Param("age") Integer age);
	
	@Insert("insert into user(name,age) values(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
	int insertByMap(Map<String, Object> map);
	
	@Insert("insert into user(name,age) values(#{name},#{age})")
	int insertByUser(User user);
	
	@Select("select * from user where age >= #{age}")
	List<User> findByAge(Integer age);
}
