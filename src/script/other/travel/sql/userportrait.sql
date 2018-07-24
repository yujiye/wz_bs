create table `wz_big_sc`.`t_travelbigscreen_userportrait`( 
   `id` varchar(64) NOT NULL , 
   `mounth` varchar(8) , 
   `dat` varchar(4) , 
   `provinceGXId` varchar(64) , 
   `cityId` varchar(64) , 
   `areaId` varchar(64) , 
   `remoteProvinceId` varchar(64) , 
   `remoteCityId` varchar(64) , 
   `totalFee` varchar(64) , 
   `gender_id` varchar(8) , 
   `age` varchar(8) , 
   `term_model` varchar(64) , 
   `num` varchar(8) ,
   `create_time` timestamp NOT NULL default current_timestamp, 
   PRIMARY KEY (`id`)
 )