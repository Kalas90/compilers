/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:11
 * @production AssociativeExpr : {@link AddSubExpr} ::= <span class="component">{@link AddSubExpr}</span> <span class="component">{@link Term}</span>;

 */
public class AssociativeExpr extends AddSubExpr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public AssociativeExpr() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  public AssociativeExpr(AddSubExpr p0, Term p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public AssociativeExpr clone() throws CloneNotSupportedException {
    AssociativeExpr node = (AssociativeExpr) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public AssociativeExpr copy() {
    try {
      AssociativeExpr node = (AssociativeExpr) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public AssociativeExpr fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public AssociativeExpr treeCopyNoTransform() {
    AssociativeExpr tree = (AssociativeExpr) copy();
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
   * @declaredat ASTNode:94
   */
  public AssociativeExpr treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:101
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the AddSubExpr child.
   * @param node The new node to replace the AddSubExpr child.
   * @apilevel high-level
   */
  public void setAddSubExpr(AddSubExpr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the AddSubExpr child.
   * @return The current node used as the AddSubExpr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="AddSubExpr")
  public AddSubExpr getAddSubExpr() {
    return (AddSubExpr) getChild(0);
  }
  /**
   * Retrieves the AddSubExpr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the AddSubExpr child.
   * @apilevel low-level
   */
  public AddSubExpr getAddSubExprNoTransform() {
    return (AddSubExpr) getChildNoTransform(0);
  }
  /**
   * Replaces the Term child.
   * @param node The new node to replace the Term child.
   * @apilevel high-level
   */
  public void setTerm(Term node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Term child.
   * @return The current node used as the Term child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Term")
  public Term getTerm() {
    return (Term) getChild(1);
  }
  /**
   * Retrieves the Term child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Term child.
   * @apilevel low-level
   */
  public Term getTermNoTransform() {
    return (Term) getChildNoTransform(1);
  }
}
