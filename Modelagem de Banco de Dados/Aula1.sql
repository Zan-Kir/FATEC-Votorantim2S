/*
CREATE DATABASE BD_Teste;
GO;
USE BD_Teste;
GO;
DROP DATABASE BD_Teste;
GO;
*/

/*
Create table Cliente
(
Cod_Cli int not null,
Nome_Cli varchar(40) not null,
End_Cli varchar(30) not null,
Bai_Cli varchar(20) not null,
Cid_Cli varchar(20) not null,
Uf_Cli char(3) not null,
Tel_Cli varchar(15) null,
Constraint PK_Cliente Primary Key(Cod_Cli),
)
*/

/*
Create Table NotaFiscal
(
Num_Nota int not null,
Cod_Cli int not null,
Serie_Nota varchar(10) not null,
Emissao_Nota smalldatetime null,
Vtot_Nota SmallMoney not null,

Constraint PK_NotaFiscal Primary Key(Num_Nota),
Constraint FK_Cliente Foreign Key(Cod_Cli) References cliente(Cod_Cli)
)
*/

/*
Create table Cidade
(Codcidade varchar(2) not null,
Nomecidade varchar(40))

Create table Empregado
(Nrmatricula int,
Nome varchar(50),
Data_demissao datetime,
Salario float)

Create table estado
(cdestado varchar(2) not null,
Nomeestado varchar(30))
*/

/*
Alter table cidade
Add Primary Key (codcidade);

Alter table cidade
Add cdestado char(2) not null,
teste varchar(1) null;

Alter table cidade
Drop column teste;

Alter table cidade
Alter column cdestado varchar(2);


Alter table cidade
Drop constraint PK__Cidade__9ED2CA961CE2D03A

Alter table cidade
Add constraint PK_CodCidade Primary Key(Codcidade)


Alter table estado
Add Primary Key(cdestado);

Alter table cidade
Add Foreign Key(cdestado) references estado(cdestado);
*/

Drop table Empregado