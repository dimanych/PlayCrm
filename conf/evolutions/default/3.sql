# --- Sample dataset

# --- !Ups

insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (1,'+7(100)000-00 00','+7(200)000-00 00','+7(300)000-00 00','skype1','mail@site1.com','site1.com','socalAccount1','other1');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (2,'+7(010)000-00 00','+7(020)000-00 00','+7(030)000-00 00','skype2','mail@site2.com','site2.com','socalAccount2','other2');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (3,'+7(001)000-00 00','+7(002)000-00 00','+7(003)000-00 00','skype3','mail@site3.com','site3.com','socalAccount3','other3');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (4,'+7(000)100-00 00','+7(000)200-00 00','+7(000)300-00 00','skype4','mail@site4.com','site4.com','socalAccount4','other4');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (5,'+7(000)010-00 00','+7(000)020-00 00','+7(000)030-00 00','skype5','mail@site5.com','site5.com','socalAccount5','other5');

insert into contractor (id,name,contractor_type_id,adress,www,fax,mail,extension_phone) values (1,'Уэйн Энтерпрайзис',1,'Готэм, Башня Уэйнов','waine.com',1212,'mail@waine.com','+7(000)010-00 00');
-- insert into contractor (id,name,contractor_type_id) values (2,'Apple',2);
-- insert into contractor (id,name,contractor_type_id) values (3,'General Motors Inc',3);
-- insert into contractor (id,name,contractor_type_id) values (4,'Газпром',2);
-- insert into contractor (id,name,contractor_type_id) values (5,'Рога и копыта',4);
-- insert into contractor (id,name,contractor_type_id) values (6,'Международный банк',5);

insert into contact (id,name,contractor_id,post,communication_id,adress) values (1,'Брюс Уэйн',1,'миллиардер',1,'Готэм, поместье Уэйнов');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (2,'Младший брат Тора',2,'сын короля',1,'Асгард, дворец Одина');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (3,'Рон Уизли',3,'друг Поттера',1,'г.Москва, ул.Стрелецкая');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (4,'Зеленый Гоблин',4,'злодей',1,'хз');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (5,'Профессор Мориарти',5,'математик-злодей',1,'Лондон, Оксфорд');


# --- !Downs
