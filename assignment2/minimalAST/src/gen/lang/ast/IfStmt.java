/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:30
 * @production IfStmt : {@link Stmt} ::= <span class="component">If:{@link Expr}</span> <span class="component">Then:{@link CompoundStmt}</span> <span class="component">Else:{@link CompoundStmt}</span>;

 */
public class IfStmt extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public IfStmt() {
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
    children = new ASTNode[3];
  }
  /**
   * @declaredat ASTNode:13
   */
  public IfStmt(Expr p0, CompoundStmt p1, CompoundStmt p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 3;
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
  public IfStmt clone() throws CloneNotSupportedException {
    IfStmt node = (IfStmt) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public IfStmt copy() {
    try {
      IfStmt node = (IfStmt) clone();
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
  public IfStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public IfStmt treeCopyNoTransform() {
    IfStmt tree = (IfStmt) copy();
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
  public IfStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:102
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the If child.
   * @param node The new node to replace the If child.
   * @apilevel high-level
   */
  public void setIf(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the If child.
   * @return The current node used as the If child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="If")
  public Expr getIf() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the If child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the If child.
   * @apilevel low-level
   */
  public Expr getIfNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the Then child.
   * @param node The new node to replace the Then child.
   * @apilevel high-level
   */
  public void setThen(CompoundStmt node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Then child.
   * @return The current node used as the Then child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Then")
  public CompoundStmt getThen() {
    return (CompoundStmt) getChild(1);
  }
  /**
   * Retrieves the Then child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Then child.
   * @apilevel low-level
   */
  public CompoundStmt getThenNoTransform() {
    return (CompoundStmt) getChildNoTransform(1);
  }
  /**
   * Replaces the Else child.
   * @param node The new node to replace the Else child.
   * @apilevel high-level
   */
  public void setElse(CompoundStmt node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Else child.
   * @return The current node used as the Else child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Else")
  public CompoundStmt getElse() {
    return (CompoundStmt) getChild(2);
  }
  /**
   * Retrieves the Else child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Else child.
   * @apilevel low-level
   */
  public CompoundStmt getElseNoTransform() {
    return (CompoundStmt) getChildNoTransform(2);
  }
}
