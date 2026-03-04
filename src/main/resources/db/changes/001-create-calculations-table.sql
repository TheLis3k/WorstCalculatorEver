-- liquibase formatted sql

-- changeset thelis3k:1
CREATE TABLE calculations (
    id SERIAL PRIMARY KEY,
    first_number DOUBLE PRECISION,
    second_number DOUBLE PRECISION,
    result DOUBLE PRECISION
);
