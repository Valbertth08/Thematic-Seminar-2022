use seminario;
create table aluno (
id_aluno int primary key not null auto_increment,
codigo int not null,
senha int not null,
nome varchar(50) not null,
idade int not null,
cpf  int  null unique,
endereço varchar(50) not null,
responsavel varchar(50) not null
);

create table professor(
id_professor int primary key not null auto_increment,
usuario varchar(30),
senha int
);


use seminario;
select  * from aluno







