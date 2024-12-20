// Generated from c:/Users/simon/Documents/GitHub/SolidityProject/Solidity/Solidity.g4 by ANTLR 4.13.1

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, VersionLiteral=83, LiteralBooleano=84, NumeroDecimale=85, 
		NumeroEsadecimale=86, UnitaNumero=87, LiteralEsadecimale=88, ReservedKeyword=89, 
		AnonymousKeyword=90, BreakKeyword=91, ConstantKeyword=92, ContinueKeyword=93, 
		ExternalKeyword=94, IndexedKeyword=95, InternalKeyword=96, PayableKeyword=97, 
		PrivateKeyword=98, PublicKeyword=99, PureKeyword=100, TypeKeyword=101, 
		ViewKeyword=102, Int=103, Uint=104, Byte=105, Fixed=106, Ufixed=107, Identifier=108, 
		AND=109, OR=110, NOT=111, LiteralStringa=112, WS=113, COMMENTO=114, COMMENTO_LINEA=115;
	public static final int
		RULE_sourceUnit = 0, RULE_pragma = 1, RULE_nomePragma = 2, RULE_valorePragma = 3, 
		RULE_versione = 4, RULE_operatoreVersione = 5, RULE_vincoloVersione = 6, 
		RULE_dichiarazioneImport = 7, RULE_imports = 8, RULE_definizioneContratto = 9, 
		RULE_inheritanceSpecifier = 10, RULE_parteDiContratto = 11, RULE_assegnazioneVariabile = 12, 
		RULE_usingForDeclaration = 13, RULE_definizioneStruct = 14, RULE_definizioneCostruttore = 15, 
		RULE_definizioneModifier = 16, RULE_invocazioneModifier = 17, RULE_definizioneFunzione = 18, 
		RULE_definizioneErrore = 19, RULE_valoreRitorno = 20, RULE_listaModifier = 21, 
		RULE_definizioneEvento = 22, RULE_valoreEnum = 23, RULE_definizioneEnum = 24, 
		RULE_listaParametri = 25, RULE_parametro = 26, RULE_listaParametriEvent = 27, 
		RULE_parametriEvent = 28, RULE_listaParametriFunzione = 29, RULE_parametroFunzione = 30, 
		RULE_dichiarazioneVariabile = 31, RULE_nomeTipo = 32, RULE_tipiDefinitiUtente = 33, 
		RULE_mapping = 34, RULE_functionTypeName = 35, RULE_tipoStorage = 36, 
		RULE_stateMutability = 37, RULE_block = 38, RULE_statement = 39, RULE_expressionStatement = 40, 
		RULE_ifStatement = 41, RULE_whileStatement = 42, RULE_simpleStatement = 43, 
		RULE_forStatement = 44, RULE_doWhileStatement = 45, RULE_continueStatement = 46, 
		RULE_breakStatement = 47, RULE_returnStatement = 48, RULE_throwStatement = 49, 
		RULE_emitStatement = 50, RULE_tryCatchStatement = 51, RULE_listaCatch = 52, 
		RULE_dichiarazioneVariabileStatement = 53, RULE_listaDichiarazioneVariabili = 54, 
		RULE_listaIdentifier = 55, RULE_expression = 56, RULE_primaryExpression = 57, 
		RULE_listaExpression = 58, RULE_listaNameValue = 59, RULE_nameValue = 60, 
		RULE_argomentiChiamataFunzione = 61, RULE_chiamataFunzione = 62, RULE_tupleExpression = 63, 
		RULE_tipiExpression = 64, RULE_valoreNumerico = 65, RULE_identificatore = 66, 
		RULE_tipiPrimitivi = 67, RULE_array = 68, RULE_incremento = 69, RULE_decremento = 70, 
		RULE_operatoriSomma = 71, RULE_potenza = 72, RULE_operatoriMoltiplicazione = 73, 
		RULE_operatoriRelazionali = 74, RULE_operatoriConfrontoDiretto = 75, RULE_puntoVirgola = 76, 
		RULE_operatoriAssegnazione = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragma", "nomePragma", "valorePragma", "versione", "operatoreVersione", 
			"vincoloVersione", "dichiarazioneImport", "imports", "definizioneContratto", 
			"inheritanceSpecifier", "parteDiContratto", "assegnazioneVariabile", 
			"usingForDeclaration", "definizioneStruct", "definizioneCostruttore", 
			"definizioneModifier", "invocazioneModifier", "definizioneFunzione", 
			"definizioneErrore", "valoreRitorno", "listaModifier", "definizioneEvento", 
			"valoreEnum", "definizioneEnum", "listaParametri", "parametro", "listaParametriEvent", 
			"parametriEvent", "listaParametriFunzione", "parametroFunzione", "dichiarazioneVariabile", 
			"nomeTipo", "tipiDefinitiUtente", "mapping", "functionTypeName", "tipoStorage", 
			"stateMutability", "block", "statement", "expressionStatement", "ifStatement", 
			"whileStatement", "simpleStatement", "forStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "returnStatement", "throwStatement", 
			"emitStatement", "tryCatchStatement", "listaCatch", "dichiarazioneVariabileStatement", 
			"listaDichiarazioneVariabili", "listaIdentifier", "expression", "primaryExpression", 
			"listaExpression", "listaNameValue", "nameValue", "argomentiChiamataFunzione", 
			"chiamataFunzione", "tupleExpression", "tipiExpression", "valoreNumerico", 
			"identificatore", "tipiPrimitivi", "array", "incremento", "decremento", 
			"operatoriSomma", "potenza", "operatoriMoltiplicazione", "operatoriRelazionali", 
			"operatoriConfrontoDiretto", "puntoVirgola", "operatoriAssegnazione"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", "'='", 
			"'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", 
			"'interface'", "'library'", "'is'", "'('", "')'", "'using'", "'for'", 
			"'struct'", "'constructor'", "'modifier'", "'function'", "'error'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", 
			"'memory'", "'storage'", "'calldata'", "'if'", "'else'", "'while'", "'do'", 
			"'return'", "'throw'", "'emit'", "'try'", "'catch'", "'var'", "'new'", 
			"'after'", "'delete'", "'<<'", "'>>'", "'&'", "'|'", "'?'", "':'", "'bool'", 
			"'string'", "'byte'", "'++'", "'--'", "'+'", "'-'", "'**'", "'/'", "'%'", 
			"'=='", "'!='", "';'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", null, null, null, null, null, null, null, 
			"'anonymous'", "'break'", "'constant'", "'continue'", "'external'", "'indexed'", 
			"'internal'", "'payable'", "'private'", "'public'", "'pure'", "'type'", 
			"'view'", null, null, null, null, null, null, "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "VersionLiteral", 
			"LiteralBooleano", "NumeroDecimale", "NumeroEsadecimale", "UnitaNumero", 
			"LiteralEsadecimale", "ReservedKeyword", "AnonymousKeyword", "BreakKeyword", 
			"ConstantKeyword", "ContinueKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"PureKeyword", "TypeKeyword", "ViewKeyword", "Int", "Uint", "Byte", "Fixed", 
			"Ufixed", "Identifier", "AND", "OR", "NOT", "LiteralStringa", "WS", "COMMENTO", 
			"COMMENTO_LINEA"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<DefinizioneContrattoContext> definizioneContratto() {
			return getRuleContexts(DefinizioneContrattoContext.class);
		}
		public DefinizioneContrattoContext definizioneContratto(int i) {
			return getRuleContext(DefinizioneContrattoContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 459778L) != 0)) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(156);
					pragma();
					}
					break;
				case T__9:
					{
					setState(157);
					imports();
					}
					break;
				case T__15:
				case T__16:
				case T__17:
					{
					setState(158);
					definizioneContratto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaContext extends ParserRuleContext {
		public NomePragmaContext nomePragma() {
			return getRuleContext(NomePragmaContext.class,0);
		}
		public ValorePragmaContext valorePragma() {
			return getRuleContext(ValorePragmaContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragma(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__0);
			setState(167);
			nomePragma();
			setState(168);
			valorePragma();
			setState(169);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NomePragmaContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public NomePragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomePragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNomePragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNomePragma(this);
		}
	}

	public final NomePragmaContext nomePragma() throws RecognitionException {
		NomePragmaContext _localctx = new NomePragmaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nomePragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorePragmaContext extends ParserRuleContext {
		public VersioneContext versione() {
			return getRuleContext(VersioneContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValorePragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorePragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValorePragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValorePragma(this);
		}
	}

	public final ValorePragmaContext valorePragma() throws RecognitionException {
		ValorePragmaContext _localctx = new ValorePragmaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valorePragma);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				versione();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersioneContext extends ParserRuleContext {
		public List<VincoloVersioneContext> vincoloVersione() {
			return getRuleContexts(VincoloVersioneContext.class);
		}
		public VincoloVersioneContext vincoloVersione(int i) {
			return getRuleContext(VincoloVersioneContext.class,i);
		}
		public VersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersione(this);
		}
	}

	public final VersioneContext versione() throws RecognitionException {
		VersioneContext _localctx = new VersioneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_versione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			vincoloVersione();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 508L) != 0) || _la==VersionLiteral) {
				{
				setState(178);
				vincoloVersione();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoreVersioneContext extends ParserRuleContext {
		public OperatoreVersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoreVersione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoreVersione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoreVersione(this);
		}
	}

	public final OperatoreVersioneContext operatoreVersione() throws RecognitionException {
		OperatoreVersioneContext _localctx = new OperatoreVersioneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operatoreVersione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 508L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VincoloVersioneContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public OperatoreVersioneContext operatoreVersione() {
			return getRuleContext(OperatoreVersioneContext.class,0);
		}
		public VincoloVersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vincoloVersione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVincoloVersione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVincoloVersione(this);
		}
	}

	public final VincoloVersioneContext vincoloVersione() throws RecognitionException {
		VincoloVersioneContext _localctx = new VincoloVersioneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vincoloVersione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 508L) != 0)) {
				{
				setState(183);
				operatoreVersione();
				}
			}

			setState(186);
			match(VersionLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DichiarazioneImportContext extends ParserRuleContext {
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public DichiarazioneImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDichiarazioneImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDichiarazioneImport(this);
		}
	}

	public final DichiarazioneImportContext dichiarazioneImport() throws RecognitionException {
		DichiarazioneImportContext _localctx = new DichiarazioneImportContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dichiarazioneImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			identificatore();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(189);
				match(T__8);
				setState(190);
				identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode LiteralStringa() { return getToken(SolidityParser.LiteralStringa, 0); }
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public List<DichiarazioneImportContext> dichiarazioneImport() {
			return getRuleContexts(DichiarazioneImportContext.class);
		}
		public DichiarazioneImportContext dichiarazioneImport(int i) {
			return getRuleContext(DichiarazioneImportContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_imports);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__9);
				setState(194);
				match(LiteralStringa);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(195);
					match(T__8);
					setState(196);
					identificatore();
					}
				}

				setState(199);
				puntoVirgola();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__9);
				setState(203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(201);
					match(T__10);
					}
					break;
				case T__11:
				case T__39:
				case Identifier:
					{
					setState(202);
					identificatore();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(205);
					match(T__8);
					setState(206);
					identificatore();
					}
				}

				setState(209);
				match(T__11);
				setState(210);
				match(LiteralStringa);
				setState(211);
				puntoVirgola();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(T__9);
				setState(213);
				match(T__12);
				setState(214);
				dichiarazioneImport();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(215);
					match(T__13);
					setState(216);
					dichiarazioneImport();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(T__14);
				setState(223);
				match(T__11);
				setState(224);
				match(LiteralStringa);
				setState(225);
				puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneContrattoContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ParteDiContrattoContext> parteDiContratto() {
			return getRuleContexts(ParteDiContrattoContext.class);
		}
		public ParteDiContrattoContext parteDiContratto(int i) {
			return getRuleContext(ParteDiContrattoContext.class,i);
		}
		public DefinizioneContrattoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneContratto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneContratto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneContratto(this);
		}
	}

	public final DefinizioneContrattoContext definizioneContratto() throws RecognitionException {
		DefinizioneContrattoContext _localctx = new DefinizioneContrattoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definizioneContratto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(230);
			identificatore();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(231);
				match(T__18);
				setState(232);
				inheritanceSpecifier();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(233);
					match(T__13);
					setState(234);
					inheritanceSpecifier();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(242);
			match(T__12);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577621311262720L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
				{
				{
				setState(243);
				parteDiContratto();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			tipiDefinitiUtente();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(252);
				match(T__19);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
					{
					setState(253);
					listaExpression();
					}
				}

				setState(256);
				match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParteDiContrattoContext extends ParserRuleContext {
		public AssegnazioneVariabileContext assegnazioneVariabile() {
			return getRuleContext(AssegnazioneVariabileContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public DefinizioneStructContext definizioneStruct() {
			return getRuleContext(DefinizioneStructContext.class,0);
		}
		public DefinizioneCostruttoreContext definizioneCostruttore() {
			return getRuleContext(DefinizioneCostruttoreContext.class,0);
		}
		public DefinizioneModifierContext definizioneModifier() {
			return getRuleContext(DefinizioneModifierContext.class,0);
		}
		public DefinizioneFunzioneContext definizioneFunzione() {
			return getRuleContext(DefinizioneFunzioneContext.class,0);
		}
		public DefinizioneErroreContext definizioneErrore() {
			return getRuleContext(DefinizioneErroreContext.class,0);
		}
		public DefinizioneEventoContext definizioneEvento() {
			return getRuleContext(DefinizioneEventoContext.class,0);
		}
		public DefinizioneEnumContext definizioneEnum() {
			return getRuleContext(DefinizioneEnumContext.class,0);
		}
		public ParteDiContrattoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parteDiContratto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParteDiContratto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParteDiContratto(this);
		}
	}

	public final ParteDiContrattoContext parteDiContratto() throws RecognitionException {
		ParteDiContrattoContext _localctx = new ParteDiContrattoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parteDiContratto);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				assegnazioneVariabile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				definizioneStruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				definizioneCostruttore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				definizioneModifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				definizioneFunzione();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				definizioneErrore();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				definizioneEvento();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				definizioneEnum();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssegnazioneVariabileContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public AssegnazioneVariabileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assegnazioneVariabile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssegnazioneVariabile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssegnazioneVariabile(this);
		}
	}

	public final AssegnazioneVariabileContext assegnazioneVariabile() throws RecognitionException {
		AssegnazioneVariabileContext _localctx = new AssegnazioneVariabileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assegnazioneVariabile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			nomeTipo(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 209L) != 0)) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 209L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			identificatore();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(278);
				match(T__7);
				setState(279);
				expression(0);
				}
			}

			setState(282);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__21);
			setState(285);
			identificatore();
			setState(286);
			match(T__22);
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(287);
				match(T__10);
				}
				break;
			case T__11:
			case T__26:
			case T__33:
			case T__35:
			case T__39:
			case T__49:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(288);
				nomeTipo(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(291);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneStructContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<DichiarazioneVariabileContext> dichiarazioneVariabile() {
			return getRuleContexts(DichiarazioneVariabileContext.class);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile(int i) {
			return getRuleContext(DichiarazioneVariabileContext.class,i);
		}
		public List<PuntoVirgolaContext> puntoVirgola() {
			return getRuleContexts(PuntoVirgolaContext.class);
		}
		public PuntoVirgolaContext puntoVirgola(int i) {
			return getRuleContext(PuntoVirgolaContext.class,i);
		}
		public DefinizioneStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneStruct(this);
		}
	}

	public final DefinizioneStructContext definizioneStruct() throws RecognitionException {
		DefinizioneStructContext _localctx = new DefinizioneStructContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definizioneStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__23);
			setState(294);
			identificatore();
			setState(295);
			match(T__12);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577617699966976L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
				{
				setState(296);
				dichiarazioneVariabile();
				setState(297);
				puntoVirgola();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577617699966976L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
					{
					{
					setState(298);
					dichiarazioneVariabile();
					setState(299);
					puntoVirgola();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(308);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneCostruttoreContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ListaModifierContext listaModifier() {
			return getRuleContext(ListaModifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefinizioneCostruttoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneCostruttore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneCostruttore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneCostruttore(this);
		}
	}

	public final DefinizioneCostruttoreContext definizioneCostruttore() throws RecognitionException {
		DefinizioneCostruttoreContext _localctx = new DefinizioneCostruttoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_definizioneCostruttore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__24);
			setState(311);
			listaParametri();
			setState(312);
			listaModifier();
			setState(313);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneModifierContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public DefinizioneModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneModifier(this);
		}
	}

	public final DefinizioneModifierContext definizioneModifier() throws RecognitionException {
		DefinizioneModifierContext _localctx = new DefinizioneModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definizioneModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__25);
			setState(316);
			identificatore();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(317);
				listaParametri();
				}
			}

			setState(320);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InvocazioneModifierContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public InvocazioneModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocazioneModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInvocazioneModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInvocazioneModifier(this);
		}
	}

	public final InvocazioneModifierContext invocazioneModifier() throws RecognitionException {
		InvocazioneModifierContext _localctx = new InvocazioneModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_invocazioneModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			identificatore();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(323);
				match(T__19);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
					{
					setState(324);
					listaExpression();
					}
				}

				setState(327);
				match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneFunzioneContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ListaModifierContext listaModifier() {
			return getRuleContext(ListaModifierContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ValoreRitornoContext valoreRitorno() {
			return getRuleContext(ValoreRitornoContext.class,0);
		}
		public DefinizioneFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneFunzione(this);
		}
	}

	public final DefinizioneFunzioneContext definizioneFunzione() throws RecognitionException {
		DefinizioneFunzioneContext _localctx = new DefinizioneFunzioneContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definizioneFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__26);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(331);
				identificatore();
				}
			}

			setState(334);
			listaParametri();
			setState(335);
			listaModifier();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(336);
				valoreRitorno();
				}
			}

			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__71:
				{
				setState(339);
				puntoVirgola();
				}
				break;
			case T__12:
				{
				setState(340);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneErroreContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public DefinizioneErroreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneErrore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneErrore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneErrore(this);
		}
	}

	public final DefinizioneErroreContext definizioneErrore() throws RecognitionException {
		DefinizioneErroreContext _localctx = new DefinizioneErroreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definizioneErrore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__27);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(344);
				identificatore();
				}
			}

			setState(347);
			listaParametri();
			setState(348);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoreRitornoContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ValoreRitornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreRitorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValoreRitorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValoreRitorno(this);
		}
	}

	public final ValoreRitornoContext valoreRitorno() throws RecognitionException {
		ValoreRitornoContext _localctx = new ValoreRitornoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valoreRitorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__28);
			setState(351);
			listaParametri();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaModifierContext extends ParserRuleContext {
		public List<InvocazioneModifierContext> invocazioneModifier() {
			return getRuleContexts(InvocazioneModifierContext.class);
		}
		public InvocazioneModifierContext invocazioneModifier(int i) {
			return getRuleContext(InvocazioneModifierContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public ListaModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaModifier(this);
		}
	}

	public final ListaModifierContext listaModifier() throws RecognitionException {
		ListaModifierContext _localctx = new ListaModifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listaModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__39 || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 67061L) != 0)) {
				{
				setState(359);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__39:
				case Identifier:
					{
					setState(353);
					invocazioneModifier();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(354);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(355);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(356);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(357);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(358);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(363);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneEventoContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaParametriEventContext listaParametriEvent() {
			return getRuleContext(ListaParametriEventContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public DefinizioneEventoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneEvento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneEvento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneEvento(this);
		}
	}

	public final DefinizioneEventoContext definizioneEvento() throws RecognitionException {
		DefinizioneEventoContext _localctx = new DefinizioneEventoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_definizioneEvento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__29);
			setState(365);
			identificatore();
			setState(366);
			listaParametriEvent();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(367);
				match(AnonymousKeyword);
				}
			}

			setState(370);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoreEnumContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ValoreEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValoreEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValoreEnum(this);
		}
	}

	public final ValoreEnumContext valoreEnum() throws RecognitionException {
		ValoreEnumContext _localctx = new ValoreEnumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valoreEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneEnumContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<ValoreEnumContext> valoreEnum() {
			return getRuleContexts(ValoreEnumContext.class);
		}
		public ValoreEnumContext valoreEnum(int i) {
			return getRuleContext(ValoreEnumContext.class,i);
		}
		public DefinizioneEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneEnum(this);
		}
	}

	public final DefinizioneEnumContext definizioneEnum() throws RecognitionException {
		DefinizioneEnumContext _localctx = new DefinizioneEnumContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_definizioneEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__30);
			setState(375);
			identificatore();
			setState(376);
			match(T__12);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(377);
				valoreEnum();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(380);
				match(T__13);
				setState(381);
				valoreEnum();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametriContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ListaParametriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaParametri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaParametri(this);
		}
	}

	public final ListaParametriContext listaParametri() throws RecognitionException {
		ListaParametriContext _localctx = new ListaParametriContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listaParametri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__19);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577617699966976L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
				{
				setState(390);
				parametro();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(391);
					match(T__13);
					setState(392);
					parametro();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(400);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			nomeTipo(0);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(403);
				tipoStorage();
				}
				break;
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(406);
				identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametriEventContext extends ParserRuleContext {
		public List<ParametriEventContext> parametriEvent() {
			return getRuleContexts(ParametriEventContext.class);
		}
		public ParametriEventContext parametriEvent(int i) {
			return getRuleContext(ParametriEventContext.class,i);
		}
		public ListaParametriEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametriEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaParametriEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaParametriEvent(this);
		}
	}

	public final ListaParametriEventContext listaParametriEvent() throws RecognitionException {
		ListaParametriEventContext _localctx = new ListaParametriEventContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaParametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__19);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577617699966976L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
				{
				setState(410);
				parametriEvent();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(411);
					match(T__13);
					setState(412);
					parametriEvent();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(420);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametriEventContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ParametriEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametriEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParametriEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParametriEvent(this);
		}
	}

	public final ParametriEventContext parametriEvent() throws RecognitionException {
		ParametriEventContext _localctx = new ParametriEventContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			nomeTipo(0);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(423);
				match(IndexedKeyword);
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(426);
				identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametriFunzioneContext extends ParserRuleContext {
		public List<ParametroFunzioneContext> parametroFunzione() {
			return getRuleContexts(ParametroFunzioneContext.class);
		}
		public ParametroFunzioneContext parametroFunzione(int i) {
			return getRuleContext(ParametroFunzioneContext.class,i);
		}
		public ListaParametriFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametriFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaParametriFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaParametriFunzione(this);
		}
	}

	public final ListaParametriFunzioneContext listaParametriFunzione() throws RecognitionException {
		ListaParametriFunzioneContext _localctx = new ListaParametriFunzioneContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listaParametriFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__19);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577617699966976L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
				{
				setState(430);
				parametroFunzione();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(431);
					match(T__13);
					setState(432);
					parametroFunzione();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(440);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroFunzioneContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public ParametroFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParametroFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParametroFunzione(this);
		}
	}

	public final ParametroFunzioneContext parametroFunzione() throws RecognitionException {
		ParametroFunzioneContext _localctx = new ParametroFunzioneContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parametroFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			nomeTipo(0);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) {
				{
				setState(443);
				tipoStorage();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DichiarazioneVariabileContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public DichiarazioneVariabileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneVariabile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDichiarazioneVariabile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDichiarazioneVariabile(this);
		}
	}

	public final DichiarazioneVariabileContext dichiarazioneVariabile() throws RecognitionException {
		DichiarazioneVariabileContext _localctx = new DichiarazioneVariabileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dichiarazioneVariabile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			nomeTipo(0);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(447);
				tipoStorage();
				}
				break;
			}
			setState(450);
			identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NomeTipoContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NomeTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNomeTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNomeTipo(this);
		}
	}

	public final NomeTipoContext nomeTipo() throws RecognitionException {
		return nomeTipo(0);
	}

	private NomeTipoContext nomeTipo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NomeTipoContext _localctx = new NomeTipoContext(_ctx, _parentState);
		NomeTipoContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_nomeTipo, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(453);
				tipiPrimitivi();
				}
				break;
			case 2:
				{
				setState(454);
				tipiDefinitiUtente();
				}
				break;
			case 3:
				{
				setState(455);
				mapping();
				}
				break;
			case 4:
				{
				setState(456);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(457);
				match(T__33);
				setState(458);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NomeTipoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nomeTipo);
					setState(461);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(462);
					match(T__31);
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
						{
						setState(463);
						expression(0);
						}
					}

					setState(466);
					match(T__32);
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipiDefinitiUtenteContext extends ParserRuleContext {
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public TipiDefinitiUtenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiDefinitiUtente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipiDefinitiUtente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipiDefinitiUtente(this);
		}
	}

	public final TipiDefinitiUtenteContext tipiDefinitiUtente() throws RecognitionException {
		TipiDefinitiUtenteContext _localctx = new TipiDefinitiUtenteContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tipiDefinitiUtente);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			identificatore();
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(T__34);
					setState(474);
					identificatore();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MappingContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__35);
			setState(481);
			match(T__19);
			setState(482);
			tipiPrimitivi();
			setState(483);
			match(T__36);
			setState(484);
			nomeTipo(0);
			setState(485);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<ListaParametriFunzioneContext> listaParametriFunzione() {
			return getRuleContexts(ListaParametriFunzioneContext.class);
		}
		public ListaParametriFunzioneContext listaParametriFunzione(int i) {
			return getRuleContext(ListaParametriFunzioneContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__26);
			setState(488);
			listaParametriFunzione();
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(492);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(489);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(490);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(491);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(497);
				match(T__28);
				setState(498);
				listaParametriFunzione();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoStorageContext extends ParserRuleContext {
		public TipoStorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoStorage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipoStorage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipoStorage(this);
		}
	}

	public final TipoStorageContext tipoStorage() throws RecognitionException {
		TipoStorageContext _localctx = new TipoStorageContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tipoStorage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1313L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T__12);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1135756938247655416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456985215500295L) != 0)) {
				{
				{
				setState(506);
				statement();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				ifStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				whileStatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				forStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				block();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(520);
				breakStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 8);
				{
				setState(521);
				returnStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 9);
				{
				setState(522);
				throwStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(523);
				emitStatement();
				}
				break;
			case T__2:
			case T__11:
			case T__19:
			case T__26:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case NOT:
			case LiteralStringa:
				enterOuterAlt(_localctx, 11);
				{
				setState(524);
				simpleStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			expression(0);
			setState(528);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(T__40);
			setState(531);
			match(T__19);
			setState(532);
			expression(0);
			setState(533);
			match(T__20);
			setState(534);
			statement();
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(535);
				match(T__41);
				setState(536);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(T__42);
			setState(540);
			match(T__19);
			setState(541);
			expression(0);
			setState(542);
			match(T__20);
			setState(543);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public DichiarazioneVariabileStatementContext dichiarazioneVariabileStatement() {
			return getRuleContext(DichiarazioneVariabileStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(545);
				dichiarazioneVariabileStatement();
				}
				break;
			case 2:
				{
				setState(546);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<PuntoVirgolaContext> puntoVirgola() {
			return getRuleContexts(PuntoVirgolaContext.class);
		}
		public PuntoVirgolaContext puntoVirgola(int i) {
			return getRuleContext(PuntoVirgolaContext.class,i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(T__22);
			setState(550);
			match(T__19);
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__19:
			case T__26:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case NOT:
			case LiteralStringa:
				{
				setState(551);
				simpleStatement();
				}
				break;
			case T__71:
				{
				setState(552);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__19:
			case T__31:
			case T__33:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case NOT:
			case LiteralStringa:
				{
				setState(555);
				expressionStatement();
				}
				break;
			case T__71:
				{
				setState(556);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
				{
				setState(559);
				expression(0);
				}
			}

			setState(562);
			match(T__20);
			setState(563);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__43);
			setState(566);
			statement();
			setState(567);
			match(T__42);
			setState(568);
			match(T__19);
			setState(569);
			expression(0);
			setState(570);
			match(T__20);
			setState(571);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(ContinueKeyword);
			setState(574);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(BreakKeyword);
			setState(577);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__44);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
				{
				setState(580);
				expression(0);
				}
			}

			setState(583);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__45);
			setState(586);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmitStatementContext extends ParserRuleContext {
		public ChiamataFunzioneContext chiamataFunzione() {
			return getRuleContext(ChiamataFunzioneContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__46);
			setState(589);
			chiamataFunzione();
			setState(590);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ListaCatchContext listaCatch() {
			return getRuleContext(ListaCatchContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryCatchStatement(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tryCatchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__47);
			setState(593);
			expression(0);
			setState(594);
			statement();
			setState(595);
			listaCatch();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaCatchContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListaCatchContext listaCatch() {
			return getRuleContext(ListaCatchContext.class,0);
		}
		public ListaCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaCatch(this);
		}
	}

	public final ListaCatchContext listaCatch() throws RecognitionException {
		ListaCatchContext _localctx = new ListaCatchContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_listaCatch);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(T__48);
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(598);
					expression(0);
					}
					break;
				case 2:
					{
					setState(599);
					match(T__19);
					setState(600);
					expression(0);
					setState(601);
					match(T__20);
					}
					break;
				}
				setState(605);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(T__48);
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(608);
					expression(0);
					}
					break;
				case 2:
					{
					setState(609);
					match(T__19);
					setState(610);
					expression(0);
					setState(611);
					match(T__20);
					}
					break;
				}
				setState(615);
				statement();
				setState(616);
				listaCatch();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DichiarazioneVariabileStatementContext extends ParserRuleContext {
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ListaIdentifierContext listaIdentifier() {
			return getRuleContext(ListaIdentifierContext.class,0);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile() {
			return getRuleContext(DichiarazioneVariabileContext.class,0);
		}
		public ListaDichiarazioneVariabiliContext listaDichiarazioneVariabili() {
			return getRuleContext(ListaDichiarazioneVariabiliContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DichiarazioneVariabileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneVariabileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDichiarazioneVariabileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDichiarazioneVariabileStatement(this);
		}
	}

	public final DichiarazioneVariabileStatementContext dichiarazioneVariabileStatement() throws RecognitionException {
		DichiarazioneVariabileStatementContext _localctx = new DichiarazioneVariabileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_dichiarazioneVariabileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(620);
				match(T__49);
				setState(621);
				listaIdentifier();
				}
				break;
			case 2:
				{
				setState(622);
				dichiarazioneVariabile();
				}
				break;
			case 3:
				{
				setState(623);
				match(T__19);
				setState(624);
				listaDichiarazioneVariabili();
				setState(625);
				match(T__20);
				}
				break;
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(629);
				match(T__7);
				setState(630);
				expression(0);
				}
			}

			setState(633);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDichiarazioneVariabiliContext extends ParserRuleContext {
		public List<DichiarazioneVariabileContext> dichiarazioneVariabile() {
			return getRuleContexts(DichiarazioneVariabileContext.class);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile(int i) {
			return getRuleContext(DichiarazioneVariabileContext.class,i);
		}
		public ListaDichiarazioneVariabiliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDichiarazioneVariabili; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaDichiarazioneVariabili(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaDichiarazioneVariabili(this);
		}
	}

	public final ListaDichiarazioneVariabiliContext listaDichiarazioneVariabili() throws RecognitionException {
		ListaDichiarazioneVariabiliContext _localctx = new ListaDichiarazioneVariabiliContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_listaDichiarazioneVariabili);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577617699966976L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
				{
				setState(635);
				dichiarazioneVariabile();
				}
			}

			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(638);
				match(T__13);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071577617699966976L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) {
					{
					setState(639);
					dichiarazioneVariabile();
					}
				}

				}
				}
				setState(646);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdentifierContext extends ParserRuleContext {
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public ListaIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaIdentifier(this);
		}
	}

	public final ListaIdentifierContext listaIdentifier() throws RecognitionException {
		ListaIdentifierContext _localctx = new ListaIdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_listaIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__19);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11 || _la==T__39 || _la==Identifier) {
						{
						setState(648);
						identificatore();
						}
					}

					setState(651);
					match(T__13);
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(657);
				identificatore();
				}
			}

			setState(660);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public DecrementoContext decremento() {
			return getRuleContext(DecrementoContext.class,0);
		}
		public OperatoriSommaContext operatoriSomma() {
			return getRuleContext(OperatoriSommaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SolidityParser.NOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PotenzaContext potenza() {
			return getRuleContext(PotenzaContext.class,0);
		}
		public OperatoriMoltiplicazioneContext operatoriMoltiplicazione() {
			return getRuleContext(OperatoriMoltiplicazioneContext.class,0);
		}
		public OperatoriRelazionaliContext operatoriRelazionali() {
			return getRuleContext(OperatoriRelazionaliContext.class,0);
		}
		public OperatoriConfrontoDirettoContext operatoriConfrontoDiretto() {
			return getRuleContext(OperatoriConfrontoDirettoContext.class,0);
		}
		public TerminalNode AND() { return getToken(SolidityParser.AND, 0); }
		public TerminalNode OR() { return getToken(SolidityParser.OR, 0); }
		public OperatoriAssegnazioneContext operatoriAssegnazione() {
			return getRuleContext(OperatoriAssegnazioneContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(663);
				match(T__50);
				setState(664);
				nomeTipo(0);
				}
				break;
			case 2:
				{
				setState(665);
				match(T__19);
				setState(666);
				expression(0);
				setState(667);
				match(T__20);
				}
				break;
			case 3:
				{
				setState(671);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__62:
					{
					setState(669);
					incremento();
					}
					break;
				case T__63:
					{
					setState(670);
					decremento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(673);
				expression(19);
				}
				break;
			case 4:
				{
				{
				setState(675);
				operatoriSomma();
				}
				setState(676);
				expression(18);
				}
				break;
			case 5:
				{
				setState(678);
				_la = _input.LA(1);
				if ( !(_la==T__51 || _la==T__52) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(679);
				expression(17);
				}
				break;
			case 6:
				{
				setState(680);
				match(NOT);
				setState(681);
				expression(16);
				}
				break;
			case 7:
				{
				setState(682);
				match(T__2);
				setState(683);
				expression(15);
				}
				break;
			case 8:
				{
				setState(684);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(753);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(688);
						potenza();
						setState(689);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(692);
						operatoriMoltiplicazione();
						}
						setState(693);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(695);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						{
						setState(696);
						operatoriSomma();
						}
						setState(697);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(700);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(701);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(702);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(703);
						match(T__55);
						setState(704);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(706);
						match(T__1);
						setState(707);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(709);
						match(T__56);
						setState(710);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(712);
						operatoriRelazionali();
						}
						setState(713);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(715);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(716);
						operatoriConfrontoDiretto();
						}
						setState(717);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(720);
						match(AND);
						setState(721);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(723);
						match(OR);
						setState(724);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(726);
						match(T__57);
						setState(727);
						expression(0);
						setState(728);
						match(T__58);
						setState(729);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(731);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(732);
						operatoriAssegnazione();
						}
						setState(733);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(738);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__62:
							{
							setState(736);
							incremento();
							}
							break;
						case T__63:
							{
							setState(737);
							decremento();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(740);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(741);
						match(T__31);
						setState(742);
						expression(0);
						setState(743);
						match(T__32);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(746);
						match(T__19);
						setState(747);
						argomentiChiamataFunzione();
						setState(748);
						match(T__20);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(751);
						match(T__34);
						setState(752);
						identificatore();
						}
						break;
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode LiteralBooleano() { return getToken(SolidityParser.LiteralBooleano, 0); }
		public ValoreNumericoContext valoreNumerico() {
			return getRuleContext(ValoreNumericoContext.class,0);
		}
		public TerminalNode LiteralEsadecimale() { return getToken(SolidityParser.LiteralEsadecimale, 0); }
		public TerminalNode LiteralStringa() { return getToken(SolidityParser.LiteralStringa, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TipiExpressionContext tipiExpression() {
			return getRuleContext(TipiExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primaryExpression);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(LiteralBooleano);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				valoreNumerico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				match(LiteralEsadecimale);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				match(LiteralStringa);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(762);
				identificatore();
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(763);
					match(T__31);
					setState(764);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(767);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(768);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(769);
				tipiExpression();
				setState(772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(770);
					match(T__31);
					setState(771);
					match(T__32);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaExpression(this);
		}
	}

	public final ListaExpressionContext listaExpression() throws RecognitionException {
		ListaExpressionContext _localctx = new ListaExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_listaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			expression(0);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(777);
				match(T__13);
				setState(778);
				expression(0);
				}
				}
				setState(783);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaNameValueContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public ListaNameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaNameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaNameValue(this);
		}
	}

	public final ListaNameValueContext listaNameValue() throws RecognitionException {
		ListaNameValueContext _localctx = new ListaNameValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_listaNameValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			nameValue();
			setState(789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(785);
					match(T__13);
					setState(786);
					nameValue();
					}
					} 
				}
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(792);
				match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameValueContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			identificatore();
			setState(796);
			match(T__58);
			setState(797);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgomentiChiamataFunzioneContext extends ParserRuleContext {
		public ListaNameValueContext listaNameValue() {
			return getRuleContext(ListaNameValueContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argomentiChiamataFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArgomentiChiamataFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArgomentiChiamataFunzione(this);
		}
	}

	public final ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() throws RecognitionException {
		ArgomentiChiamataFunzioneContext _localctx = new ArgomentiChiamataFunzioneContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_argomentiChiamataFunzione);
		int _la;
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(T__12);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__39 || _la==Identifier) {
					{
					setState(800);
					listaNameValue();
					}
				}

				setState(803);
				match(T__14);
				}
				break;
			case T__2:
			case T__11:
			case T__19:
			case T__20:
			case T__31:
			case T__33:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case NOT:
			case LiteralStringa:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
					{
					setState(804);
					listaExpression();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ChiamataFunzioneContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
		}
		public ChiamataFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chiamataFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterChiamataFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitChiamataFunzione(this);
		}
	}

	public final ChiamataFunzioneContext chiamataFunzione() throws RecognitionException {
		ChiamataFunzioneContext _localctx = new ChiamataFunzioneContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_chiamataFunzione);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			expression(0);
			setState(810);
			match(T__19);
			setState(811);
			argomentiChiamataFunzione();
			setState(812);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tupleExpression);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(T__19);
				{
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
					{
					setState(815);
					expression(0);
					}
				}

				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(818);
					match(T__13);
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
						{
						setState(819);
						expression(0);
						}
					}

					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(827);
				match(T__20);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(T__31);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1136031885016690680L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 456984544411655L) != 0)) {
					{
					setState(829);
					expression(0);
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(830);
						match(T__13);
						setState(831);
						expression(0);
						}
						}
						setState(836);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(839);
				match(T__32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipiExpressionContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public TipiExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipiExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipiExpression(this);
		}
	}

	public final TipiExpressionContext tipiExpression() throws RecognitionException {
		TipiExpressionContext _localctx = new TipiExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tipiExpression);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__49:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				tipiPrimitivi();
				}
				break;
			case T__11:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				tipiDefinitiUtente();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoreNumericoContext extends ParserRuleContext {
		public TerminalNode NumeroDecimale() { return getToken(SolidityParser.NumeroDecimale, 0); }
		public TerminalNode NumeroEsadecimale() { return getToken(SolidityParser.NumeroEsadecimale, 0); }
		public TerminalNode UnitaNumero() { return getToken(SolidityParser.UnitaNumero, 0); }
		public ValoreNumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreNumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValoreNumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValoreNumerico(this);
		}
	}

	public final ValoreNumericoContext valoreNumerico() throws RecognitionException {
		ValoreNumericoContext _localctx = new ValoreNumericoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_valoreNumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(_la==NumeroDecimale || _la==NumeroEsadecimale) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(847);
				match(UnitaNumero);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificatoreContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentificatoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificatore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentificatore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentificatore(this);
		}
	}

	public final IdentificatoreContext identificatore() throws RecognitionException {
		IdentificatoreContext _localctx = new IdentificatoreContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_identificatore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__39 || _la==Identifier) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipiPrimitiviContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public TipiPrimitiviContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiPrimitivi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipiPrimitivi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipiPrimitivi(this);
		}
	}

	public final TipiPrimitiviContext tipiPrimitivi() throws RecognitionException {
		TipiPrimitiviContext _localctx = new TipiPrimitiviContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tipiPrimitivi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8071576449334640640L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 31L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			tipiPrimitivi();
			setState(855);
			match(T__31);
			setState(856);
			match(T__32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends ParserRuleContext {
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIncremento(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(T__62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementoContext extends ParserRuleContext {
		public DecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDecremento(this);
		}
	}

	public final DecrementoContext decremento() throws RecognitionException {
		DecrementoContext _localctx = new DecrementoContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(T__63);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriSommaContext extends ParserRuleContext {
		public OperatoriSommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriSomma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriSomma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriSomma(this);
		}
	}

	public final OperatoriSommaContext operatoriSomma() throws RecognitionException {
		OperatoriSommaContext _localctx = new OperatoriSommaContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_operatoriSomma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_la = _input.LA(1);
			if ( !(_la==T__64 || _la==T__65) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PotenzaContext extends ParserRuleContext {
		public PotenzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPotenza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPotenza(this);
		}
	}

	public final PotenzaContext potenza() throws RecognitionException {
		PotenzaContext _localctx = new PotenzaContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_potenza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriMoltiplicazioneContext extends ParserRuleContext {
		public OperatoriMoltiplicazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriMoltiplicazione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriMoltiplicazione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriMoltiplicazione(this);
		}
	}

	public final OperatoriMoltiplicazioneContext operatoriMoltiplicazione() throws RecognitionException {
		OperatoriMoltiplicazioneContext _localctx = new OperatoriMoltiplicazioneContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_operatoriMoltiplicazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 432345564227567617L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriRelazionaliContext extends ParserRuleContext {
		public OperatoriRelazionaliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriRelazionali; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriRelazionali(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriRelazionali(this);
		}
	}

	public final OperatoriRelazionaliContext operatoriRelazionali() throws RecognitionException {
		OperatoriRelazionaliContext _localctx = new OperatoriRelazionaliContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_operatoriRelazionali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriConfrontoDirettoContext extends ParserRuleContext {
		public OperatoriConfrontoDirettoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriConfrontoDiretto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriConfrontoDiretto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriConfrontoDiretto(this);
		}
	}

	public final OperatoriConfrontoDirettoContext operatoriConfrontoDiretto() throws RecognitionException {
		OperatoriConfrontoDirettoContext _localctx = new OperatoriConfrontoDirettoContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_operatoriConfrontoDiretto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__70) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PuntoVirgolaContext extends ParserRuleContext {
		public PuntoVirgolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntoVirgola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPuntoVirgola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPuntoVirgola(this);
		}
	}

	public final PuntoVirgolaContext puntoVirgola() throws RecognitionException {
		PuntoVirgolaContext _localctx = new PuntoVirgolaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_puntoVirgola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(T__71);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriAssegnazioneContext extends ParserRuleContext {
		public OperatoriAssegnazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriAssegnazione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriAssegnazione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriAssegnazione(this);
		}
	}

	public final OperatoriAssegnazioneContext operatoriAssegnazione() throws RecognitionException {
		OperatoriAssegnazioneContext _localctx = new OperatoriAssegnazioneContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_operatoriAssegnazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(_la==T__7 || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1023L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return nomeTipo_sempred((NomeTipoContext)_localctx, predIndex);
		case 56:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nomeTipo_sempred(NomeTipoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001s\u036d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u00a0\b\u0000\n\u0000\f\u0000\u00a3\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00b0\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00b4\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0003\u0006\u00b9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00c0\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00c6\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cc\b\b"+
		"\u0001\b\u0001\b\u0003\b\u00d0\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00da\b\b\n\b\f\b\u00dd\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e4\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ec\b\t\n\t\f\t\u00ef\t\t\u0003\t"+
		"\u00f1\b\t\u0001\t\u0001\t\u0005\t\u00f5\b\t\n\t\f\t\u00f8\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00ff\b\n\u0001\n\u0003\n\u0102"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u010d\b\u000b\u0001"+
		"\f\u0001\f\u0005\f\u0111\b\f\n\f\f\f\u0114\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0119\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0122\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u012e\b\u000e\n\u000e\f\u000e\u0131\t\u000e\u0003\u000e\u0133\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u013f\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0146\b\u0011\u0001\u0011\u0003\u0011\u0149\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u014d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0152\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0156\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u015a\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0168\b\u0015"+
		"\n\u0015\f\u0015\u016b\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0171\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u017b"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u017f\b\u0018\n\u0018\f\u0018"+
		"\u0182\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u018a\b\u0019\n\u0019\f\u0019\u018d\t\u0019\u0003"+
		"\u0019\u018f\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0195\b\u001a\u0001\u001a\u0003\u001a\u0198\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u019e\b\u001b\n\u001b"+
		"\f\u001b\u01a1\t\u001b\u0003\u001b\u01a3\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01a9\b\u001c\u0001\u001c\u0003\u001c"+
		"\u01ac\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01b2\b\u001d\n\u001d\f\u001d\u01b5\t\u001d\u0003\u001d\u01b7\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01bd\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01c1\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01cc\b \u0001"+
		" \u0001 \u0001 \u0003 \u01d1\b \u0001 \u0005 \u01d4\b \n \f \u01d7\t "+
		"\u0001!\u0001!\u0001!\u0005!\u01dc\b!\n!\f!\u01df\t!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0005#\u01ed\b#\n#\f#\u01f0\t#\u0001#\u0001#\u0003#\u01f4\b#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001&\u0001&\u0005&\u01fc\b&\n&\f&\u01ff\t&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u020e\b\'\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u021a\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0003+\u0224\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u022a\b,\u0001,\u0001,\u0003,\u022e\b,\u0001,\u0003,\u0231"+
		"\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u0003"+
		"0\u0246\b0\u00010\u00010\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00034\u025c\b4\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00034\u0266\b4\u00014\u00014\u00014\u00034\u026b\b4\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u0274\b5\u00015\u00015\u0003"+
		"5\u0278\b5\u00015\u00015\u00016\u00036\u027d\b6\u00016\u00016\u00036\u0281"+
		"\b6\u00056\u0283\b6\n6\f6\u0286\t6\u00017\u00017\u00037\u028a\b7\u0001"+
		"7\u00057\u028d\b7\n7\f7\u0290\t7\u00017\u00037\u0293\b7\u00017\u00017"+
		"\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u02a0\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u02ae\b8\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u02e3\b8\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00058\u02f2\b8\n8\f8\u02f5\t8\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00039\u02fe\b9\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u0305\b9\u00039\u0307\b9\u0001:\u0001:\u0001:\u0005:\u030c\b:\n:\f:"+
		"\u030f\t:\u0001;\u0001;\u0001;\u0005;\u0314\b;\n;\f;\u0317\t;\u0001;\u0003"+
		";\u031a\b;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0003=\u0322\b=\u0001"+
		"=\u0001=\u0003=\u0326\b=\u0003=\u0328\b=\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0003?\u0331\b?\u0001?\u0001?\u0003?\u0335\b?\u0005?\u0337"+
		"\b?\n?\f?\u033a\t?\u0001?\u0001?\u0001?\u0001?\u0001?\u0005?\u0341\b?"+
		"\n?\f?\u0344\t?\u0003?\u0346\b?\u0001?\u0003?\u0349\b?\u0001@\u0001@\u0003"+
		"@\u034d\b@\u0001A\u0001A\u0003A\u0351\bA\u0001B\u0001B\u0001C\u0001C\u0001"+
		"D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001"+
		"H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0000\u0002@pN\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u0000\u000f\u0001\u0000\u0002\b\u0001"+
		"\u0000\u0010\u0012\u0003\u0000\\\\``bc\u0001\u0000&(\u0004\u0000\\\\a"+
		"addff\u0001\u000045\u0001\u000067\u0001\u0000UV\u0003\u0000\f\f((ll\u0004"+
		"\u0000\"\"22<>gk\u0001\u0000AB\u0002\u0000\u000b\u000bDE\u0001\u0000\u0004"+
		"\u0007\u0001\u0000FG\u0002\u0000\b\bIR\u03b2\u0000\u00a1\u0001\u0000\u0000"+
		"\u0000\u0002\u00a6\u0001\u0000\u0000\u0000\u0004\u00ab\u0001\u0000\u0000"+
		"\u0000\u0006\u00af\u0001\u0000\u0000\u0000\b\u00b1\u0001\u0000\u0000\u0000"+
		"\n\u00b5\u0001\u0000\u0000\u0000\f\u00b8\u0001\u0000\u0000\u0000\u000e"+
		"\u00bc\u0001\u0000\u0000\u0000\u0010\u00e3\u0001\u0000\u0000\u0000\u0012"+
		"\u00e5\u0001\u0000\u0000\u0000\u0014\u00fb\u0001\u0000\u0000\u0000\u0016"+
		"\u010c\u0001\u0000\u0000\u0000\u0018\u010e\u0001\u0000\u0000\u0000\u001a"+
		"\u011c\u0001\u0000\u0000\u0000\u001c\u0125\u0001\u0000\u0000\u0000\u001e"+
		"\u0136\u0001\u0000\u0000\u0000 \u013b\u0001\u0000\u0000\u0000\"\u0142"+
		"\u0001\u0000\u0000\u0000$\u014a\u0001\u0000\u0000\u0000&\u0157\u0001\u0000"+
		"\u0000\u0000(\u015e\u0001\u0000\u0000\u0000*\u0169\u0001\u0000\u0000\u0000"+
		",\u016c\u0001\u0000\u0000\u0000.\u0174\u0001\u0000\u0000\u00000\u0176"+
		"\u0001\u0000\u0000\u00002\u0185\u0001\u0000\u0000\u00004\u0192\u0001\u0000"+
		"\u0000\u00006\u0199\u0001\u0000\u0000\u00008\u01a6\u0001\u0000\u0000\u0000"+
		":\u01ad\u0001\u0000\u0000\u0000<\u01ba\u0001\u0000\u0000\u0000>\u01be"+
		"\u0001\u0000\u0000\u0000@\u01cb\u0001\u0000\u0000\u0000B\u01d8\u0001\u0000"+
		"\u0000\u0000D\u01e0\u0001\u0000\u0000\u0000F\u01e7\u0001\u0000\u0000\u0000"+
		"H\u01f5\u0001\u0000\u0000\u0000J\u01f7\u0001\u0000\u0000\u0000L\u01f9"+
		"\u0001\u0000\u0000\u0000N\u020d\u0001\u0000\u0000\u0000P\u020f\u0001\u0000"+
		"\u0000\u0000R\u0212\u0001\u0000\u0000\u0000T\u021b\u0001\u0000\u0000\u0000"+
		"V\u0223\u0001\u0000\u0000\u0000X\u0225\u0001\u0000\u0000\u0000Z\u0235"+
		"\u0001\u0000\u0000\u0000\\\u023d\u0001\u0000\u0000\u0000^\u0240\u0001"+
		"\u0000\u0000\u0000`\u0243\u0001\u0000\u0000\u0000b\u0249\u0001\u0000\u0000"+
		"\u0000d\u024c\u0001\u0000\u0000\u0000f\u0250\u0001\u0000\u0000\u0000h"+
		"\u026a\u0001\u0000\u0000\u0000j\u0273\u0001\u0000\u0000\u0000l\u027c\u0001"+
		"\u0000\u0000\u0000n\u0287\u0001\u0000\u0000\u0000p\u02ad\u0001\u0000\u0000"+
		"\u0000r\u0306\u0001\u0000\u0000\u0000t\u0308\u0001\u0000\u0000\u0000v"+
		"\u0310\u0001\u0000\u0000\u0000x\u031b\u0001\u0000\u0000\u0000z\u0327\u0001"+
		"\u0000\u0000\u0000|\u0329\u0001\u0000\u0000\u0000~\u0348\u0001\u0000\u0000"+
		"\u0000\u0080\u034c\u0001\u0000\u0000\u0000\u0082\u034e\u0001\u0000\u0000"+
		"\u0000\u0084\u0352\u0001\u0000\u0000\u0000\u0086\u0354\u0001\u0000\u0000"+
		"\u0000\u0088\u0356\u0001\u0000\u0000\u0000\u008a\u035a\u0001\u0000\u0000"+
		"\u0000\u008c\u035c\u0001\u0000\u0000\u0000\u008e\u035e\u0001\u0000\u0000"+
		"\u0000\u0090\u0360\u0001\u0000\u0000\u0000\u0092\u0362\u0001\u0000\u0000"+
		"\u0000\u0094\u0364\u0001\u0000\u0000\u0000\u0096\u0366\u0001\u0000\u0000"+
		"\u0000\u0098\u0368\u0001\u0000\u0000\u0000\u009a\u036a\u0001\u0000\u0000"+
		"\u0000\u009c\u00a0\u0003\u0002\u0001\u0000\u009d\u00a0\u0003\u0010\b\u0000"+
		"\u009e\u00a0\u0003\u0012\t\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0000\u0000\u0001\u00a5"+
		"\u0001\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000\u0000\u00a7"+
		"\u00a8\u0003\u0004\u0002\u0000\u00a8\u00a9\u0003\u0006\u0003\u0000\u00a9"+
		"\u00aa\u0003\u0098L\u0000\u00aa\u0003\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0003\u0084B\u0000\u00ac\u0005\u0001\u0000\u0000\u0000\u00ad\u00b0\u0003"+
		"\b\u0004\u0000\u00ae\u00b0\u0003p8\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u0007\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0003\f\u0006\u0000\u00b2\u00b4\u0003\f\u0006\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\t\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000\u0000\u00b6"+
		"\u000b\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\n\u0005\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005S\u0000\u0000\u00bb\r\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bf\u0003\u0084B\u0000\u00bd\u00be\u0005\t"+
		"\u0000\u0000\u00be\u00c0\u0003\u0084B\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u000f\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\n\u0000\u0000\u00c2\u00c5\u0005p\u0000\u0000"+
		"\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u00c6\u0003\u0084B\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00e4\u0003\u0098L\u0000\u00c8\u00cb"+
		"\u0005\n\u0000\u0000\u00c9\u00cc\u0005\u000b\u0000\u0000\u00ca\u00cc\u0003"+
		"\u0084B\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\t\u0000"+
		"\u0000\u00ce\u00d0\u0003\u0084B\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\f\u0000\u0000\u00d2\u00d3\u0005p\u0000\u0000\u00d3"+
		"\u00e4\u0003\u0098L\u0000\u00d4\u00d5\u0005\n\u0000\u0000\u00d5\u00d6"+
		"\u0005\r\u0000\u0000\u00d6\u00db\u0003\u000e\u0007\u0000\u00d7\u00d8\u0005"+
		"\u000e\u0000\u0000\u00d8\u00da\u0003\u000e\u0007\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\u000f\u0000\u0000\u00df\u00e0\u0005\f\u0000\u0000\u00e0\u00e1\u0005p"+
		"\u0000\u0000\u00e1\u00e2\u0003\u0098L\u0000\u00e2\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e3\u00c1\u0001\u0000\u0000\u0000\u00e3\u00c8\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d4\u0001\u0000\u0000\u0000\u00e4\u0011\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0007\u0001\u0000\u0000\u00e6\u00f0\u0003\u0084B\u0000"+
		"\u00e7\u00e8\u0005\u0013\u0000\u0000\u00e8\u00ed\u0003\u0014\n\u0000\u00e9"+
		"\u00ea\u0005\u000e\u0000\u0000\u00ea\u00ec\u0003\u0014\n\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00e7"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f6\u0005\r\u0000\u0000\u00f3\u00f5\u0003"+
		"\u0016\u000b\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u000f\u0000\u0000\u00fa\u0013\u0001"+
		"\u0000\u0000\u0000\u00fb\u0101\u0003B!\u0000\u00fc\u00fe\u0005\u0014\u0000"+
		"\u0000\u00fd\u00ff\u0003t:\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0005\u0015\u0000\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0015\u0001\u0000\u0000\u0000\u0103"+
		"\u010d\u0003\u0018\f\u0000\u0104\u010d\u0003\u001a\r\u0000\u0105\u010d"+
		"\u0003\u001c\u000e\u0000\u0106\u010d\u0003\u001e\u000f\u0000\u0107\u010d"+
		"\u0003 \u0010\u0000\u0108\u010d\u0003$\u0012\u0000\u0109\u010d\u0003&"+
		"\u0013\u0000\u010a\u010d\u0003,\u0016\u0000\u010b\u010d\u00030\u0018\u0000"+
		"\u010c\u0103\u0001\u0000\u0000\u0000\u010c\u0104\u0001\u0000\u0000\u0000"+
		"\u010c\u0105\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000\u0000"+
		"\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000"+
		"\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0017\u0001\u0000\u0000\u0000"+
		"\u010e\u0112\u0003@ \u0000\u010f\u0111\u0007\u0002\u0000\u0000\u0110\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118"+
		"\u0003\u0084B\u0000\u0116\u0117\u0005\b\u0000\u0000\u0117\u0119\u0003"+
		"p8\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u0098L\u0000"+
		"\u011b\u0019\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0016\u0000\u0000"+
		"\u011d\u011e\u0003\u0084B\u0000\u011e\u0121\u0005\u0017\u0000\u0000\u011f"+
		"\u0122\u0005\u000b\u0000\u0000\u0120\u0122\u0003@ \u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0003\u0098L\u0000\u0124\u001b\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005\u0018\u0000\u0000\u0126\u0127\u0003\u0084"+
		"B\u0000\u0127\u0132\u0005\r\u0000\u0000\u0128\u0129\u0003>\u001f\u0000"+
		"\u0129\u012f\u0003\u0098L\u0000\u012a\u012b\u0003>\u001f\u0000\u012b\u012c"+
		"\u0003\u0098L\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012a\u0001"+
		"\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0133\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0128\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005\u000f\u0000\u0000\u0135\u001d\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005\u0019\u0000\u0000\u0137\u0138\u0003"+
		"2\u0019\u0000\u0138\u0139\u0003*\u0015\u0000\u0139\u013a\u0003L&\u0000"+
		"\u013a\u001f\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u001a\u0000\u0000"+
		"\u013c\u013e\u0003\u0084B\u0000\u013d\u013f\u00032\u0019\u0000\u013e\u013d"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0003L&\u0000\u0141!\u0001\u0000"+
		"\u0000\u0000\u0142\u0148\u0003\u0084B\u0000\u0143\u0145\u0005\u0014\u0000"+
		"\u0000\u0144\u0146\u0003t:\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0149\u0005\u0015\u0000\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149#\u0001\u0000\u0000\u0000\u014a\u014c"+
		"\u0005\u001b\u0000\u0000\u014b\u014d\u0003\u0084B\u0000\u014c\u014b\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u00032\u0019\u0000\u014f\u0151\u0003*\u0015"+
		"\u0000\u0150\u0152\u0003(\u0014\u0000\u0151\u0150\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000"+
		"\u0153\u0156\u0003\u0098L\u0000\u0154\u0156\u0003L&\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156%\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0005\u001c\u0000\u0000\u0158\u015a\u0003"+
		"\u0084B\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u00032\u0019"+
		"\u0000\u015c\u015d\u0003\u0098L\u0000\u015d\'\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0005\u001d\u0000\u0000\u015f\u0160\u00032\u0019\u0000\u0160"+
		")\u0001\u0000\u0000\u0000\u0161\u0168\u0003\"\u0011\u0000\u0162\u0168"+
		"\u0003J%\u0000\u0163\u0168\u0005^\u0000\u0000\u0164\u0168\u0005c\u0000"+
		"\u0000\u0165\u0168\u0005`\u0000\u0000\u0166\u0168\u0005b\u0000\u0000\u0167"+
		"\u0161\u0001\u0000\u0000\u0000\u0167\u0162\u0001\u0000\u0000\u0000\u0167"+
		"\u0163\u0001\u0000\u0000\u0000\u0167\u0164\u0001\u0000\u0000\u0000\u0167"+
		"\u0165\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a+\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u001e\u0000\u0000\u016d\u016e"+
		"\u0003\u0084B\u0000\u016e\u0170\u00036\u001b\u0000\u016f\u0171\u0005Z"+
		"\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0003\u0098"+
		"L\u0000\u0173-\u0001\u0000\u0000\u0000\u0174\u0175\u0003\u0084B\u0000"+
		"\u0175/\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u001f\u0000\u0000\u0177"+
		"\u0178\u0003\u0084B\u0000\u0178\u017a\u0005\r\u0000\u0000\u0179\u017b"+
		"\u0003.\u0017\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017b\u0180\u0001\u0000\u0000\u0000\u017c\u017d\u0005"+
		"\u000e\u0000\u0000\u017d\u017f\u0003.\u0017\u0000\u017e\u017c\u0001\u0000"+
		"\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u000f"+
		"\u0000\u0000\u01841\u0001\u0000\u0000\u0000\u0185\u018e\u0005\u0014\u0000"+
		"\u0000\u0186\u018b\u00034\u001a\u0000\u0187\u0188\u0005\u000e\u0000\u0000"+
		"\u0188\u018a\u00034\u001a\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a"+
		"\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018e\u0186\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005\u0015\u0000\u0000\u01913\u0001\u0000\u0000\u0000\u0192\u0194"+
		"\u0003@ \u0000\u0193\u0195\u0003H$\u0000\u0194\u0193\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000"+
		"\u0000\u0196\u0198\u0003\u0084B\u0000\u0197\u0196\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u01985\u0001\u0000\u0000\u0000\u0199"+
		"\u01a2\u0005\u0014\u0000\u0000\u019a\u019f\u00038\u001c\u0000\u019b\u019c"+
		"\u0005\u000e\u0000\u0000\u019c\u019e\u00038\u001c\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u019a\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0005\u0015\u0000\u0000\u01a57\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0003@ \u0000\u01a7\u01a9\u0005_\u0000\u0000"+
		"\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01ac\u0003\u0084B\u0000\u01ab"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"9\u0001\u0000\u0000\u0000\u01ad\u01b6\u0005\u0014\u0000\u0000\u01ae\u01b3"+
		"\u0003<\u001e\u0000\u01af\u01b0\u0005\u000e\u0000\u0000\u01b0\u01b2\u0003"+
		"<\u001e\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b6\u01ae\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u0015"+
		"\u0000\u0000\u01b9;\u0001\u0000\u0000\u0000\u01ba\u01bc\u0003@ \u0000"+
		"\u01bb\u01bd\u0003H$\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd=\u0001\u0000\u0000\u0000\u01be\u01c0\u0003"+
		"@ \u0000\u01bf\u01c1\u0003H$\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0003\u0084B\u0000\u01c3?\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0006 \uffff\uffff\u0000\u01c5\u01cc\u0003\u0086C\u0000\u01c6\u01cc\u0003"+
		"B!\u0000\u01c7\u01cc\u0003D\"\u0000\u01c8\u01cc\u0003F#\u0000\u01c9\u01ca"+
		"\u0005\"\u0000\u0000\u01ca\u01cc\u0005a\u0000\u0000\u01cb\u01c4\u0001"+
		"\u0000\u0000\u0000\u01cb\u01c6\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001"+
		"\u0000\u0000\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cc\u01d5\u0001\u0000\u0000\u0000\u01cd\u01ce\n\u0003"+
		"\u0000\u0000\u01ce\u01d0\u0005 \u0000\u0000\u01cf\u01d1\u0003p8\u0000"+
		"\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0005!\u0000\u0000\u01d3"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"A\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01dd"+
		"\u0003\u0084B\u0000\u01d9\u01da\u0005#\u0000\u0000\u01da\u01dc\u0003\u0084"+
		"B\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000"+
		"\u0000\u01deC\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0005$\u0000\u0000\u01e1\u01e2\u0005\u0014\u0000\u0000\u01e2"+
		"\u01e3\u0003\u0086C\u0000\u01e3\u01e4\u0005%\u0000\u0000\u01e4\u01e5\u0003"+
		"@ \u0000\u01e5\u01e6\u0005\u0015\u0000\u0000\u01e6E\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0005\u001b\u0000\u0000\u01e8\u01ee\u0003:\u001d\u0000"+
		"\u01e9\u01ed\u0005`\u0000\u0000\u01ea\u01ed\u0005^\u0000\u0000\u01eb\u01ed"+
		"\u0003J%\u0000\u01ec\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f3\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0005\u001d\u0000\u0000\u01f2\u01f4\u0003:\u001d"+
		"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f4G\u0001\u0000\u0000\u0000\u01f5\u01f6\u0007\u0003\u0000\u0000"+
		"\u01f6I\u0001\u0000\u0000\u0000\u01f7\u01f8\u0007\u0004\u0000\u0000\u01f8"+
		"K\u0001\u0000\u0000\u0000\u01f9\u01fd\u0005\r\u0000\u0000\u01fa\u01fc"+
		"\u0003N\'\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0005\u000f\u0000\u0000\u0201M\u0001\u0000"+
		"\u0000\u0000\u0202\u020e\u0003R)\u0000\u0203\u020e\u0003T*\u0000\u0204"+
		"\u020e\u0003X,\u0000\u0205\u020e\u0003L&\u0000\u0206\u020e\u0003Z-\u0000"+
		"\u0207\u020e\u0003\\.\u0000\u0208\u020e\u0003^/\u0000\u0209\u020e\u0003"+
		"`0\u0000\u020a\u020e\u0003b1\u0000\u020b\u020e\u0003d2\u0000\u020c\u020e"+
		"\u0003V+\u0000\u020d\u0202\u0001\u0000\u0000\u0000\u020d\u0203\u0001\u0000"+
		"\u0000\u0000\u020d\u0204\u0001\u0000\u0000\u0000\u020d\u0205\u0001\u0000"+
		"\u0000\u0000\u020d\u0206\u0001\u0000\u0000\u0000\u020d\u0207\u0001\u0000"+
		"\u0000\u0000\u020d\u0208\u0001\u0000\u0000\u0000\u020d\u0209\u0001\u0000"+
		"\u0000\u0000\u020d\u020a\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000"+
		"\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020eO\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0003p8\u0000\u0210\u0211\u0003\u0098L\u0000\u0211"+
		"Q\u0001\u0000\u0000\u0000\u0212\u0213\u0005)\u0000\u0000\u0213\u0214\u0005"+
		"\u0014\u0000\u0000\u0214\u0215\u0003p8\u0000\u0215\u0216\u0005\u0015\u0000"+
		"\u0000\u0216\u0219\u0003N\'\u0000\u0217\u0218\u0005*\u0000\u0000\u0218"+
		"\u021a\u0003N\'\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0001\u0000\u0000\u0000\u021aS\u0001\u0000\u0000\u0000\u021b\u021c\u0005"+
		"+\u0000\u0000\u021c\u021d\u0005\u0014\u0000\u0000\u021d\u021e\u0003p8"+
		"\u0000\u021e\u021f\u0005\u0015\u0000\u0000\u021f\u0220\u0003N\'\u0000"+
		"\u0220U\u0001\u0000\u0000\u0000\u0221\u0224\u0003j5\u0000\u0222\u0224"+
		"\u0003P(\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0222\u0001\u0000"+
		"\u0000\u0000\u0224W\u0001\u0000\u0000\u0000\u0225\u0226\u0005\u0017\u0000"+
		"\u0000\u0226\u0229\u0005\u0014\u0000\u0000\u0227\u022a\u0003V+\u0000\u0228"+
		"\u022a\u0003\u0098L\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228"+
		"\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u022e"+
		"\u0003P(\u0000\u022c\u022e\u0003\u0098L\u0000\u022d\u022b\u0001\u0000"+
		"\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e\u0230\u0001\u0000"+
		"\u0000\u0000\u022f\u0231\u0003p8\u0000\u0230\u022f\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0005\u0015\u0000\u0000\u0233\u0234\u0003N\'\u0000\u0234"+
		"Y\u0001\u0000\u0000\u0000\u0235\u0236\u0005,\u0000\u0000\u0236\u0237\u0003"+
		"N\'\u0000\u0237\u0238\u0005+\u0000\u0000\u0238\u0239\u0005\u0014\u0000"+
		"\u0000\u0239\u023a\u0003p8\u0000\u023a\u023b\u0005\u0015\u0000\u0000\u023b"+
		"\u023c\u0003\u0098L\u0000\u023c[\u0001\u0000\u0000\u0000\u023d\u023e\u0005"+
		"]\u0000\u0000\u023e\u023f\u0003\u0098L\u0000\u023f]\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u0005[\u0000\u0000\u0241\u0242\u0003\u0098L\u0000\u0242"+
		"_\u0001\u0000\u0000\u0000\u0243\u0245\u0005-\u0000\u0000\u0244\u0246\u0003"+
		"p8\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0003\u0098L\u0000"+
		"\u0248a\u0001\u0000\u0000\u0000\u0249\u024a\u0005.\u0000\u0000\u024a\u024b"+
		"\u0003\u0098L\u0000\u024bc\u0001\u0000\u0000\u0000\u024c\u024d\u0005/"+
		"\u0000\u0000\u024d\u024e\u0003|>\u0000\u024e\u024f\u0003\u0098L\u0000"+
		"\u024fe\u0001\u0000\u0000\u0000\u0250\u0251\u00050\u0000\u0000\u0251\u0252"+
		"\u0003p8\u0000\u0252\u0253\u0003N\'\u0000\u0253\u0254\u0003h4\u0000\u0254"+
		"g\u0001\u0000\u0000\u0000\u0255\u025b\u00051\u0000\u0000\u0256\u025c\u0003"+
		"p8\u0000\u0257\u0258\u0005\u0014\u0000\u0000\u0258\u0259\u0003p8\u0000"+
		"\u0259\u025a\u0005\u0015\u0000\u0000\u025a\u025c\u0001\u0000\u0000\u0000"+
		"\u025b\u0256\u0001\u0000\u0000\u0000\u025b\u0257\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0003N\'\u0000\u025e"+
		"\u026b\u0001\u0000\u0000\u0000\u025f\u0265\u00051\u0000\u0000\u0260\u0266"+
		"\u0003p8\u0000\u0261\u0262\u0005\u0014\u0000\u0000\u0262\u0263\u0003p"+
		"8\u0000\u0263\u0264\u0005\u0015\u0000\u0000\u0264\u0266\u0001\u0000\u0000"+
		"\u0000\u0265\u0260\u0001\u0000\u0000\u0000\u0265\u0261\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0003N\'\u0000"+
		"\u0268\u0269\u0003h4\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u0255"+
		"\u0001\u0000\u0000\u0000\u026a\u025f\u0001\u0000\u0000\u0000\u026bi\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u00052\u0000\u0000\u026d\u0274\u0003n7"+
		"\u0000\u026e\u0274\u0003>\u001f\u0000\u026f\u0270\u0005\u0014\u0000\u0000"+
		"\u0270\u0271\u0003l6\u0000\u0271\u0272\u0005\u0015\u0000\u0000\u0272\u0274"+
		"\u0001\u0000\u0000\u0000\u0273\u026c\u0001\u0000\u0000\u0000\u0273\u026e"+
		"\u0001\u0000\u0000\u0000\u0273\u026f\u0001\u0000\u0000\u0000\u0274\u0277"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0005\b\u0000\u0000\u0276\u0278\u0003"+
		"p8\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0003\u0098L\u0000"+
		"\u027ak\u0001\u0000\u0000\u0000\u027b\u027d\u0003>\u001f\u0000\u027c\u027b"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u0284"+
		"\u0001\u0000\u0000\u0000\u027e\u0280\u0005\u000e\u0000\u0000\u027f\u0281"+
		"\u0003>\u001f\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u027e\u0001"+
		"\u0000\u0000\u0000\u0283\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285m\u0001\u0000"+
		"\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0287\u028e\u0005\u0014"+
		"\u0000\u0000\u0288\u028a\u0003\u0084B\u0000\u0289\u0288\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028b\u028d\u0005\u000e\u0000\u0000\u028c\u0289\u0001\u0000\u0000"+
		"\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0293\u0003\u0084B\u0000"+
		"\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0005\u0015\u0000\u0000"+
		"\u0295o\u0001\u0000\u0000\u0000\u0296\u0297\u00068\uffff\uffff\u0000\u0297"+
		"\u0298\u00053\u0000\u0000\u0298\u02ae\u0003@ \u0000\u0299\u029a\u0005"+
		"\u0014\u0000\u0000\u029a\u029b\u0003p8\u0000\u029b\u029c\u0005\u0015\u0000"+
		"\u0000\u029c\u02ae\u0001\u0000\u0000\u0000\u029d\u02a0\u0003\u008aE\u0000"+
		"\u029e\u02a0\u0003\u008cF\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f"+
		"\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0003p8\u0013\u02a2\u02ae\u0001\u0000\u0000\u0000\u02a3\u02a4\u0003"+
		"\u008eG\u0000\u02a4\u02a5\u0003p8\u0012\u02a5\u02ae\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0007\u0005\u0000\u0000\u02a7\u02ae\u0003p8\u0011\u02a8"+
		"\u02a9\u0005o\u0000\u0000\u02a9\u02ae\u0003p8\u0010\u02aa\u02ab\u0005"+
		"\u0003\u0000\u0000\u02ab\u02ae\u0003p8\u000f\u02ac\u02ae\u0003r9\u0000"+
		"\u02ad\u0296\u0001\u0000\u0000\u0000\u02ad\u0299\u0001\u0000\u0000\u0000"+
		"\u02ad\u029f\u0001\u0000\u0000\u0000\u02ad\u02a3\u0001\u0000\u0000\u0000"+
		"\u02ad\u02a6\u0001\u0000\u0000\u0000\u02ad\u02a8\u0001\u0000\u0000\u0000"+
		"\u02ad\u02aa\u0001\u0000\u0000\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000"+
		"\u02ae\u02f3\u0001\u0000\u0000\u0000\u02af\u02b0\n\u000e\u0000\u0000\u02b0"+
		"\u02b1\u0003\u0090H\u0000\u02b1\u02b2\u0003p8\u000f\u02b2\u02f2\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\n\r\u0000\u0000\u02b4\u02b5\u0003\u0092"+
		"I\u0000\u02b5\u02b6\u0003p8\u000e\u02b6\u02f2\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b8\n\f\u0000\u0000\u02b8\u02b9\u0003\u008eG\u0000\u02b9\u02ba"+
		"\u0003p8\r\u02ba\u02f2\u0001\u0000\u0000\u0000\u02bb\u02bc\n\u000b\u0000"+
		"\u0000\u02bc\u02bd\u0007\u0006\u0000\u0000\u02bd\u02f2\u0003p8\f\u02be"+
		"\u02bf\n\n\u0000\u0000\u02bf\u02c0\u00058\u0000\u0000\u02c0\u02f2\u0003"+
		"p8\u000b\u02c1\u02c2\n\t\u0000\u0000\u02c2\u02c3\u0005\u0002\u0000\u0000"+
		"\u02c3\u02f2\u0003p8\n\u02c4\u02c5\n\b\u0000\u0000\u02c5\u02c6\u00059"+
		"\u0000\u0000\u02c6\u02f2\u0003p8\t\u02c7\u02c8\n\u0007\u0000\u0000\u02c8"+
		"\u02c9\u0003\u0094J\u0000\u02c9\u02ca\u0003p8\b\u02ca\u02f2\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\n\u0006\u0000\u0000\u02cc\u02cd\u0003\u0096K"+
		"\u0000\u02cd\u02ce\u0003p8\u0007\u02ce\u02f2\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\n\u0005\u0000\u0000\u02d0\u02d1\u0005m\u0000\u0000\u02d1\u02f2"+
		"\u0003p8\u0006\u02d2\u02d3\n\u0004\u0000\u0000\u02d3\u02d4\u0005n\u0000"+
		"\u0000\u02d4\u02f2\u0003p8\u0005\u02d5\u02d6\n\u0003\u0000\u0000\u02d6"+
		"\u02d7\u0005:\u0000\u0000\u02d7\u02d8\u0003p8\u0000\u02d8\u02d9\u0005"+
		";\u0000\u0000\u02d9\u02da\u0003p8\u0004\u02da\u02f2\u0001\u0000\u0000"+
		"\u0000\u02db\u02dc\n\u0002\u0000\u0000\u02dc\u02dd\u0003\u009aM\u0000"+
		"\u02dd\u02de\u0003p8\u0003\u02de\u02f2\u0001\u0000\u0000\u0000\u02df\u02e2"+
		"\n\u0019\u0000\u0000\u02e0\u02e3\u0003\u008aE\u0000\u02e1\u02e3\u0003"+
		"\u008cF\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e3\u02f2\u0001\u0000\u0000\u0000\u02e4\u02e5\n\u0017\u0000"+
		"\u0000\u02e5\u02e6\u0005 \u0000\u0000\u02e6\u02e7\u0003p8\u0000\u02e7"+
		"\u02e8\u0005!\u0000\u0000\u02e8\u02f2\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\n\u0016\u0000\u0000\u02ea\u02eb\u0005\u0014\u0000\u0000\u02eb\u02ec\u0003"+
		"z=\u0000\u02ec\u02ed\u0005\u0015\u0000\u0000\u02ed\u02f2\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\n\u0015\u0000\u0000\u02ef\u02f0\u0005#\u0000\u0000"+
		"\u02f0\u02f2\u0003\u0084B\u0000\u02f1\u02af\u0001\u0000\u0000\u0000\u02f1"+
		"\u02b3\u0001\u0000\u0000\u0000\u02f1\u02b7\u0001\u0000\u0000\u0000\u02f1"+
		"\u02bb\u0001\u0000\u0000\u0000\u02f1\u02be\u0001\u0000\u0000\u0000\u02f1"+
		"\u02c1\u0001\u0000\u0000\u0000\u02f1\u02c4\u0001\u0000\u0000\u0000\u02f1"+
		"\u02c7\u0001\u0000\u0000\u0000\u02f1\u02cb\u0001\u0000\u0000\u0000\u02f1"+
		"\u02cf\u0001\u0000\u0000\u0000\u02f1\u02d2\u0001\u0000\u0000\u0000\u02f1"+
		"\u02d5\u0001\u0000\u0000\u0000\u02f1\u02db\u0001\u0000\u0000\u0000\u02f1"+
		"\u02df\u0001\u0000\u0000\u0000\u02f1\u02e4\u0001\u0000\u0000\u0000\u02f1"+
		"\u02e9\u0001\u0000\u0000\u0000\u02f1\u02ee\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f4q\u0001\u0000\u0000\u0000\u02f5\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f6\u0307\u0005T\u0000\u0000\u02f7\u0307\u0003"+
		"\u0082A\u0000\u02f8\u0307\u0005X\u0000\u0000\u02f9\u0307\u0005p\u0000"+
		"\u0000\u02fa\u02fd\u0003\u0084B\u0000\u02fb\u02fc\u0005 \u0000\u0000\u02fc"+
		"\u02fe\u0005!\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u0307\u0001\u0000\u0000\u0000\u02ff\u0307"+
		"\u0005e\u0000\u0000\u0300\u0307\u0003~?\u0000\u0301\u0304\u0003\u0080"+
		"@\u0000\u0302\u0303\u0005 \u0000\u0000\u0303\u0305\u0005!\u0000\u0000"+
		"\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000"+
		"\u0305\u0307\u0001\u0000\u0000\u0000\u0306\u02f6\u0001\u0000\u0000\u0000"+
		"\u0306\u02f7\u0001\u0000\u0000\u0000\u0306\u02f8\u0001\u0000\u0000\u0000"+
		"\u0306\u02f9\u0001\u0000\u0000\u0000\u0306\u02fa\u0001\u0000\u0000\u0000"+
		"\u0306\u02ff\u0001\u0000\u0000\u0000\u0306\u0300\u0001\u0000\u0000\u0000"+
		"\u0306\u0301\u0001\u0000\u0000\u0000\u0307s\u0001\u0000\u0000\u0000\u0308"+
		"\u030d\u0003p8\u0000\u0309\u030a\u0005\u000e\u0000\u0000\u030a\u030c\u0003"+
		"p8\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000\u0000"+
		"\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000"+
		"\u0000\u030eu\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000"+
		"\u0310\u0315\u0003x<\u0000\u0311\u0312\u0005\u000e\u0000\u0000\u0312\u0314"+
		"\u0003x<\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000"+
		"\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000"+
		"\u0000\u0000\u0316\u0319\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000"+
		"\u0000\u0000\u0318\u031a\u0005\u000e\u0000\u0000\u0319\u0318\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031aw\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0003\u0084B\u0000\u031c\u031d\u0005;\u0000\u0000\u031d"+
		"\u031e\u0003p8\u0000\u031ey\u0001\u0000\u0000\u0000\u031f\u0321\u0005"+
		"\r\u0000\u0000\u0320\u0322\u0003v;\u0000\u0321\u0320\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000"+
		"\u0000\u0323\u0328\u0005\u000f\u0000\u0000\u0324\u0326\u0003t:\u0000\u0325"+
		"\u0324\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326"+
		"\u0328\u0001\u0000\u0000\u0000\u0327\u031f\u0001\u0000\u0000\u0000\u0327"+
		"\u0325\u0001\u0000\u0000\u0000\u0328{\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0003p8\u0000\u032a\u032b\u0005\u0014\u0000\u0000\u032b\u032c\u0003z"+
		"=\u0000\u032c\u032d\u0005\u0015\u0000\u0000\u032d}\u0001\u0000\u0000\u0000"+
		"\u032e\u0330\u0005\u0014\u0000\u0000\u032f\u0331\u0003p8\u0000\u0330\u032f"+
		"\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0338"+
		"\u0001\u0000\u0000\u0000\u0332\u0334\u0005\u000e\u0000\u0000\u0333\u0335"+
		"\u0003p8\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336\u0332\u0001\u0000"+
		"\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033b\u0001\u0000"+
		"\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u0349\u0005\u0015"+
		"\u0000\u0000\u033c\u0345\u0005 \u0000\u0000\u033d\u0342\u0003p8\u0000"+
		"\u033e\u033f\u0005\u000e\u0000\u0000\u033f\u0341\u0003p8\u0000\u0340\u033e"+
		"\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342\u0340"+
		"\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0346"+
		"\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u033d"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0001\u0000\u0000\u0000\u0347\u0349\u0005!\u0000\u0000\u0348\u032e\u0001"+
		"\u0000\u0000\u0000\u0348\u033c\u0001\u0000\u0000\u0000\u0349\u007f\u0001"+
		"\u0000\u0000\u0000\u034a\u034d\u0003\u0086C\u0000\u034b\u034d\u0003B!"+
		"\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034b\u0001\u0000\u0000"+
		"\u0000\u034d\u0081\u0001\u0000\u0000\u0000\u034e\u0350\u0007\u0007\u0000"+
		"\u0000\u034f\u0351\u0005W\u0000\u0000\u0350\u034f\u0001\u0000\u0000\u0000"+
		"\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0083\u0001\u0000\u0000\u0000"+
		"\u0352\u0353\u0007\b\u0000\u0000\u0353\u0085\u0001\u0000\u0000\u0000\u0354"+
		"\u0355\u0007\t\u0000\u0000\u0355\u0087\u0001\u0000\u0000\u0000\u0356\u0357"+
		"\u0003\u0086C\u0000\u0357\u0358\u0005 \u0000\u0000\u0358\u0359\u0005!"+
		"\u0000\u0000\u0359\u0089\u0001\u0000\u0000\u0000\u035a\u035b\u0005?\u0000"+
		"\u0000\u035b\u008b\u0001\u0000\u0000\u0000\u035c\u035d\u0005@\u0000\u0000"+
		"\u035d\u008d\u0001\u0000\u0000\u0000\u035e\u035f\u0007\n\u0000\u0000\u035f"+
		"\u008f\u0001\u0000\u0000\u0000\u0360\u0361\u0005C\u0000\u0000\u0361\u0091"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0007\u000b\u0000\u0000\u0363\u0093"+
		"\u0001\u0000\u0000\u0000\u0364\u0365\u0007\f\u0000\u0000\u0365\u0095\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0007\r\u0000\u0000\u0367\u0097\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0005H\u0000\u0000\u0369\u0099\u0001\u0000\u0000"+
		"\u0000\u036a\u036b\u0007\u000e\u0000\u0000\u036b\u009b\u0001\u0000\u0000"+
		"\u0000^\u009f\u00a1\u00af\u00b3\u00b8\u00bf\u00c5\u00cb\u00cf\u00db\u00e3"+
		"\u00ed\u00f0\u00f6\u00fe\u0101\u010c\u0112\u0118\u0121\u012f\u0132\u013e"+
		"\u0145\u0148\u014c\u0151\u0155\u0159\u0167\u0169\u0170\u017a\u0180\u018b"+
		"\u018e\u0194\u0197\u019f\u01a2\u01a8\u01ab\u01b3\u01b6\u01bc\u01c0\u01cb"+
		"\u01d0\u01d5\u01dd\u01ec\u01ee\u01f3\u01fd\u020d\u0219\u0223\u0229\u022d"+
		"\u0230\u0245\u025b\u0265\u026a\u0273\u0277\u027c\u0280\u0284\u0289\u028e"+
		"\u0292\u029f\u02ad\u02e2\u02f1\u02f3\u02fd\u0304\u0306\u030d\u0315\u0319"+
		"\u0321\u0325\u0327\u0330\u0334\u0338\u0342\u0345\u0348\u034c\u0350";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}