-- liquibase formatted sql

-- changeset thelis3k:2
    CREATE TYPE operation_enum AS ENUM ('add', 'sub', 'multiply', 'div');
    ALTER TABLE calculations
    ADD operation operation_enum;

-- rollback ALTER TABLE calculations DROP COLUMN operation;
-- rollback DROP TYPE operation_enum;