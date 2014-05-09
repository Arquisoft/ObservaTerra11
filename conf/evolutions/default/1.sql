# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table business (
  id                        varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  type                      varchar(255),
  active                    boolean,
  nif                       varchar(255),
  description               varchar(255),
  phone                     varchar(255),
  address                   varchar(255),
  web_site                  varchar(255),
  constraint pk_business primary key (id))
;

create table collaborator (
  id                        varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  type                      varchar(255),
  active                    boolean,
  phone                     varchar(255),
  address                   varchar(255),
  organization              varchar(255),
  specialization            varchar(255),
  constraint pk_collaborator primary key (id))
;

create table country (
  code                      varchar(255) not null,
  name                      varchar(255),
  constraint pk_country primary key (code))
;

create table indicator (
  code                      varchar(255) not null,
  name                      varchar(255),
  constraint pk_indicator primary key (code))
;

create table observation (
  id                        bigint not null,
  user_id                   varchar(255),
  obs_value                 double,
  country_code              varchar(255),
  indicator_code            varchar(255),
  constraint pk_observation primary key (id))
;

create table user (
  id                        varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  type                      varchar(255),
  active                    boolean,
  constraint pk_user primary key (id))
;

create table users (
  id                        varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  type                      varchar(255),
  active                    boolean,
  constraint pk_users primary key (id))
;

create sequence business_seq;

create sequence collaborator_seq;

create sequence country_seq;

create sequence indicator_seq;

create sequence observation_seq;

create sequence user_seq;

create sequence users_seq;

alter table observation add constraint fk_observation_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_observation_user_1 on observation (user_id);
alter table observation add constraint fk_observation_country_2 foreign key (country_code) references country (code) on delete restrict on update restrict;
create index ix_observation_country_2 on observation (country_code);
alter table observation add constraint fk_observation_indicator_3 foreign key (indicator_code) references indicator (code) on delete restrict on update restrict;
create index ix_observation_indicator_3 on observation (indicator_code);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists business;

drop table if exists collaborator;

drop table if exists country;

drop table if exists indicator;

drop table if exists observation;

drop table if exists user;

drop table if exists users;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists business_seq;

drop sequence if exists collaborator_seq;

drop sequence if exists country_seq;

drop sequence if exists indicator_seq;

drop sequence if exists observation_seq;

drop sequence if exists user_seq;

drop sequence if exists users_seq;

