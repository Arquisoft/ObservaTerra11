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
  id                        bigint not null,
  org_have_id               bigint,
  org_belong_id             bigint,
  constraint pk_TCOMPOSEDBY primary key (id))
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
  email                     varchar(255),
  permission                varchar(16),
  organization_id           bigint,
  activo                    boolean,
  constraint ck_TUSERS_permission check (permission in ('ADMINISTRATOR','ADMINITRATOR_ONG','ENPLOYEE')),
  constraint pk_TUSERS primary key (id))
;

create sequence TCOMPOSEDBY_seq;

alter table TCOMPOSEDBY add constraint fk_TCOMPOSEDBY_orgHave_1 foreign key (org_have_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TCOMPOSEDBY_orgHave_1 on TCOMPOSEDBY (org_have_id);
alter table TCOMPOSEDBY add constraint fk_TCOMPOSEDBY_orgBelong_2 foreign key (org_belong_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TCOMPOSEDBY_orgBelong_2 on TCOMPOSEDBY (org_belong_id);
alter table TDOCUMENTS add constraint fk_TDOCUMENTS_provider_3 foreign key (provider_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TDOCUMENTS_provider_3 on TDOCUMENTS (provider_id);
alter table TDOCUMENTS add constraint fk_TDOCUMENTS_user_4 foreign key (user_id) references TUSERS (id) on delete restrict on update restrict;
create index ix_TDOCUMENTS_user_4 on TDOCUMENTS (user_id);
alter table TUSERS add constraint fk_TUSERS_organization_5 foreign key (organization_id) references TORGANIZATION (id) on delete restrict on update restrict;
create index ix_TUSERS_organization_5 on TUSERS (organization_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists TORGANIZATION;

drop table if exists TCOMPOSEDBY;

drop table if exists TDOCUMENTS;

drop table if exists TUSERS;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists TCOMPOSEDBY_seq;

