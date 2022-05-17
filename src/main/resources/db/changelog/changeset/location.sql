create table location (
    location_id bigserial  not null primary key ,
    lat         numeric    not null,
    lon         numeric    not null
);