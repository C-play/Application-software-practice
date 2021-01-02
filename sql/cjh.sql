-- --------------------新增代码------------------------

-- ----------------------------
-- 21、宠物管理表
-------------------------------
drop table if exists sys_pet_management;
create table sys_pet_management(
  pet_id            bigint(20)      not null auto_increment    comment '宠物ID',
  pet_name          varchar(20)     default ''                 comment '宠物昵称',
  pet_kind          varchar(20)     not null                   comment '宠物种类',
  pet_master_id     bigint(20)      default 0                  comment '宠物主人ID',
  pet_master_name   varchar(20)     default '00'               comment '宠物主人昵称（00代表暂无主人）',
  is_sell           bigint(5)       not null                   comment '宠物是否售出（1已售出，0未售出）',
  pet_price         bigint(20)      not null                   comment '宠物价格',
  pet_breeder_id    bigint(20)      not null                   comment '宠物饲养员ID',
  pet_breeder_name  varchar(20)     not null                   comment '宠物饲养员昵称',
  primary key (pet_id)
) engine=innodb auto_increment=2000 comment = '宠物管理表';

-- ----------------------------
-- 初始化-宠物管理表数据
-- ----------------------------
insert into sys_pet_management values(1,  '小黄', '中华田园犬', 10, 'cjh', 1, 2000, 25, '王海');
insert into sys_pet_management values(2,  '旺财', '中华田园犬', 10, 'cjh', 1, 1500, 15, '王琦');
insert into sys_pet_management values(3,  '大黄', '中华田园犬', 10, 'cjh', 1, 1500, 15, '王琦');


-- ----------------------------
-- 22、宠物基本信息表
-------------------------------
drop table if exists sys_pet;
create table sys_pet (
  pet_id            bigint(20)      not null auto_increment    comment '宠物ID',
  pet_name          varchar(20)     default ''                 comment '宠物昵称',
  pet_kind          varchar(20)     not null                   comment '宠物种类',
  pet_age           bigint(5)       not null                   comment '宠物年龄',
  pet_birth         varchar(20)     default ''                 comment '宠物出生日期',
  pet_weight        varchar(20)     default ''                 comment '宠物体重',
  pet_color         varchar(20)     default ''                 comment '宠物毛色',
  pet_like          varchar(20)     default ''                 comment '宠物喜好',
  primary key (pet_id)
) engine=innodb auto_increment=1 comment = '宠物基本信息表';

-- ----------------------------
-- 初始化-宠物基本信息表数据
-- ----------------------------
insert into sys_pet values(1,  '小黄','中华田园犬',5,'','25KG','黄色','');
insert into sys_pet values(2,  '旺财','中华田园犬',5,'2015','25KG','黄色','');



-- ----------------------------
-- 23、饲养员基本信息表
-------------------------------
drop table if exists sys_breeder;
create table sys_breeder (
  breeder_id        bigint(20)      not null auto_increment    comment '饲养员ID',
  breeder_name      varchar(20)     default ''                 comment '饲养员昵称',
  breeder_sl        varchar(20)     not null                   comment '饲养员工龄',
  breeder_age       bigint(5)       not null                   comment '饲养员年龄',
  breeder_birth     varchar(20)     default ''                 comment '饲养员出生日期',
  primary key (breeder_id)
) engine=innodb auto_increment=2000 comment = '饲养员基本信息表';

-- ----------------------------
-- 初始化-饲养员管理表数据
-- ----------------------------
insert into sys_breeder values(1,  '小王','3年',25,'');
insert into sys_breeder values(2,  '老王','2年',25,'1998');

-- ----------------------------
-- 24、宠物主人信息表
-------------------------------
drop table if exists sys_master;
create table sys_master (
  master_id        bigint(20)      not null auto_increment    comment '宠物主人ID',
  master_name      varchar(20)     default ''                 comment '宠物主人昵称',
  master_phone     varchar(20)     not null                   comment '宠物主人电话',
  master_mail      varchar(20)     not null                   comment '宠物主人邮箱',
  master_age       bigint(5)       not null                   comment '宠物主人年龄',
  master_birth     varchar(20)     default ''                 comment '宠物主人出生日期',
  master_buy       varchar(20)     not null                   comment '何时购买',
  pet_id           bigint(20)      not null                   comment '宠物ID',
  pet_name         varchar(20)     default ''                 comment '宠物昵称',
  primary key (master_id)
) engine=innodb auto_increment=2000 comment = '宠物主人基本信息表';

-- ----------------------------
-- 初始化-饲养员管理表数据
-- ----------------------------
insert into sys_master values(1,  '小王','1271721729','17722@qq.com',25,'1995','2020',1,'小黄');
insert into sys_master values(2,  '老王','1271721729','17722@qq.com',25,'1995','2020',1,'小黄');

