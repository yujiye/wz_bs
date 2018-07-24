create table `wz_big_sc`.`t_approvalbigscreen_approvaldata`( 
   `id` varchar(64) NOT NULL , 
   `keyword` varchar(64) NOT NULL , 
   `code` varchar(64) , 
   `msg` varchar(64) , 
   `data` varchar(512) , 
   `isnew` varchar(8) , 
   `create_time` timestamp NOT NULL default current_timestamp, 
   PRIMARY KEY (`id`)
 )