create table products
(
    id      serial           not null
        constraint products_pkey
            primary key,
    name    text             not null,
    price   double precision not null,
    user_id bigint
        constraint fkdb050tk37qryv15hd932626th
            references users
);
insert into products (name, price, user_id)
values ('iPhone 7', 200000, 2),
       ('iPhone X', 250000, 3),
       ('iPhone 12', 400000, 2);