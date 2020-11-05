create database locadora;

use locadora;

create table genero(
    codGenero int primary key,
    descricao varchar(50)
);

create table midia(
    codMidia int primary key,
    titulo varchar(100),
    valor decimal(10,2),
    codGenero int
);

insert into genero values
    (1, 'Terror'),
    (2, 'Comédia'),
    (3, 'Drama'),
    (4, 'Policial'),
    (5, 'Infantil'),
    (6, 'Romance');

insert into midia values
    (1, 'Sexta-feira 13 parte I', 2.87, 1),
    (2, 'Férias frustradas', 1.65, 2),
    (3, 'Outubro', 1.99, 3),
    (4, 'Maquina Mortífera', 3.88, 4),
    (5, 'Frosen', 0.33, 5),
    (6, '50 Tons de Cinza', 0.01, 6);

select * from midia;
select * from genero;