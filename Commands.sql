USE apirest;

INSERT INTO anotacao (titulo, descricao, data, usersId)
VALUES ('Minha primeira anotação', 'Esta é a descrição da minha primeira anotação', '2022-01-01', 1);

INSERT INTO anotacao (titulo, descricao, data, usersId)
VALUES ('Minha segunda anotação', 'Esta é a descrição da minha segunda anotação', '2022-01-02', 2);

INSERT INTO anotacao (titulo, descricao, data, usersId)
VALUES ('Minha terceira anotação', 'Esta é a descrição da minha terceira anotação', '2022-01-03', 3);


INSERT INTO tarefa (titulo, descricao, data, usersId, status)
VALUES ('Minha primeira tarefa', 'Esta é a descrição da minha primeira tarefa', '2022-01-01', 1, 'PENDENTE');

INSERT INTO tarefa (titulo, descricao, data, usersId, status)
VALUES ('Minha segunda tarefa', 'Esta é a descrição da minha segunda tarefa', '2022-01-02', 2, 'EM ANDAMENTO');

INSERT INTO tarefa (titulo, descricao, data, usersId, status)
VALUES ('Minha terceira tarefa', 'Esta é a descrição da minha terceira tarefa', '2022-01-03', 3, 'CONCLUÍDA');


INSERT INTO lembrete (titulo, descricao, data, usersId, status)
VALUES ('Meu primeiro lembrete', 'Esta é a descrição do meu primeiro lembrete', '2022-01-01', 1, 'PENDENTE');

INSERT INTO lembrete (titulo, descricao, data, usersId, status)
VALUES ('Meu segundo lembrete', 'Esta é a descrição do meu segundo lembrete', '2022-01-02', 2, 'CONCLUÍDO');

INSERT INTO lembrete (titulo, descricao, data, usersId, status)
VALUES ('Meu terceiro lembrete', 'Esta é a descrição do meu terceiro lembrete', '2022-01-03', 3, 'PENDENTE');
