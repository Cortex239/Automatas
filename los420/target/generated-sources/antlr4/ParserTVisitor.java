// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ParserTParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(ParserTParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ParserTParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#primitiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiva(ParserTParser.PrimitivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(ParserTParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ParserTParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ParserTParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sentencia_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_if(ParserTParser.Sentencia_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#bloque_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicional(ParserTParser.Bloque_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#bloque_de_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_de_sentencia(ParserTParser.Bloque_de_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sentencia_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_while(ParserTParser.Sentencia_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sentencia_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_for(ParserTParser.Sentencia_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#bloque_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_for(ParserTParser.Bloque_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserTParser.PrintContext ctx);
}