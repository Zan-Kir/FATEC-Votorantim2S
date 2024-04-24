Select NomeProduto from Produto
	where Preco > all(Select Preco from Produto where NomeProduto = 'Chapéu')

Select NomeProduto from Produto
	Where Preco > all(Select Preco from Produto
						where CategoriaID = (Select CategoriaID from Categoria
												where NomeCategoria = 'Eletrônicos'))

Select NomeProduto from Produto
	where Preco < Any(Select Preco from Produto where CategoriaID = 1)

Select NomeProduto from Produto
	where Preco < Some(Select Preco from Produto where CategoriaID = 1)

Select NomeProduto from Produto
	where Exists (Select * from Pedido
					where Pedido.ProdutoID = Produto.ProdutoID)

Select NomeProduto from Produto
	where ProdutoID in (Select ProdutoID from Pedido where PedidoID in (1, 3))

Select NomeProduto from Produto
	where ProdutoID in (Select ProdutoID from Pedido
							where Year(DataPedido) = 2023 and MONTH(DataPedido) = 1)

Select NomeCategoria from Categoria
	where CategoriaID in (Select CategoriaID from Produto where Preco > 100)

Select NomeProduto from Produto
	where ProdutoID not in(Select ProdutoID from Pedido)