import Parser.sym;import java_cup.runtime.Symbol;
import parser.*;

%%


%class MPLexer
%function next_token
%line
%column
%debug
%type Symbol
%eofval{
return new Symbol(sym.EOF);
%eofval}


//states
%state COMMENT
//macros
slovo = [a-zA-Z]
cifra = [0-9]
oc16 = [0-9A-F]
%%


\/\/ { yybegin( COMMENT ); }
<COMMENT>~\n { yybegin( YYINITIAL ); }

[\t\n\r ] { ; }

//operators
\+ { return new Symbol( sym.PLUS ); }
\* { return new Symbol( sym.MULTI ); }
\- { return new Symbol( sym.MINUS ); }
\/ { return new Symbol( sym.DIV ); }
\= { return new Symbol( sym.ASSIGN ); }

//separatorsas
\: { return new Symbol( sym.COL ); }
\!\! { return new Symbol( sym.FS ); }
\@\@ { return new Symbol( sym.FE ); }
\?\? { return new Symbol( sym.CB ); }
\^\^ { return new Symbol( sym.EOL) ; }
\$\$ { return new Symbol( sym.CS ); }

//comparators
\> { return new Symbol( sym.GT ); }
\>\= { return new Symbol( sym.GTE ); }
\< { return new Symbol( sym.LT ); }
\<\= { return new Symbol( sym.LTE ); }
\=\= { return new Symbol( sym.E ); }
\!\= { return new Symbol( sym.NE ); }


//key words
Start { return new Symbol( sym.START ); }
if { return new Symbol( sym.IF ); }


{slovo}+ { return new Symbol(sym.ID); }
//id-s
({slovo} |_)({slovo}|{cifra}| _ ) { return new Symbol(sym.ID); }
//constants
{cifra}+ { return new Symbol( sym.CONST ); }
\${oc16}+ { return new Symbol( sym.CONST ); }
0.{cifra}+(E[+-]{cifra}+)? { return new Symbol( sym.CONST);}
'[^]' { return new Symbol( sym.CONST); }

//error symbol
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }