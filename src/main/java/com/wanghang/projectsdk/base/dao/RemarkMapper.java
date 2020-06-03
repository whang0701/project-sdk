package com.wanghang.projectsdk.base.dao;

import com.wanghang.projectsdk.base.entity.Remark;
import com.wanghang.projectsdk.base.entity.RemarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RemarkMapper {
    int countByExample(RemarkExample example);

    int deleteByExample(RemarkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Remark record);

    int insertSelective(Remark record);

    List<Remark> selectByExampleWithBLOBs(RemarkExample example);

    List<Remark> selectByExample(RemarkExample example);

    Remark selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Remark record, @Param("example") RemarkExample example);

    int updateByExampleWithBLOBs(@Param("record") Remark record, @Param("example") RemarkExample example);

    int updateByExample(@Param("record") Remark record, @Param("example") RemarkExample example);

    int updateByPrimaryKeySelective(Remark record);

    int updateByPrimaryKeyWithBLOBs(Remark record);

    int updateByPrimaryKey(Remark record);
}