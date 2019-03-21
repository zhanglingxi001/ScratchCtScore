// Generated from C:/Users/XIXI/Desktop/ScratchAnalysis\Antlr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TARGETS=12, EXTENSIONS=13, META=14, BROADCATS=15, BLOCKS=16, 
		WHENGREENFLAG=17, STRING=18, NUMBER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "TARGETS", "EXTENSIONS", "META", "BROADCATS", "BLOCKS", 
		"WHENGREENFLAG", "STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", 
		"WS"
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


	public AntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Antlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00f1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00b5\n\23\f\23\16"+
		"\23\u00b8\13\23\3\23\3\23\3\24\3\24\3\24\5\24\u00bf\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\5\27\u00ca\n\27\3\27\3\27\3\27\6\27\u00cf"+
		"\n\27\r\27\16\27\u00d0\5\27\u00d3\n\27\3\27\5\27\u00d6\n\27\3\30\3\30"+
		"\3\30\7\30\u00db\n\30\f\30\16\30\u00de\13\30\5\30\u00e0\n\30\3\31\3\31"+
		"\5\31\u00e4\n\31\3\31\6\31\u00e7\n\31\r\31\16\31\u00e8\3\32\6\32\u00ec"+
		"\n\32\r\32\16\32\u00ed\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2-\25"+
		"/\2\61\2\63\26\3\2\n\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62"+
		";\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u00f7\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2-\3"+
		"\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13"+
		"=\3\2\2\2\rB\3\2\2\2\17H\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27"+
		"\\\3\2\2\2\31e\3\2\2\2\33o\3\2\2\2\35|\3\2\2\2\37\u0083\3\2\2\2!\u0090"+
		"\3\2\2\2#\u0099\3\2\2\2%\u00b1\3\2\2\2\'\u00bb\3\2\2\2)\u00c0\3\2\2\2"+
		"+\u00c6\3\2\2\2-\u00c9\3\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00eb"+
		"\3\2\2\2\65\66\7}\2\2\66\4\3\2\2\2\678\7.\2\28\6\3\2\2\29:\7\177\2\2:"+
		"\b\3\2\2\2;<\7<\2\2<\n\3\2\2\2=>\7v\2\2>?\7t\2\2?@\7w\2\2@A\7g\2\2A\f"+
		"\3\2\2\2BC\7h\2\2CD\7c\2\2DE\7n\2\2EF\7u\2\2FG\7g\2\2G\16\3\2\2\2HI\7"+
		"p\2\2IJ\7w\2\2JK\7n\2\2KL\7n\2\2L\20\3\2\2\2MN\7]\2\2N\22\3\2\2\2OP\7"+
		"_\2\2P\24\3\2\2\2QR\7$\2\2RS\7e\2\2ST\7q\2\2TU\7u\2\2UV\7v\2\2VW\7w\2"+
		"\2WX\7o\2\2XY\7g\2\2YZ\7u\2\2Z[\7$\2\2[\26\3\2\2\2\\]\7$\2\2]^\7u\2\2"+
		"^_\7q\2\2_`\7w\2\2`a\7p\2\2ab\7f\2\2bc\7u\2\2cd\7$\2\2d\30\3\2\2\2ef\7"+
		"$\2\2fg\7v\2\2gh\7c\2\2hi\7t\2\2ij\7i\2\2jk\7g\2\2kl\7v\2\2lm\7u\2\2m"+
		"n\7$\2\2n\32\3\2\2\2op\7$\2\2pq\7g\2\2qr\7z\2\2rs\7v\2\2st\7g\2\2tu\7"+
		"p\2\2uv\7u\2\2vw\7k\2\2wx\7q\2\2xy\7p\2\2yz\7u\2\2z{\7$\2\2{\34\3\2\2"+
		"\2|}\7$\2\2}~\7o\2\2~\177\7g\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7$\2\2\u0082\36\3\2\2\2\u0083\u0084\7$\2\2\u0084\u0085\7d\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7c\2\2\u0088\u0089\7f\2\2"+
		"\u0089\u008a\7e\2\2\u008a\u008b\7c\2\2\u008b\u008c\7u\2\2\u008c\u008d"+
		"\7v\2\2\u008d\u008e\7u\2\2\u008e\u008f\7$\2\2\u008f \3\2\2\2\u0090\u0091"+
		"\7$\2\2\u0091\u0092\7d\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7m\2\2\u0096\u0097\7u\2\2\u0097\u0098\7$\2\2"+
		"\u0098\"\3\2\2\2\u0099\u009a\7$\2\2\u009a\u009b\7g\2\2\u009b\u009c\7x"+
		"\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\u00a0"+
		"\7a\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7c\2\2"+
		"\u00a7\u00a8\7i\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7m\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7f\2\2\u00af\u00b0\7$\2\2\u00b0$\3\2\2\2\u00b1\u00b6\7$\2\2\u00b2"+
		"\u00b5\5\'\24\2\u00b3\u00b5\n\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba&\3\2\2\2\u00bb"+
		"\u00be\7^\2\2\u00bc\u00bf\t\3\2\2\u00bd\u00bf\5)\25\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2"+
		"\5+\26\2\u00c2\u00c3\5+\26\2\u00c3\u00c4\5+\26\2\u00c4\u00c5\5+\26\2\u00c5"+
		"*\3\2\2\2\u00c6\u00c7\t\4\2\2\u00c7,\3\2\2\2\u00c8\u00ca\7/\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d2\5/"+
		"\30\2\u00cc\u00ce\7\60\2\2\u00cd\u00cf\t\5\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d6\5\61\31\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6.\3\2\2"+
		"\2\u00d7\u00e0\7\62\2\2\u00d8\u00dc\t\6\2\2\u00d9\u00db\t\5\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00d7\3\2\2\2\u00df"+
		"\u00d8\3\2\2\2\u00e0\60\3\2\2\2\u00e1\u00e3\t\7\2\2\u00e2\u00e4\t\b\2"+
		"\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7"+
		"\5/\30\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\62\3\2\2\2\u00ea\u00ec\t\t\2\2\u00eb\u00ea\3\2\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\b\32\2\2\u00f0\64\3\2\2\2\17\2\u00b4\u00b6\u00be"+
		"\u00c9\u00d0\u00d2\u00d5\u00dc\u00df\u00e3\u00e8\u00ed\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}