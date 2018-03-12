# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  email                         varchar(255),
  name                          varchar(255),
  department_id                 bigint,
  constraint pk_employee primary key (id)
);

create table employee_project (
  employee_id                   bigint not null,
  project_id                    bigint not null,
  constraint pk_employee_project primary key (employee_id,project_id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_project primary key (id)
);

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  age                           varchar(255),
  constraint pk_user primary key (email)
);

alter table employee add constraint fk_employee_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_employee_department_id on employee (department_id);

alter table employee_project add constraint fk_employee_project_employee foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_employee_project_employee on employee_project (employee_id);

alter table employee_project add constraint fk_employee_project_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_employee_project_project on employee_project (project_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_department_id;
drop index if exists ix_employee_department_id;

alter table employee_project drop constraint if exists fk_employee_project_employee;
drop index if exists ix_employee_project_employee;

alter table employee_project drop constraint if exists fk_employee_project_project;
drop index if exists ix_employee_project_project;

drop table if exists department;

drop table if exists employee;

drop table if exists employee_project;

drop table if exists project;

drop table if exists user;

