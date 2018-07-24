create table `wz_big_sc`.`t_trafficbigscreen_trafficindex`( 
   `id` varchar(64) NOT NULL , 
   `highway_index` varchar(32) , 
   `highway_speed` varchar(32) , 
   `highway_week_rate` varchar(32) , 
   `general_way_index` varchar(32) , 
   `general_way_speed` varchar(32) , 
   `general_way_week_rate` varchar(32) , 
   `create_time` timestamp NOT NULL default current_timestamp, 
   PRIMARY KEY (`id`)
 )
