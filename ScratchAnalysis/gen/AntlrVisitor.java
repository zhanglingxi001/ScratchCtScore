// Generated from C:/Users/XIXI/Desktop/ScratchAnalysis\Antlr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(AntlrParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(AntlrParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(AntlrParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AntlrParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AntlrParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#costumes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCostumes(AntlrParser.CostumesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#costume_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCostume_content(AntlrParser.Costume_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#sounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSounds(AntlrParser.SoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#sound_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSound_content(AntlrParser.Sound_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrParser#blocks_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocks_event(AntlrParser.Blocks_eventContext ctx);
}