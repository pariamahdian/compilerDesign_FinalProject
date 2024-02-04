grammar phase1 ;

start : funcList ;

funcList : funcDef funcList2 ;

funcList2 : funcList
		  | 
          ;

funcDef : dataType id '(' paramList ')' codeBlock ;

paramList : param paramList2
		  |
		  ;
		  
paramList2 : ',' paramList
		   |
		   ;

param : dataType id ;

dataType : 'int' | 'double' | 'boolean' | 'void' 
		 ;

codeBlock : '{' stmtList '}' ;

stmtList : stmt stmtList
         | 
         ;

stmt : id stmt2
	 |';'
     | codeBlock
     | dataType varList ';'
     | 'return' stmt3
     | loopStmt
	 | 'if' '(' expr ')' stmt ('else' stmt)?
	 | expr ';'
     | 'if' '(' expr ')' stmt 
     ;

stmt2 : '=' expr ';'
      | '++' ';'
      | '--' ';'
	  ;
	 
stmt3 : ';'
	  |expr ';'
	  ;
	  
loopStmt : 'while' '(' expr ')' stmt
         | 'do' stmt 'while' '(' expr ')' ';'
         | 'for' '(' initStmt ';' expr ';' postStmt ')' stmt
         ;

initStmt : dataType id '=' expr
         | id '=' expr
         | 
         ;

postStmt : id postStmt2
		 |
		 ;
		 
postStmt2 : '=' expr
          | '++'
          | '--'
          ;

varList : var varList2 ;

varList2 : var varList2
         | 
         ;

var : id var2 ;

var2 : '=' expr
	 | ','     //for parsing tests
	 | 
	 ;

expr : number expr2
	 | id expr3
     | 'true' expr2
     | 'false' expr2
     | stringList expr2
     | '(' expr ')' expr2
     | unop expr expr2
	 ;
	 
expr2 : binop expr expr2
	  |
      ;
	  
expr3 : expr2
	  | '(' args ')'
	  ;

args : expr args2 ;

args2 : ',' args
      | 
      ;

unop : '-' unop | '!' unop | number | id
     ;
	  
prec1 : unop ;

prec2 : prec1 ( ( '*' | '/' | '%' ) prec1 )* ;

prec3 : prec2 ( ( '+' | '-' ) prec2 )* ;

prec4 : prec3 ( ( '<' | '>' | '<=' | '>=' ) prec3 )* ;

prec5 : prec4 ( ( '==' | '!=' ) prec4 )* ;

prec6 : prec5 ( '&&' prec5 )* ;

binop : prec6 ( '||' prec6 )* ;  


number : integer | double ;

stringList : '"' .*? '"'
		   |
		   ;

integer : DIGIT ;

DIGIT : [0-9]+ ;

PT : '.' ;

double : integer (PT integer)? ;


id : LETTER (LETTER | DIGIT | '_')* ;
LETTER : [a-zA-Z][a-zA-Z0-9_]* ;


//FI : 'fi' ;

WS : [ \t\r\n]+ -> skip ;

