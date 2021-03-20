CREATE TABLE cliente (
	id serial not null,
	nome varchar(60) not null,
	email varchar(255) not null,
	telefone varchar(20) not null,
	
	primary key (id)
)