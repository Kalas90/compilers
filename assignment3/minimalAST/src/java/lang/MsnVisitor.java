package lang;

import lang.ast.*;

/**
 * Checks if there are any 'ask user' statements in a Calc program.
 */
public class MsnVisitor extends TraversingVisitor {
    // client method
    public static int result(ASTNode n) {
        MsnVisitor v = new MsnVisitor();
        n.accept(v, null);
        return v.isInteractive;
    }
    
    // state variables
    private boolean isInteractive = false;

    public Object visit(Program node, Object data) {
	
	isInteractive = true;
        return data;
    }
}
