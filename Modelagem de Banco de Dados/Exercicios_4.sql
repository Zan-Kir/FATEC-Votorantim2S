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


select * from FILME
select * from LOCACOES
