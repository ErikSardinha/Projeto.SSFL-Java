-- Gerado por Oracle SQL Developer Data Modeler 4.1.1.888
--   em:        2017-11-19 23:23:41 BRST
--   site:      SQL Server 2012
--   tipo:      SQL Server 2012




CREATE
  TABLE Clientes
  (
    codigoCliente INTEGER NOT NULL ,
    nomeCliente   VARCHAR (40) NOT NULL ,
    email         VARCHAR (40) NOT NULL
  )
  ON "default"
GO
ALTER TABLE Clientes ADD CONSTRAINT Clientes_PK PRIMARY KEY CLUSTERED (
codigoCliente)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

CREATE
  TABLE Elenco
  (
    codigoElenco INTEGER NOT NULL ,
    espaco BIT ,
    Clientes_codigoCliente INTEGER NOT NULL
  )
  ON "default"
GO
CREATE UNIQUE NONCLUSTERED INDEX
Elenco__IDX ON Elenco
(
  Clientes_codigoCliente
)
ON "default"
GO
ALTER TABLE Elenco ADD CONSTRAINT Elenco_PK PRIMARY KEY CLUSTERED (codigoElenco
)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

CREATE
  TABLE Jogadores
  (
    codigoJogador INTEGER NOT NULL ,
    nomeJogador   VARCHAR (40) NOT NULL ,
    habilidade    INTEGER NOT NULL
  )
  ON "default"
GO
ALTER TABLE Jogadores ADD CONSTRAINT Jogadores_PK PRIMARY KEY CLUSTERED (
codigoJogador)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

CREATE
  TABLE JogadoresLeilao
  (
    Elenco_codigoElenco     INTEGER ,
    Leiloes_codigoLeilao    INTEGER NOT NULL ,
    Jogadores_codigoJogador INTEGER NOT NULL ,
    disponibilidadeJogador BIT
  )
  ON "default"
GO


CREATE
  TABLE Leiloes
  (
    codigoLeilao INTEGER NOT NULL ,
    inicio       DATETIME NOT NULL ,
    condicao BIT
  )
  ON "default"
GO
ALTER TABLE Leiloes ADD CONSTRAINT Leiloes_PK PRIMARY KEY CLUSTERED (
codigoLeilao)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

CREATE
  TABLE ParticipantesLeilao
  (
    Leiloes_codigoLeilao   INTEGER NOT NULL ,
    Clientes_codigoCliente INTEGER NOT NULL
  )
  ON "default"
GO
ALTER TABLE ParticipantesLeilao ADD CONSTRAINT ParticipantesLeilao_PK PRIMARY
KEY CLUSTERED (Leiloes_codigoLeilao, Clientes_codigoCliente)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

CREATE
  TABLE Times
  (
    nomeTime    VARCHAR (40) NOT NULL ,
    apelidoTime VARCHAR (3) NOT NULL
  )
  ON "default"
GO
ALTER TABLE Times ADD CONSTRAINT Times_PK PRIMARY KEY CLUSTERED (nomeTime)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

CREATE
  TABLE TimesLeilao
  (
    Elenco_codigoElenco  INTEGER ,
    Times_nomeTime       VARCHAR (40) NOT NULL ,
    Leiloes_codigoLeilao INTEGER NOT NULL ,
    disponibilidadeTime BIT
  )
  ON "default"
GO
CREATE UNIQUE NONCLUSTERED INDEX
TimesLeilao__IDX ON TimesLeilao
(
  Elenco_codigoElenco
)
ON "default"
GO


ALTER TABLE Elenco
ADD CONSTRAINT Elenco_Clientes_FK FOREIGN KEY
(
Clientes_codigoCliente
)
REFERENCES Clientes
(
codigoCliente
)
ON
DELETE CASCADE ON
UPDATE NO ACTION
GO

ALTER TABLE ParticipantesLeilao
ADD CONSTRAINT FK_ASS_20 FOREIGN KEY
(
Leiloes_codigoLeilao
)
REFERENCES Leiloes
(
codigoLeilao
)
ON
DELETE
  NO ACTION ON
UPDATE NO ACTION
GO

ALTER TABLE ParticipantesLeilao
ADD CONSTRAINT FK_ASS_21 FOREIGN KEY
(
Clientes_codigoCliente
)
REFERENCES Clientes
(
codigoCliente
)
ON
DELETE
  NO ACTION ON
UPDATE NO ACTION
GO

ALTER TABLE JogadoresLeilao
ADD CONSTRAINT JogadoresLeilao_Elenco_FK FOREIGN KEY
(
Elenco_codigoElenco
)
REFERENCES Elenco
(
codigoElenco
)
ON
DELETE SET NULL ON
UPDATE NO ACTION
GO

ALTER TABLE JogadoresLeilao
ADD CONSTRAINT JogadoresLeilao_Jogadores_FK FOREIGN KEY
(
Jogadores_codigoJogador
)
REFERENCES Jogadores
(
codigoJogador
)
ON
DELETE CASCADE ON
UPDATE NO ACTION
GO

ALTER TABLE JogadoresLeilao
ADD CONSTRAINT JogadoresLeilao_Leiloes_FK FOREIGN KEY
(
Leiloes_codigoLeilao
)
REFERENCES Leiloes
(
codigoLeilao
)
ON
DELETE CASCADE ON
UPDATE NO ACTION
GO

ALTER TABLE TimesLeilao
ADD CONSTRAINT TimesLeilao_Elenco_FK FOREIGN KEY
(
Elenco_codigoElenco
)
REFERENCES Elenco
(
codigoElenco
)
ON
DELETE SET NULL ON
UPDATE NO ACTION
GO

ALTER TABLE TimesLeilao
ADD CONSTRAINT TimesLeilao_Leiloes_FK FOREIGN KEY
(
Leiloes_codigoLeilao
)
REFERENCES Leiloes
(
codigoLeilao
)
ON
DELETE CASCADE ON
UPDATE NO ACTION
GO

ALTER TABLE TimesLeilao
ADD CONSTRAINT TimesLeilao_Times_FK FOREIGN KEY
(
Times_nomeTime
)
REFERENCES Times
(
nomeTime
)
ON
DELETE CASCADE ON
UPDATE NO ACTION
GO


-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             8
-- CREATE INDEX                             2
-- ALTER TABLE                             15
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE DATABASE                          0
-- CREATE DEFAULT                           0
-- CREATE INDEX ON VIEW                     0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE ROLE                              0
-- CREATE RULE                              0
-- CREATE SCHEMA                            0
-- CREATE SEQUENCE                          0
-- CREATE PARTITION FUNCTION                0
-- CREATE PARTITION SCHEME                  0
-- 
-- DROP DATABASE                            0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
