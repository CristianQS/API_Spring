CREATE TABLE public.series
(
    id serial PRIMARY KEY NOT NULL,
    name text NOT NULL,
    seasons int NOT NULL,
    description text
);
CREATE UNIQUE INDEX series_id_uindex ON public.series (id);
CREATE UNIQUE INDEX series_id_uindex_2 ON public.series (id);

INSERT INTO series (name, seasons, description)
VALUES ('Juego de Tronos', 6 , 'Esto es juego de tronos');
