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
@TableName ("locations")
public class Locations  implements Serializable {

	private static final long serialVersionUID =  5385595459436243717L;

   	@TableId(value = "location_id" ,type = IdType.AUTO)
	private Integer locationId;

   	@TableField("street_address" )
	private String streetAddress;

   	@TableField("postal_code" )
	private String postalCode;

   	@TableField("city" )
	private String city;

   	@TableField("state_province" )
	private String stateProvince;

   	@TableField("country_id" )
	private String countryId;

}
