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
@TableName ("regions")
public class Regions  implements Serializable {

	private static final long serialVersionUID =  1989934676101125930L;

	/**
	 * primary key
	 */
   	@TableId(value = "region_id",type = IdType.AUTO)
	private Integer regionId;

	/**
	 * regions name
	 */
   	@TableField("region_name" )
	private String regionName;

}
