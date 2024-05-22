BEGIN TRANSACTION;

UPDATE Produto
Set Preco = Preco * 1.1;

Commit;

Begin transaction;

insert into Categoria(CategoriaID, NomeCategoria)
values(11, 'Decoração'), (12, 'Automóveis');
insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
values(11, 'Vaso Decorativo', 11, 30), (12, 'Pneu de Carro', 12, 100);

Commit;

Begin transaction;

insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
values(11, 'Produto Errado', 100, 9999);

Rollback;

Begin transaction;

Update Produto Set CategoriaID = 100 where ProdutoID = 3;

Rollback;

Begin Transaction;
Update Produto Set CategoriaID = 100 where ProdutoID = 3;
If @@ERROR = 0
Commit
Else
Rollback;
Print'Atualização na Tabela Produto foi Cancelada';

Select NomeProduto, Preco,
	Case
		when Preco < 100 Then 'Barato'
		when Preco >= 100 and Preco < 1000 then 'Médio'
		else 'Caro'
	end as CategoriaPreco
From Produto;

Select NomeProduto, CategoriaID, Preco,
	Case CategoriaID
		When 1 then Preco * 0.9
		when 2 then Preco * 0.95
		else Preco
	end as PrecoComDesconto
from Produto;

Select ProdutoID, CategoriaID,
	Case CategoriaID
		when 1 then 'Eletrônicos'
		when 2 then 'Roupas'
		when 3 then 'Alimentos'
		else 'Desconhecida'
	end as NomeCategoria
From Produto;

Select PedidoID, DataPedido,
	case
		when DataPedido < '2023-06-01' then 'Antigo'
		else 'Novo'
	end as StatusPedido
from Pedido;