DROP SCHEMA IF EXISTS ecole;
CREATE SCHEMA ecole;
CREATE USER if not exists 'adm'@'localhost' IDENTIFIED BY 'adm';
GRANT ALL PRIVILEGES ON ecole.* TO 'adm'@'localhost';
USE ecole

create table eleves (
    numEleve    int auto_increment,
    prenom      varchar(10) not null,
    password    varchar(4)  not null,
    primary key (numEleve)
);

create table cours (
    abbrev      varchar(2)  not null,
    nom         varchar(15) not null,
    nbEleves    int,
    maxEleves   int not null,
    primary key (abbrev),
    check (nbEleves <= maxEleves)
);

create table inscriptions
(
    numEleve int not null,
    abbrev   varchar(2) not null,
    primary key (numEleve,abbrev),
    foreign key (numEleve) references eleves (numEleve),
    foreign key (abbrev) references cours (abbrev)
);

insert into eleves (prenom,password) values ("Jean","1234");
insert into eleves (prenom,password) values ("Marie","1111");
insert into eleves (prenom,password) values ("Pierre","2222");
insert into eleves (prenom,password) values ("Sylvie","3333");
insert into eleves (prenom,password) values ("Sophie","4444");
insert into eleves (prenom,password) values ("Martin","0000");

INSERT INTO cours (abbrev, nom, nbEleves,maxEleves) VALUES ("CS", "C Sharp", 2, 2);
INSERT INTO cours (abbrev, nom, nbEleves,maxEleves) VALUES ("PY", "Python", 1, 3);
INSERT INTO cours (abbrev, nom, nbEleves,maxEleves) VALUES ("PO", "Prog objet", 3, 5);
INSERT INTO cours (abbrev, nom, nbEleves,maxEleves) VALUES ("DB", "Database", 3, 4);

INSERT INTO inscriptions (numeleve, abbrev) VALUES (1, "CS");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (3, "CS");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (3, "PY");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (4, "PO");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (5, "PO");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (6, "PO");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (1, "DB");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (3, "DB");
INSERT INTO inscriptions (numeleve, abbrev) VALUES (4, "DB");

select * from cours;
select * from eleves;
select * from inscriptions;
