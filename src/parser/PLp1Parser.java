// Generated from src/parser/PLp1.g4 by ANTLR 4.7.2

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLp1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, IF=2, THEN=3, ELSE=4, ENDIF=5, LAMBDA=6, LET=7, SWITCH=8, 
		CASE=9, DEFAULT=10, TRUE=11, FALSE=12, NULL=13, INVOKE=14, EQ=15, NE=16, 
		LE=17, GE=18, MULT=19, DIV=20, ADD=21, SUB=22, LT=23, GT=24, NOT=25, OR=26, 
		AND=27, ASSIGN=28, LP=29, RP=30, LB=31, RB=32, LK=33, RK=34, COMMA=35, 
		COLON=36, ID=37, INTNUM=38, FLOATNUM=39, STRING=40, NEWLINE=41, WS=42;
	public static final int
		RULE_program = 0, RULE_element = 1, RULE_function = 2, RULE_paramList = 3, 
		RULE_expressionList = 4, RULE_expression = 5, RULE_varRef = 6, RULE_constantExp = 7, 
		RULE_listExp = 8, RULE_ifExpr = 9, RULE_lambdaExp = 10, RULE_assignment = 11, 
		RULE_letExp = 12, RULE_letDecls = 13, RULE_letDecl = 14, RULE_switchExp = 15, 
		RULE_switchCases = 16, RULE_switchCase = 17, RULE_defaultCase = 18, RULE_argumentList = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "element", "function", "paramList", "expressionList", "expression", 
			"varRef", "constantExp", "listExp", "ifExpr", "lambdaExp", "assignment", 
			"letExp", "letDecls", "letDecl", "switchExp", "switchCases", "switchCase", 
			"defaultCase", "argumentList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'if'", "'then'", "'else'", "'endif'", "'lambda'", 
			"'let'", "'switch'", "'case'", "'default'", "'true'", "'false'", "'null'", 
			"'->'", "'=='", "'!='", "'<='", "'>='", "'*'", "'/'", "'+'", "'-'", "'<'", 
			"'>'", "'!'", "'|'", "'&'", "'='", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "IF", "THEN", "ELSE", "ENDIF", "LAMBDA", "LET", "SWITCH", 
			"CASE", "DEFAULT", "TRUE", "FALSE", "NULL", "INVOKE", "EQ", "NE", "LE", 
			"GE", "MULT", "DIV", "ADD", "SUB", "LT", "GT", "NOT", "OR", "AND", "ASSIGN", 
			"LP", "RP", "LB", "RB", "LK", "RK", "COMMA", "COLON", "ID", "INTNUM", 
			"FLOATNUM", "STRING", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "PLp1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLp1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitProgram(this);
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				element();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << SWITCH) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << LP) | (1L << LK) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0) );
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

	public static class ElementContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				function();
				}
				break;
			case IF:
			case LAMBDA:
			case LET:
			case SWITCH:
			case TRUE:
			case FALSE:
			case NULL:
			case NOT:
			case LP:
			case LK:
			case ID:
			case INTNUM:
			case FLOATNUM:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				expression(0);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PLp1Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FUNCTION);
			setState(50);
			match(ID);
			setState(51);
			match(LP);
			setState(52);
			paramList();
			setState(53);
			match(RP);
			setState(54);
			match(LB);
			setState(55);
			expressionList();
			setState(56);
			match(RB);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PLp1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLp1Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(58);
				match(ID);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(59);
					match(COMMA);
					setState(60);
					match(ID);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				expression(0);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << SWITCH) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << LP) | (1L << LK) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0) );
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PLp1Parser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public ConstantExpContext constantExp() {
			return getRuleContext(ConstantExpContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public LambdaExpContext lambdaExp() {
			return getRuleContext(LambdaExpContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SwitchExpContext switchExp() {
			return getRuleContext(SwitchExpContext.class,0);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode MULT() { return getToken(PLp1Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PLp1Parser.DIV, 0); }
		public TerminalNode ADD() { return getToken(PLp1Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PLp1Parser.SUB, 0); }
		public TerminalNode EQ() { return getToken(PLp1Parser.EQ, 0); }
		public TerminalNode NE() { return getToken(PLp1Parser.NE, 0); }
		public TerminalNode LT() { return getToken(PLp1Parser.LT, 0); }
		public TerminalNode LE() { return getToken(PLp1Parser.LE, 0); }
		public TerminalNode GT() { return getToken(PLp1Parser.GT, 0); }
		public TerminalNode GE() { return getToken(PLp1Parser.GE, 0); }
		public TerminalNode OR() { return getToken(PLp1Parser.OR, 0); }
		public TerminalNode AND() { return getToken(PLp1Parser.AND, 0); }
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(74);
				match(NOT);
				setState(75);
				expression(10);
				}
				break;
			case 2:
				{
				setState(76);
				varRef();
				}
				break;
			case 3:
				{
				setState(77);
				constantExp();
				}
				break;
			case 4:
				{
				setState(78);
				ifExpr();
				}
				break;
			case 5:
				{
				setState(79);
				lambdaExp();
				}
				break;
			case 6:
				{
				setState(80);
				assignment();
				}
				break;
			case 7:
				{
				setState(81);
				switchExp();
				}
				break;
			case 8:
				{
				setState(82);
				letExp();
				}
				break;
			case 9:
				{
				setState(83);
				match(LP);
				setState(84);
				expression(0);
				setState(85);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(90);
						match(MULT);
						setState(91);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(93);
						match(DIV);
						setState(94);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(96);
						match(ADD);
						setState(97);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(99);
						match(SUB);
						setState(100);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(102);
						match(EQ);
						setState(103);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(105);
						match(NE);
						setState(106);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(108);
						match(LT);
						setState(109);
						expression(17);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(111);
						match(LE);
						setState(112);
						expression(16);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(114);
						match(GT);
						setState(115);
						expression(15);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(117);
						match(GE);
						setState(118);
						expression(14);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(120);
						match(OR);
						setState(121);
						expression(13);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(123);
						match(AND);
						setState(124);
						expression(12);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(126);
						match(INVOKE);
						setState(127);
						match(LP);
						setState(128);
						argumentList();
						setState(129);
						match(RP);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
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

	public static class ConstantExpContext extends ParserRuleContext {
		public TerminalNode INTNUM() { return getToken(PLp1Parser.INTNUM, 0); }
		public TerminalNode FLOATNUM() { return getToken(PLp1Parser.FLOATNUM, 0); }
		public ListExpContext listExp() {
			return getRuleContext(ListExpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PLp1Parser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(PLp1Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PLp1Parser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(PLp1Parser.NULL, 0); }
		public ConstantExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitConstantExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpContext constantExp() throws RecognitionException {
		ConstantExpContext _localctx = new ConstantExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantExp);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(INTNUM);
				}
				break;
			case FLOATNUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(FLOATNUM);
				}
				break;
			case LK:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				listExp();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				match(NULL);
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

	public static class ListExpContext extends ParserRuleContext {
		public TerminalNode LK() { return getToken(PLp1Parser.LK, 0); }
		public TerminalNode RK() { return getToken(PLp1Parser.RK, 0); }
		public List<ConstantExpContext> constantExp() {
			return getRuleContexts(ConstantExpContext.class);
		}
		public ConstantExpContext constantExp(int i) {
			return getRuleContext(ConstantExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public ListExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitListExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpContext listExp() throws RecognitionException {
		ListExpContext _localctx = new ListExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LK);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LK) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0)) {
				{
				setState(148);
				constantExp();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					constantExp();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(158);
			match(RK);
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PLp1Parser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(PLp1Parser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(PLp1Parser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(PLp1Parser.ENDIF, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			expression(0);
			setState(162);
			match(THEN);
			setState(163);
			expression(0);
			setState(164);
			match(ELSE);
			setState(165);
			expression(0);
			setState(166);
			match(ENDIF);
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

	public static class LambdaExpContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PLp1Parser.LAMBDA, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public LambdaExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLambdaExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpContext lambdaExp() throws RecognitionException {
		LambdaExpContext _localctx = new LambdaExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lambdaExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LAMBDA);
			setState(169);
			match(LP);
			setState(170);
			paramList();
			setState(171);
			match(RP);
			setState(172);
			match(LB);
			setState(173);
			expressionList();
			setState(174);
			match(RB);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PLp1Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(ASSIGN);
			setState(178);
			expression(0);
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

	public static class LetExpContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(PLp1Parser.LET, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public LetDeclsContext letDecls() {
			return getRuleContext(LetDeclsContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public LetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetExpContext letExp() throws RecognitionException {
		LetExpContext _localctx = new LetExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LET);
			setState(181);
			match(LP);
			setState(182);
			letDecls();
			setState(183);
			match(RP);
			setState(184);
			match(LB);
			setState(185);
			expressionList();
			setState(186);
			match(RB);
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

	public static class LetDeclsContext extends ParserRuleContext {
		public List<LetDeclContext> letDecl() {
			return getRuleContexts(LetDeclContext.class);
		}
		public LetDeclContext letDecl(int i) {
			return getRuleContext(LetDeclContext.class,i);
		}
		public LetDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclsContext letDecls() throws RecognitionException {
		LetDeclsContext _localctx = new LetDeclsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_letDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LK) {
				{
				{
				setState(188);
				letDecl();
				}
				}
				setState(193);
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

	public static class LetDeclContext extends ParserRuleContext {
		public TerminalNode LK() { return getToken(PLp1Parser.LK, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RK() { return getToken(PLp1Parser.RK, 0); }
		public LetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclContext letDecl() throws RecognitionException {
		LetDeclContext _localctx = new LetDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_letDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LK);
			setState(195);
			match(ID);
			setState(196);
			expression(0);
			setState(197);
			match(RK);
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

	public static class SwitchExpContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(PLp1Parser.SWITCH, 0); }
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public SwitchExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExpContext switchExp() throws RecognitionException {
		SwitchExpContext _localctx = new SwitchExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switchExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SWITCH);
			setState(200);
			match(LB);
			setState(201);
			switchCases();
			setState(202);
			defaultCase();
			setState(203);
			match(RB);
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

	public static class SwitchCasesContext extends ParserRuleContext {
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(205);
				switchCase();
				}
				}
				setState(210);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PLp1Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PLp1Parser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CASE);
			setState(212);
			expression(0);
			setState(213);
			match(COLON);
			setState(214);
			expressionList();
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

	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(PLp1Parser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(PLp1Parser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DEFAULT);
			setState(217);
			match(COLON);
			setState(218);
			expressionList();
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << SWITCH) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << LP) | (1L << LK) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0)) {
				{
				setState(220);
				expression(0);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221);
					match(COMMA);
					setState(222);
					expression(0);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\5\3\62\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C"+
		"\13\5\5\5E\n\5\3\6\6\6H\n\6\r\6\16\6I\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0086"+
		"\n\7\f\7\16\7\u0089\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094"+
		"\n\t\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\5\n\u009f\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\7\17\u00c0\n\17\f\17\16\17\u00c3\13\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00e2"+
		"\n\25\f\25\16\25\u00e5\13\25\5\25\u00e7\n\25\3\25\2\3\f\26\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u00fa\2+\3\2\2\2\4\61\3\2\2\2"+
		"\6\63\3\2\2\2\bD\3\2\2\2\nG\3\2\2\2\fY\3\2\2\2\16\u008a\3\2\2\2\20\u0093"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u00a2\3\2\2\2\26\u00aa\3\2\2\2\30\u00b2\3"+
		"\2\2\2\32\u00b6\3\2\2\2\34\u00c1\3\2\2\2\36\u00c4\3\2\2\2 \u00c9\3\2\2"+
		"\2\"\u00d2\3\2\2\2$\u00d5\3\2\2\2&\u00da\3\2\2\2(\u00e6\3\2\2\2*,\5\4"+
		"\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\62\5\6\4\2\60"+
		"\62\5\f\7\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\3\2\2\64\65"+
		"\7\'\2\2\65\66\7\37\2\2\66\67\5\b\5\2\678\7 \2\289\7!\2\29:\5\n\6\2:;"+
		"\7\"\2\2;\7\3\2\2\2<A\7\'\2\2=>\7%\2\2>@\7\'\2\2?=\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2D<\3\2\2\2DE\3\2\2\2E\t\3\2\2\2"+
		"FH\5\f\7\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KL\b\7\1"+
		"\2LM\7\33\2\2MZ\5\f\7\fNZ\5\16\b\2OZ\5\20\t\2PZ\5\24\13\2QZ\5\26\f\2R"+
		"Z\5\30\r\2SZ\5 \21\2TZ\5\32\16\2UV\7\37\2\2VW\5\f\7\2WX\7 \2\2XZ\3\2\2"+
		"\2YK\3\2\2\2YN\3\2\2\2YO\3\2\2\2YP\3\2\2\2YQ\3\2\2\2YR\3\2\2\2YS\3\2\2"+
		"\2YT\3\2\2\2YU\3\2\2\2Z\u0087\3\2\2\2[\\\f\30\2\2\\]\7\25\2\2]\u0086\5"+
		"\f\7\31^_\f\27\2\2_`\7\26\2\2`\u0086\5\f\7\30ab\f\26\2\2bc\7\27\2\2c\u0086"+
		"\5\f\7\27de\f\25\2\2ef\7\30\2\2f\u0086\5\f\7\26gh\f\24\2\2hi\7\21\2\2"+
		"i\u0086\5\f\7\25jk\f\23\2\2kl\7\22\2\2l\u0086\5\f\7\24mn\f\22\2\2no\7"+
		"\31\2\2o\u0086\5\f\7\23pq\f\21\2\2qr\7\23\2\2r\u0086\5\f\7\22st\f\20\2"+
		"\2tu\7\32\2\2u\u0086\5\f\7\21vw\f\17\2\2wx\7\24\2\2x\u0086\5\f\7\20yz"+
		"\f\16\2\2z{\7\34\2\2{\u0086\5\f\7\17|}\f\r\2\2}~\7\35\2\2~\u0086\5\f\7"+
		"\16\177\u0080\f\3\2\2\u0080\u0081\7\20\2\2\u0081\u0082\7\37\2\2\u0082"+
		"\u0083\5(\25\2\u0083\u0084\7 \2\2\u0084\u0086\3\2\2\2\u0085[\3\2\2\2\u0085"+
		"^\3\2\2\2\u0085a\3\2\2\2\u0085d\3\2\2\2\u0085g\3\2\2\2\u0085j\3\2\2\2"+
		"\u0085m\3\2\2\2\u0085p\3\2\2\2\u0085s\3\2\2\2\u0085v\3\2\2\2\u0085y\3"+
		"\2\2\2\u0085|\3\2\2\2\u0085\177\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\r\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7\'\2\2\u008b\17\3\2\2\2\u008c\u0094\7(\2\2\u008d\u0094\7)\2\2"+
		"\u008e\u0094\5\22\n\2\u008f\u0094\7*\2\2\u0090\u0094\7\r\2\2\u0091\u0094"+
		"\7\16\2\2\u0092\u0094\7\17\2\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2\2\2"+
		"\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094\21\3\2\2\2\u0095\u009e\7#\2\2\u0096"+
		"\u009b\5\20\t\2\u0097\u0098\7%\2\2\u0098\u009a\5\20\t\2\u0099\u0097\3"+
		"\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1\23\3\2\2\2\u00a2\u00a3"+
		"\7\4\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\5\f\7\2\u00a6"+
		"\u00a7\7\6\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7\7\2\2\u00a9\25\3\2\2"+
		"\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\5\b\5\2\u00ad"+
		"\u00ae\7 \2\2\u00ae\u00af\7!\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\7\"\2"+
		"\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\'\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b5"+
		"\5\f\7\2\u00b5\31\3\2\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7\37\2\2\u00b8"+
		"\u00b9\5\34\17\2\u00b9\u00ba\7 \2\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\5\n"+
		"\6\2\u00bc\u00bd\7\"\2\2\u00bd\33\3\2\2\2\u00be\u00c0\5\36\20\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\35\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6"+
		"\7\'\2\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\7$\2\2\u00c8\37\3\2\2\2\u00c9"+
		"\u00ca\7\n\2\2\u00ca\u00cb\7!\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd\5&"+
		"\24\2\u00cd\u00ce\7\"\2\2\u00ce!\3\2\2\2\u00cf\u00d1\5$\23\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"#\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\5\f\7\2"+
		"\u00d7\u00d8\7&\2\2\u00d8\u00d9\5\n\6\2\u00d9%\3\2\2\2\u00da\u00db\7\f"+
		"\2\2\u00db\u00dc\7&\2\2\u00dc\u00dd\5\n\6\2\u00dd\'\3\2\2\2\u00de\u00e3"+
		"\5\f\7\2\u00df\u00e0\7%\2\2\u00e0\u00e2\5\f\7\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		")\3\2\2\2\21-\61ADIY\u0085\u0087\u0093\u009b\u009e\u00c1\u00d2\u00e3\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}