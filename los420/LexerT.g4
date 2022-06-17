lexer grammar LexerT;

BEGIN: 'lastorres';
END: 'rmx';
PRINT: 'xipetiao';
SCAN: 'malveke';

INT: 'laglock'
   	[0-9]+;
STRING: 'cochinae'
		[a-zA-Z]+ [0-9]*;
FLOAT: 'elcasti'
	[0-9]+ ','[0-9]*;

IF: 'kpaha';
ELSE: 'wasa';
WHILE: 'dimetu';
FOR: 'luv';

AND: '&&';
OR: '||';

SUM: '+';
DIV: '/';
RES: '-';
MUL: '*';
SQRT: 'svenska';
POW: 'engleska';
COS: 'spanska';
AP: '(';
CP: ')';
MENIG: '<=';
MAYIG: '>=';
MAY: '>';
MEN: '<';
IG: '==';
DIF: '!=';
AL: '{';
CL: '}';

NAME : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip ;
VARSTATMENT : INT|STRING|FLOAT;
BLANCO :
( ' '
| '\t'
);
