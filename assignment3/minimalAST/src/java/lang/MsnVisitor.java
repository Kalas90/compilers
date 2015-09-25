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
        return v.maxDepth;
    }
    
    // state variables
    private int maxDepth = 1;
    private int currentDepth = 1;
    
    public Object visit(CompoundStmt node, Object data) {
	currentDepth++;
        if(currentDepth > maxDepth) maxDepth = currentDepth;
	super.visit(node, data);
	currentDepth--;
	return data;
    }
    
}
