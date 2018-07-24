create table `wz_big_sc`.`t_travelbigscreen_scenicflowdate`( 
   `id` varchar(64) NOT NULL , 
   `month_id` varchar(8) , 
   `day_id` varchar(4) , 
   `prov_name` varchar(64) , 
   `prov_id` varchar(64) , 
   `area_name` varchar(64) , 
   `area_no` varchar(64) , 
   `scenic_code` varchar(64) , 
   `scenic_name` varchar(64) , 
   `from_provno` varchar(64) , 
   `from_provno_name` varchar(64) , 
   `from_area_no` varchar(64) , 
   `from_area_name` varchar(64) , 
   `sum` varchar(8) , 
   `create_time` timestamp NOT NULL default current_timestamp, 
   PRIMARY KEY (`id`)
 )