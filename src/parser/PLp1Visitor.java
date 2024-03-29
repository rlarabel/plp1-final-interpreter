// Generated from src/parser/PLp1.g4 by ANTLR 4.7.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLp1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLp1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PLp1Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PLp1Parser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PLp1Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(PLp1Parser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PLp1Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PLp1Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(PLp1Parser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#constantExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExp(PLp1Parser.ConstantExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#listExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExp(PLp1Parser.ListExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(PLp1Parser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#lambdaExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExp(PLp1Parser.LambdaExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PLp1Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExp(PLp1Parser.LetExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDecls(PLp1Parser.LetDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDecl(PLp1Parser.LetDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExp(PLp1Parser.SwitchExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchCases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCases(PLp1Parser.SwitchCasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(PLp1Parser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(PLp1Parser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(PLp1Parser.ArgumentListContext ctx);
}