# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table TORGANIZATION (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  activa                    boolean,
  constraint pk_TORGANIZATION primary key (id))
;

create table TCOMPOSEDBY (
  id                        bigint auto_increment not null,
  org_have_id               bigint,
  org_belong_id             bigint,
  constraint pk_TCOMPOSEDBY primary key (id))
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
  obs_value                 double,
  country_code              varchar(255),
  indicator_code            varchar(255),
  constraint pk_observation primary key (id))
;

create table TDOCUMENTS (
  id                        bigint auto_increment not null,
  area                      varchar(255),
  indicator                 varchar(255),
  measure                   varchar(255),
  external_sorce            boolean,
  provider_id               bigint,
  user_id                   bigint,
  time                      timestamp,
  constraint pk_TDOCUMENTS primary key (id))
;

create table TUSERS (
  id                        bigint auto_increment not null,
  login                     varchar(255),
  password                  varchar(255),
  permission                varchar(16),
  organization_id           bigint,
  activo                    boolean,
  constraint ck_TUSERS_permission check (permission in ('ADMINISTRATOR','ADMINITRATOR_ONG','ENPLOYEE')),
  constraint pk_TUSERS primary key (id))
;

create sequence country_seq;

create sequence indicator_seq;

create sequence observation_seq;

alter table TCOMPOSEDBY add constraint fk_TCOMPOSEDBY_orgHave_1 foreign key (org_have_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TCOMPOSEDBY_orgHave_1 on TCOMPOSEDBY (org_have_id);
alter table TCOMPOSEDBY add constraint fk_TCOMPOSEDBY_orgBelong_2 foreign key (org_belong_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TCOMPOSEDBY_orgBelong_2 on TCOMPOSEDBY (org_belong_id);
alter table observation add constraint fk_observation_country_3 foreign key (country_code) references country (code) on delete restrict on update restrict;
create index ix_observation_country_3 on observation (country_code);
alter table observation add constraint fk_observation_indicator_4 foreign key (indicator_code) references indicator (code) on delete restrict on update restrict;
create index ix_observation_indicator_4 on observation (indicator_code);
alter table TDOCUMENTS add constraint fk_TDOCUMENTS_provider_5 foreign key (provider_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TDOCUMENTS_provider_5 on TDOCUMENTS (provider_id);
alter table TDOCUMENTS add constraint fk_TDOCUMENTS_user_6 foreign key (user_id) references TUSERS (id) on delete restrict on update restrict;
create index ix_TDOCUMENTS_user_6 on TDOCUMENTS (user_id);
alter table TUSERS add constraint fk_TUSERS_organization_7 foreign key (organization_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TUSERS_organization_7 on TUSERS (organization_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists TORGANIZATION;

drop table if exists TCOMPOSEDBY;

drop table if exists country;

drop table if exists indicator;

drop table if exists observation;

drop table if exists TDOCUMENTS;

drop table if exists TUSERS;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists country_seq;

drop sequence if exists indicator_seq;

drop sequence if exists observation_seq;

