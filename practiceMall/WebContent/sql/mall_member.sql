create table mall_member(
    member_number number not null primary key,
    member_id varchar2(36) not null,
    member_passwd varchar2(60) not null,
    member_name varchar(20) not null,
    member_type varchar2(10) not null,
    member_point number not null,
    member_reg_date date not null
);