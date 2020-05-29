-- create table tbl_board(
-- bno int primary key auto_increment,
-- title varchar(200) not null,
-- content varchar(20000) not null,
-- writer varchar(50) not null,
-- regdate datetime default now(),
-- updatedate datetime default now());

create table tbl_reply(
	rno int primary key auto_increment,
	bno int references tbl_board(bno),
	reply varchar(1000) not null,
	replyer varchar(50) not null,
	replyDate datetime default now(),
	updateDate datetime default now()
)
