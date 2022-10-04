create table carro (
id SERIAL,
modelo varchar(24) not null,
cor varchar(20),
preco float not null,
velocidade_maxima int not null
);

select * from carro; 

insert into carro(modelo, cor, preco, velocidade_maxima) values ('Compass','Branco',10,220);

insert into carro
(modelo, cor, preco, velocidade_maxima) 
values ('Creta','Preto',90.000,180);
