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
@TableName ("countries")
public class Countries  implements Serializable {

	private static final long serialVersionUID =  470830104610762660L;

	/**
	 * Primary key of countries table.
	 */
   	@TableId("country_id" )
	private String countryId;

	/**
	 * Country name
	 */
   	@TableField("country_name" )
	private String countryName;

	/**
	 * Region ID for the country. Foreign key to region_id column in the departments table.
	 */
   	@TableField("region_id" )
	private Integer regionId;

}
