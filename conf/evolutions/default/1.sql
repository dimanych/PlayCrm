# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table contact (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  contractor_id             bigint,
  post                      varchar(255),
  phone                     varchar(255),
  adress                    varchar(255),
  constraint pk_contact primary key (id))
;

create table contractor (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_contractor primary key (id))
;

alter table contact add constraint fk_contact_contractor_1 foreign key (contractor_id) references contractor (id) on delete restrict on update restrict;
create index ix_contact_contractor_1 on contact (contractor_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table contact;

drop table contractor;

SET FOREIGN_KEY_CHECKS=1;

