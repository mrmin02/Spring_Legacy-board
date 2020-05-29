create table tbl_board(
	bno int primary key AUto_increment,
	title varchar(200) not null,
	content varchar(20000) not null,
	writer varchar(50) not null,
	regdate datetime default now(),
	updatdatte datetime default now());