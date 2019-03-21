// Generated from C:/Users/XIXI/Desktop/ScratchAnalysis\Antlr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrParser}.
 */
public interface AntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(AntlrParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(AntlrParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(AntlrParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(AntlrParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(AntlrParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(AntlrParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AntlrParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AntlrParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AntlrParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AntlrParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#costumes}.
	 * @param ctx the parse tree
	 */
	void enterCostumes(AntlrParser.CostumesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#costumes}.
	 * @param ctx the parse tree
	 */
	void exitCostumes(AntlrParser.CostumesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#costume_content}.
	 * @param ctx the parse tree
	 */
	void enterCostume_content(AntlrParser.Costume_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#costume_content}.
	 * @param ctx the parse tree
	 */
	void exitCostume_content(AntlrParser.Costume_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#sounds}.
	 * @param ctx the parse tree
	 */
	void enterSounds(AntlrParser.SoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#sounds}.
	 * @param ctx the parse tree
	 */
	void exitSounds(AntlrParser.SoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#sound_content}.
	 * @param ctx the parse tree
	 */
	void enterSound_content(AntlrParser.Sound_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#sound_content}.
	 * @param ctx the parse tree
	 */
	void exitSound_content(AntlrParser.Sound_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#blocks_event}.
	 * @param ctx the parse tree
	 */
	void enterBlocks_event(AntlrParser.Blocks_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#blocks_event}.
	 * @param ctx the parse tree
	 */
	void exitBlocks_event(AntlrParser.Blocks_eventContext ctx);
}