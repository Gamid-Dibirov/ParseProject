CREATE TABLE books(
    id_b number(1) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    name_book varchar(15) NOT NULL,
    cnt_book number(2) NOT NUll,
    CONSTRAINT books_pk PRIMARY KEY (id_b)
);

CREATE TABLE libraries(
    id_l number(1) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    name_library varchar(300) NOT NULL,
    address varchar(100) NOT NUll,
    email varchar(30) NOT NULL,
    phone varchar(20) NOT NULL,
    CONSTRAINT libraries_pk PRIMARY KEY (id_l)
);

CREATE TABLE intertable (
id_books number(1) NOT NULL,
id_libraries number(1) NOT NULL,
constraint intertable_pk PRIMARY KEY (id_libraries,id_books),
CONSTRAINT fk_LibrariesBooks_Books_id FOREIGN KEY (id_books) REFERENCES books (id_b) ON DELETE CASCADE,
CONSTRAINT fk_LibrariesBooks_Libraries_id FOREIGN KEY (id_libraries) REFERENCES libraries (id_l) ON DELETE CASCADE
);

CREATE INDEX fk_LibrariesBooks_Books_id ON intertable (id_books);
CREATE INDEX fk_LibrariesBooks_Libraries_id ON intertable (id_libraries);