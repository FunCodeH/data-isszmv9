package com.gd.dataisszmv9.mapper;

import com.gd.dataisszmv9.entity.TImBranchStock;

import java.util.List;

public interface TImBranchStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_im_branch_stock
     *
     * @mbggenerated
     */
    int insert(TImBranchStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_im_branch_stock
     *
     * @mbggenerated
     */
    int insertSelective(TImBranchStock record);

    List<TImBranchStock> selectTitemStock();
}