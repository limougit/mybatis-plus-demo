
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `demo`;

/*Table structure for table `countries` */

DROP TABLE IF EXISTS `countries`;

CREATE TABLE `countries` (
  `country_id` char(2) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'Primary key of countries table.',
  `country_name` varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'Country name',
  `region_id` smallint(6) DEFAULT NULL COMMENT 'Region ID for the country. Foreign key to region_id column in the departments table.',
PRIMARY KEY (`country_id`),
KEY `idx_countries_region_id` (`region_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Table structure for table `departments` */

DROP TABLE IF EXISTS `departments`;

CREATE TABLE `departments` (
  `department_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `manager_id` smallint(6) DEFAULT NULL,
  `location_id` smallint(6) DEFAULT NULL,
PRIMARY KEY (`department_id`),
KEY `idx_dept_manager_id` (`manager_id`),
KEY `idx_dept_location_id` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=271 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Table structure for table `employees` */

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `employee_id` mediumint(6) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `last_name` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone_number` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hire_date` date NOT NULL,
  `job_id` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `salary` double(8,2) DEFAULT NULL,
  `commission_pct` double(2,2) DEFAULT NULL,
  `manager_id` mediumint(6) DEFAULT NULL,
  `department_id` smallint(4) DEFAULT NULL,
PRIMARY KEY (`employee_id`),
UNIQUE KEY `idx_emp_name` (`first_name`,`last_name`),
UNIQUE KEY `idx_emp_email` (`email`),
KEY `idx_emp_job_id` (`job_id`),
KEY `idx_emp_manager_id` (`manager_id`),
KEY `idx_emp_dept_id` (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Table structure for table `job_history` */

DROP TABLE IF EXISTS `job_history`;

CREATE TABLE `job_history` (
  `employee_id` mediumint(6) unsigned NOT NULL AUTO_INCREMENT,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `job_id` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `department_id` smallint(4) NOT NULL,
PRIMARY KEY (`employee_id`,`start_date`),
KEY `idx_job_his_job_id` (`job_id`),
KEY `idx_job_his_dept_id` (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=202 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Table structure for table `jobs` */

DROP TABLE IF EXISTS `jobs`;

CREATE TABLE `jobs` (
  `job_id` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `job_title` varchar(35) COLLATE utf8mb4_unicode_ci NOT NULL,
  `min_salary` smallint(6) DEFAULT NULL,
  `max_salary` smallint(6) DEFAULT NULL,
PRIMARY KEY (`job_id`),
KEY `idx_jobs_job_title` (`job_title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Table structure for table `locations` */

DROP TABLE IF EXISTS `locations`;

CREATE TABLE `locations` (
  `location_id` smallint(4) unsigned NOT NULL AUTO_INCREMENT,
  `street_address` varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `postal_code` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `city` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `state_province` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `country_id` char(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
PRIMARY KEY (`location_id`),
KEY `LOC_CITY_IX` (`city`),
KEY `LOC_COUNTRY_IX` (`country_id`),
KEY `LOC_STATE_PROVINCE_IX` (`state_province`)
) ENGINE=InnoDB AUTO_INCREMENT=3201 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Table structure for table `regions` */

DROP TABLE IF EXISTS `regions`;

CREATE TABLE `regions` (
  `region_id` smallint(6) unsigned NOT NULL AUTO_INCREMENT COMMENT 'primary key',
  `region_name` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'regions name',
PRIMARY KEY (`region_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
