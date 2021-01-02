package com.example.demo.myabtisplus.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * @Description  
 * @Author  limou
 * @Date 2021-01-02 
 */

@Data
@Accessors(chain = true)
@TableName ("employees")
public class Employees extends Model<Employees> implements Serializable {

	private static final long serialVersionUID =  5317723350255590094L;

   	@TableId(value = "employee_id" ,type = IdType.AUTO)
	private Integer employeeId;

   	@TableField("first_name" )
	private String firstName;

   	@TableField("last_name" )
	private String lastName;

   	@TableField("email" )
	private String email;

   	@TableField("phone_number" )
	private String phoneNumber;

   	@TableField("hire_date" )
	private Date hireDate;

   	@TableField("job_id" )
	private String jobId;

   	@TableField("salary" )
	private Double salary;

   	@TableField("commission_pct" )
	private Double commissionPct;

   	@TableField("manager_id" )
	private Integer managerId;

   	@TableField("department_id" )
	private Integer departmentId;

}
