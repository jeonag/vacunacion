/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     2/12/2022 10:02:08 AM                        */
/*==============================================================*/


drop index EMPLEADOS_PK;

drop table EMPLEADO;

drop index REL_EMPVAC_TIPOVAC_FK;

drop index REL_EMP_EMPVACUNA_FK;

drop index EMPLEADOSVACUNADOS_PK;

drop table EMPLEADOVACUNADO;

drop index ROLES_PK;

drop table ROL;

drop index TIPOVACUNAS_PK;

drop table TIPOVACUNA;

drop index RELATIONSHIP_4_FK;

drop index REL_EMP_USUARIO_FK;

drop index USUARIOS_PK;

drop table USUARIO;

/*==============================================================*/
/* Table: EMPLEADO                                              */
/*==============================================================*/
create table EMPLEADO (
   CEMPLEADO            NUMERIC(10)          not null,
   IDENTIFICACION       NUMERIC(10)          null,
   NOMBRES              VARCHAR(50)          null,
   APELLIDOS            VARCHAR(50)          null,
   MAIL                 VARCHAR(120)         null,
   FNACIMIENTO          DATE                 null,
   DIRECCION            VARCHAR(120)         null,
   TELEFONO             VARCHAR(20)          null,
   ESTAVACUNADO         NUMERIC(1)           null,
   constraint PK_EMPLEADO primary key (CEMPLEADO)
);

/*==============================================================*/
/* Index: EMPLEADOS_PK                                          */
/*==============================================================*/
create unique index EMPLEADOS_PK on EMPLEADO (
CEMPLEADO
);

/*==============================================================*/
/* Table: EMPLEADOVACUNADO                                      */
/*==============================================================*/
create table EMPLEADOVACUNADO (
   CEMPLEADOVACUNA      NUMERIC(3)           not null,
   CEMPLEADO            NUMERIC(10)          not null,
   CVACUNA              NUMERIC(3)           not null,
   FVACUNACION          DATE                 null,
   NUMDOSIS             NUMERIC(2)           null,
   constraint PK_EMPLEADOVACUNADO primary key (CEMPLEADOVACUNA)
);

/*==============================================================*/
/* Index: EMPLEADOSVACUNADOS_PK                                 */
/*==============================================================*/
create unique index EMPLEADOSVACUNADOS_PK on EMPLEADOVACUNADO (
CEMPLEADOVACUNA
);

/*==============================================================*/
/* Index: REL_EMP_EMPVACUNA_FK                                  */
/*==============================================================*/
create  index REL_EMP_EMPVACUNA_FK on EMPLEADOVACUNADO (
CEMPLEADO
);

/*==============================================================*/
/* Index: REL_EMPVAC_TIPOVAC_FK                                 */
/*==============================================================*/
create  index REL_EMPVAC_TIPOVAC_FK on EMPLEADOVACUNADO (
CVACUNA
);

/*==============================================================*/
/* Table: ROL                                                   */
/*==============================================================*/
create table ROL (
   CROL                 NUMERIC(4)           not null,
   NOMBRE               VARCHAR(30)          null,
   constraint PK_ROL primary key (CROL)
);

/*==============================================================*/
/* Index: ROLES_PK                                              */
/*==============================================================*/
create unique index ROLES_PK on ROL (
CROL
);

/*==============================================================*/
/* Table: TIPOVACUNA                                            */
/*==============================================================*/
create table TIPOVACUNA (
   CVACUNA              NUMERIC(3)           not null,
   NOMBRE               VARCHAR(100)         null,
   constraint PK_TIPOVACUNA primary key (CVACUNA)
);

/*==============================================================*/
/* Index: TIPOVACUNAS_PK                                        */
/*==============================================================*/
create unique index TIPOVACUNAS_PK on TIPOVACUNA (
CVACUNA
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO (
   CUSUARIO             VARCHAR(20)          not null,
   CEMPLEADO            NUMERIC(10)          null,
   CROL                 NUMERIC(4)           null,
   PASSWORD             VARCHAR(70)          null,
   constraint PK_USUARIO primary key (CUSUARIO)
);

/*==============================================================*/
/* Index: USUARIOS_PK                                           */
/*==============================================================*/
create unique index USUARIOS_PK on USUARIO (
CUSUARIO
);

/*==============================================================*/
/* Index: REL_EMP_USUARIO_FK                                    */
/*==============================================================*/
create  index REL_EMP_USUARIO_FK on USUARIO (
CEMPLEADO
);

/*==============================================================*/
/* Index: RELATIONSHIP_4_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_4_FK on USUARIO (
CROL
);

alter table EMPLEADOVACUNADO
   add constraint FK_EMPLEADO_REL_EMPVA_TIPOVACU foreign key (CVACUNA)
      references TIPOVACUNA (CVACUNA)
      on delete restrict on update restrict;

alter table EMPLEADOVACUNADO
   add constraint FK_EMPLEADO_REL_EMP_E_EMPLEADO foreign key (CEMPLEADO)
      references EMPLEADO (CEMPLEADO)
      on delete restrict on update restrict;

alter table USUARIO
   add constraint FK_USUARIO_RELATIONS_ROL foreign key (CROL)
      references ROL (CROL)
      on delete restrict on update restrict;

alter table USUARIO
   add constraint FK_USUARIO_REL_EMP_U_EMPLEADO foreign key (CEMPLEADO)
      references EMPLEADO (CEMPLEADO)
      on delete restrict on update restrict;

