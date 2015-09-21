/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:30
 * @production AssignStmt : {@link Stmt} ::= <span class="component">{@link IdDecl}</span> <span class="component">{@link AddSubExpr}*</span>;

 */
public class AssignStmt extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public AssignStmt() {
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
    children = new ASTNode[2];
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public AssignStmt(IdDecl p0, List<AddSubExpr> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 2;
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
  public AssignStmt clone() throws CloneNotSupportedException {
    AssignStmt node = (AssignStmt) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public AssignStmt copy() {
    try {
      AssignStmt node = (AssignStmt) clone();
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
  public AssignStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public AssignStmt treeCopyNoTransform() {
    AssignStmt tree = (AssignStmt) copy();
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
  public AssignStmt treeCopy() {
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
   * Replaces the IdDecl child.
   * @param node The new node to replace the IdDecl child.
   * @apilevel high-level
   */
  public void setIdDecl(IdDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdDecl child.
   * @return The current node used as the IdDecl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdDecl")
  public IdDecl getIdDecl() {
    return (IdDecl) getChild(0);
  }
  /**
   * Retrieves the IdDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdDecl child.
   * @apilevel low-level
   */
  public IdDecl getIdDeclNoTransform() {
    return (IdDecl) getChildNoTransform(0);
  }
  /**
   * Replaces the AddSubExpr list.
   * @param list The new list node to be used as the AddSubExpr list.
   * @apilevel high-level
   */
  public void setAddSubExprList(List<AddSubExpr> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the AddSubExpr list.
   * @return Number of children in the AddSubExpr list.
   * @apilevel high-level
   */
  public int getNumAddSubExpr() {
    return getAddSubExprList().getNumChild();
  }
  /**
   * Retrieves the number of children in the AddSubExpr list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the AddSubExpr list.
   * @apilevel low-level
   */
  public int getNumAddSubExprNoTransform() {
    return getAddSubExprListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the AddSubExpr list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the AddSubExpr list.
   * @apilevel high-level
   */
  public AddSubExpr getAddSubExpr(int i) {
    return (AddSubExpr) getAddSubExprList().getChild(i);
  }
  /**
   * Check whether the AddSubExpr list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasAddSubExpr() {
    return getAddSubExprList().getNumChild() != 0;
  }
  /**
   * Append an element to the AddSubExpr list.
   * @param node The element to append to the AddSubExpr list.
   * @apilevel high-level
   */
  public void addAddSubExpr(AddSubExpr node) {
    List<AddSubExpr> list = (parent == null) ? getAddSubExprListNoTransform() : getAddSubExprList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addAddSubExprNoTransform(AddSubExpr node) {
    List<AddSubExpr> list = getAddSubExprListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the AddSubExpr list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setAddSubExpr(AddSubExpr node, int i) {
    List<AddSubExpr> list = getAddSubExprList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the AddSubExpr list.
   * @return The node representing the AddSubExpr list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="AddSubExpr")
  public List<AddSubExpr> getAddSubExprList() {
    List<AddSubExpr> list = (List<AddSubExpr>) getChild(1);
    return list;
  }
  /**
   * Retrieves the AddSubExpr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the AddSubExpr list.
   * @apilevel low-level
   */
  public List<AddSubExpr> getAddSubExprListNoTransform() {
    return (List<AddSubExpr>) getChildNoTransform(1);
  }
  /**
   * Retrieves the AddSubExpr list.
   * @return The node representing the AddSubExpr list.
   * @apilevel high-level
   */
  public List<AddSubExpr> getAddSubExprs() {
    return getAddSubExprList();
  }
  /**
   * Retrieves the AddSubExpr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the AddSubExpr list.
   * @apilevel low-level
   */
  public List<AddSubExpr> getAddSubExprsNoTransform() {
    return getAddSubExprListNoTransform();
  }
}
