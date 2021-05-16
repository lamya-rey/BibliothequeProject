


insert into user (Name,age, category, email,password, user_name, nbr_empr) values ('amira', 15, 'ado', 'amirafahem1920@gmail.com','123456789','amira_fahem', 2);
insert into user (Name,age, category, email,password, user_name, nbr_empr) values ('ahlem', 6, 'enfant', 'ahlem.fahem98@gmail.com','123456789','ahlem123',1);
insert into user (Name,age, category, email,password, user_name, nbr_empr)values ('lamya', 23 , 'adulte', 'lamya.rayess1@gmail.com','123456789','lamia.rayess', 2);
insert into user (Name,age, category, email,password, user_name, nbr_empr) values ('hanen', 17 , 'ado', 'hanen_mansour@gmail.com','123456789','hanen1997', 2);
insert into user (Name,age, category, email,password, user_name, nbr_empr) values ('ines', 10 ,'enfant', 'ines.loulou123@gmail.com','123456789','inesnoussa', 3);
insert into user (Name,age, category, email,password, user_name, nbr_empr) values ('test', 10 ,'ado', 'test.loulou123@gmail.com','123456789','testnoussa', 0);
COMMIT;

insert into book (id, title, isbn, category, user_id) values (1,'the fault in our stars', '2-7654-1005-4', 'adulte', 3);
insert into book (id, title, isbn, category, user_id) values (2,'citadel', '4-7144-1775-4', 'enfant', 5);
insert into book (id, title, isbn, category, user_id) values (3,'Le chat Tome', '3-0054-1105-4', 'enfant', 5);
insert into book (id, title, isbn, category, user_id) values (4,'Bla bla bla Tome', '4-7004-1111-5', 'ado', 4);
insert into book (id, title, isbn, category, user_id) values (5,'Magnificat', '3-0054-4422-1', 'ado', 1);
insert into book (id, title, isbn, category, user_id) values (6,'Chonchon', '1-8854-2545-3', 'ado', 1);
insert into book (id, title, isbn, category, user_id) values (7,'La tarentule', '2-9874-8755-7', 'adulte',3);
insert into book (id, title, isbn, category, user_id) values (8,'Darkness Tome', '7-1024-9855-2', 'enfant',2);
insert into book (id, title, isbn, category, user_id) values (9,'La dame Abou Simbel', '8-3524-1115-1', 'ado',4);
insert into book (id, title, isbn, category, user_id) values (10,'Le Masque', '6-9204-0005-4', 'enfant', 5);
COMMIT;

insert into comment (id, content, title, book_id, user_id) values (1,'seems Great', 'motivated', 5, 2);
insert into comment (id, content, title, book_id, user_id) values (2,'i Like it', 'grateful', 6, 1);
insert into comment (id, content, title, book_id, user_id) values (3,'Amazing book', 'Avis', 1,3);
insert into comment (id, content, title, book_id, user_id) values (4, 'i dislike its too long', 'too long', 2, 5);
insert into comment (id, content, title, book_id, user_id) values (5,'Good book', 'Avis', 4, 4);
COMMIT;