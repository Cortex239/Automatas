grammar ParserT;
import LexerT;

program   : BEGIN sentencia+ END;  

expr
: RES expr
| expr op=(MUL | DIV) expr
| expr op=(SUM | RES) expr
| expr op=(MENIG | MAYIG | MAY | MEN) expr
| expr op=(IG | DIF) expr
| expr AND expr
| VARSTATMENT
;



scan      :SCAN (INT|STRING|FLOAT);

variable  : VARSTATMENT NAME '=' (INT|STRING|FLOAT);

primitiva
: AP expr CP
| (INT | FLOAT)
| variable
;

bloque
: sentencia*
;

sentencia
: asignacion
| sentencia_if
|sentencia_while
| sentencia_for
| print
;

asignacion
: variable expr ';'
;

sentencia_if
: IF bloque_condicional (ELSE IF bloque_condicional)* (ELSE bloque_de_sentencia)?
;

bloque_condicional
: AP expr CP bloque_de_sentencia
;

bloque_de_sentencia
: AL bloque CL
| sentencia
;

sentencia_while
: WHILE expr bloque_de_sentencia
;

sentencia_for
: FOR bloque_for
;

bloque_for
: AP asignacion expr ';' expr CP bloque_de_sentencia
;

print
: PRINT expr ';'
;

