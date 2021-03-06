/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:27
 * @production FunctionStmt : {@link Stmt} ::= <span class="component">{@link FunctionCall}</span>;

 */
public class FunctionStmt extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public FunctionStmt() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  public FunctionStmt(FunctionCall p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:25
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:37
   */
  public FunctionStmt clone() throws CloneNotSupportedException {
    FunctionStmt node = (FunctionStmt) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public FunctionStmt copy() {
    try {
      FunctionStmt node = (FunctionStmt) clone();
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
   * @declaredat ASTNode:63
   */
  @Deprecated
  public FunctionStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public FunctionStmt treeCopyNoTransform() {
    FunctionStmt tree = (FunctionStmt) copy();
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
   * @declaredat ASTNode:93
   */
  public FunctionStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the FunctionCall child.
   * @param node The new node to replace the FunctionCall child.
   * @apilevel high-level
   */
  public void setFunctionCall(FunctionCall node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the FunctionCall child.
   * @return The current node used as the FunctionCall child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="FunctionCall")
  public FunctionCall getFunctionCall() {
    return (FunctionCall) getChild(0);
  }
  /**
   * Retrieves the FunctionCall child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the FunctionCall child.
   * @apilevel low-level
   */
  public FunctionCall getFunctionCallNoTransform() {
    return (FunctionCall) getChildNoTransform(0);
  }
}
