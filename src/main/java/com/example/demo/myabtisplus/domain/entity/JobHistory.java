package com.example.demo.myabtisplus.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName ("job_history")
public class JobHistory  implements Serializable {

	private static final long serialVersionUID =  8822927316389520858L;

   	@TableId(value = "employee_id",type = IdType.AUTO)
	private Integer employeeId;

   	@TableField("start_date" )
	private Date startDate;

   	@TableField("end_date" )
	private Date endDate;

   	@TableField("job_id" )
	private String jobId;

   	@TableField("department_id" )
	private Integer departmentId;

}
