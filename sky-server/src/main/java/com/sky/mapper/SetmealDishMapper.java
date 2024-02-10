package com.sky.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品ids查询套餐ids
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);


}
