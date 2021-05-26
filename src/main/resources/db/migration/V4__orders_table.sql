create table orders
(
    id         bigint generated by default as identity
        constraint orders_pkey
            primary key,
    order_date timestamp,
    product_id bigint
        constraint fkkp5k52qtiygd8jkag4hayd0qg
            references products,
    user_id    bigint
        constraint fk32ql8ubntj5uh44ph9659tiih
            references users
);

