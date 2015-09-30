/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.13 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment3/A3-CalcComp/src/jastadd/calc.ast:10
 * @production Let : {@link Expr} ::= <span class="component">{@link Binding}*</span> <span class="component">{@link Expr}</span>;

 */
public class Let extends Expr implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat /Users/Klas/School/edan65/assignment3/A3-CalcComp/src/jastadd/NameAnalysis.jrag:76
   */
  public void checkNames(PrintStream err, SymbolTable symbols) {
		symbols = symbols.push();
		for (int i = 0; i < getNumBinding(); ++i) {
			getBinding(i).checkNames(err, symbols);
		}
		getExpr().checkNames(err, symbols);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/Klas/School/edan65/assignment3/A3-CalcComp/src/jastadd/PrettyPrint.jrag:39
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.println("let");
		for (int i = 0; i < getNumBinding(); ++i) {
			out.print(ind+"  ");
			getBinding(i).prettyPrint(out, ind+"  ");
			out.println();
		}
		out.println(ind + "in");
		out.print(ind+"  ");
		getExpr().prettyPrint(out, ind+"  ");
		out.println();
		out.print(ind + "end");
	}
  /**
   * @aspect Visitor
   * @declaredat /Users/Klas/School/edan65/assignment3/A3-CalcComp/src/jastadd/Visitor.jrag:47
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Let() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Let(List<Binding> p0, Expr p1) {
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
  public Let clone() throws CloneNotSupportedException {
    Let node = (Let) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public Let copy() {
    try {
      Let node = (Let) clone();
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
  public Let fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public Let treeCopyNoTransform() {
    Let tree = (Let) copy();
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
  public Let treeCopy() {
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
   * Replaces the Binding list.
   * @param list The new list node to be used as the Binding list.
   * @apilevel high-level
   */
  public void setBindingList(List<Binding> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Binding list.
   * @return Number of children in the Binding list.
   * @apilevel high-level
   */
  public int getNumBinding() {
    return getBindingList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Binding list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Binding list.
   * @apilevel low-level
   */
  public int getNumBindingNoTransform() {
    return getBindingListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Binding list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Binding list.
   * @apilevel high-level
   */
  public Binding getBinding(int i) {
    return (Binding) getBindingList().getChild(i);
  }
  /**
   * Check whether the Binding list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasBinding() {
    return getBindingList().getNumChild() != 0;
  }
  /**
   * Append an element to the Binding list.
   * @param node The element to append to the Binding list.
   * @apilevel high-level
   */
  public void addBinding(Binding node) {
    List<Binding> list = (parent == null) ? getBindingListNoTransform() : getBindingList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addBindingNoTransform(Binding node) {
    List<Binding> list = getBindingListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Binding list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setBinding(Binding node, int i) {
    List<Binding> list = getBindingList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Binding list.
   * @return The node representing the Binding list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Binding")
  public List<Binding> getBindingList() {
    List<Binding> list = (List<Binding>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Binding list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Binding list.
   * @apilevel low-level
   */
  public List<Binding> getBindingListNoTransform() {
    return (List<Binding>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Binding list.
   * @return The node representing the Binding list.
   * @apilevel high-level
   */
  public List<Binding> getBindings() {
    return getBindingList();
  }
  /**
   * Retrieves the Binding list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Binding list.
   * @apilevel low-level
   */
  public List<Binding> getBindingsNoTransform() {
    return getBindingListNoTransform();
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
}
