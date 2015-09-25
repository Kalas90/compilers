/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:10
 * @production IntUse : {@link Expr} ::= <span class="component">&lt;INT:String&gt;</span>;

 */
public class IntUse extends Expr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public IntUse() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  public IntUse(String p0) {
    setINT(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public IntUse(beaver.Symbol p0) {
    setINT(p0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:39
   */
  public IntUse clone() throws CloneNotSupportedException {
    IntUse node = (IntUse) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public IntUse copy() {
    try {
      IntUse node = (IntUse) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:65
   */
  @Deprecated
  public IntUse fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public IntUse treeCopyNoTransform() {
    IntUse tree = (IntUse) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:95
   */
  public IntUse treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:102
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_INT == ((IntUse)node).tokenString_INT);    
  }
  /**
   * Replaces the lexeme INT.
   * @param value The new value for the lexeme INT.
   * @apilevel high-level
   */
  public void setINT(String value) {
    tokenString_INT = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_INT;
  /**
   */
  public int INTstart;
  /**
   */
  public int INTend;
  /**
   * JastAdd-internal setter for lexeme INT using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme INT
   * @apilevel internal
   */
  public void setINT(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setINT is only valid for String lexemes");
    tokenString_INT = (String)symbol.value;
    INTstart = symbol.getStart();
    INTend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme INT.
   * @return The value for the lexeme INT.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="INT")
  public String getINT() {
    return tokenString_INT != null ? tokenString_INT : "";
  }
}
