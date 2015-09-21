package lang.ast;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class LangParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short LPAR = 1;
		static public final short ID = 2;
		static public final short INT = 3;
		static public final short RPAR = 4;
		static public final short INTW = 5;
		static public final short LBR = 6;
		static public final short SEMI = 7;
		static public final short IF = 8;
		static public final short WHILE = 9;
		static public final short RBR = 10;
		static public final short COMMA = 11;
		static public final short RETURN = 12;
		static public final short ASSIGN = 13;
		static public final short PLUS = 14;
		static public final short MINUS = 15;
		static public final short MUL = 16;
		static public final short DIV = 17;
		static public final short MOD = 18;
		static public final short EQ = 19;
		static public final short NEQ = 20;
		static public final short GEQ = 21;
		static public final short LEQ = 22;
		static public final short GREATER = 23;
		static public final short LESS = 24;

		static public final String[] NAMES = {
			"EOF",
			"LPAR",
			"ID",
			"INT",
			"RPAR",
			"INTW",
			"LBR",
			"SEMI",
			"IF",
			"WHILE",
			"RBR",
			"COMMA",
			"RETURN",
			"ASSIGN",
			"PLUS",
			"MINUS",
			"MUL",
			"DIV",
			"MOD",
			"EQ",
			"NEQ",
			"GEQ",
			"LEQ",
			"GREATER",
			"LESS"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9ojbJbKKq4KXl#N409XtqICGC9EM18HzrrG53SGZ#VOsTdPMTbePMLbeusjrXuBBIoiHKL" +
		"H0L4KHH4K5r0KHQ$$cpS9x#K4nUMTV7Fl$T$CdNcp1J3oiHqvg44JAb2DtTY9J2HZhrApa8" +
		"qy56WrY7IamHTJmrYEHjso704qOwcboIqKwRVhi1uRi16RiDbHSqLSksZ$BKX1Abjs8iHUV" +
		"TY7GcoHJrJQu5NAObD11dAfpEKeTkGhTKHbA7743OueueXsEA9Ty$JmRxu7#TYFHLY2fBWv" +
		"h8ABN#YN6wZ46gpLRvTfQytj6zJ28w$XnbQqnZBOovLOXTK9z0MN8gZ3DlRZuuplGJlgqK6" +
		"lY2CsyNEzFFoI80oEsLIgk78rvhYKMaSrp3qKLGr#bJlMifYhKQgr97wrvULnJWeu9uLSNs" +
		"VDn545smRPCi3ryx2lDBLlV5JIkNDCnT2Abueznw#oDooexzz5$yiFSEnb98cx8NuE6$c5G" +
		"UwCUfxBhDXiMjOglRHM1iEMmLvcyuJd9j0NNaAjWi6nU1XdS1K2z82k4r2FmL#gwUiuXQIJ" +
		"5fAZjJRI4QrZXyy1RIzfUrdRWoH4hf3hMlDhEqGgoJKoJ4Qqta$6oOIE#yXxZYzPnrDaMli" +
		"pf3l1U6OJZNC##0mI8GFinsjfHXfnqUcXvGmQvdprqcRCjJCo4#GwIwx6QI5jgqqh8gDaya" +
		"$6gDj7v#22jgtQjfDZp3b6sqcEQ$qykKXgRJdyDlyGEQdzm#HKWZvF$yKuoxGTjsb7o1dj7" +
		"oNdujfCniLTbf7lCiloY$A$gN9Qtif7cP99#Xy8TuUyWtw4UqT6bFUCF9TXuKwJ9$9K7ijB" +
		"UXDaL1wf6eFoK6xA2tabVV90xik0zCizwPMxSaTwv7OivnWSZtJBPvOpybL#C6pc#JPuqar" +
		"SwXnNydI5Q4CyU#R#3zCFyrsOVhcwZQEuOWHPr$odgQ5VIx#AEQf9XFKYZ2DiQzx7fNnVmh" +
		"Y4Vh72nPl6JGpUEL7SojPfwcqqp4E5khVCkyY5ffzSXWgI");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static public class SyntaxError extends RuntimeException { public SyntaxError(String msg) {super(msg);}}
	// Disable syntax error recovery
	protected void recoverFromError(Symbol token, TokenStream in) {
		throw new SyntaxError("Cannot recover from the syntax error");
	}

	private final Action[] actions;

	public LangParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			new Action() {	// [0] program = program_component_list.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					 return new Program(a);
				}
			},
			new Action() {	// [1] program_component_list = program_component.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final ProgramComponent a = (ProgramComponent) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [2] program_component_list = program_component_list.a program_component.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final ProgramComponent b = (ProgramComponent) _symbol_b.value;
					 return a.add(b);
				}
			},
			Action.RETURN,	// [3] program_component = function_dec
			new Action() {	// [4] function_dec = id_decl.a LPAR param_list.b RPAR compound_stmt.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 5];
					final CompoundStmt c = (CompoundStmt) _symbol_c.value;
					 return new FunctionDec(a, b, c);
				}
			},
			new Action() {	// [5] param_list = id_decl.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [6] param_list = param_list.a COMMA id_decl.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final IdDecl b = (IdDecl) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [7] param_list = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new List();
				}
			},
			new Action() {	// [8] stmt_list = stmt.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [9] stmt_list = stmt_list.a stmt.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Stmt b = (Stmt) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [10] stmt_list = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new List();
				}
			},
			Action.RETURN,	// [11] stmt = compound_stmt
			Action.RETURN,	// [12] stmt = if_stmt
			Action.RETURN,	// [13] stmt = while_stmt
			RETURN2,	// [14] stmt = function_stmt SEMI; returns 'SEMI' although none is marked
			RETURN2,	// [15] stmt = return_stmt SEMI; returns 'SEMI' although none is marked
			RETURN2,	// [16] stmt = assign_stmt SEMI; returns 'SEMI' although none is marked
			new Action() {	// [17] compound_stmt = LBR stmt_list.a RBR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					 return new CompoundStmt(a);
				}
			},
			new Action() {	// [18] function_stmt = id_use.a LPAR add_sub_list.b RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdUse a = (IdUse) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return new FunctionStmt(a, b);
				}
			},
			new Action() {	// [19] return_stmt = RETURN add_sub_expr.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					 return new ReturnStmt(a);
				}
			},
			new Action() {	// [20] assign_stmt = id_decl.a ASSIGN add_sub_expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return new AssignStmt(a, b);
				}
			},
			new Action() {	// [21] if_stmt = IF LPAR comparison.a RPAR compound_stmt.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final CompoundStmt b = (CompoundStmt) _symbol_b.value;
					 return new IfStmt(a, b);
				}
			},
			new Action() {	// [22] while_stmt = WHILE LPAR comparison.a RPAR compound_stmt.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final CompoundStmt b = (CompoundStmt) _symbol_b.value;
					 return new WhileStmt(a, b);
				}
			},
			new Action() {	// [23] add_sub_list = add_sub_expr.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [24] add_sub_list = add_sub_list.a COMMA add_sub_expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [25] add_sub_list = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new List();
				}
			},
			new Action() {	// [26] add_sub_expr = add_sub_expr_binding.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final AddSubExpr a = (AddSubExpr) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [27] add_sub_expr = add_sub_expr.a add_sub_expr_binding.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final AddSubExpr b = (AddSubExpr) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [28] add_sub_expr_binding = term.a operator1 add_sub_expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return new AssociativeExpr(b, a);
				}
			},
			new Action() {	// [29] add_sub_expr_binding = term.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					 return new TermExpr(a);
				}
			},
			new Action() {	// [30] term = term_binding.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Term a = (Term) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [31] term = term.a term_binding.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Term b = (Term) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [32] term_binding = factor.a operator2 term.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Factor a = (Factor) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return new MultDiv(a, b);
				}
			},
			new Action() {	// [33] term_binding = factor.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Factor a = (Factor) _symbol_a.value;
					 return new SimpleTerm(a);
				}
			},
			new Action() {	// [34] factor = id_use.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdUse a = (IdUse) _symbol_a.value;
					 return new IdFactor(a);
				}
			},
			new Action() {	// [35] factor = INT.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new IntFactor(a);
				}
			},
			new Action() {	// [36] factor = LPAR add_sub_expr.a RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					 return new CompoundFactor(a);
				}
			},
			new Action() {	// [37] factor = function_stmt.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final FunctionStmt a = (FunctionStmt) _symbol_a.value;
					 return new FunctionFactor(a);
				}
			},
			Action.RETURN,	// [38] operator1 = PLUS
			Action.RETURN,	// [39] operator1 = MINUS
			Action.RETURN,	// [40] operator2 = MUL
			Action.RETURN,	// [41] operator2 = DIV
			Action.RETURN,	// [42] operator2 = MOD
			Action.RETURN,	// [43] operator3 = EQ
			Action.RETURN,	// [44] operator3 = NEQ
			Action.RETURN,	// [45] operator3 = GEQ
			Action.RETURN,	// [46] operator3 = LEQ
			Action.RETURN,	// [47] operator3 = GREATER
			Action.RETURN,	// [48] operator3 = LESS
			new Action() {	// [49] comparison = add_sub_expr.a operator3 add_sub_expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return new Comparison(a, b);
				}
			},
			new Action() {	// [50] id_use = ID.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol id = _symbols[offset + 1];
					 return new IdUse(id);
				}
			},
			new Action() {	// [51] id_decl = INTW ID.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol id = _symbols[offset + 2];
					 return new IdDecl(id);
				}
			}
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
