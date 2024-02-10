package com.sky.service;

import com.sky.dto.DishDTO;

public interface DishService {
    /**
     * 新增菜品、保存口味
     * @param dishDTO
     */
    public void createWithFlavor(DishDTO dishDTO);
}
