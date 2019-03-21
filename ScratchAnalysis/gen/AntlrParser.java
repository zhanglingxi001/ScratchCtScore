// Generated from C:/Users/XIXI/Desktop/ScratchAnalysis\Antlr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TARGETS=12, EXTENSIONS=13, META=14, BROADCATS=15, BLOCKS=16, 
		WHENGREENFLAG=17, STRING=18, NUMBER=19, WS=20;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_pair = 2, RULE_value = 3, RULE_array = 4, 
		RULE_costumes = 5, RULE_costume_content = 6, RULE_sounds = 7, RULE_sound_content = 8, 
		RULE_blocks_event = 9;
	public static final String[] ruleNames = {
		"json", "obj", "pair", "value", "array", "costumes", "costume_content", 
		"sounds", "sound_content", "blocks_event"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'true'", "'false'", "'null'", "'['", 
		"']'", "'\"costumes\"'", "'\"sounds\"'", "'\"targets\"'", "'\"extensions\"'", 
		"'\"meta\"'", "'\"broadcasts\"'", "'\"blocks\"'", "'\"event_whenflagclicked\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"TARGETS", "EXTENSIONS", "META", "BROADCATS", "BLOCKS", "WHENGREENFLAG", 
		"STRING", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Antlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(23);
				pair();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(24);
					match(T__1);
					setState(25);
					pair();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__0);
				setState(34);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AntlrParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CostumesContext costumes() {
			return getRuleContext(CostumesContext.class,0);
		}
		public SoundsContext sounds() {
			return getRuleContext(SoundsContext.class,0);
		}
		public TerminalNode BROADCATS() { return getToken(AntlrParser.BROADCATS, 0); }
		public TerminalNode BLOCKS() { return getToken(AntlrParser.BLOCKS, 0); }
		public TerminalNode TARGETS() { return getToken(AntlrParser.TARGETS, 0); }
		public TerminalNode EXTENSIONS() { return getToken(AntlrParser.EXTENSIONS, 0); }
		public TerminalNode META() { return getToken(AntlrParser.META, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(STRING);
				setState(38);
				match(T__3);
				setState(39);
				value();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				costumes();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				sounds();
				}
				break;
			case BROADCATS:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(BROADCATS);
				setState(43);
				match(T__3);
				setState(44);
				value();
				}
				break;
			case BLOCKS:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(BLOCKS);
				setState(46);
				match(T__3);
				setState(47);
				value();
				}
				break;
			case TARGETS:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				match(TARGETS);
				setState(49);
				match(T__3);
				setState(50);
				value();
				}
				break;
			case EXTENSIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(EXTENSIONS);
				setState(52);
				match(T__3);
				setState(53);
				value();
				}
				break;
			case META:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				match(META);
				setState(55);
				match(T__3);
				setState(56);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AntlrParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AntlrParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Blocks_eventContext blocks_event() {
			return getRuleContext(Blocks_eventContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				obj();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				array();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				match(T__6);
				}
				break;
			case WHENGREENFLAG:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				blocks_event();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__7);
				setState(70);
				value();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(71);
					match(T__1);
					setState(72);
					value();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(T__7);
				setState(81);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CostumesContext extends ParserRuleContext {
		public List<Costume_contentContext> costume_content() {
			return getRuleContexts(Costume_contentContext.class);
		}
		public Costume_contentContext costume_content(int i) {
			return getRuleContext(Costume_contentContext.class,i);
		}
		public CostumesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costumes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterCostumes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitCostumes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitCostumes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CostumesContext costumes() throws RecognitionException {
		CostumesContext _localctx = new CostumesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_costumes);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__9);
				setState(85);
				match(T__3);
				setState(86);
				match(T__7);
				setState(87);
				costume_content();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(88);
					match(T__1);
					setState(89);
					costume_content();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__9);
				setState(98);
				match(T__3);
				setState(99);
				match(T__0);
				setState(100);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Costume_contentContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public Costume_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costume_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterCostume_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitCostume_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitCostume_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Costume_contentContext costume_content() throws RecognitionException {
		Costume_contentContext _localctx = new Costume_contentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_costume_content);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__0);
				setState(104);
				pair();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(105);
					match(T__1);
					setState(106);
					pair();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__0);
				setState(115);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SoundsContext extends ParserRuleContext {
		public List<Sound_contentContext> sound_content() {
			return getRuleContexts(Sound_contentContext.class);
		}
		public Sound_contentContext sound_content(int i) {
			return getRuleContext(Sound_contentContext.class,i);
		}
		public SoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterSounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitSounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitSounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoundsContext sounds() throws RecognitionException {
		SoundsContext _localctx = new SoundsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sounds);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__10);
				setState(119);
				match(T__3);
				setState(120);
				match(T__7);
				setState(121);
				sound_content();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(122);
					match(T__1);
					setState(123);
					sound_content();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__10);
				setState(132);
				match(T__3);
				setState(133);
				match(T__0);
				setState(134);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sound_contentContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public Sound_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sound_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterSound_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitSound_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitSound_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sound_contentContext sound_content() throws RecognitionException {
		Sound_contentContext _localctx = new Sound_contentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sound_content);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__0);
				setState(138);
				pair();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(139);
					match(T__1);
					setState(140);
					pair();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__0);
				setState(149);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Blocks_eventContext extends ParserRuleContext {
		public TerminalNode WHENGREENFLAG() { return getToken(AntlrParser.WHENGREENFLAG, 0); }
		public Blocks_eventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocks_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterBlocks_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitBlocks_event(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrVisitor ) return ((AntlrVisitor<? extends T>)visitor).visitBlocks_event(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Blocks_eventContext blocks_event() throws RecognitionException {
		Blocks_eventContext _localctx = new Blocks_eventContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blocks_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHENGREENFLAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3\3"+
		"\3\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5F\n"+
		"\5\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\3\6\3\6\5\6U\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7h\n\7\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b\3\b\3\b\5\b"+
		"w\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n"+
		"\u0093\13\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\13\3\13\3\13\2\2\f\2\4\6\b"+
		"\n\f\16\20\22\24\2\2\2\u00ac\2\26\3\2\2\2\4%\3\2\2\2\6;\3\2\2\2\bE\3\2"+
		"\2\2\nT\3\2\2\2\fg\3\2\2\2\16v\3\2\2\2\20\u0089\3\2\2\2\22\u0098\3\2\2"+
		"\2\24\u009a\3\2\2\2\26\27\5\b\5\2\27\3\3\2\2\2\30\31\7\3\2\2\31\36\5\6"+
		"\4\2\32\33\7\4\2\2\33\35\5\6\4\2\34\32\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\5\2\2\"&\3\2\2\2#$\7\3\2"+
		"\2$&\7\5\2\2%\30\3\2\2\2%#\3\2\2\2&\5\3\2\2\2\'(\7\24\2\2()\7\6\2\2)<"+
		"\5\b\5\2*<\5\f\7\2+<\5\20\t\2,-\7\21\2\2-.\7\6\2\2.<\5\b\5\2/\60\7\22"+
		"\2\2\60\61\7\6\2\2\61<\5\b\5\2\62\63\7\16\2\2\63\64\7\6\2\2\64<\5\b\5"+
		"\2\65\66\7\17\2\2\66\67\7\6\2\2\67<\5\b\5\289\7\20\2\29:\7\6\2\2:<\5\b"+
		"\5\2;\'\3\2\2\2;*\3\2\2\2;+\3\2\2\2;,\3\2\2\2;/\3\2\2\2;\62\3\2\2\2;\65"+
		"\3\2\2\2;8\3\2\2\2<\7\3\2\2\2=F\7\24\2\2>F\7\25\2\2?F\5\4\3\2@F\5\n\6"+
		"\2AF\7\7\2\2BF\7\b\2\2CF\7\t\2\2DF\5\24\13\2E=\3\2\2\2E>\3\2\2\2E?\3\2"+
		"\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\7"+
		"\n\2\2HM\5\b\5\2IJ\7\4\2\2JL\5\b\5\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\13\2\2QU\3\2\2\2RS\7\n\2\2SU\7\13\2\2T"+
		"G\3\2\2\2TR\3\2\2\2U\13\3\2\2\2VW\7\f\2\2WX\7\6\2\2XY\7\n\2\2Y^\5\16\b"+
		"\2Z[\7\4\2\2[]\5\16\b\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3"+
		"\2\2\2`^\3\2\2\2ab\7\13\2\2bh\3\2\2\2cd\7\f\2\2de\7\6\2\2ef\7\3\2\2fh"+
		"\7\5\2\2gV\3\2\2\2gc\3\2\2\2h\r\3\2\2\2ij\7\3\2\2jo\5\6\4\2kl\7\4\2\2"+
		"ln\5\6\4\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\7\5\2\2sw\3\2\2\2tu\7\3\2\2uw\7\5\2\2vi\3\2\2\2vt\3\2\2\2w\17\3\2\2"+
		"\2xy\7\r\2\2yz\7\6\2\2z{\7\n\2\2{\u0080\5\22\n\2|}\7\4\2\2}\177\5\22\n"+
		"\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u008a\3"+
		"\2\2\2\u0085\u0086\7\r\2\2\u0086\u0087\7\6\2\2\u0087\u0088\7\3\2\2\u0088"+
		"\u008a\7\5\2\2\u0089x\3\2\2\2\u0089\u0085\3\2\2\2\u008a\21\3\2\2\2\u008b"+
		"\u008c\7\3\2\2\u008c\u0091\5\6\4\2\u008d\u008e\7\4\2\2\u008e\u0090\5\6"+
		"\4\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\5"+
		"\2\2\u0095\u0099\3\2\2\2\u0096\u0097\7\3\2\2\u0097\u0099\7\5\2\2\u0098"+
		"\u008b\3\2\2\2\u0098\u0096\3\2\2\2\u0099\23\3\2\2\2\u009a\u009b\7\23\2"+
		"\2\u009b\25\3\2\2\2\20\36%;EMT^gov\u0080\u0089\u0091\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}