/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:4
 * @production FunctionDec : {@link ProgramComponent} ::= <span class="component">{@link IdDecl}</span> <span class="component">[{@link Param}]</span> <span class="component">{@link CompoundStmt}</span>;

 */
public class FunctionDec extends ProgramComponent implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public FunctionDec() {
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
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public FunctionDec(IdDecl p0, Opt<Param> p1, CompoundStmt p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public FunctionDec clone() throws CloneNotSupportedException {
    FunctionDec node = (FunctionDec) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:47
   */
  public FunctionDec copy() {
    try {
      FunctionDec node = (FunctionDec) clone();
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
   * @declaredat ASTNode:66
   */
  @Deprecated
  public FunctionDec fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public FunctionDec treeCopyNoTransform() {
    FunctionDec tree = (FunctionDec) copy();
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
   * @declaredat ASTNode:96
   */
  public FunctionDec treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:103
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
   * Replaces the optional node for the Param child. This is the <code>Opt</code>
   * node containing the child Param, not the actual child!
   * @param opt The new node to be used as the optional node for the Param child.
   * @apilevel low-level
   */
  public void setParamOpt(Opt<Param> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) Param child.
   * @param node The new node to be used as the Param child.
   * @apilevel high-level
   */
  public void setParam(Param node) {
    getParamOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Param child exists.
   * @return {@code true} if the optional Param child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasParam() {
    return getParamOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Param child.
   * @return The Param child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Param getParam() {
    return (Param) getParamOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Param child. This is the <code>Opt</code> node containing the child Param, not the actual child!
   * @return The optional node for child the Param child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Param")
  public Opt<Param> getParamOpt() {
    return (Opt<Param>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Param. This is the <code>Opt</code> node containing the child Param, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Param.
   * @apilevel low-level
   */
  public Opt<Param> getParamOptNoTransform() {
    return (Opt<Param>) getChildNoTransform(1);
  }
  /**
   * Replaces the CompoundStmt child.
   * @param node The new node to replace the CompoundStmt child.
   * @apilevel high-level
   */
  public void setCompoundStmt(CompoundStmt node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the CompoundStmt child.
   * @return The current node used as the CompoundStmt child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="CompoundStmt")
  public CompoundStmt getCompoundStmt() {
    return (CompoundStmt) getChild(2);
  }
  /**
   * Retrieves the CompoundStmt child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the CompoundStmt child.
   * @apilevel low-level
   */
  public CompoundStmt getCompoundStmtNoTransform() {
    return (CompoundStmt) getChildNoTransform(2);
  }
}
