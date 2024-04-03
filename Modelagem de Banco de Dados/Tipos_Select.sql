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