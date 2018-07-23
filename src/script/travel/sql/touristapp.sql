create table `wz_big_sc`.`t_travelbigscreen_touristapp`( 
   `id` varchar(64) NOT NULL , 
   `mounth` varchar(8) , 
   `dat` varchar(4) , 
   `remoteProvinceName` varchar(64) , 
   `remoteProvinceId` varchar(64) , 
   `localcityName` varchar(64) , 
   `cityId` varchar(64) , 
   `area_id` varchar(64) , 
   `areaName` varchar(64) , 
   `appBigType` varchar(64) , 
   `appSmallType` varchar(64) , 
   `num` varchar(8) ,  
   `create_time` timestamp NOT NULL default current_timestamp, 
   PRIMARY KEY (`id`)
 )