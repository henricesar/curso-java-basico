CREATE TABLE public.cliente
(
    id bigserial not null primary key,
    cpf varchar(11),
    nome varchar(255),
    nascimento date,
    sexo varchar(1),
    renda numeric(19, 2),
    estado_civil varchar(20)
);

-- EX 1: INSERIR 10 NOMES

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('85207143', 'JOSÉ DA SILVA', '1970-06-07', 'M', 3500, 'CASADO');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('78636796', 'ÉRICO CINTRA MONTEIRO', '1991-09-06', 'M', 500, 'SOLTEIRO');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('12345678', 'ANDRÉ GUEDES', '1978-11-10', 'M', 900, 'CASADO');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('87654321', 'LORENA MASETTO', '2000-10-12', 'F', 1000, 'SOLTEIRA');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('22222222', 'THAÍS SILVEIRA', '1995-05-05', 'F', 1200, 'SOLTEIRA');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('33333333', 'SARAH VIEIRA', '1997-01-04', 'F', 700, 'SOLTEIRA');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('22222222', 'THAÍS SILVEIRA', '1995-05-05', 'F', 1200, 'SOLTEIRA');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('44444444', 'VIVIAN SANTOS FARIAS PELLEGRINO', '1980-11-23', 'F', 700, 'CASADA');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('55555555', 'HENRIQUE CÉSAR PELLEGRINO MASETTO', '1981-02-03', 'M', 1500, 'CASADO');

insert into cliente (cpf, nome, nascimento, sexo, renda, estado_civil)
VALUES ('66666666', 'LORENZO SANTOS FARIAS PELLEGRINO MASETTO', '2016-02-26', 'M', 0, 'SOLTEIRO');


-- EX 2: SELECIONAR TODOS OS HOMENS
select * from cliente where sexo = 'M';

-- EX 3: SELECIONAR TODAS AS MULHERES
select * from cliente where sexo = 'F';

-- EX 4: SELECIONAR TODOS OS CLIENTES COM RENDA SUPERIOR A 2000
select * from cliente where renda > 2000;

-- EX 5: SELECIONAR TODOS OS CLIENTES DO SEXO 'F' COM RENDA INFERIOR A 1500
select * from cliente where renda < 1500 and sexo = 'F';

-- EX 6: SELECIONAR TODOS OS CLIENTES COM IDADE SUPERIOR A 35 E CASADOS
SELECT *, date_part('YEAR', age(nascimento)) as idade FROM cliente
where date_part('YEAR', age(nascimento)) > 35 and (estado_civil = 'CASADO' or estado_civil = 'CASADA');

-- EX 7: ATUALIZAR A RENDA DE UM CLIENTE
update cliente set renda = 800 where nome like 'SARAH%';

-- EX 8: EXCLUIR TODO CLIENTE COM MENOS DE 18 ANOS
delete from cliente where date_part('YEAR', age(nascimento)) < 18;
