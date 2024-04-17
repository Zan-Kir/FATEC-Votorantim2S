/* 1 */
Select * from CLIENTES;

/* 2 */
Select * from FILME;

/* 3 */
Select * from CATEGORIA;

/* 4 */
Select * from CLIENTES
where sexo = 'M' and CIDADE = 'Sorocaba';

/* 5 */
Select c.NOME, c.TELEFONE
from CLIENTES c
order by NOME;

/* 6 */
Select count(*) from CLIENTES
where sexo = 'F';

/* 7 */
Select NOME_CATEGORIA from CATEGORIA
order by NOME_CATEGORIA;

/* 8 */
Select FILME from FILME
where DIRETOR = 'Shawn Levy' and RESERVADA = 'n';

/* 9 */
Select FILME from FILME
Where VALOR_LOCACAO > 5 and RESERVADA = 's';

/* 10 */
Select DISTINCT DIRETOR from FILME;

/* 11 */
Select count(*) from FILME
Where RESERVADA = 's';

/* 12 */
Select MAX(VALOR_LOCACAO) from FILME;

/* 13 */
Select *, cat.COD_CATEGORIA from FILME f
left outer join CATEGORIA cat on cat.COD_CATEGORIA = f.COD_CATEGORIA
where cat.NOME_CATEGORIA = 'Ação';

/* 14 */
Select *, cat.COD_CATEGORIA from FILME f
left outer join CATEGORIA cat on cat.COD_CATEGORIA = f.COD_CATEGORIA
where (cat.NOME_CATEGORIA = 'Romance' or cat.NOME_CATEGORIA = 'Aventura')
AND f.RESERVADA = 's' AND VALOR_LOCACAO < 5;

/* 15 */
Select f.FILME, c.NOME from CLIENTES c
full join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
full join FILME f on f.COD_FILME = l.COD_FILME
where c.NOME = 'Renata Cristina';

/* 16 */
Select c.COD_CLIENTE, c.NOME, count(l.COD_LOCACAO) as Total_Locacoes from CLIENTES c
full join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
group by c.COD_CLIENTE, c.NOME
having count(l.COD_LOCACAO) > 3

/* 17 */
Select c.NOME, sum(all f.VALOR_LOCACAO) as Total_Gasto from CLIENTES c
full join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
full join FILME f on f.COD_FILME = l.COD_FILME
where c.NOME = 'Renata Cristina'
group by c.NOME;

/* 18 */
Select ROUND(avg(VALOR_LOCACAO), 2) as MEDIA_LOCACAO
from FILME;

/* 19 */
Select min(VALOR_LOCACAO) as MIN_LOCACAO
from FILME;

/* 20 */
Select c.NOME_CATEGORIA, count(f.COD_FILME) as Qtd_filme from CATEGORIA C
join FILME f on c.COD_CATEGORIA = f.COD_CATEGORIA
Group by c.NOME_CATEGORIA

