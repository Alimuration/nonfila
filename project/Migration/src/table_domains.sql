
CREATE SEQUENCE IF NOT EXISTS domain_id_seq
    START WITH 1
    INCREMENT BY 1
    CACHE 1
;

CREATE TABLE IF NOT EXISTS domains
(
    id              BIGINT      primary key         default nextval('domain_id_seq'),
    name            TEXT                                                                    NOT NULL,
    created_date    TIMESTAMP WITHOUT TIME ZONE     default now()                           NOT NULL
);