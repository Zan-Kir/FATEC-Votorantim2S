/*1*/
Create table Professores
(
ID_Prof int not null,
Nome_Prof varchar(50),
Disc_Prof varchar(15),
Constraint PK_Professor Primary Key (ID_Prof),
);


/*2*/
insert into Professores
values
('1','Ana Oliveira', 'Português'); 


/*3*/
update Professores
set Nome_Prof = 'Ana Silva'
where ID_Prof = '1'


/*4*/
insert into Professores
values
('2','Ryan Lima Souza', 'Matemática'), ('3','Alex Gomes Silva', 'Biologia'),
('4','Manuela Araujo Martins', 'História'), ('5','Bruna Rocha Cardoso', 'Química'),
('6','Beatriz Goncalves Carvalho', 'Física'), ('7','Felipe Ribeiro Azevedo', 'Filosofia'),
('8','Diego Melo Correia', 'Geografia'), ('9','Evelyn Carvalho Goncalves', 'Educação Física'),
('10','Leonardo Pereira Alves', 'Artes'), ('11','Gabriela Castro Barros', 'Sociologia');


/*5*/
delete from Professores
where ID_Prof = '2';


/*6*/
create table Turmas
(
ID_Turma int not null,
Nome_Turma varchar(50) not null,
Prof_Responsavel int not null,
Constraint FK_Professor Foreign Key(Prof_Responsavel) References Professores(ID_Prof),
Constraint PK_Turma Primary Key (ID_Turma)
);


/*7*/
insert into Turmas
values
('1', '9A', '1');


/*8*/
insert into Turmas
values
('2', '8A', '3'), ('3', '7A', '4'), ('4', '6A', '5'),
('5', '9B', '6'), ('6', '8B', '7'), ('7', '7B', '8'),
('8', '6B', '9'), ('9', '9C', '10'), ('10', '8C', '11'), ('11', '7C', '7')


/*9*/
create table Alunos
(
ID_Alunos int not null,
Nome_Aluno varchar(50) not null,
Data_Nasc date not null,
Turma_ID int not null,
Constraint PK_Aluno Primary Key(ID_Alunos),
Constraint FK_Turma Foreign Key(Turma_ID) References Turmas(ID_Turma)
)


/*10*/
insert into Alunos
values
('1','Maria Souza','2005-10-15','1')


/*11*/
update Alunos
set Nome_Aluno = 'Maria da Silva'
where ID_Alunos = '1'


/*12*/
insert into Alunos
values
('2','Vinícius Araujo Lima','2010-09-27','1'), ('3','Antônio Barbosa Ferreira','1999-02-02','2'),
('4','Sarah Dias Ribeiro','1991-02-10','2'), ('5','Luís Souza Lima','1991-08-29','3'),
('6','Lara Alves Pinto','2005-02-01','3'), ('7','Kai Melo Martins','1996-09-22','4'),
('8','Gabriel Fernandes Carvalho','1982-02-14','4'), ('9','Alice Ferreira Alves','2012-08-01','5'),
('10','Thaís Barros Santos','2003-07-26','5'), ('11','Igor Goncalves Carvalho','1992-03-07','6')


/*13*/
delete from Alunos
where ID_Alunos = '2'


/*14*/
create table Notas
(
ID_Notas int identity(1,1) not null,
Aluno_ID int not null,
Disciplina varchar(15) not null,
Nota decimal(5,2) not null,
Constraint FK_Aluno Foreign Key (Aluno_ID) References Alunos(ID_Alunos),
Constraint PK_Notas Primary Key(ID_Notas)
);


/*15*/
insert into Notas
values
('1','Matemática', '8.5')


/*16*/
update Notas
set Nota = '9.0'
where Aluno_ID = '1'


/*17*/
insert into Notas
values
('3','Matemática', '6.2'), ('4','Matemática', '10.0'), ('5','Matemática', '6.0'),
('6','Matemática', '8.4'), ('7','Matemática', '8.2'), ('8','Matemática', '7.4'),
('9','Matemática', '9.7'), ('10','Matemática', '10.0'), ('11','Matemática', '10.0'),
('3','Biologia', '9.3')


/*18*/
delete from Notas
where Aluno_ID = '1' and Disciplina = 'Matemática'


/*19*/
create table Matriculas
(
ID_Matricula int identity(1,1) not null,
Aluno_ID int not null,
Turma_ID int not null,
Data_Matricula date,
Constraint FK_Turma_Matri Foreign Key(Turma_ID) References Turmas(ID_Turma),
Constraint FK_Aluno_Matri Foreign Key(Aluno_ID) References Alunos(ID_Alunos),
Constraint PK_Matricula Primary Key(ID_Matricula)
)


/*20*/
insert into Matriculas
values
('1','1','2022-02-15')

/*21*/
insert into Matriculas
values
('3','2','2005-05-13'), ('4','3','2017-11-07'), ('5','3','2009-10-11'),
('6','4','2021-04-04'), ('7','4','2017-03-21'), ('8','5','2005-10-25'),
('9','5','2019-06-06'), ('10','6','2016-07-16'), ('11','6','2008-03-08'), ('3','7','2011-12-05')

select * from Professores;
select * from Turmas;
select * from Alunos;
select * from Notas;
select * from Matriculas;

