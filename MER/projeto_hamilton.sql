create database projetos_teste;
use projetos_teste;

create table AreaPesq(
id int auto_increment,
area_de_conhec varchar(20) not null,
grande_area_conhec varchar(20) not null,
primary key(ID)
);

create  table GrauAc(
id int auto_increment,
nivel_academico varchar(45) not null,
primary key (ID)
);


create  table Avaliador(
id int auto_increment,
nome varchar(40) not null,
cpf int (11) not null,
rg int (9) not null,
sexo character not null,
dta_nasc int not null,
primary key (id),
GrauAc_ID int,
AreaPesq_id int, 
foreign key (GrauAc_ID) references GrauAc(id),
foreign key (AreaPesq_id) references AreaPesq(id) 
);



create  table Pesquisador(
id int auto_increment,
nome varchar(40) not null,
cpf int (11) not null,
rg int (9) not null,
sexo character not null,
dta_nasc int not null,
primary key (id),
GrauAc_id int,
AreaPesq_id int,   
foreign key (GrauAc_id) references GrauAc(id)
);



create  table Projetos(
id int auto_increment,
titulo varchar(20) not null,
orcamento int not null,
instituicao varchar (20) not null,
primary key (id),
Avaliador_id int,
Pesquisador_id int,
foreign key (Avaliador_id) references Avaliador(id),
foreign key (Pesquisador_id) references Pesquisador(id)
);

create table Projetos_do_avaliador(
Avaliador_id int,
Projetos_id int,
foreign key (Avaliador_id) references Avaliador(id),
foreign key (Projetos_id) references Projetos(id)
);
