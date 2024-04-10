/* DATENAME (datepart, date)  retorna o nome da parte de uma data */
/* Exemplos */
Select DATENAME(yy, getdate())
Select DATENAME(MONTH, GETDATE())

/* DATENAME (datepart, date)  retorna parte de uma data */
/* Exemplos */
Select DATEPART(MM, getdate())
Select DATEPART(month, getdate())

/* DAY(date) retorna um inteiro que representa a parte do dia da date especificada */
/* Exemplo */
Select DAY(getdate())

/* MONTH(date) retorna um inteiro que representa a parte do m�s de uma date especificada */
/* Exemplo */
Select MONTH(getdate())

/* YEAR(date) retorna um inteiro que representa a parte do ano de uma date especificada */
/* Exemplo */
Select YEAR(getdate())

/* DATEDIFF(datepart, startdate, enddate) retorna um n�mero de limites de data
ou hora entre duas datas especificas */
/* Exemplos */
Select DATEDIFF(yy, getdate(), getdate() +366)
Select DATEDIFF(yy, getdate(), getdate() +720)

/* DATEADD(datepart, number, date)  adiciona um valor a parte de uma data. Retorna um
novo valor datetime adicionando um intervalo a datepart especificada da date especificada */
/* Exemplos */
Select DATEADD(yy, 1, getdate())
Select DATENAME(MONTH,(DATEADD(MONTH, 3, GETDATE())))

/* ISDATE(expression) Determina se a express�o de entrada datetime ou smalldatetime � um valor v�lido de data ou hora.
Se for v�lida, ou seja, a data existe, retorna 1 se for inv�lida uma data que n�o existe retorna 0 */
/* Exemplos */
Select ISDATE('27-02-2023')
Select ISDATE('30-02-2023')

/* CONVERT(expression) converte um tipo de dado */
/* Exemplos */
Select CONVERT(char, getdate(), 103)
Select CONVERT(char, getdate(), 113)

/* ROUND(numeric_expression, length)  Arredonda n�meros com o n�mero de digitos de precis�o indicados */
/* Exemplos */
Select ROUND(123.3467, 3)
Select ROUND(123.3467, 2)
Select ROUND(123.3467, 1)
Select ROUND(123.5467, 1)
Select ROUND(123.3467, 0)
Select ROUND(123.3467, -1)
Select ROUND(123.3467, -2)
Select CONVERT(decimal(10,3),ROUND(123.3467,3))

/* FLOOR(numeric_expression) Retorna o maior inteiro menor ou igual a express�o num�rica especificada */
/* Exemplos */
Select FLOOR(123.45)

/* POWER(m, exponente) Calcula a pot�ncia de um n�mero */
/* Exemplos */
Select POWER(4,2)
Select POWER(2,2)

/* ASCII(character_expression) Retorna o valor do c�digo ASCII do caractere mais � esquerda
de uma express�o de caractere */
/* Exemplo */
Select ASCII('A'), ASCII('AMANDA')

/* CHAR(integer_expression) Converte um c�digo ASCII int em um caractere */
/* Exemplos */
Select CHAR(65), CHAR(66)

/*CHARINDEX(expression1, expression2, [posi��o inicial])
Pesquisa expression2 pela expression1 e retorna sua posi��o incial, se for localizada.
A pesquisa inicia em posi��o inicial*/
/* Exemplos */
Select CHARINDEX('Mundo','Ola Mundo Bonito')
Select CHARINDEX('Mundo','Ola Mundo Bonito', 3)
Select CHARINDEX('Mundo','Ola Mundo Bonito', 6)

/* REPLACE(cad, cadeia_busca, [cadeia de substitui��o]) Substitui um caractere ou cadeia de caracteres
de uma cadeia com 0 ou mais caracteres. */
/* Exemplos */
Select Replace('abcdefghicde', 'cde', 'xxx')
Select Replace(primeiro_nome, 'I', 'Z') FROM Funcionario

/* STUFF(Express�o, Inicio, Quantidade de caracteres que ser�o trocados, Conjunto de caracteres que ir�o substituir)
A fun��o STUFF insere uma cadeia de caracteres em outra cadeia de caracteres. Ela exclui um comprimento especificado
de caracteres da primeira cadeia de caracteres na posi��o inicial e, em seguida, insere a segunda cadeia de caracteres na primeira,
na posi��o inicial */
/* Exemplo */
Select STUFF('abcdef', 2, 3, '_ijklmn_')

/* LEFT(character_expression, integer_expression) Retorna a parte da esquerda de uma cadeia de caracteres com o n�mero
de caracteres especificado */
/* Exemplo */
Select LEFT('abcdefgh', 5)

/* RIGHT(character_expression, integer_expression) Retorna a parte da direita de uma cadeia de caracteres com o n�mero
de caracteres especificado */
/* Exemplos */
Select RIGHT('abcdefgh', 5)

/* REPLICATE(string_expression, integer_expression) Repete um valor da cadeia de caracteres
um n�mero especificado de vezes */
/* Exemplo */
Select REPLICATE('ABC', 3)

/* SUBSTRING(value_expression, start_expression, length_expression) Retorna parte de uma express�o de caractere */
/* Exemplo */
Select SUBSTRING('ABCDEFGHIJ', 2, 3)

/* LEN(string_expression) Retorna o n�mero de caracteres da express�o da cadeia de caracteres especificada,
excluindo espa�os em branco � direita */
/* Exemplos */
Select len('ABCD')
Select len('ABCD   ')

/* REVERSE(string_expression) Retorna o inverso de um valor da cadeia de caracteres */
/* Exemplo */
Select reverse('ABCD')

/* LOWER(character_expression) Retorna uma express�o de caractere depois de converter para min�sculas
os dados de caracteres em mai�sculas */
/* Exemplo */
Select lower('AbCD')
Select LOWER(primeiro_nome) from Funcionario

/* UPPER(character_expression) Retorna uma express�o de caractere depois de converter para mai�sculas
os dados de caracteres em min�sculas */
/* Exemplo */
Select upper('abCd')
Select UPPER(primeiro_nome) from Funcionario

/* LTRIM(character_expression) Retorna uma express�o de caractere depois de remover os espa�os em branco � esquerda */
/* Exemplo */
Select '_' + ltrim(' AbCD ') + '_'

/* RTRIM(character_expression) Retorna uma express�o de caractere depois de remover os espa�os em branco � direita */
/* Exemplo */
Select '_' + rtrim(' AbCD ') + '_'

