create table cliente (
	id bigint not null auto_increment,
	nome varchar(100) not null,
	sobrenome varchar(100) not null,
	email varchar(255) not null,
	cpf varchar(11) not null,
	nascimento datetime not null,		
	primary key (id)
)engine=InnoDB default charset=utf8;