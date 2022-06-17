// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BEGIN=3, END=4, PRINT=5, SCAN=6, INT=7, STRING=8, FLOAT=9, 
		IF=10, ELSE=11, WHILE=12, FOR=13, AND=14, OR=15, SUM=16, DIV=17, RES=18, 
		MUL=19, SQRT=20, POW=21, COS=22, AP=23, CP=24, MENIG=25, MAYIG=26, MAY=27, 
		MEN=28, IG=29, DIF=30, AL=31, CL=32, NAME=33, WS=34, VARSTATMENT=35, BLANCO=36;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_scan = 2, RULE_variable = 3, RULE_primitiva = 4, 
		RULE_bloque = 5, RULE_sentencia = 6, RULE_asignacion = 7, RULE_sentencia_if = 8, 
		RULE_bloque_condicional = 9, RULE_bloque_de_sentencia = 10, RULE_sentencia_while = 11, 
		RULE_sentencia_for = 12, RULE_bloque_for = 13, RULE_print = 14;
	public static final String[] ruleNames = {
		"program", "expr", "scan", "variable", "primitiva", "bloque", "sentencia", 
		"asignacion", "sentencia_if", "bloque_condicional", "bloque_de_sentencia", 
		"sentencia_while", "sentencia_for", "bloque_for", "print"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'lastorres'", "'rmx'", "'xipetiao'", "'malveke'", 
		null, null, null, "'kpaha'", "'wasa'", "'dimetu'", "'luv'", "'&&'", "'||'", 
		"'+'", "'/'", "'-'", "'*'", "'svenska'", "'engleska'", "'spanska'", "'('", 
		"')'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BEGIN", "END", "PRINT", "SCAN", "INT", "STRING", "FLOAT", 
		"IF", "ELSE", "WHILE", "FOR", "AND", "OR", "SUM", "DIV", "RES", "MUL", 
		"SQRT", "POW", "COS", "AP", "CP", "MENIG", "MAYIG", "MAY", "MEN", "IG", 
		"DIF", "AL", "CL", "NAME", "WS", "VARSTATMENT", "BLANCO"
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
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(BEGIN);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				sentencia();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VARSTATMENT))) != 0) );
			setState(36);
			match(END);
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

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode RES() { return getToken(ParserTParser.RES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VARSTATMENT() { return getToken(ParserTParser.VARSTATMENT, 0); }
		public TerminalNode MUL() { return getToken(ParserTParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ParserTParser.DIV, 0); }
		public TerminalNode SUM() { return getToken(ParserTParser.SUM, 0); }
		public TerminalNode MENIG() { return getToken(ParserTParser.MENIG, 0); }
		public TerminalNode MAYIG() { return getToken(ParserTParser.MAYIG, 0); }
		public TerminalNode MAY() { return getToken(ParserTParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(ParserTParser.MEN, 0); }
		public TerminalNode IG() { return getToken(ParserTParser.IG, 0); }
		public TerminalNode DIF() { return getToken(ParserTParser.DIF, 0); }
		public TerminalNode AND() { return getToken(ParserTParser.AND, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
				{
				setState(39);
				match(RES);
				setState(40);
				expr(7);
				}
				break;
			case VARSTATMENT:
				{
				setState(41);
				match(VARSTATMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(45);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(48);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==RES) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(50);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(51);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENIG) | (1L << MAYIG) | (1L << MAY) | (1L << MEN))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IG || _la==DIF) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(AND);
						setState(58);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ParserTParser.SCAN, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SCAN);
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARSTATMENT() { return getToken(ParserTParser.VARSTATMENT, 0); }
		public TerminalNode NAME() { return getToken(ParserTParser.NAME, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(VARSTATMENT);
			setState(68);
			match(NAME);
			setState(69);
			match(T__0);
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class PrimitivaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(ParserTParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(ParserTParser.CP, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrimitivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiva; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrimitiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivaContext primitiva() throws RecognitionException {
		PrimitivaContext _localctx = new PrimitivaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiva);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(AP);
				setState(73);
				expr(0);
				setState(74);
				match(CP);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case VARSTATMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				variable();
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

	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VARSTATMENT))) != 0)) {
				{
				{
				setState(80);
				sentencia();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_whileContext sentencia_while() {
			return getRuleContext(Sentencia_whileContext.class,0);
		}
		public Sentencia_forContext sentencia_for() {
			return getRuleContext(Sentencia_forContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARSTATMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				sentencia_if();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				sentencia_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				sentencia_for();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				print();
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

	public static class AsignacionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			variable();
			setState(94);
			expr(0);
			setState(95);
			match(T__1);
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

	public static class Sentencia_ifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(ParserTParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ParserTParser.IF, i);
		}
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(ParserTParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ParserTParser.ELSE, i);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IF);
			setState(98);
			bloque_condicional();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					match(ELSE);
					setState(100);
					match(IF);
					setState(101);
					bloque_condicional();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(107);
				match(ELSE);
				setState(108);
				bloque_de_sentencia();
				}
				break;
			}
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

	public static class Bloque_condicionalContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(ParserTParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(ParserTParser.CP, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloque_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(AP);
			setState(112);
			expr(0);
			setState(113);
			match(CP);
			setState(114);
			bloque_de_sentencia();
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

	public static class Bloque_de_sentenciaContext extends ParserRuleContext {
		public TerminalNode AL() { return getToken(ParserTParser.AL, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode CL() { return getToken(ParserTParser.CL, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Bloque_de_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_de_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloque_de_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_de_sentenciaContext bloque_de_sentencia() throws RecognitionException {
		Bloque_de_sentenciaContext _localctx = new Bloque_de_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque_de_sentencia);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AL:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(AL);
				setState(117);
				bloque();
				setState(118);
				match(CL);
				}
				break;
			case PRINT:
			case IF:
			case WHILE:
			case FOR:
			case VARSTATMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				sentencia();
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

	public static class Sentencia_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSentencia_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(WHILE);
			setState(124);
			expr(0);
			setState(125);
			bloque_de_sentencia();
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

	public static class Sentencia_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public Bloque_forContext bloque_for() {
			return getRuleContext(Bloque_forContext.class,0);
		}
		public Sentencia_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSentencia_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FOR);
			setState(128);
			bloque_for();
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

	public static class Bloque_forContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(ParserTParser.AP, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CP() { return getToken(ParserTParser.CP, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Bloque_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloque_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_forContext bloque_for() throws RecognitionException {
		Bloque_forContext _localctx = new Bloque_forContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloque_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(AP);
			setState(131);
			asignacion();
			setState(132);
			expr(0);
			setState(133);
			match(T__1);
			setState(134);
			expr(0);
			setState(135);
			match(CP);
			setState(136);
			bloque_de_sentencia();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PRINT);
			setState(139);
			expr(0);
			setState(140);
			match(T__1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\7\7T\n\7\f\7\16"+
		"\7W\13\7\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\2\3\4\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\b\4\2\23\23\25\25\4\2\22\22\24\24"+
		"\3\2\33\36\3\2\37 \3\2\t\13\4\2\t\t\13\13\2\u0092\2 \3\2\2\2\4,\3\2\2"+
		"\2\6B\3\2\2\2\bE\3\2\2\2\nP\3\2\2\2\fU\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2"+
		"\22c\3\2\2\2\24q\3\2\2\2\26{\3\2\2\2\30}\3\2\2\2\32\u0081\3\2\2\2\34\u0084"+
		"\3\2\2\2\36\u008c\3\2\2\2 \"\7\5\2\2!#\5\16\b\2\"!\3\2\2\2#$\3\2\2\2$"+
		"\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\6\2\2\'\3\3\2\2\2()\b\3\1\2)*\7\24"+
		"\2\2*-\5\4\3\t+-\7%\2\2,(\3\2\2\2,+\3\2\2\2-?\3\2\2\2./\f\b\2\2/\60\t"+
		"\2\2\2\60>\5\4\3\t\61\62\f\7\2\2\62\63\t\3\2\2\63>\5\4\3\b\64\65\f\6\2"+
		"\2\65\66\t\4\2\2\66>\5\4\3\7\678\f\5\2\289\t\5\2\29>\5\4\3\6:;\f\4\2\2"+
		";<\7\20\2\2<>\5\4\3\5=.\3\2\2\2=\61\3\2\2\2=\64\3\2\2\2=\67\3\2\2\2=:"+
		"\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\7\b\2\2"+
		"CD\t\6\2\2D\7\3\2\2\2EF\7%\2\2FG\7#\2\2GH\7\3\2\2HI\t\6\2\2I\t\3\2\2\2"+
		"JK\7\31\2\2KL\5\4\3\2LM\7\32\2\2MQ\3\2\2\2NQ\t\7\2\2OQ\5\b\5\2PJ\3\2\2"+
		"\2PN\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RT\5\16\b\2SR\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2X^\5\20\t\2Y^\5\22\n\2Z^\5\30\r\2"+
		"[^\5\32\16\2\\^\5\36\20\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3"+
		"\2\2\2^\17\3\2\2\2_`\5\b\5\2`a\5\4\3\2ab\7\4\2\2b\21\3\2\2\2cd\7\f\2\2"+
		"dj\5\24\13\2ef\7\r\2\2fg\7\f\2\2gi\5\24\13\2he\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2ko\3\2\2\2lj\3\2\2\2mn\7\r\2\2np\5\26\f\2om\3\2\2\2op\3"+
		"\2\2\2p\23\3\2\2\2qr\7\31\2\2rs\5\4\3\2st\7\32\2\2tu\5\26\f\2u\25\3\2"+
		"\2\2vw\7!\2\2wx\5\f\7\2xy\7\"\2\2y|\3\2\2\2z|\5\16\b\2{v\3\2\2\2{z\3\2"+
		"\2\2|\27\3\2\2\2}~\7\16\2\2~\177\5\4\3\2\177\u0080\5\26\f\2\u0080\31\3"+
		"\2\2\2\u0081\u0082\7\17\2\2\u0082\u0083\5\34\17\2\u0083\33\3\2\2\2\u0084"+
		"\u0085\7\31\2\2\u0085\u0086\5\20\t\2\u0086\u0087\5\4\3\2\u0087\u0088\7"+
		"\4\2\2\u0088\u0089\5\4\3\2\u0089\u008a\7\32\2\2\u008a\u008b\5\26\f\2\u008b"+
		"\35\3\2\2\2\u008c\u008d\7\7\2\2\u008d\u008e\5\4\3\2\u008e\u008f\7\4\2"+
		"\2\u008f\37\3\2\2\2\f$,=?PU]jo{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}