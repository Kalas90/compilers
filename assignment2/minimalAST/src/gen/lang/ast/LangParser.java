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
		"U9ojb3bJ544Kn$yxUm3B8fU2iBBBSX$BiIBUzm6Ae2YK9bfbPcQLWPc1PMHaP6I2Ny0FO6Z" +
		"eBOedA8eeNY2AeeZw$4zlCyniBPIeC$NhT$IRrptlJG$WoaCBib65vIX3AIgm2ukm3#tOWq" +
		"xua8aiv6A9Ycb04#gH3h#AQKSQ0aWLiMBQiHVhi1uRi16RiDdAMOmLM8OSRLUYm37Jd10NY" +
		"QyZDx0DY#6bxaODS$lXGJwso2GzhSXJdgMc1naef6SsIv4ZOzXXbV2faCDJvx0Q7TPEXxLx" +
		"ZZN#JVSYY2vTMuzLexWTWu4rM2jNjHslp3lsfrpUOh$TYsgaEEoLM8NL3iz2nwsenNRiOEO" +
		"sLgq3KTQyWBKs2R9JHTn$X7ZLkxYuwoh6rgXv5tVkPZLzAiPBolXsi6Ay$8vosTybx6G##p" +
		"YRCyIEfLXsUSACquhgTJoCI#5A1liROsuVl#DKVfz#UWASCJqkxV7GOyyoNtuVgp3V$9zQ$" +
		"qitQrcYtxd2cfcfGGDFPIQ$dxWT7ysgr74iTNXTxApTpkBfpac8MEZeuHsXp63L37RNosvt" +
		"duAwJ3riwjeEa3nII7AqhuCSc8cnmokgPOkMNLeU8WFaC3ckVRbQ3f9MSfaCan7jxoUZP5p" +
		"RGsG2SALfUv9CQVq7kP9aFv9idtF1tEd487uIqBvCOjQbbv8dmvLAlOyos$PSrXprw27r2R" +
		"vBfXIHQIr7oDH2zgdppDIlHyisBJl9IH8a1ybfxR$8TTwOqfQZsAOV8MUqVfISJRBckR$OP" +
		"wMMOpRVCN9UwoV81VipvZwJvEcE2$afxBPyL$gq6Z$Bg4p89$b8VPny86FGb$dEya9fpycG" +
		"F9Cdb4zbK0PaXDfxybBwLSHZUIJNPLXUoNsv9ttoK1x8NRaZlN9RRibDA#ThE2wv9byuVfE" +
		"lCYM$w6XMfxj1OQW$GGNFLYrdQjMPTgjptaYxKKc3VrsN3SCYmjX2djXgwZNKAvcdYiJuR8" +
		"onCVh2b67EXwY7g1Sf3FvntEgl4xHmAndLrDceduDoFbD0QVwpctu3AhCIuG==");

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
			new Action() {	// [3] program_component = function_dec.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final ProgramComponent a = (ProgramComponent) _symbol_a.value;
					 return new ProgramComponent(a);
				}
			},
			new Action() {	// [4] function_dec = id_decl.a LPAR param_list.b RPAR compound_stmt.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 5];
					final Stmt c = (Stmt) _symbol_c.value;
					 return new FunctionDec(a, b, c);
				}
			},
			Action.NONE,  	// [5] param_list = 
			new Action() {	// [6] param_list = param.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Param a = (Param) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [7] param_list = param_list.a COMMA param.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Param b = (Param) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [8] param = id_decl.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					 return new IdDecl(a);
				}
			},
			Action.NONE,  	// [9] stmt_list = 
			new Action() {	// [10] stmt_list = stmt.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [11] stmt_list = stmt_list.a stmt.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Stmt b = (Stmt) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [12] stmt = compound_stmt.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new Stmt(a);
				}
			},
			new Action() {	// [13] stmt = if_stmt.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new Stmt(a);
				}
			},
			new Action() {	// [14] stmt = while_stmt.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new Stmt(a);
				}
			},
			new Action() {	// [15] stmt = function_stmt.a SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new Stmt(a);
				}
			},
			new Action() {	// [16] stmt = return_stmt.a SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new Stmt(a);
				}
			},
			new Action() {	// [17] stmt = assign_stmt.a SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new Stmt(a);
				}
			},
			new Action() {	// [18] compound_stmt = LBR stmt_list.a RBR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					 return new CompoundStmt(a);
				}
			},
			new Action() {	// [19] function_stmt = id_use.a LPAR add_sub_list.b RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdUse a = (IdUse) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return new FunctionStmt(a, b);
				}
			},
			new Action() {	// [20] return_stmt = RETURN add_sub_expr.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final Expr a = (Expr) _symbol_a.value;
					 return new ReturnStmt(a);
				}
			},
			new Action() {	// [21] assign_stmt = id_decl.a ASSIGN add_sub_expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new AssignStmt(a, b);
				}
			},
			new Action() {	// [22] if_stmt = IF LPAR comparison.a RPAR compound_stmt.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Stmt b = (Stmt) _symbol_b.value;
					 return new IfStmt(a, b);
				}
			},
			new Action() {	// [23] while_stmt = WHILE LPAR comparison.a RPAR compound_stmt.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Stmt b = (Stmt) _symbol_b.value;
					 return new WhileStmt(a, b);
				}
			},
			Action.NONE,  	// [24] add_sub_list = 
			new Action() {	// [25] add_sub_list = add_sub_expr.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [26] add_sub_list = add_sub_list.a COMMA add_sub_expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [27] add_sub_expr = add_sub_expr_binding.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final AddSubExpr a = (AddSubExpr) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [28] add_sub_expr = add_sub_expr.a add_sub_expr_binding.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final AddSubExpr b = (AddSubExpr) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [29] add_sub_expr_binding = term.a operator1 add_sub_expr.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_c = _symbols[offset + 3];
					final Expr c = (Expr) _symbol_c.value;
					 return new AddSubExpr(a, b, c);
				}
			},
			new Action() {	// [30] add_sub_expr_binding = term.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					 return new AddSubExpr(a);
				}
			},
			new Action() {	// [31] term = term_binding.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Term a = (Term) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [32] term = term.a term_binding.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Term b = (Term) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [33] term_binding = factor.a operator2.b term.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Factor a = (Factor) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Operator2 b = (Operator2) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 3];
					final List c = (List) _symbol_c.value;
					 return new Term(a, b, c);
				}
			},
			new Action() {	// [34] term_binding = factor.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Factor a = (Factor) _symbol_a.value;
					 return new Term(a);
				}
			},
			new Action() {	// [35] factor = id_use.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdUse a = (IdUse) _symbol_a.value;
					 return new Factor(a);
				}
			},
			new Action() {	// [36] factor = INT.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Factor(a);
				}
			},
			new Action() {	// [37] factor = LPAR add_sub_expr.a RPAR
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final Expr a = (Expr) _symbol_a.value;
					 return new Factor(a);
				}
			},
			new Action() {	// [38] factor = function_stmt.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new Factor(a);
				}
			},
			new Action() {	// [39] operator1 = PLUS.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator1(a);
				}
			},
			new Action() {	// [40] operator1 = MINUS.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator1(a);
				}
			},
			new Action() {	// [41] operator2 = MUL.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator2(a);
				}
			},
			new Action() {	// [42] operator2 = DIV.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator2(a);
				}
			},
			new Action() {	// [43] operator2 = MOD.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator2(a);
				}
			},
			new Action() {	// [44] operator3 = EQ.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator3(a);
				}
			},
			new Action() {	// [45] operator3 = NEQ.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator3(a);
				}
			},
			new Action() {	// [46] operator3 = GEQ.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator3(a);
				}
			},
			new Action() {	// [47] operator3 = LEQ.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator3(a);
				}
			},
			new Action() {	// [48] operator3 = GREATER.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator3(a);
				}
			},
			new Action() {	// [49] operator3 = LESS.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Operator3(a);
				}
			},
			new Action() {	// [50] comparison = add_sub_expr.a operator3.b add_sub_expr.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Operator3 b = (Operator3) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 3];
					final Expr c = (Expr) _symbol_c.value;
					 return new Comparison(a, b, c);
				}
			},
			new Action() {	// [51] id_use = ID.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol id = _symbols[offset + 1];
					 return new IdUse(id);
				}
			},
			new Action() {	// [52] id_decl = INTW ID.id
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
