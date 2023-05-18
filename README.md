# ProjetoXBrain

##### Premissas:
API criada com Spring Boot utilizando banco de dados H2

##### Teste:
Desenvolver um serviço que seja capaz de gerar uma venda.
Uma venda é composta por id, data da venda, valor, vendedor id e vendedor nome.

##### Sua tarefa é desenvolver os serviços REST abaixo:
- Criar uma nova venda
- Retornar a lista de vendedores com os campos: nome, total de vendas do vendedor e média de vendas diária, conforme o período informado por parâmetro 

### Imports SQL:
```sql
INSERT INTO tb_vendedor(id, nome) VALUES (1, 'Carlos');
INSERT INTO tb_vendedor(id, nome) VALUES (2, 'Leo');
INSERT INTO tb_vendedor(id, nome) VALUES (3, 'Gabriel');

INSERT INTO tb_venda(datavenda, valor, vendedor_id) VALUES ('2023-05-12', 223.53, 1);
INSERT INTO tb_venda(datavenda, valor, vendedor_id) VALUES ('2023-05-14', 123.5, 1);
INSERT INTO tb_venda(datavenda, valor, vendedor_id) VALUES ('2023-05-17', 206.5, 2);
INSERT INTO tb_venda(datavenda, valor, vendedor_id) VALUES ('2023-05-19', 125, 2);
INSERT INTO tb_venda(datavenda, valor, vendedor_id) VALUES ('2023-05-21', 96.2, 3);
```
