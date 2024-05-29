Declare @CategoriaDesejada int = 1;
if @CategoriaDesejada = 1
begin
	insert into Produto (ProdutoID, NomeProduto, CategoriaID, Preco)
	values (13, 'Tablet', @CategoriaDesejada, 1500)
end

Declare @ExibirResultados int = 1;
if @ExibirResultados = 1
begin
	Select ProdutoID, NomeProduto, CategoriaID, Preco
	from Produto;
end

Declare @CategoriaID int = 1;
Declare @NomeCategoria NVARCHAR(50);
if Exists (Select * from Categoria where CategoriaID = @CategoriaID)
begin
	Select @NomeCategoria = NomeCategoria from Categoria where CategoriaID = @CategoriaID;
	print'Nome da Categoria:' + @NomeCategoria;
end
else
begin
	print'Categoria não encontrada.';
end

Declare @Counter int
set @Counter = 1

while @Counter <= 10
	begin
		update Produto
		set Preco = Preco + 100
		where ProdutoID = @Counter
		set @Counter = @Counter + 1
	end

Declare @Counter int
set @Counter = 1

while @Counter <= (Select Count(*) from Produto)
begin
	declare @PrecoAtual Decimal(10,2)
	Select @PrecoAtual = Preco from Produto where ProdutoID = @Counter

	if @PrecoAtual > 1000
	begin
		update Produto
		set Preco = Preco * 1.1
		where ProdutoID = @Counter
	end

	Set @Counter = @Counter + 1
end

Declare @PedidoDate Date
set @PedidoDate = '2023-01-01'

while @PedidoDate <= '2023-10-31'
begin
	select * from Pedido where DataPedido = @PedidoDate

	set @PedidoDate = DateADD(Day, 1, @PedidoDate)
end

