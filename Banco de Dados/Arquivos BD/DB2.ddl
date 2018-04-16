-- Gerado por Oracle SQL Developer Data Modeler 4.1.1.888
--   em:        2017-11-19 23:23:55 BRST
--   site:      DB2/UDB 9
--   tipo:      DB2/UDB 9




CREATE
  TABLE Clientes
  (
    codigoCliente INTEGER NOT NULL ,
    nomeCliente   VARCHAR (40) NOT NULL ,
    email         VARCHAR (40) NOT NULL
  ) ;
ALTER TABLE Clientes ADD CONSTRAINT Clientes_PK PRIMARY KEY (codigoCliente) ;


CREATE
  TABLE Elenco
  (
    codigoElenco           INTEGER NOT NULL ,
    espaco                 CHAR (254) ,
    Clientes_codigoCliente INTEGER NOT NULL
  ) ;
CREATE UNIQUE INDEX Elenco__IDX ON Elenco
  (
    Clientes_codigoCliente ASC
  )
  PCTFREE 10 LEVEL2 PCTFREE 10 DISALLOW REVERSE SCANS ;
ALTER TABLE Elenco ADD CONSTRAINT Elenco_PK PRIMARY KEY (codigoElenco) ;


CREATE
  TABLE Jogadores
  (
    codigoJogador INTEGER NOT NULL ,
    nomeJogador   VARCHAR (40) NOT NULL ,
    habilidade    INTEGER NOT NULL
  ) ;
ALTER TABLE Jogadores ADD CONSTRAINT Jogadores_PK PRIMARY KEY (codigoJogador) ;


CREATE
  TABLE JogadoresLeilao
  (
    Elenco_codigoElenco     INTEGER ,
    Leiloes_codigoLeilao    INTEGER NOT NULL ,
    Jogadores_codigoJogador INTEGER NOT NULL ,
    disponibilidadeJogador  CHAR (254)
  ) ;


CREATE
  TABLE Leiloes
  (
    codigoLeilao INTEGER NOT NULL ,
    inicio       TIMESTAMP NOT NULL ,
    condicao     CHAR (254)
  ) ;
ALTER TABLE Leiloes ADD CONSTRAINT Leiloes_PK PRIMARY KEY (codigoLeilao) ;


CREATE
  TABLE ParticipantesLeilao
  (
    Leiloes_codigoLeilao   INTEGER NOT NULL ,
    Clientes_codigoCliente INTEGER NOT NULL
  ) ;
ALTER TABLE ParticipantesLeilao ADD CONSTRAINT ParticipantesLeilao_PK PRIMARY
KEY (Leiloes_codigoLeilao, Clientes_codigoCliente) ;


CREATE
  TABLE Times
  (
    nomeTime    VARCHAR (40) NOT NULL ,
    apelidoTime VARCHAR (3) NOT NULL
  ) ;
ALTER TABLE Times ADD CONSTRAINT Times_PK PRIMARY KEY (nomeTime) ;


CREATE
  TABLE TimesLeilao
  (
    Elenco_codigoElenco  INTEGER ,
    Times_nomeTime       VARCHAR (40) NOT NULL ,
    Leiloes_codigoLeilao INTEGER NOT NULL ,
    disponibilidadeTime  CHAR (254)
  ) ;
CREATE UNIQUE INDEX TimesLeilao__IDX ON TimesLeilao
  (
    Elenco_codigoElenco ASC
  )
  PCTFREE 10 LEVEL2 PCTFREE 10 DISALLOW REVERSE SCANS ;


ALTER TABLE Elenco ADD CONSTRAINT Elenco_Clientes_FK FOREIGN KEY (
Clientes_codigoCliente ) REFERENCES Clientes ( codigoCliente ) ON
DELETE CASCADE ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE ParticipantesLeilao ADD CONSTRAINT FK_ASS_20 FOREIGN KEY (
Leiloes_codigoLeilao ) REFERENCES Leiloes ( codigoLeilao ) ON
DELETE
  NO ACTION ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE ParticipantesLeilao ADD CONSTRAINT FK_ASS_21 FOREIGN KEY (
Clientes_codigoCliente ) REFERENCES Clientes ( codigoCliente ) ON
DELETE
  NO ACTION ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE JogadoresLeilao ADD CONSTRAINT JogadoresLeilao_Elenco_FK FOREIGN
KEY ( Elenco_codigoElenco ) REFERENCES Elenco ( codigoElenco ) ON
DELETE SET NULL ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE JogadoresLeilao ADD CONSTRAINT JogadoresLeilao_Jogadores_FK FOREIGN
KEY ( Jogadores_codigoJogador ) REFERENCES Jogadores ( codigoJogador ) ON
DELETE CASCADE ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE JogadoresLeilao ADD CONSTRAINT JogadoresLeilao_Leiloes_FK FOREIGN
KEY ( Leiloes_codigoLeilao ) REFERENCES Leiloes ( codigoLeilao ) ON
DELETE CASCADE ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE TimesLeilao ADD CONSTRAINT TimesLeilao_Elenco_FK FOREIGN KEY (
Elenco_codigoElenco ) REFERENCES Elenco ( codigoElenco ) ON
DELETE SET NULL ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE TimesLeilao ADD CONSTRAINT TimesLeilao_Leiloes_FK FOREIGN KEY (
Leiloes_codigoLeilao ) REFERENCES Leiloes ( codigoLeilao ) ON
DELETE CASCADE ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;

ALTER TABLE TimesLeilao ADD CONSTRAINT TimesLeilao_Times_FK FOREIGN KEY (
Times_nomeTime ) REFERENCES Times ( nomeTime ) ON
DELETE CASCADE ON
UPDATE
  NO ACTION ENFORCED ENABLE QUERY OPTIMIZATION ;


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
-- CREATE STRUCTURED TYPE                   0
-- CREATE ALIAS                             0
-- CREATE BUFFERPOOL                        0
-- CREATE DATABASE                          0
-- CREATE DISTINCT TYPE                     0
-- CREATE INSTANCE                          0
-- CREATE DATABASE PARTITION GROUP          0
-- CREATE SCHEMA                            0
-- CREATE SEQUENCE                          0
-- CREATE TABLESPACE                        0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
