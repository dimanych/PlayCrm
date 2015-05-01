# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table communication (
  id                        bigint not null,
  home_phone                varchar(255),
  mobile_phone              varchar(255),
  work_phone                varchar(255),
  skype                     varchar(255),
  email                     varchar(255),
  www                       varchar(255),
  social_account            varchar(255),
  other                     varchar(255),
  constraint pk_communication primary key (id))
;

create table contact (
  id                        bigint not null,
  name                      varchar(255),
  contractor_id             bigint,
  post                      varchar(255),
  communication_id          bigint,
  adress                    varchar(255),
  constraint pk_contact primary key (id))
;

create table contractor (
  id                        bigint not null,
  name                      varchar(255),
  contractor_type_id        bigint,
  adress                    varchar(255),
  www                       varchar(255),
  fax                       varchar(255),
  mail                      varchar(255),
  extension_phone           varchar(255),
  constraint pk_contractor primary key (id))
;

create table contractor_type (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_contractor_type primary key (id))
;

create table deal (
  id                        bigint not null,
  name                      varchar(255),
  contractor_id             bigint,
  deal_phase_id             bigint,
  start_date                timestamp,
  end_date                  timestamp,
  budget                    decimal(38),
  constraint pk_deal primary key (id))
;

create table deal_phase (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_deal_phase primary key (id))
;

create table order_entity (
  id                        bigint not null,
  name                      varchar(255),
  number                    integer,
  date                      timestamp,
  contractor_id             bigint,
  contact_id                bigint,
  plan_execution_date       timestamp,
  execution_date            timestamp,
  amount                    bigint,
  payment                   bigint,
  order_state               integer,
  payment_state             integer,
  supply_state              integer,
  deal_id                   bigint,
  product_id                bigint,
  supply_payment            varchar(255),
  constraint ck_order_entity_order_state check (order_state in (0,1,2,3,4)),
  constraint ck_order_entity_payment_state check (payment_state in (0,1,2,3,4)),
  constraint ck_order_entity_supply_state check (supply_state in (0,1,2,3,4)),
  constraint pk_order_entity primary key (id))
;

create table product (
  id                        bigint not null,
  name                      varchar(255),
  code                      integer,
  price                     bigint,
  characteristic            varchar(255),
  constraint pk_product primary key (id))
;

create table supply_payment (
  id                        bigint not null,
  name                      varchar(255),
  supply_payment_type       varchar(255),
  plan_date                 timestamp,
  percentage                integer,
  sum_plan                  bigint,
  delay                     integer,
  fact_date                 timestamp,
  state                     varchar(255),
  sum_fact                  bigint,
  constraint pk_supply_payment primary key (id))
;

create sequence communication_seq;

create sequence contact_seq;

create sequence contractor_seq;

create sequence contractor_type_seq;

create sequence deal_seq;

create sequence deal_phase_seq;

create sequence order_entity_seq;

create sequence product_seq;

create sequence supply_payment_seq;

alter table contact add constraint fk_contact_contractor_1 foreign key (contractor_id) references contractor (id);
create index ix_contact_contractor_1 on contact (contractor_id);
alter table contact add constraint fk_contact_communication_2 foreign key (communication_id) references communication (id);
create index ix_contact_communication_2 on contact (communication_id);
alter table contractor add constraint fk_contractor_contractorType_3 foreign key (contractor_type_id) references contractor_type (id);
create index ix_contractor_contractorType_3 on contractor (contractor_type_id);
alter table deal add constraint fk_deal_contractor_4 foreign key (contractor_id) references contractor (id);
create index ix_deal_contractor_4 on deal (contractor_id);
alter table deal add constraint fk_deal_dealPhase_5 foreign key (deal_phase_id) references deal_phase (id);
create index ix_deal_dealPhase_5 on deal (deal_phase_id);
alter table order_entity add constraint fk_order_entity_contractor_6 foreign key (contractor_id) references contractor (id);
create index ix_order_entity_contractor_6 on order_entity (contractor_id);
alter table order_entity add constraint fk_order_entity_contact_7 foreign key (contact_id) references contact (id);
create index ix_order_entity_contact_7 on order_entity (contact_id);
alter table order_entity add constraint fk_order_entity_deal_8 foreign key (deal_id) references deal (id);
create index ix_order_entity_deal_8 on order_entity (deal_id);
alter table order_entity add constraint fk_order_entity_product_9 foreign key (product_id) references product (id);
create index ix_order_entity_product_9 on order_entity (product_id);



# --- !Downs

drop table if exists communication cascade;

drop table if exists contact cascade;

drop table if exists contractor cascade;

drop table if exists contractor_type cascade;

drop table if exists deal cascade;

drop table if exists deal_phase cascade;

drop table if exists order_entity cascade;

drop table if exists product cascade;

drop table if exists supply_payment cascade;

drop sequence if exists communication_seq;

drop sequence if exists contact_seq;

drop sequence if exists contractor_seq;

drop sequence if exists contractor_type_seq;

drop sequence if exists deal_seq;

drop sequence if exists deal_phase_seq;

drop sequence if exists order_entity_seq;

drop sequence if exists product_seq;

drop sequence if exists supply_payment_seq;

