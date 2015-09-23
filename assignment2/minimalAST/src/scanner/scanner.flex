package lang.ast; // The generated scanner will belong to the package lang.ast

import lang.ast.LangParser.Terminals; // The terminals are implicitly defined in the parser
import lang.ast.LangParser.SyntaxError;

%%

// define the signature for the generated scanner
%public
%final
%class LangScanner
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol 
%function nextToken 

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r
INT = [0-9]+
ID = [A-Za-z]+ [A-Za-z0-9]*
COMMENT = [\/\*] [.*|\n]* [\*\/]
%%

// discard whitespace information
{WhiteSpace}  { }

// token definitions
"int"	  	{ return sym(Terminals.INTW); }
"("	  	{ return sym(Terminals.LPAR); }
")"	  	{ return sym(Terminals.RPAR); }
"*"	  	{ return sym(Terminals.MUL); }
"/"		{ return sym(Terminals.DIV); }
"%"	  	{ return sym(Terminals.MOD); }
"+"	  	{ return sym(Terminals.PLUS); }
"-"	  	{ return sym(Terminals.MINUS); }
"!="	  	{ return sym(Terminals.NEQ); }
"=="	  	{ return sym(Terminals.EQ); }
">="	  	{ return sym(Terminals.GEQ); }
"<="	  	{ return sym(Terminals.LEQ); }
">"		{ return sym(Terminals.GREATER); }
"<"	  	{ return sym(Terminals.LESS); }
","	  	{ return sym(Terminals.COMMA); }
"{"	  	{ return sym(Terminals.LBR); }
"}"	  	{ return sym(Terminals.RBR); }
"return"	{ return sym(Terminals.RETURN); }
"="		{ return sym(Terminals.ASSIGN); }
"if"	  	{ return sym(Terminals.IF); }
"else"		{ return sym(Terminals.ELSE); }
"while"	  	{ return sym(Terminals.WHILE); }
";"	  	{ return sym(Terminals.SEMI); }
{ID}          	{ return sym(Terminals.ID); }
{INT}     	{ return sym(Terminals.INT); }
{COMMENT}	{ return sym(Terminals.COMMENT); }
<<EOF>>       { return sym(Terminals.EOF); }

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
