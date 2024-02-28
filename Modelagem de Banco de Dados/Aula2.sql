/*
insert into estado
values
('SP', 'São Paulo');

insert into cidade
values
('1', 'Votorantim', 'SP');

insert into cidade(Codcidade, Nomecidade, Cdestado)
values ('2', 'Sorocaba', 'SP');
*/
/*
select * from estado;
select * from cidade;
*/
/*
insert into estado
values
('NN', 'Não Cadastrado');

insert into cidade(Codcidade, Nomecidade, cdestado)
values ('3', 'Itu', 'NN');

insert into Cidade(Codcidade, Nomecidade, cdestado)
values ('4', 'Itapira', 'NN');
*/
/*
Update Cidade
set cdestado = 'SP'
Where cdestado = 'NN';
*/

/*
insert into estado
values ('RJ', 'Rio de Janeiro');

insert into cidade
values ('5', 'São Roque', 'RJ');

*/
/*
select * from cidade
where cdestado = 'RJ';

update Cidade
set Nomecidade = 'Rio de Janeiro'
where codcidade = '5'
*/
/*
Update Cidade
set cdestado = 'NN'
where Nomecidade in ('Itu', 'Itapira');
*/
/*
Delete from Cidade
where Nomecidade = 'Itapira';
*/
/*
Delete from Cidade
where cdestado = 'SP';

delete from estado
where cdestado = 'SP';
*/

/*
create table tb1_Clientes
(
Codigo int identity(1,1) Primary Key,
Nome varchar(100),
UF varchar(2)
);
*/

/*
insert into 
tb1_Clientes (Nome, UF)
values 
('Nicholas', 'RS');
*/

/*
insert into 
tb1_Clientes (Nome, UF)
values 
('Robertinho', 'SP');
insert into 
tb1_Clientes (Nome, UF)
values 
('Murilo', 'SP');
*/

/*
insert into tb1_Clientes
(Nome, UF)
values ('Bruce Wayne', 'SP'), ('Tony Stark', 'RS'), ('Diana Prince', 'PR');
*/

/*
select * from tb1_Clientes;
select IDENT_CURRENT('tb1_Clientes') as Ultimo_registro;
*/

/* 
sp_rename 'tb1_Clientes.Nome', 'nome', 'column' 
esse comando renomeia o campo 
*/