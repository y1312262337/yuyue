package com.yunzhong.appointment.mapper;


import org.apache.ibatis.annotations.Update;
import com.yunzhong.appointment.entity.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(String ppId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(String ppId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
   
	/**
	 * 
	 * @methodName setUserIdNullByUserId
	 * @description 设置用户主键为NULL
	 * @author 石洪刚
	 * @time 2017年10月5日 下午7:35:48
	 * @param id
	 */
	@Update("update person set user_id = NULL where user_id = #{id}")
	void updateUserIdNullByUserId(String id);

}