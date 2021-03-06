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
		static public final short ID = 1;
		static public final short ASK = 2;
		static public final short LET = 3;
		static public final short NUMERAL = 4;
		static public final short MUL = 5;
		static public final short ASSIGN = 6;
		static public final short USER = 7;
		static public final short LBRACKET = 8;
		static public final short RBRACKET = 9;
		static public final short IN = 10;
		static public final short END = 11;

		static public final String[] NAMES = {
			"EOF",
			"ID",
			"ASK",
			"LET",
			"NUMERAL",
			"MUL",
			"ASSIGN",
			"USER",
			"LBRACKET",
			"RBRACKET",
			"IN",
			"END"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9o5aabFmp0GXLz8DrBIj4qeMmyze8e31pX0MGGt$XV$c7sd7JvReJ9LK2nzdkStiMPiHzA" +
		"DUcggfROwMjEUjfJONU1j17eOw1qrbdfJcTPLr4KpnThLY1ekfinzRQkh73MmUsgbLCXm1z" +
		"JA$SxGgzSHPuZfh2wAtYDVmyKkSvkp97JPv3mjykDR#J614zXtwrKO5t0A1t0S#3EuX4Cug" +
		"zXt3aTm1TU$lfazb$b#LJsN9qo9Yt$wQLJvPIvPMOzL3flRjttPftqidNTRCBzv$MgFzk0h" +
		"ovxWnVN7sqJSlIFc1Q8$fDnZZxjs$ql1ka0F#Iv3krVAOVG3D$1940==");

	static public class SyntaxError extends RuntimeException { public SyntaxError(String msg) {super(msg);}}
	// Disable syntax error recovery
	protected void recoverFromError(Symbol token, TokenStream in) {
		throw new SyntaxError("Cannot recover from the syntax error");
	}

	private final Action[] actions;

	public LangParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			new Action() {	// [0] program = exp.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return new Program(a);
				}
			},
			Action.RETURN,	// [1] exp = factor
			new Action() {	// [2] exp = exp.a MUL factor.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 System.out.println("Hej"); return new Mul(a, b);
				}
			},
			Action.RETURN,	// [3] factor = let
			Action.RETURN,	// [4] factor = ask
			Action.RETURN,	// [5] factor = numeral
			Action.RETURN,	// [6] factor = id_use
			new Action() {	// [7] let = LET binding_list.a IN exp.b END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 4];
					final Expr b = (Expr) _symbol_b.value;
					 return new Let(a, b);
				}
			},
			new Action() {	// [8] ask = ASK USER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Ask(new Opt());
				}
			},
			new Action() {	// [9] ask = ASK USER LBRACKET exp.a RBRACKET
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 4];
					final Expr a = (Expr) _symbol_a.value;
					 return new Ask(new Opt(a));
				}
			},
			new Action() {	// [10] binding_list = binding.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Binding a = (Binding) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [11] binding_list = binding_list.a binding.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Binding b = (Binding) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [12] binding = id_decl.a ASSIGN exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Binding(a, b);
				}
			},
			new Action() {	// [13] numeral = NUMERAL.num
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol num = _symbols[offset + 1];
					 return new Numeral(num);
				}
			},
			new Action() {	// [14] id_use = ID.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol id = _symbols[offset + 1];
					 return new IdUse(id);
				}
			},
			new Action() {	// [15] id_decl = ID.id
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol id = _symbols[offset + 1];
					 return new IdDecl(id);
				}
			}
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
