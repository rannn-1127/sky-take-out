package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {

    //新增套餐
    void save(SetmealDTO setmealDTO);

    //分页查询
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    //删除套餐
    void delete(List<Long> ids);

    //根据id查询套餐和相关菜品
    SetmealVO getByIdWithDish(Long id);

    //修改套餐
    void update(SetmealDTO setmealDTO);

    //起售停售
    void setStatus(Integer status, Long id);
}
