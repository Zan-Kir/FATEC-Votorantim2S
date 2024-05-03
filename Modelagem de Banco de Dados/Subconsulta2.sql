Select NomeCategoria from Categoria
where CategoriaID in (Select CategoriaID from Produto where Preco > 1000)
union
Select NomeCategoria from Categoria
where CategoriaID in (Select Produto.CategoriaID from Produto join Pedido on Produto.ProdutoID = Pedido.ProdutoID)

Select NomeProduto from Produto
where Preco < 100
union all
Select NomeProduto from Produto
where Preco > 1000

Select NomeCategoria from Categoria
where CategoriaID in (Select CategoriaID from Produto where Preco > 1000)
intersect
Select NomeCategoria from Categoria
where CategoriaID in (Select Produto.CategoriaID from Produto join Pedido on Produto.ProdutoID = Pedido.ProdutoID)

Select NomeCategoria from Categoria
where CategoriaID in (Select CategoriaID from Produto where Preco > 100)
except
Select NomeCategoria from Categoria
where CategoriaID in (Select Produto.CategoriaID from Produto join Pedido on Produto.ProdutoID = Pedido.ProdutoID)

Create View ProdutosCaros as
Select NomeProduto, Preco from Produto
where Preco > 1000

Create View ProdutoMaisCarosPorCategoria as
Select Categoria.NomeCategoria, Produto.NomeProduto, Produto.Preco from Categoria
inner join Produto On Categoria.CategoriaID = Produto.CategoriaID
where Produto.Preco = ( Select Max(Preco) from Produto as P 
						where P.CategoriaID = Categoria.CategoriaID )


Select * from ProdutoMaisCarosPorCategoria
Select * from ProdutosCaros