/*1*/
create table Setor
(
cod_setor int identity(1,1),
nome_setor varchar(30),
constraint PK_Setor Primary key (cod_setor)
)

/*2-3*/
create table Funcionario
(
nrmatricula int identity(1,1),
primeiro_nome varchar(20),
ultimo_nome varchar(50),
email varchar(200),
telefone varchar(20),
data_admissao datetime,
salario float,
setor_cod int,
constraint FK_Func_Cod_Setor Foreign Key(setor_cod) references Setor(cod_setor),
constraint PK_Funcionario Primary key (nrmatricula)
)

/*4*/
insert into Setor
values
('Administração'), ('Recursos Humanos'), ('Produção'), ('Logística'), ('Tecnologia da Informação')

/*5*/
insert into Funcionario
values
('Washington', 'Oliveira', 'sr_washington_oliveira@yandex.com', '(65) 3653-0479','05-02-2019', '5250', '1'),
('Isabela', 'Albuquerque', 'isabela_albuquerque@aol.com', '(96) 3858-6010','08-10-2018', '5150', '1'),
('Isis', 'Barros Filho', 'isis_barros_filho@yandex.com', '(67) 3367-1768', '29-12-2021', '3050', '2'),
('Antônio', 'Carvalho', 'antônio_carvalho@gmail.com', '(88) 2252-3719', '26-07-2020', '1800', '3'),
('Ladislau', 'Oliveira', 'ladislau_oliveira@yandex.com', '(55) 2418-5124', '11-06-2022', '1800', '3'),
('Elísio', 'Barros', 'elísio_barros@aol.com', '(44) 3047-6747', '13-12-2017', '1800', '3'),
('Maria', 'Alice Santos', 'maria_alice_santos@aol.com', '(68) 2125-8433', '08-08-2020', '2750', '4'),
('Ígor', 'Costa', 'ígor_costa@yahoo.com', '(97) 3486-0769', '03-08-2016', '3500', '5')

/*6a*/
select distinct setor_cod from Funcionario

/*6b*/
select ultimo_nome + ', ' + CONVERT(varchar, setor_cod) as 'Empregado e Setor' from Funcionario

select * from Setor
select * from Funcionario