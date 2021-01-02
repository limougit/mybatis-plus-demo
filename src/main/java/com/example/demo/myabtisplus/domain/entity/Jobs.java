package com.example.demo.myabtisplus.domain.entity;

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
@TableName ("jobs")
public class Jobs  implements Serializable {

	private static final long serialVersionUID =  7045527862016629677L;

   	@TableId("job_id" )
	private String jobId;

   	@TableField("job_title" )
	private String jobTitle;

   	@TableField("min_salary" )
	private Integer minSalary;

   	@TableField("max_salary" )
	private Integer maxSalary;

}
