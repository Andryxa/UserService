create table users(
    user_id     bigserial  not null  primary key,
    location_id_location_id bigint references location (location_id)
);