/* Exercicio 1 */
Select f.nrfatura, f.datafatura, f.codcliente, c.nome from fatura f
inner join cliente c on f.codcliente = c.codcliente
order by c.nome

/* Exercicio 2 */
Select p.codproduto, p.descricao, p.preco, fo.nomeforn, p.saldo from produto p
inner join fornecedor fo on fo.codforn = p.codforn
order by p.descricao

/* Exercicio 3 */
Select i.nrfatura, sum(i.qtde * i.valor) as valorTotal from itens_fatura i
group by i.nrfatura

/* Exercicio 4 */
Select fo.nomeforn, sum(p.saldo) from produto p
inner join fornecedor fo on fo.codforn = p.codforn
group by fo.nomeforn

/* Exercicio 5 */
Select i.nrfatura, count(i.qtde) as quantidade from itens_fatura i
group by i.nrfatura

/* Exercicio 6 */
Select c.nome, Sum(i.qtde * i.valor) As valorTotal
From itens_fatura i
Join fatura f On i.nrfatura = f.nrfatura
Join cliente c On f.codcliente = c.codcliente
Group By c.nome;

/* Exercicio 7 */


Select * from produto
Select * from fatura
Select * from cliente
select * from fornecedor
select * from itens_fatura

