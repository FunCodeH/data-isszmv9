package com.gd.dataisszmv9.mapper;

import com.gd.dataisszmv9.entity.TRmSaleFlowInfo;
import com.gd.dataisszmv9.entity.TRmSaleflow;

import java.util.Date;
import java.util.List;

public interface TRmSaleflowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rm_saleflow
     *
     * @mbggenerated
     */
    int insert(TRmSaleflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rm_saleflow
     *
     * @mbggenerated
     */
    int insertSelective(TRmSaleflow record);

    List<TRmSaleFlowInfo> selectSaleDetail(Date saleDetailDate);
}