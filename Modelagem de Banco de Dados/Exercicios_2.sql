/*1*/
create table Tbl_Clientes
(
ID_Cli int identity(1,1) not null,
Nome_Cli varchar(50) not null,
Email_Cli varchar(100) not null,
Telefone_Cli varchar(15) not null,
constraint PK_Clientes Primary Key (ID_Cli)
)

/*2*/
insert into Tbl_Clientes
values
('João Silva', 'joao@email.com', '(11) 1234-5678')

/*3*/
insert into Tbl_Clientes
values
('Benjamin Braga', 'benjamin_braga@yahoo.com', '(82) 2806-8312'), ('Nicolas Souza', 'nicolas_souza@aol.com', '(68) 3941-7786'),
('Breno Costa', 'breno_costa@yahoo.com', '(37) 2064-4488'), ('Roberta Martins', 'roberta_martins@gmail.com', '(17) 2678-2175'),
('Sílvia Reis', 'sra_sílvia_reis@gmail.com', '(22) 2252-5656'), ('Ladislau Barros', 'ladislau_barros@gmail.com', '(63) 3358-8596'),
('Maria Clara Reis', 'maria_clara_reis@protonmail.com', '(32) 3181-6126'), ('Enzo Silva', 'enzo_silva@yandex.com', '(95) 3798-2326'),
('Bruna Franco', 'bruna_franco@yandex.com', '(12) 3477-3290'), ('Sophia Nogueira', 'sophia_nogueira@outlook.com', '(67) 2537-7734')

/*4*/
update Tbl_Clientes
set Telefone_Cli = '(11) 8765-4321'
where ID_Cli = '1'

/*5*/
create table Tbl_Produtos
(
ID_Prod int identity(1,1) not null,
Nome_Prod varchar(50) not null,
Preco_Prod decimal(7,2) not null,
Estoque_Prod int not null,
constraint PK_Produtos Primary Key (ID_Prod)
)

/*6*/
insert into Tbl_Produtos
values
('Camiseta', '29.99', '100')

/*7*/
insert into Tbl_Produtos
values
('Meias', '5.99', '86'), ('Calça', '139.99', '156'), ('Tênis', '369.99', '200'),
('Shorts', '49.99', '133'), ('Vestido', '69.99', '127'), ('Pijama', '79.99', '55'),
('Boné', '19.99', '285'), ('Camisa', '29.99', '213'), ('Blusa', '129.99', '76'),
('Paletó', '399.99', '100')

/*8*/
update Tbl_Produtos
set Preco_Prod = '39.99'
where ID_Prod = '1'

/*9*/
create table Tbl_Pedidos
(
ID_Pedido int identity(1,1) not null,
Cliente_ID int not null,
Produto_ID int not null,
Qtd_Pedido int not null,
Data_Pedido Date not null,
constraint PK_Pedidos Primary Key (ID_Pedido),
constraint FK_Cli_Pedido Foreign Key(Cliente_ID) references Tbl_Clientes(ID_Cli),
constraint FK_Prod_Pedido Foreign Key(Produto_ID) references Tbl_Produtos(ID_Prod)
)

/*10*/
insert into Tbl_Pedidos
values
('1', '1', '2', GETDATE())

/*11*/
insert into Tbl_Pedidos
values
('2', '2', '3', GETDATE()+10), ('3', '3', '2', GETDATE()+12), ('4', '4', '5', GETDATE()+14),
('5', '5', '1', GETDATE()+32), ('6', '6', '8', GETDATE()+90), ('7', '7', '4', GETDATE()+356),
('8', '8', '2', GETDATE()+11), ('9', '9', '3', GETDATE()+55), ('10', '10', '7', GETDATE()+223),
('11', '11', '9', GETDATE()+5)

/*12*/
update Tbl_Pedidos
set Qtd_Pedido = '3'
where ID_Pedido = '1'

/*13*/
create table Tbl_Funcionarios
(
ID_Func int identity(1,1) not null,
Nome_Func varchar(50) not null,
Cargo_Func varchar(50) not null,
Salario_Func decimal(7,2) not null,
constraint PK_Funcionario Primary Key (ID_Func)
)

/*14*/
insert into Tbl_Funcionarios
values
('Maria Santos', 'Gerente', '5000')

/*15*/
update Tbl_Funcionarios
set Salario_Func = '6000'
where ID_Func = '1'

/*16*/
insert into Tbl_Funcionarios
values
('Karla Martins', 'Gestor de Marketing', '3500'), ('Joana Pereira', 'Coordenador de Vendas', '4000'), ('Suélen Silva Neto', 'Consultor', '3000'),
('Eloá Pereira', 'Suporte/SAC', '2500'), ('Beatriz Reis', 'Suporte/SAC', '2500'), ('Frederico Saraiva', 'Vendedor', '2000'),
('Bryan Moraes', 'Vendedor', '2000'), ('Antônio Reis', 'Vendedor', '2000'), ('Rafaela Franco', 'Vendedor', '2000'),
('Janaína Nogueira', 'Vendedor', '2000')

/*17*/
create table Tbl_Vendas
(
ID_Venda int identity(1,1) not null,
Prod_ID int not null,
Qtd_Venda int not null,
Valor_Total decimal(7,2),
Data_Venda Date,
constraint PK_Vendas Primary Key (ID_Venda),
constraint FK_Prod_Venda Foreign Key(Prod_ID) references Tbl_Produtos(ID_Prod)
)

/*18*/
insert into Tbl_Vendas
values
('1', '2', '79.98', GETDATE())

/*19*/
delete from Tbl_Vendas
where ID_Venda = '1'

/*20*/
insert into Tbl_Vendas
values
('2', '2', '11.98', GETDATE()), ('3', '4', '559.96', GETDATE()+100), ('4', '1', '369.99', GETDATE()+23),
('5', '3', '149.97', GETDATE()+33), ('6', '10', '699.90', GETDATE()+98), ('7', '2', '159.98', GETDATE()+738),
('8', '6', '119.94', GETDATE()+00), ('9', '2', '59.98', GETDATE()), ('10', '1', '129.99', GETDATE()),
('11', '2', '799.98', GETDATE())

select * from Tbl_Clientes
select * from Tbl_Produtos
select * from Tbl_Pedidos
select * from Tbl_Funcionarios
select * from Tbl_Vendas