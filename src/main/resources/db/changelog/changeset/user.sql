create table users(
    userId     bigserial  not null  primary key,
    locationId bigint references location (locationId)
);