insert into item (etiqueta, descricao, data_aquisicao) values ('NT0123', 'Notebook I7', sysdate());
insert into item (etiqueta, descricao, data_aquisicao) values ('AU9875', 'Ford Fiesta', sysdate());

insert into local  (tipo_local, numero, piso) values ( 'LABORATORIO', '12', 1);
insert into local  (tipo_local, numero, piso) values ( 'SALA', '5', 2);
insert into local  (tipo_local, numero, piso) values ( 'AUDITORIO', '1', 0);

insert into evento (titulo, instrutor, local_id, data, modificado) values ('Curso de Spring Boot', 'Slash', 1, sysdate(), false);
insert into evento (titulo, instrutor, local_id, data, modificado) values ('Curso de Angular 4', 'Neymar Jr', 1, sysdate(), false);
insert into evento (titulo, instrutor, local_id, data, modificado) values ('Curso de Spring MVC', 'Slash', 3, sysdate(), false);
 