/* 1 */
Select f.COD_FILME, count(l.DATA_RETIRADA) as Vezes_Retirada from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
group by f.COD_FILME

/* 2 */
Select f.FILME, l.DATA_DEVOLUCAO from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
inner join CLIENTES c on c.COD_CLIENTE = l.COD_CLIENTE
where c.NOME = 'Edson Martin Feitosa' and f.DIRETOR = 'Richard Donner'

/* 3 */
Select FILME, (VALOR_LOCACAO * 0.10) as DESCONTO,
(VALOR_LOCACAO - (VALOR_LOCACAO * 0.10)) as VALOR_FINAL
from FILME

/* 4 */
Select DISTINCT f.FILME from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
inner join CLIENTES c on c.COD_CLIENTE = l.COD_CLIENTE
where c.CIDADE = 'Votorantim'

/* 5 */
Select f.FILME from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
where l.DATA_RETIRADA = GETDATE()

/* 6 */
Select f.FILME, (f.VALOR_LOCACAO * count(*)) as Lucro from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
where f.FILME = 'A vida é bela'
group by f.FILME, f.VALOR_LOCACAO

/* 7 */
Select f.DIRETOR,  count(l.DATA_RETIRADA) as Saidas from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
group by f.DIRETOR

/* 8 */
Select f.FILME, cat.NOME_CATEGORIA from CATEGORIA cat
inner join FILME f on f.COD_CATEGORIA = cat.COD_CATEGORIA
inner join LOCACOES l on l.COD_FILME = f.COD_FILME
inner join CLIENTES c on l.COD_CLIENTE = c.COD_CLIENTE
where c.NOME = 'Maria Chiquinha'


/* 9 */
Select c.NOME, c.TELEFONE from CLIENTES c
inner join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
inner Join FILME f on f.COD_FILME = l.COD_FILME
where f.FILME = 'Constantine'

/* 10 */
Select cat.NOME_CATEGORIA from CATEGORIA cat
left join FILME f on f.COD_CATEGORIA = cat.COD_CATEGORIA
where f.COD_CATEGORIA is null

select * from FILME
select * from LOCACOES
select * from CLIENTES
select * from CATEGORIA


