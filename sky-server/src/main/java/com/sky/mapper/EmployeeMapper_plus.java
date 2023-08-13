package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sky.entity.Employee;
import com.sky.result.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface EmployeeMapper_plus extends BaseMapper<Employee> {

    Page<Employee> SelectPage (Page<Employee> page,String name);

}
