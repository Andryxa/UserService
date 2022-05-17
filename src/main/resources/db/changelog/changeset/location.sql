create table location (
    locationId bigserial  not null primary key ,
    lat         numeric    not null,
    lon         numeric    not null
);