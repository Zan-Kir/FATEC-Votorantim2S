Select f.primeiro_nome, f.salario, s.nome_setor
from Funcionario f
inner join Setor s on f.setor_cod = s.cod_setor;

Select c.nome_cliente, p.num_pedido
from cliente c
inner join pedido p on c.Cod_cliente = p.cod_cliente;

Select c.nome_cliente, p.num_pedido
from cliente c
Left outer join pedido p on c.cod_cliente = p.cod_cliente;

Select c.nome_cliente, p.num_pedido
from cliente c
Left outer join pedido p on c.cod_cliente = p.cod_cliente
Where p.cod_cliente is null

Select f.primeiro_nome, f.salario, s.nome_setor
from Funcionario f
Right outer join Setor s on f.setor_cod = s.cod_setor

Insert into Setor(nome_setor) values ('Marketing')

Select f.primeiro_nome, f.salario, s.nome_setor
From Funcionario f
Right outer join Setor s on f.setor_cod = s.cod_setor

Select f.primeiro_nome, f.salario, s.nome_setor
From Funcionario f
Right outer join Setor s on f.setor_cod = s.cod_setor
Where f.setor_cod is null

Select c.nome_cliente, p.num_pedido
from cliente c
Full outer join pedido p on c.Cod_cliente = p.cod_cliente

Select f.primeiro_nome, f.salario, s.nome_setor
from Funcionario f
Full outer join Setor s on f.setor_cod = s.cod_setor

Select f.primeiro_nome, f.salario, s.nome_setor
from Funcionario f
Full outer join Setor s on f.setor_cod = s.cod_setor
Where f.setor_cod is null or s.cod_setor is null

Select c.nome_cliente, p.num_pedido
from cliente c
Full outer join pedido p on c.Cod_cliente = p.cod_cliente
Where c.Cod_cliente is null or p.cod_cliente is null

Select f.primeiro_nome, f.salario, s.nome_setor
from Funcionario f
Cross join Setor s
Order by f.primeiro_nome

Select c.nome_cliente, p.num_pedido
from cliente c
Cross join pedido p
Order by c.Nome_cliente

Select min(salario_fixo) as 'Menor Salario', max(salario_fixo) as 'Maior Salario'
from vendedor

Select Sum(quantidade)
from item_pedido
Where cod_produto = 3

Select avg(salario_fixo) as MEDIA_SALARIO
from vendedor

Select count(*) from vendedor
Where salario_fixo > 2500

Select num_pedido, total_produtos = count(*)
from item_pedido
Group by num_pedido

Select num_pedido, total_produtos = count(*)
from item_pedido
where quantidade > 5
Group by num_pedido
having count(*) > 1

Update produto
set valor_unitario = 4.00
where descricao = 'alface'

update produto
set Valor_unitario = Valor_unitario * 1.025
where Valor_unitario <
	(select avg(Valor_unitario)
	from produto
	where unidade = 'KG')