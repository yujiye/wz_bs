create table `wz_big_sc`.`t_travelbigscreen_touristtrack`( 
   `id` varchar(64) NOT NULL , 
   `mounth` varchar(8) , 
   `dat` varchar(4) , 
   `provinceGXId` varchar(64) , 
   `provinceGXName` varchar(64) , 
   `cityId` varchar(64) , 
   `localcityName` varchar(64) , 
   `remoteProvinceId` varchar(64) , 
   `remoteProvinceName` varchar(64) , 
   `areaId` varchar(64) , 
   `areaName` varchar(64) , 
   `lng` varchar(64) , 
   `lat` varchar(64) , 
   `userNumber` varchar(64) , 
   `scenicOrderV` varchar(64) , 
   `countryOrderV` varchar(64) , 
   `create_time` timestamp NOT NULL default current_timestamp, 
   PRIMARY KEY (`id`)
 )