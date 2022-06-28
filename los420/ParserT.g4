grammar ParserT;
import LexerT;

program   : BEGIN sentencia+ END;  

sentencia
: asignacion
| sentencia_if
| sentencia_while
| sentencia_for
| print
| scan
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

sentencia_while
: WHILE expr bloque_de_sentencia
;

bloque_de_sentencia
: AL bloque CL
| sentencia
;

bloque
: sentencia*
;



sentencia_for
: FOR bloque_for
;

bloque_for
: AP asignacion expr ';' expr CP bloque_de_sentencia
;



varstament:
INT
|FLOAT
|STRING
;

scan      :SCAN (INT|STRING|FLOAT);

print
: PRINT expr ';'
;


variable  : varstament expr '=' ;

primitiva
: AP expr CP
| (INT | FLOAT)
| variable
;

expr
: RES expr
| expr op=(MUL | DIV) expr
| expr op=(SUM | RES) expr
| expr op=(MENIG | MAYIG | MAY | MEN) expr
| expr op=(IG | DIF) expr
| expr AND expr
| INT
| FLOAT
| STRING
;














