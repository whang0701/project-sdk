package com.wanghang.projectsdk.base.dao;

import com.wanghang.projectsdk.base.entity.Order;
import com.wanghang.projectsdk.base.entity.OrderExample;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExampleWithBLOBs(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    List<Order> selectByUserNoAndStatusAndLimitOrderByDesc(@Param("userNo") String userNo, @Param("statusStart") Integer statusStart,
                                                @Param("statusEnd") Integer statusEnd, @Param("stateFlag") Integer stateFlag,
                                                @Param("offset") Integer offset, @Param("limit") Integer limit,
                                                @Param("orderBy") String orderBy);

    Order selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExampleWithBLOBs(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKeyWithBLOBs(Order record);

    int updateByPrimaryKey(Order record);
}