package com.example.demo.myabtisplus.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description  
 * @Author  limou
 * @Date 2021-01-02 
 */

@Data
@Accessors(chain = true)
@TableName ("departments")
public class Departments  implements Serializable {

	private static final long serialVersionUID =  1258683554315298551L;

   	@TableId(value = "department_id" ,type = IdType.AUTO)
	private Integer departmentId;

   	@TableField("department_name" )
	private String departmentName;

   	@TableField("manager_id" )
	private Integer managerId;

   	@TableField("location_id" )
	private Integer locationId;

}
