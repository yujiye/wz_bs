create table `wz_big_sc`.`t_travelbigscreen_staytime`( 
   `id` varchar(64) NOT NULL , 
   `mounth` varchar(8) , 
   `dat` varchar(4) , 
   `provinceGXId` varchar(64) , 
   `provinceGXName` varchar(64) , 
   `cityId` varchar(64) , 
   `localcityName` varchar(64) , 
   `nDay` varchar(64) , 
   `peopleNum` varchar(8) , 
   `remoteProvinceName` varchar(64) , 
   `remoteCityName` varchar(64) , 
   `remoteProvinceId` varchar(64) , 
   `remoteCityId` varchar(64) , 
   `create_time` timestamp NOT NULL default current_timestamp, 
   PRIMARY KEY (`id`)
 )