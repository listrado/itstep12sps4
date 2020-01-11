--------------------------------------------------------
--  Arquivo criado - Sábado-Janeiro-11-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure INCLUIR_PESSOA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "T12SPS4"."INCLUIR_PESSOA" (
    vNOME VARCHAR2,
    vEMAIL VARCHAR2,
    vSENHA VARCHAR2)

IS
    vEXCEPTION EXCEPTION;
    BEGIN
    
        INSERT INTO T12SPS4.PESSOA(ID, NOME, EMAIL, SENHA) VALUES(T12SPS4.SEC_PESSOA01.NEXTVAL, vNOME, vEMAIL, vSENHA);
        
    EXCEPTION
      WHEN vEXCEPTION THEN
        RAISE_APPLICATION_ERROR(-20999,'ATENÇCAO FALHA NA INCLUSAO DE PESSOA', FALSE);
        
END INCLUIR_PESSOA;

/
