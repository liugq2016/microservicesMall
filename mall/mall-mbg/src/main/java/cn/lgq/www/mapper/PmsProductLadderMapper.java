package cn.lgq.www.mapper;

import cn.lgq.www.model.PmsProductLadder;
import cn.lgq.www.model.PmsProductLadderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductLadderMapper {
    long countByExample(PmsProductLadderExample example);

    int deleteByExample(PmsProductLadderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadder record);

    int insertSelective(PmsProductLadder record);

    List<PmsProductLadder> selectByExample(PmsProductLadderExample example);

    PmsProductLadder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example);

    int updateByExample(@Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example);

    int updateByPrimaryKeySelective(PmsProductLadder record);

    int updateByPrimaryKey(PmsProductLadder record);
}