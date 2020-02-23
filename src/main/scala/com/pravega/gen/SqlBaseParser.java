// Generated from /home/ranganaths/IdeaProjects/PravegaSQL/src/main/scala/com/pravega/antlr/SqlBase.g4 by ANTLR 4.8
package com.pravega.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, EMIT=8, CHANGES=9, 
		SELECT=10, FROM=11, AS=12, ALL=13, DISTINCT=14, WHERE=15, WITHIN=16, WINDOW=17, 
		GROUP=18, BY=19, HAVING=20, LIMIT=21, AT=22, OR=23, AND=24, IN=25, NOT=26, 
		EXISTS=27, BETWEEN=28, LIKE=29, IS=30, NULL=31, TRUE=32, FALSE=33, INTEGER=34, 
		DATE=35, TIME=36, TIMESTAMP=37, INTERVAL=38, YEAR=39, MONTH=40, DAY=41, 
		HOUR=42, MINUTE=43, SECOND=44, MILLISECOND=45, YEARS=46, MONTHS=47, DAYS=48, 
		HOURS=49, MINUTES=50, SECONDS=51, MILLISECONDS=52, ZONE=53, TUMBLING=54, 
		HOPPING=55, SIZE=56, ADVANCE=57, CASE=58, WHEN=59, THEN=60, ELSE=61, END=62, 
		JOIN=63, FULL=64, OUTER=65, INNER=66, LEFT=67, RIGHT=68, ON=69, PARTITION=70, 
		STRUCT=71, WITH=72, VALUES=73, CREATE=74, TABLE=75, TOPIC=76, STREAM=77, 
		STREAMS=78, INSERT=79, DELETE=80, INTO=81, DESCRIBE=82, EXTENDED=83, PRINT=84, 
		EXPLAIN=85, ANALYZE=86, TYPE=87, TYPES=88, CAST=89, SHOW=90, LIST=91, 
		TABLES=92, TOPICS=93, QUERY=94, QUERIES=95, TERMINATE=96, LOAD=97, COLUMNS=98, 
		COLUMN=99, PARTITIONS=100, FUNCTIONS=101, FUNCTION=102, DROP=103, TO=104, 
		RENAME=105, ARRAY=106, MAP=107, SET=108, RESET=109, SESSION=110, SAMPLE=111, 
		EXPORT=112, CATALOG=113, PROPERTIES=114, BEGINNING=115, UNSET=116, RUN=117, 
		SCRIPT=118, DECIMAL=119, KEY=120, CONNECTOR=121, CONNECTORS=122, SINK=123, 
		SOURCE=124, NAMESPACE=125, MATERIALIZED=126, VIEW=127, PRIMARY=128, IF=129, 
		EQ=130, NEQ=131, LT=132, LTE=133, GT=134, GTE=135, PLUS=136, MINUS=137, 
		ASTERISK=138, SLASH=139, PERCENT=140, CONCAT=141, ASSIGN=142, STRUCT_FIELD_REF=143, 
		STRING=144, INTEGER_VALUE=145, DECIMAL_VALUE=146, FLOATING_POINT_VALUE=147, 
		IDENTIFIER=148, DIGIT_IDENTIFIER=149, QUOTED_IDENTIFIER=150, BACKQUOTED_IDENTIFIER=151, 
		TIME_WITH_TIME_ZONE=152, TIMESTAMP_WITH_TIME_ZONE=153, SIMPLE_COMMENT=154, 
		BRACKETED_COMMENT=155, WS=156, UNRECOGNIZED=157, DELIMITER=158;
	public static final int
		RULE_statements = 0, RULE_singleStatement = 1, RULE_singleExpression = 2, 
		RULE_statement = 3, RULE_query = 4, RULE_resultMaterialization = 5, RULE_tableElements = 6, 
		RULE_tableElement = 7, RULE_tableProperties = 8, RULE_tableProperty = 9, 
		RULE_printClause = 10, RULE_intervalClause = 11, RULE_limitClause = 12, 
		RULE_windowExpression = 13, RULE_tumblingWindowExpression = 14, RULE_hoppingWindowExpression = 15, 
		RULE_sessionWindowExpression = 16, RULE_windowUnit = 17, RULE_groupBy = 18, 
		RULE_groupingElement = 19, RULE_groupingExpressions = 20, RULE_values = 21, 
		RULE_selectItem = 22, RULE_relation = 23, RULE_joinType = 24, RULE_joinWindow = 25, 
		RULE_withinExpression = 26, RULE_joinWindowSize = 27, RULE_joinCriteria = 28, 
		RULE_aliasedRelation = 29, RULE_columns = 30, RULE_relationPrimary = 31, 
		RULE_expression = 32, RULE_booleanExpression = 33, RULE_predicated = 34, 
		RULE_predicate = 35, RULE_valueExpression = 36, RULE_primaryExpression = 37, 
		RULE_timeZoneSpecifier = 38, RULE_comparisonOperator = 39, RULE_booleanValue = 40, 
		RULE_type = 41, RULE_typeParameter = 42, RULE_baseType = 43, RULE_whenClause = 44, 
		RULE_identifier = 45, RULE_sourceName = 46, RULE_number = 47, RULE_literal = 48, 
		RULE_nonReserved = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "singleStatement", "singleExpression", "statement", "query", 
			"resultMaterialization", "tableElements", "tableElement", "tableProperties", 
			"tableProperty", "printClause", "intervalClause", "limitClause", "windowExpression", 
			"tumblingWindowExpression", "hoppingWindowExpression", "sessionWindowExpression", 
			"windowUnit", "groupBy", "groupingElement", "groupingExpressions", "values", 
			"selectItem", "relation", "joinType", "joinWindow", "withinExpression", 
			"joinWindowSize", "joinCriteria", "aliasedRelation", "columns", "relationPrimary", 
			"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
			"primaryExpression", "timeZoneSpecifier", "comparisonOperator", "booleanValue", 
			"type", "typeParameter", "baseType", "whenClause", "identifier", "sourceName", 
			"number", "literal", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'.'", "'['", "']'", "'EMIT'", "'CHANGES'", 
			"'SELECT'", "'FROM'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", "'WITHIN'", 
			"'WINDOW'", "'GROUP'", "'BY'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", 
			"'AND'", "'IN'", "'NOT'", "'EXISTS'", "'BETWEEN'", "'LIKE'", "'IS'", 
			"'NULL'", "'TRUE'", "'FALSE'", "'INTEGER'", "'DATE'", "'TIME'", "'TIMESTAMP'", 
			"'INTERVAL'", "'YEAR'", "'MONTH'", "'DAY'", "'HOUR'", "'MINUTE'", "'SECOND'", 
			"'MILLISECOND'", "'YEARS'", "'MONTHS'", "'DAYS'", "'HOURS'", "'MINUTES'", 
			"'SECONDS'", "'MILLISECONDS'", "'ZONE'", "'TUMBLING'", "'HOPPING'", "'SIZE'", 
			"'ADVANCE'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", 
			"'FULL'", "'OUTER'", "'INNER'", "'LEFT'", "'RIGHT'", "'ON'", "'PARTITION'", 
			"'STRUCT'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'TOPIC'", "'STREAM'", 
			"'STREAMS'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXTENDED'", 
			"'PRINT'", "'EXPLAIN'", "'ANALYZE'", "'TYPE'", "'TYPES'", "'CAST'", "'SHOW'", 
			"'LIST'", "'TABLES'", "'TOPICS'", "'QUERY'", "'QUERIES'", "'TERMINATE'", 
			"'LOAD'", "'COLUMNS'", "'COLUMN'", "'PARTITIONS'", "'FUNCTIONS'", "'FUNCTION'", 
			"'DROP'", "'TO'", "'RENAME'", "'ARRAY'", "'MAP'", "'SET'", "'RESET'", 
			"'SESSION'", "'SAMPLE'", "'EXPORT'", "'CATALOG'", "'PROPERTIES'", "'BEGINNING'", 
			"'UNSET'", "'RUN'", "'SCRIPT'", "'DECIMAL'", "'KEY'", "'CONNECTOR'", 
			"'CONNECTORS'", "'SINK'", "'SOURCE'", "'NAMESPACE'", "'MATERIALIZED'", 
			"'VIEW'", "'PRIMARY'", "'IF'", "'='", null, "'<'", "'<='", "'>'", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "':='", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "EMIT", "CHANGES", "SELECT", 
			"FROM", "AS", "ALL", "DISTINCT", "WHERE", "WITHIN", "WINDOW", "GROUP", 
			"BY", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", "NOT", "EXISTS", "BETWEEN", 
			"LIKE", "IS", "NULL", "TRUE", "FALSE", "INTEGER", "DATE", "TIME", "TIMESTAMP", 
			"INTERVAL", "YEAR", "MONTH", "DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", 
			"YEARS", "MONTHS", "DAYS", "HOURS", "MINUTES", "SECONDS", "MILLISECONDS", 
			"ZONE", "TUMBLING", "HOPPING", "SIZE", "ADVANCE", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "JOIN", "FULL", "OUTER", "INNER", "LEFT", "RIGHT", "ON", 
			"PARTITION", "STRUCT", "WITH", "VALUES", "CREATE", "TABLE", "TOPIC", 
			"STREAM", "STREAMS", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXTENDED", 
			"PRINT", "EXPLAIN", "ANALYZE", "TYPE", "TYPES", "CAST", "SHOW", "LIST", 
			"TABLES", "TOPICS", "QUERY", "QUERIES", "TERMINATE", "LOAD", "COLUMNS", 
			"COLUMN", "PARTITIONS", "FUNCTIONS", "FUNCTION", "DROP", "TO", "RENAME", 
			"ARRAY", "MAP", "SET", "RESET", "SESSION", "SAMPLE", "EXPORT", "CATALOG", 
			"PROPERTIES", "BEGINNING", "UNSET", "RUN", "SCRIPT", "DECIMAL", "KEY", 
			"CONNECTOR", "CONNECTORS", "SINK", "SOURCE", "NAMESPACE", "MATERIALIZED", 
			"VIEW", "PRIMARY", "IF", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", 
			"MINUS", "ASTERISK", "SLASH", "PERCENT", "CONCAT", "ASSIGN", "STRUCT_FIELD_REF", 
			"STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "FLOATING_POINT_VALUE", "IDENTIFIER", 
			"DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE", 
			"TIMESTAMP_WITH_TIME_ZONE", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED", "DELIMITER"
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
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (CREATE - 74)) | (1L << (INSERT - 74)) | (1L << (DESCRIBE - 74)) | (1L << (PRINT - 74)) | (1L << (EXPLAIN - 74)) | (1L << (SHOW - 74)) | (1L << (LIST - 74)) | (1L << (TERMINATE - 74)) | (1L << (DROP - 74)) | (1L << (SET - 74)) | (1L << (UNSET - 74)))) != 0)) {
				{
				{
				setState(100);
				singleStatement();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			statement();
			setState(109);
			match(T__0);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expression();
			setState(112);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListTablesContext extends StatementContext {
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public ListTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TableElementsContext tableElements() {
			return getRuleContext(TableElementsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetPropertyContext extends StatementContext {
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnsetPropertyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListTypesContext extends StatementContext {
		public TerminalNode TYPES() { return getToken(SqlBaseParser.TYPES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public ListTypesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListTypes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegisterTypeContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RegisterTypeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegisterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegisterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegisterType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListTopicsContext extends StatementContext {
		public TerminalNode TOPICS() { return getToken(SqlBaseParser.TOPICS, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public ListTopicsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListTopics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListTopics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListTopics(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListQueriesContext extends StatementContext {
		public TerminalNode QUERIES() { return getToken(SqlBaseParser.QUERIES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public ListQueriesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListQueries(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropStreamContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode STREAM() { return getToken(SqlBaseParser.STREAM, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode TOPIC() { return getToken(SqlBaseParser.TOPIC, 0); }
		public DropStreamContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropStream(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryStatementContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QueryStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateStreamAsContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(SqlBaseParser.STREAM, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateStreamAsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateStreamAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateStreamAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateStreamAs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateTableAsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateConnectorContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CONNECTOR() { return getToken(SqlBaseParser.CONNECTOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode SINK() { return getToken(SqlBaseParser.SINK, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public CreateConnectorContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateConnector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateConnector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateStreamContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(SqlBaseParser.STREAM, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TableElementsContext tableElements() {
			return getRuleContext(TableElementsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateStreamContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateStream(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListConnectorsContext extends StatementContext {
		public TerminalNode CONNECTORS() { return getToken(SqlBaseParser.CONNECTORS, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode SINK() { return getToken(SqlBaseParser.SINK, 0); }
		public ListConnectorsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListConnectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListConnectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListConnectors(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListStreamsContext extends StatementContext {
		public TerminalNode STREAMS() { return getToken(SqlBaseParser.STREAMS, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public ListStreamsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListStreams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListStreams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListStreams(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode TOPIC() { return getToken(SqlBaseParser.TOPIC, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropConnectorContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode CONNECTOR() { return getToken(SqlBaseParser.CONNECTOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropConnectorContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropConnector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropConnector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListFunctionsContext extends StatementContext {
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public ListFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeConnectorContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode CONNECTOR() { return getToken(SqlBaseParser.CONNECTOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeConnectorContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeConnector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeConnector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintTopicContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(SqlBaseParser.PRINT, 0); }
		public PrintClauseContext printClause() {
			return getRuleContext(PrintClauseContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PrintTopicContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrintTopic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrintTopic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrintTopic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPropertiesContext extends StatementContext {
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public ListPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterListProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitListProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitListProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTypeContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropTypeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPropertyContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public SetPropertyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TerminateQueryContext extends StatementContext {
		public TerminalNode TERMINATE() { return getToken(SqlBaseParser.TERMINATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminateQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTerminateQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTerminateQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTerminateQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertValuesContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public InsertValuesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new QueryStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				query();
				}
				break;
			case 2:
				_localctx = new ListPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(PROPERTIES);
				}
				break;
			case 3:
				_localctx = new ListTopicsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(118);
					match(ALL);
					}
				}

				setState(121);
				match(TOPICS);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(122);
					match(EXTENDED);
					}
				}

				}
				break;
			case 4:
				_localctx = new ListStreamsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				match(STREAMS);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(127);
					match(EXTENDED);
					}
				}

				}
				break;
			case 5:
				_localctx = new ListTablesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				match(TABLES);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(132);
					match(EXTENDED);
					}
				}

				}
				break;
			case 6:
				_localctx = new ListFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
				match(FUNCTIONS);
				}
				break;
			case 7:
				_localctx = new ListConnectorsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINK || _la==SOURCE) {
					{
					setState(138);
					_la = _input.LA(1);
					if ( !(_la==SINK || _la==SOURCE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(141);
				match(CONNECTORS);
				}
				break;
			case 8:
				_localctx = new ListTypesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				match(TYPES);
				}
				break;
			case 9:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				match(DESCRIBE);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(145);
					match(EXTENDED);
					}
				}

				setState(148);
				sourceName();
				}
				break;
			case 10:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				match(DESCRIBE);
				setState(150);
				match(FUNCTION);
				setState(151);
				identifier();
				}
				break;
			case 11:
				_localctx = new DescribeConnectorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(152);
				match(DESCRIBE);
				setState(153);
				match(CONNECTOR);
				setState(154);
				identifier();
				}
				break;
			case 12:
				_localctx = new PrintTopicContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(155);
				match(PRINT);
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EMIT:
				case CHANGES:
				case INTEGER:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case INTERVAL:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case ZONE:
				case PARTITION:
				case STRUCT:
				case EXPLAIN:
				case ANALYZE:
				case TYPE:
				case TYPES:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case PARTITIONS:
				case FUNCTIONS:
				case FUNCTION:
				case ARRAY:
				case MAP:
				case SET:
				case RESET:
				case SESSION:
				case KEY:
				case SINK:
				case SOURCE:
				case IF:
				case IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(156);
					identifier();
					}
					break;
				case STRING:
					{
					setState(157);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160);
				printClause();
				}
				break;
			case 13:
				_localctx = new ListQueriesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				match(QUERIES);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(163);
					match(EXTENDED);
					}
				}

				}
				break;
			case 14:
				_localctx = new TerminateQueryContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(166);
				match(TERMINATE);
				setState(167);
				identifier();
				}
				break;
			case 15:
				_localctx = new TerminateQueryContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(168);
				match(TERMINATE);
				setState(169);
				match(ALL);
				}
				break;
			case 16:
				_localctx = new SetPropertyContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(170);
				match(SET);
				setState(171);
				match(STRING);
				setState(172);
				match(EQ);
				setState(173);
				match(STRING);
				}
				break;
			case 17:
				_localctx = new UnsetPropertyContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(174);
				match(UNSET);
				setState(175);
				match(STRING);
				}
				break;
			case 18:
				_localctx = new CreateStreamContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(176);
				match(CREATE);
				setState(177);
				match(STREAM);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(178);
					match(IF);
					setState(179);
					match(NOT);
					setState(180);
					match(EXISTS);
					}
					break;
				}
				setState(183);
				sourceName();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(184);
					tableElements();
					}
				}

				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(187);
					match(WITH);
					setState(188);
					tableProperties();
					}
				}

				}
				break;
			case 19:
				_localctx = new CreateStreamAsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(191);
				match(CREATE);
				setState(192);
				match(STREAM);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(193);
					match(IF);
					setState(194);
					match(NOT);
					setState(195);
					match(EXISTS);
					}
					break;
				}
				setState(198);
				sourceName();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(199);
					match(WITH);
					setState(200);
					tableProperties();
					}
				}

				setState(203);
				match(AS);
				setState(204);
				query();
				}
				break;
			case 20:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(206);
				match(CREATE);
				setState(207);
				match(TABLE);
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(208);
					match(IF);
					setState(209);
					match(NOT);
					setState(210);
					match(EXISTS);
					}
					break;
				}
				setState(213);
				sourceName();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(214);
					tableElements();
					}
				}

				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(217);
					match(WITH);
					setState(218);
					tableProperties();
					}
				}

				}
				break;
			case 21:
				_localctx = new CreateTableAsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(221);
				match(CREATE);
				setState(222);
				match(TABLE);
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(223);
					match(IF);
					setState(224);
					match(NOT);
					setState(225);
					match(EXISTS);
					}
					break;
				}
				setState(228);
				sourceName();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(229);
					match(WITH);
					setState(230);
					tableProperties();
					}
				}

				setState(233);
				match(AS);
				setState(234);
				query();
				}
				break;
			case 22:
				_localctx = new CreateConnectorContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(236);
				match(CREATE);
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==SINK || _la==SOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				match(CONNECTOR);
				setState(239);
				identifier();
				setState(240);
				match(WITH);
				setState(241);
				tableProperties();
				}
				break;
			case 23:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(243);
				match(INSERT);
				setState(244);
				match(INTO);
				setState(245);
				sourceName();
				setState(246);
				query();
				}
				break;
			case 24:
				_localctx = new InsertValuesContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(248);
				match(INSERT);
				setState(249);
				match(INTO);
				setState(250);
				sourceName();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(251);
					columns();
					}
				}

				setState(254);
				match(VALUES);
				setState(255);
				values();
				}
				break;
			case 25:
				_localctx = new DropStreamContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(257);
				match(DROP);
				setState(258);
				match(STREAM);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(259);
					match(IF);
					setState(260);
					match(EXISTS);
					}
					break;
				}
				setState(263);
				sourceName();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(264);
					match(DELETE);
					setState(265);
					match(TOPIC);
					}
				}

				}
				break;
			case 26:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(268);
				match(DROP);
				setState(269);
				match(TABLE);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(270);
					match(IF);
					setState(271);
					match(EXISTS);
					}
					break;
				}
				setState(274);
				sourceName();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(275);
					match(DELETE);
					setState(276);
					match(TOPIC);
					}
				}

				}
				break;
			case 27:
				_localctx = new DropConnectorContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(279);
				match(DROP);
				setState(280);
				match(CONNECTOR);
				setState(281);
				identifier();
				}
				break;
			case 28:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(282);
				match(EXPLAIN);
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(283);
					statement();
					}
					break;
				case 2:
					{
					setState(284);
					identifier();
					}
					break;
				}
				}
				break;
			case 29:
				_localctx = new RegisterTypeContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(287);
				match(CREATE);
				setState(288);
				match(TYPE);
				setState(289);
				identifier();
				setState(290);
				match(AS);
				setState(291);
				type(0);
				}
				break;
			case 30:
				_localctx = new DropTypeContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(293);
				match(DROP);
				setState(294);
				match(TYPE);
				setState(295);
				identifier();
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

	public static class QueryContext extends ParserRuleContext {
		public RelationContext from;
		public BooleanExpressionContext where;
		public BooleanExpressionContext partitionBy;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public WindowExpressionContext windowExpression() {
			return getRuleContext(WindowExpressionContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode EMIT() { return getToken(SqlBaseParser.EMIT, 0); }
		public ResultMaterializationContext resultMaterialization() {
			return getRuleContext(ResultMaterializationContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(SELECT);
			setState(299);
			selectItem();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(300);
				match(T__1);
				setState(301);
				selectItem();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(FROM);
			setState(308);
			((QueryContext)_localctx).from = relation();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(309);
				match(WINDOW);
				setState(310);
				windowExpression();
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(313);
				match(WHERE);
				setState(314);
				((QueryContext)_localctx).where = booleanExpression(0);
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(317);
				match(GROUP);
				setState(318);
				match(BY);
				setState(319);
				groupBy();
				}
			}

			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(322);
				match(PARTITION);
				setState(323);
				match(BY);
				setState(324);
				((QueryContext)_localctx).partitionBy = booleanExpression(0);
				}
			}

			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(327);
				match(HAVING);
				setState(328);
				((QueryContext)_localctx).having = booleanExpression(0);
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EMIT) {
				{
				setState(331);
				match(EMIT);
				setState(332);
				resultMaterialization();
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(335);
				limitClause();
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

	public static class ResultMaterializationContext extends ParserRuleContext {
		public TerminalNode CHANGES() { return getToken(SqlBaseParser.CHANGES, 0); }
		public ResultMaterializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultMaterialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResultMaterialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResultMaterialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResultMaterialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultMaterializationContext resultMaterialization() throws RecognitionException {
		ResultMaterializationContext _localctx = new ResultMaterializationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_resultMaterialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(CHANGES);
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

	public static class TableElementsContext extends ParserRuleContext {
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TableElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementsContext tableElements() throws RecognitionException {
		TableElementsContext _localctx = new TableElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__2);
			setState(341);
			tableElement();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(342);
				match(T__1);
				setState(343);
				tableElement();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(T__3);
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

	public static class TableElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode KEY() { return getToken(SqlBaseParser.KEY, 0); }
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			identifier();
			setState(352);
			type(0);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(353);
				match(KEY);
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

	public static class TablePropertiesContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__2);
			setState(357);
			tableProperty();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(358);
				match(T__1);
				setState(359);
				tableProperty();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(T__3);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMIT:
			case CHANGES:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case IF:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(367);
				identifier();
				}
				break;
			case STRING:
				{
				setState(368);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(371);
			match(EQ);
			setState(372);
			literal();
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

	public static class PrintClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode BEGINNING() { return getToken(SqlBaseParser.BEGINNING, 0); }
		public IntervalClauseContext intervalClause() {
			return getRuleContext(IntervalClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public PrintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrintClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrintClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintClauseContext printClause() throws RecognitionException {
		PrintClauseContext _localctx = new PrintClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(374);
				match(FROM);
				setState(375);
				match(BEGINNING);
				}
			}

			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVAL || _la==SAMPLE) {
				{
				setState(378);
				intervalClause();
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(381);
				limitClause();
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

	public static class IntervalClauseContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode SAMPLE() { return getToken(SqlBaseParser.SAMPLE, 0); }
		public IntervalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalClauseContext intervalClause() throws RecognitionException {
		IntervalClauseContext _localctx = new IntervalClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intervalClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==INTERVAL || _la==SAMPLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(385);
			number();
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LIMIT);
			setState(388);
			number();
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

	public static class WindowExpressionContext extends ParserRuleContext {
		public TumblingWindowExpressionContext tumblingWindowExpression() {
			return getRuleContext(TumblingWindowExpressionContext.class,0);
		}
		public HoppingWindowExpressionContext hoppingWindowExpression() {
			return getRuleContext(HoppingWindowExpressionContext.class,0);
		}
		public SessionWindowExpressionContext sessionWindowExpression() {
			return getRuleContext(SessionWindowExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public WindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowExpressionContext windowExpression() throws RecognitionException {
		WindowExpressionContext _localctx = new WindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_windowExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(390);
				match(IDENTIFIER);
				}
			}

			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TUMBLING:
				{
				setState(393);
				tumblingWindowExpression();
				}
				break;
			case HOPPING:
				{
				setState(394);
				hoppingWindowExpression();
				}
				break;
			case SESSION:
				{
				setState(395);
				sessionWindowExpression();
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

	public static class TumblingWindowExpressionContext extends ParserRuleContext {
		public TerminalNode TUMBLING() { return getToken(SqlBaseParser.TUMBLING, 0); }
		public TerminalNode SIZE() { return getToken(SqlBaseParser.SIZE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public TumblingWindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tumblingWindowExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTumblingWindowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTumblingWindowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTumblingWindowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TumblingWindowExpressionContext tumblingWindowExpression() throws RecognitionException {
		TumblingWindowExpressionContext _localctx = new TumblingWindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tumblingWindowExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(TUMBLING);
			setState(399);
			match(T__2);
			setState(400);
			match(SIZE);
			setState(401);
			number();
			setState(402);
			windowUnit();
			setState(403);
			match(T__3);
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

	public static class HoppingWindowExpressionContext extends ParserRuleContext {
		public TerminalNode HOPPING() { return getToken(SqlBaseParser.HOPPING, 0); }
		public TerminalNode SIZE() { return getToken(SqlBaseParser.SIZE, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<WindowUnitContext> windowUnit() {
			return getRuleContexts(WindowUnitContext.class);
		}
		public WindowUnitContext windowUnit(int i) {
			return getRuleContext(WindowUnitContext.class,i);
		}
		public TerminalNode ADVANCE() { return getToken(SqlBaseParser.ADVANCE, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public HoppingWindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hoppingWindowExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHoppingWindowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHoppingWindowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHoppingWindowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoppingWindowExpressionContext hoppingWindowExpression() throws RecognitionException {
		HoppingWindowExpressionContext _localctx = new HoppingWindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hoppingWindowExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(HOPPING);
			setState(406);
			match(T__2);
			setState(407);
			match(SIZE);
			setState(408);
			number();
			setState(409);
			windowUnit();
			setState(410);
			match(T__1);
			setState(411);
			match(ADVANCE);
			setState(412);
			match(BY);
			setState(413);
			number();
			setState(414);
			windowUnit();
			setState(415);
			match(T__3);
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

	public static class SessionWindowExpressionContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public SessionWindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sessionWindowExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSessionWindowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSessionWindowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSessionWindowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SessionWindowExpressionContext sessionWindowExpression() throws RecognitionException {
		SessionWindowExpressionContext _localctx = new SessionWindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sessionWindowExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(SESSION);
			setState(418);
			match(T__2);
			setState(419);
			number();
			setState(420);
			windowUnit();
			setState(421);
			match(T__3);
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

	public static class WindowUnitContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public WindowUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowUnitContext windowUnit() throws RecognitionException {
		WindowUnitContext _localctx = new WindowUnitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_windowUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << MILLISECOND) | (1L << DAYS) | (1L << HOURS) | (1L << MINUTES) | (1L << SECONDS) | (1L << MILLISECONDS))) != 0)) ) {
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

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			groupingElement();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(426);
				match(T__1);
				setState(427);
				groupingElement();
				}
				}
				setState(432);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingExpressionsContext groupingExpressions() {
			return getRuleContext(GroupingExpressionsContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_groupingElement);
		try {
			_localctx = new SingleGroupingSetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			groupingExpressions();
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

	public static class GroupingExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingExpressionsContext groupingExpressions() throws RecognitionException {
		GroupingExpressionsContext _localctx = new GroupingExpressionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupingExpressions);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(T__2);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EMIT) | (1L << CHANGES) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE) | (1L << CASE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (CAST - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (STRING - 136)) | (1L << (INTEGER_VALUE - 136)) | (1L << (DECIMAL_VALUE - 136)) | (1L << (FLOATING_POINT_VALUE - 136)) | (1L << (IDENTIFIER - 136)) | (1L << (DIGIT_IDENTIFIER - 136)) | (1L << (QUOTED_IDENTIFIER - 136)) | (1L << (BACKQUOTED_IDENTIFIER - 136)))) != 0)) {
					{
					setState(436);
					expression();
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(437);
						match(T__1);
						setState(438);
						expression();
						}
						}
						setState(443);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(446);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				expression();
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

	public static class ValuesContext extends ParserRuleContext {
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__2);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EMIT) | (1L << CHANGES) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE) | (1L << CASE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (CAST - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (STRING - 136)) | (1L << (INTEGER_VALUE - 136)) | (1L << (DECIMAL_VALUE - 136)) | (1L << (FLOATING_POINT_VALUE - 136)) | (1L << (IDENTIFIER - 136)) | (1L << (DIGIT_IDENTIFIER - 136)) | (1L << (QUOTED_IDENTIFIER - 136)) | (1L << (BACKQUOTED_IDENTIFIER - 136)))) != 0)) {
				{
				setState(451);
				valueExpression(0);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(452);
					match(T__1);
					setState(453);
					valueExpression(0);
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(461);
			match(T__3);
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

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectItem);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				expression();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMIT) | (1L << CHANGES) | (1L << AS) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (IDENTIFIER - 148)) | (1L << (DIGIT_IDENTIFIER - 148)) | (1L << (QUOTED_IDENTIFIER - 148)) | (1L << (BACKQUOTED_IDENTIFIER - 148)))) != 0)) {
					{
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(464);
						match(AS);
						}
					}

					setState(467);
					identifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				identifier();
				setState(471);
				match(T__4);
				setState(472);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(ASTERISK);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public AliasedRelationContext left;
		public AliasedRelationContext right;
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public List<AliasedRelationContext> aliasedRelation() {
			return getRuleContexts(AliasedRelationContext.class);
		}
		public AliasedRelationContext aliasedRelation(int i) {
			return getRuleContext(AliasedRelationContext.class,i);
		}
		public JoinWindowContext joinWindow() {
			return getRuleContext(JoinWindowContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relation);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new JoinRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				((JoinRelationContext)_localctx).left = aliasedRelation();
				setState(478);
				joinType();
				setState(479);
				match(JOIN);
				setState(480);
				((JoinRelationContext)_localctx).right = aliasedRelation();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(481);
					joinWindow();
					}
				}

				setState(484);
				joinCriteria();
				}
				break;
			case 2:
				_localctx = new RelationDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				aliasedRelation();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	 
		public JoinTypeContext() { }
		public void copyFrom(JoinTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InnerJoinContext extends JoinTypeContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public InnerJoinContext(JoinTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftJoinContext extends JoinTypeContext {
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public LeftJoinContext(JoinTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLeftJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLeftJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLeftJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OuterJoinContext extends JoinTypeContext {
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public OuterJoinContext(JoinTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_joinType);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(489);
					match(INNER);
					}
				}

				}
				break;
			case FULL:
				_localctx = new OuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(FULL);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(493);
					match(OUTER);
					}
				}

				}
				break;
			case LEFT:
				_localctx = new LeftJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(LEFT);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(497);
					match(OUTER);
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

	public static class JoinWindowContext extends ParserRuleContext {
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public WithinExpressionContext withinExpression() {
			return getRuleContext(WithinExpressionContext.class,0);
		}
		public JoinWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinWindowContext joinWindow() throws RecognitionException {
		JoinWindowContext _localctx = new JoinWindowContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_joinWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(WITHIN);
			setState(503);
			withinExpression();
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

	public static class WithinExpressionContext extends ParserRuleContext {
		public WithinExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withinExpression; }
	 
		public WithinExpressionContext() { }
		public void copyFrom(WithinExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleJoinWindowContext extends WithinExpressionContext {
		public JoinWindowSizeContext joinWindowSize() {
			return getRuleContext(JoinWindowSizeContext.class,0);
		}
		public SingleJoinWindowContext(WithinExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleJoinWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleJoinWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleJoinWindow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinWindowWithBeforeAndAfterContext extends WithinExpressionContext {
		public List<JoinWindowSizeContext> joinWindowSize() {
			return getRuleContexts(JoinWindowSizeContext.class);
		}
		public JoinWindowSizeContext joinWindowSize(int i) {
			return getRuleContext(JoinWindowSizeContext.class,i);
		}
		public JoinWindowWithBeforeAndAfterContext(WithinExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinWindowWithBeforeAndAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinWindowWithBeforeAndAfter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinWindowWithBeforeAndAfter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithinExpressionContext withinExpression() throws RecognitionException {
		WithinExpressionContext _localctx = new WithinExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_withinExpression);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new JoinWindowWithBeforeAndAfterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(T__2);
				setState(506);
				joinWindowSize();
				setState(507);
				match(T__1);
				setState(508);
				joinWindowSize();
				setState(509);
				match(T__3);
				}
				break;
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case FLOATING_POINT_VALUE:
				_localctx = new SingleJoinWindowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				joinWindowSize();
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

	public static class JoinWindowSizeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public JoinWindowSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinWindowSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinWindowSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinWindowSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinWindowSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinWindowSizeContext joinWindowSize() throws RecognitionException {
		JoinWindowSizeContext _localctx = new JoinWindowSizeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_joinWindowSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			number();
			setState(515);
			windowUnit();
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(ON);
			setState(518);
			booleanExpression(0);
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

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			relationPrimary();
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(521);
					match(AS);
					}
				}

				setState(524);
				sourceName();
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

	public static class ColumnsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T__2);
			setState(528);
			identifier();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(529);
				match(T__1);
				setState(530);
				identifier();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(T__3);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relationPrimary);
		try {
			_localctx = new TableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			sourceName();
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case EMIT:
			case CHANGES:
			case NULL:
			case TRUE:
			case FALSE:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CASE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case IF:
			case PLUS:
			case MINUS:
			case STRING:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case FLOATING_POINT_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(543);
				predicated();
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(544);
				match(NOT);
				setState(545);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(554);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(548);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(549);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(550);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(551);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(552);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(553);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			((PredicatedContext)_localctx).valueExpression = valueExpression(0);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(560);
				predicate(((PredicatedContext)_localctx).valueExpression);
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

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 70, RULE_predicate);
		int _la;
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				comparisonOperator();
				setState(564);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(566);
					match(NOT);
					}
				}

				setState(569);
				match(BETWEEN);
				setState(570);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(571);
				match(AND);
				setState(572);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 3:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(574);
					match(NOT);
					}
				}

				setState(577);
				match(IN);
				setState(578);
				match(T__2);
				setState(579);
				expression();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(580);
					match(T__1);
					setState(581);
					expression();
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(589);
					match(NOT);
					}
				}

				setState(592);
				match(LIKE);
				setState(593);
				((LikeContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				match(IS);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(595);
					match(NOT);
					}
				}

				setState(598);
				match(NULL);
				}
				break;
			case 6:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(599);
				match(IS);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(600);
					match(NOT);
					}
				}

				setState(603);
				match(DISTINCT);
				setState(604);
				match(FROM);
				setState(605);
				((DistinctFromContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case EMIT:
			case CHANGES:
			case NULL:
			case TRUE:
			case FALSE:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CASE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case IF:
			case STRING:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case FLOATING_POINT_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(609);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(610);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(611);
				valueExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(614);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(615);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ASTERISK - 138)) | (1L << (SLASH - 138)) | (1L << (PERCENT - 138)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(616);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(617);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(618);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(619);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(620);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(621);
						match(CONCAT);
						setState(622);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(623);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(624);
						match(AT);
						setState(625);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode STRUCT_FIELD_REF() { return getToken(SqlBaseParser.STRUCT_FIELD_REF, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructConstructorContext extends PrimaryExpressionContext {
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlBaseParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlBaseParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StructConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStructConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStructConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStructConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QualifiedColumnReferenceContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapConstructorContext extends PrimaryExpressionContext {
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlBaseParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlBaseParser.ASSIGN, i);
		}
		public MapConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMapConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMapConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMapConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(632);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				identifier();
				setState(634);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				match(CASE);
				setState(637);
				valueExpression(0);
				setState(639); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(638);
					whenClause();
					}
					}
					setState(641); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(643);
					match(ELSE);
					setState(644);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(647);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(649);
				match(CASE);
				setState(651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(650);
					whenClause();
					}
					}
					setState(653); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(655);
					match(ELSE);
					setState(656);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(659);
				match(END);
				}
				break;
			case 5:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(661);
				match(CAST);
				setState(662);
				match(T__2);
				setState(663);
				expression();
				setState(664);
				match(AS);
				setState(665);
				type(0);
				setState(666);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(668);
				match(ARRAY);
				setState(669);
				match(T__5);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EMIT) | (1L << CHANGES) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE) | (1L << CASE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (CAST - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (STRING - 136)) | (1L << (INTEGER_VALUE - 136)) | (1L << (DECIMAL_VALUE - 136)) | (1L << (FLOATING_POINT_VALUE - 136)) | (1L << (IDENTIFIER - 136)) | (1L << (DIGIT_IDENTIFIER - 136)) | (1L << (QUOTED_IDENTIFIER - 136)) | (1L << (BACKQUOTED_IDENTIFIER - 136)))) != 0)) {
					{
					setState(670);
					expression();
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(671);
						match(T__1);
						setState(672);
						expression();
						}
						}
						setState(677);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(680);
				match(T__6);
				}
				break;
			case 7:
				{
				_localctx = new MapConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(681);
				match(MAP);
				setState(682);
				match(T__2);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EMIT) | (1L << CHANGES) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE) | (1L << CASE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (CAST - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (STRING - 136)) | (1L << (INTEGER_VALUE - 136)) | (1L << (DECIMAL_VALUE - 136)) | (1L << (FLOATING_POINT_VALUE - 136)) | (1L << (IDENTIFIER - 136)) | (1L << (DIGIT_IDENTIFIER - 136)) | (1L << (QUOTED_IDENTIFIER - 136)) | (1L << (BACKQUOTED_IDENTIFIER - 136)))) != 0)) {
					{
					setState(683);
					expression();
					setState(684);
					match(ASSIGN);
					setState(685);
					expression();
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(686);
						match(T__1);
						setState(687);
						expression();
						setState(688);
						match(ASSIGN);
						setState(689);
						expression();
						}
						}
						setState(695);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(698);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new StructConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(699);
				match(STRUCT);
				setState(700);
				match(T__2);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMIT) | (1L << CHANGES) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (IDENTIFIER - 148)) | (1L << (DIGIT_IDENTIFIER - 148)) | (1L << (QUOTED_IDENTIFIER - 148)) | (1L << (BACKQUOTED_IDENTIFIER - 148)))) != 0)) {
					{
					setState(701);
					identifier();
					setState(702);
					match(ASSIGN);
					setState(703);
					expression();
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(704);
						match(T__1);
						setState(705);
						identifier();
						setState(706);
						match(ASSIGN);
						setState(707);
						expression();
						}
						}
						setState(713);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(716);
				match(T__3);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(717);
				identifier();
				setState(718);
				match(T__2);
				setState(719);
				match(ASTERISK);
				setState(720);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(722);
				identifier();
				setState(723);
				match(T__2);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EMIT) | (1L << CHANGES) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE) | (1L << CASE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (CAST - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (STRING - 136)) | (1L << (INTEGER_VALUE - 136)) | (1L << (DECIMAL_VALUE - 136)) | (1L << (FLOATING_POINT_VALUE - 136)) | (1L << (IDENTIFIER - 136)) | (1L << (DIGIT_IDENTIFIER - 136)) | (1L << (QUOTED_IDENTIFIER - 136)) | (1L << (BACKQUOTED_IDENTIFIER - 136)))) != 0)) {
					{
					setState(724);
					expression();
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(725);
						match(T__1);
						setState(726);
						expression();
						}
						}
						setState(731);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(734);
				match(T__3);
				}
				break;
			case 11:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(736);
				identifier();
				}
				break;
			case 12:
				{
				_localctx = new QualifiedColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(737);
				identifier();
				setState(738);
				match(T__4);
				setState(739);
				identifier();
				}
				break;
			case 13:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(741);
				match(T__2);
				setState(742);
				expression();
				setState(743);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(755);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(747);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(748);
						match(T__5);
						setState(749);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(750);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(752);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(753);
						match(STRUCT_FIELD_REF);
						setState(754);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_timeZoneSpecifier);
		try {
			_localctx = new TimeZoneStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(TIME);
			setState(761);
			match(ZONE);
			setState(762);
			match(STRING);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (EQ - 130)) | (1L << (NEQ - 130)) | (1L << (LT - 130)) | (1L << (LTE - 130)) | (1L << (GT - 130)) | (1L << (GTE - 130)))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DECIMAL() { return getToken(SqlBaseParser.DECIMAL, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(769);
				match(ARRAY);
				setState(770);
				match(LT);
				setState(771);
				type(0);
				setState(772);
				match(GT);
				}
				break;
			case 2:
				{
				setState(774);
				match(MAP);
				setState(775);
				match(LT);
				setState(776);
				type(0);
				setState(777);
				match(T__1);
				setState(778);
				type(0);
				setState(779);
				match(GT);
				}
				break;
			case 3:
				{
				setState(781);
				match(STRUCT);
				setState(782);
				match(LT);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMIT) | (1L << CHANGES) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (IDENTIFIER - 148)) | (1L << (DIGIT_IDENTIFIER - 148)) | (1L << (QUOTED_IDENTIFIER - 148)) | (1L << (BACKQUOTED_IDENTIFIER - 148)))) != 0)) {
					{
					setState(783);
					identifier();
					setState(784);
					type(0);
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(785);
						match(T__1);
						setState(786);
						identifier();
						setState(787);
						type(0);
						}
						}
						setState(793);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(796);
				match(GT);
				}
				break;
			case 4:
				{
				setState(797);
				match(DECIMAL);
				setState(798);
				match(T__2);
				setState(799);
				number();
				setState(800);
				match(T__1);
				setState(801);
				number();
				setState(802);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(804);
				baseType();
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(805);
					match(T__2);
					setState(806);
					typeParameter();
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(807);
						match(T__1);
						setState(808);
						typeParameter();
						}
						}
						setState(813);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(814);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(820);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(821);
					match(ARRAY);
					}
					} 
				}
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeParameter);
		try {
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(INTEGER_VALUE);
				}
				break;
			case EMIT:
			case CHANGES:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DECIMAL:
			case KEY:
			case SINK:
			case SOURCE:
			case IF:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				type(0);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			identifier();
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(WHEN);
			setState(834);
			((WhenClauseContext)_localctx).condition = expression();
			setState(835);
			match(THEN);
			setState(836);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			setState(843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case EMIT:
			case CHANGES:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case IF:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(841);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(842);
				match(DIGIT_IDENTIFIER);
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

	public static class SourceNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SourceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSourceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSourceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSourceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceNameContext sourceName() throws RecognitionException {
		SourceNameContext _localctx = new SourceNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			identifier();
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOATING_POINT_VALUE() { return getToken(SqlBaseParser.FLOATING_POINT_VALUE, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_number);
		try {
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(DECIMAL_VALUE);
				}
				break;
			case FLOATING_POINT_VALUE:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(FLOATING_POINT_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				match(INTEGER_VALUE);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends LiteralContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends LiteralContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(NULL);
				}
				break;
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case FLOATING_POINT_VALUE:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				booleanValue();
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				match(STRING);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode INTEGER() { return getToken(SqlBaseParser.INTEGER, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(SqlBaseParser.TYPES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode SINK() { return getToken(SqlBaseParser.SINK, 0); }
		public TerminalNode KEY() { return getToken(SqlBaseParser.KEY, 0); }
		public TerminalNode EMIT() { return getToken(SqlBaseParser.EMIT, 0); }
		public TerminalNode CHANGES() { return getToken(SqlBaseParser.CHANGES, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMIT) | (1L << CHANGES) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PARTITION - 70)) | (1L << (STRUCT - 70)) | (1L << (EXPLAIN - 70)) | (1L << (ANALYZE - 70)) | (1L << (TYPE - 70)) | (1L << (TYPES - 70)) | (1L << (SHOW - 70)) | (1L << (TABLES - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN - 70)) | (1L << (PARTITIONS - 70)) | (1L << (FUNCTIONS - 70)) | (1L << (FUNCTION - 70)) | (1L << (ARRAY - 70)) | (1L << (MAP - 70)) | (1L << (SET - 70)) | (1L << (RESET - 70)) | (1L << (SESSION - 70)) | (1L << (KEY - 70)) | (1L << (SINK - 70)) | (1L << (SOURCE - 70)) | (1L << (IF - 70)))) != 0)) ) {
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
		case 33:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 36:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 37:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 41:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a0\u035f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\7\2"+
		"h\n\2\f\2\16\2k\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5z\n\5\3\5\3\5\5\5~\n\5\3\5\3\5\3\5\5\5\u0083\n\5\3\5\3\5\3\5\5\5"+
		"\u0088\n\5\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0095"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00a7\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00b8\n\5\3\5\3\5\5\5\u00bc\n\5\3\5\3\5\5\5\u00c0\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00c7\n\5\3\5\3\5\3\5\5\5\u00cc\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u00d6\n\5\3\5\3\5\5\5\u00da\n\5\3\5\3\5\5\5\u00de"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u00e5\n\5\3\5\3\5\3\5\5\5\u00ea\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00ff\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0108\n\5\3\5\3\5\3\5\5"+
		"\5\u010d\n\5\3\5\3\5\3\5\3\5\5\5\u0113\n\5\3\5\3\5\3\5\5\5\u0118\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0120\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u012b\n\5\3\6\3\6\3\6\3\6\7\6\u0131\n\6\f\6\16\6\u0134\13\6\3\6"+
		"\3\6\3\6\3\6\5\6\u013a\n\6\3\6\3\6\5\6\u013e\n\6\3\6\3\6\3\6\5\6\u0143"+
		"\n\6\3\6\3\6\3\6\5\6\u0148\n\6\3\6\3\6\5\6\u014c\n\6\3\6\3\6\5\6\u0150"+
		"\n\6\3\6\5\6\u0153\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u015b\n\b\f\b\16\b"+
		"\u015e\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u0165\n\t\3\n\3\n\3\n\3\n\7\n\u016b"+
		"\n\n\f\n\16\n\u016e\13\n\3\n\3\n\3\13\3\13\5\13\u0174\n\13\3\13\3\13\3"+
		"\13\3\f\3\f\5\f\u017b\n\f\3\f\5\f\u017e\n\f\3\f\5\f\u0181\n\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\5\17\u018a\n\17\3\17\3\17\3\17\5\17\u018f\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u01af\n\24\f\24\16\24\u01b2\13\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\7\26\u01ba\n\26\f\26\16\26\u01bd\13\26\5\26\u01bf\n\26\3\26"+
		"\3\26\5\26\u01c3\n\26\3\27\3\27\3\27\3\27\7\27\u01c9\n\27\f\27\16\27\u01cc"+
		"\13\27\5\27\u01ce\n\27\3\27\3\27\3\30\3\30\5\30\u01d4\n\30\3\30\5\30\u01d7"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u01de\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u01e5\n\31\3\31\3\31\3\31\5\31\u01ea\n\31\3\32\5\32\u01ed\n\32\3"+
		"\32\3\32\5\32\u01f1\n\32\3\32\3\32\5\32\u01f5\n\32\5\32\u01f7\n\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0203\n\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\5\37\u020d\n\37\3\37\5\37\u0210\n\37\3"+
		" \3 \3 \3 \7 \u0216\n \f \16 \u0219\13 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"#\5#\u0225\n#\3#\3#\3#\3#\3#\3#\7#\u022d\n#\f#\16#\u0230\13#\3$\3$\5$"+
		"\u0234\n$\3%\3%\3%\3%\5%\u023a\n%\3%\3%\3%\3%\3%\3%\5%\u0242\n%\3%\3%"+
		"\3%\3%\3%\7%\u0249\n%\f%\16%\u024c\13%\3%\3%\3%\5%\u0251\n%\3%\3%\3%\3"+
		"%\5%\u0257\n%\3%\3%\3%\5%\u025c\n%\3%\3%\3%\5%\u0261\n%\3&\3&\3&\3&\5"+
		"&\u0267\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0275\n&\f&\16&\u0278"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u0282\n\'\r\'\16\'\u0283\3\'"+
		"\3\'\5\'\u0288\n\'\3\'\3\'\3\'\3\'\6\'\u028e\n\'\r\'\16\'\u028f\3\'\3"+
		"\'\5\'\u0294\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u02a4\n\'\f\'\16\'\u02a7\13\'\5\'\u02a9\n\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u02b6\n\'\f\'\16\'\u02b9\13\'\5\'\u02bb\n"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u02c8\n\'\f\'\16\'"+
		"\u02cb\13\'\5\'\u02cd\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u02da\n\'\f\'\16\'\u02dd\13\'\5\'\u02df\n\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u02ec\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7"+
		"\'\u02f6\n\'\f\'\16\'\u02f9\13\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u0318\n+\f+\16+\u031b"+
		"\13+\5+\u031d\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u032c\n+\f"+
		"+\16+\u032f\13+\3+\3+\5+\u0333\n+\5+\u0335\n+\3+\3+\7+\u0339\n+\f+\16"+
		"+\u033c\13+\3,\3,\5,\u0340\n,\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\5/\u034e"+
		"\n/\3\60\3\60\3\61\3\61\3\61\5\61\u0355\n\61\3\62\3\62\3\62\3\62\5\62"+
		"\u035b\n\62\3\63\3\63\3\63\2\6DJLT\64\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\13\3\2\\]\3\2}~"+
		"\4\2((qq\4\2+/\62\66\3\2\u008a\u008b\3\2\u008c\u008e\3\2\u0084\u0089\3"+
		"\2\"#\16\2\n\13$.\67\67HIWZ\\\\^^dhlpzz}~\u0083\u0083\2\u03ca\2i\3\2\2"+
		"\2\4n\3\2\2\2\6q\3\2\2\2\b\u012a\3\2\2\2\n\u012c\3\2\2\2\f\u0154\3\2\2"+
		"\2\16\u0156\3\2\2\2\20\u0161\3\2\2\2\22\u0166\3\2\2\2\24\u0173\3\2\2\2"+
		"\26\u017a\3\2\2\2\30\u0182\3\2\2\2\32\u0185\3\2\2\2\34\u0189\3\2\2\2\36"+
		"\u0190\3\2\2\2 \u0197\3\2\2\2\"\u01a3\3\2\2\2$\u01a9\3\2\2\2&\u01ab\3"+
		"\2\2\2(\u01b3\3\2\2\2*\u01c2\3\2\2\2,\u01c4\3\2\2\2.\u01dd\3\2\2\2\60"+
		"\u01e9\3\2\2\2\62\u01f6\3\2\2\2\64\u01f8\3\2\2\2\66\u0202\3\2\2\28\u0204"+
		"\3\2\2\2:\u0207\3\2\2\2<\u020a\3\2\2\2>\u0211\3\2\2\2@\u021c\3\2\2\2B"+
		"\u021e\3\2\2\2D\u0224\3\2\2\2F\u0231\3\2\2\2H\u0260\3\2\2\2J\u0266\3\2"+
		"\2\2L\u02eb\3\2\2\2N\u02fa\3\2\2\2P\u02fe\3\2\2\2R\u0300\3\2\2\2T\u0334"+
		"\3\2\2\2V\u033f\3\2\2\2X\u0341\3\2\2\2Z\u0343\3\2\2\2\\\u034d\3\2\2\2"+
		"^\u034f\3\2\2\2`\u0354\3\2\2\2b\u035a\3\2\2\2d\u035c\3\2\2\2fh\5\4\3\2"+
		"gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\2\2\3"+
		"m\3\3\2\2\2no\5\b\5\2op\7\3\2\2p\5\3\2\2\2qr\5B\"\2rs\7\2\2\3s\7\3\2\2"+
		"\2t\u012b\5\n\6\2uv\t\2\2\2v\u012b\7t\2\2wy\t\2\2\2xz\7\17\2\2yx\3\2\2"+
		"\2yz\3\2\2\2z{\3\2\2\2{}\7_\2\2|~\7U\2\2}|\3\2\2\2}~\3\2\2\2~\u012b\3"+
		"\2\2\2\177\u0080\t\2\2\2\u0080\u0082\7P\2\2\u0081\u0083\7U\2\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u012b\3\2\2\2\u0084\u0085\t\2\2\2\u0085"+
		"\u0087\7^\2\2\u0086\u0088\7U\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u012b\3\2\2\2\u0089\u008a\t\2\2\2\u008a\u012b\7g\2\2\u008b\u008d"+
		"\t\2\2\2\u008c\u008e\t\3\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u012b\7|\2\2\u0090\u0091\t\2\2\2\u0091\u012b\7Z\2"+
		"\2\u0092\u0094\7T\2\2\u0093\u0095\7U\2\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u012b\5^\60\2\u0097\u0098\7T\2\2\u0098"+
		"\u0099\7h\2\2\u0099\u012b\5\\/\2\u009a\u009b\7T\2\2\u009b\u009c\7{\2\2"+
		"\u009c\u012b\5\\/\2\u009d\u00a0\7V\2\2\u009e\u00a1\5\\/\2\u009f\u00a1"+
		"\7\u0092\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2"+
		"\2\u00a2\u012b\5\26\f\2\u00a3\u00a4\t\2\2\2\u00a4\u00a6\7a\2\2\u00a5\u00a7"+
		"\7U\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u012b\3\2\2\2\u00a8"+
		"\u00a9\7b\2\2\u00a9\u012b\5\\/\2\u00aa\u00ab\7b\2\2\u00ab\u012b\7\17\2"+
		"\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7\u0092\2\2\u00ae\u00af\7\u0084\2\2"+
		"\u00af\u012b\7\u0092\2\2\u00b0\u00b1\7v\2\2\u00b1\u012b\7\u0092\2\2\u00b2"+
		"\u00b3\7L\2\2\u00b3\u00b7\7O\2\2\u00b4\u00b5\7\u0083\2\2\u00b5\u00b6\7"+
		"\34\2\2\u00b6\u00b8\7\35\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\5^\60\2\u00ba\u00bc\5\16\b\2\u00bb\u00ba\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\7J\2\2\u00be"+
		"\u00c0\5\22\n\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u012b\3"+
		"\2\2\2\u00c1\u00c2\7L\2\2\u00c2\u00c6\7O\2\2\u00c3\u00c4\7\u0083\2\2\u00c4"+
		"\u00c5\7\34\2\2\u00c5\u00c7\7\35\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\5^\60\2\u00c9\u00ca\7J\2\2\u00ca"+
		"\u00cc\5\22\n\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf\5\n\6\2\u00cf\u012b\3\2\2\2\u00d0"+
		"\u00d1\7L\2\2\u00d1\u00d5\7M\2\2\u00d2\u00d3\7\u0083\2\2\u00d3\u00d4\7"+
		"\34\2\2\u00d4\u00d6\7\35\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\5^\60\2\u00d8\u00da\5\16\b\2\u00d9\u00d8\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\7J\2\2\u00dc"+
		"\u00de\5\22\n\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u012b\3"+
		"\2\2\2\u00df\u00e0\7L\2\2\u00e0\u00e4\7M\2\2\u00e1\u00e2\7\u0083\2\2\u00e2"+
		"\u00e3\7\34\2\2\u00e3\u00e5\7\35\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\5^\60\2\u00e7\u00e8\7J\2\2\u00e8"+
		"\u00ea\5\22\n\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ec\7\16\2\2\u00ec\u00ed\5\n\6\2\u00ed\u012b\3\2\2\2\u00ee"+
		"\u00ef\7L\2\2\u00ef\u00f0\t\3\2\2\u00f0\u00f1\7{\2\2\u00f1\u00f2\5\\/"+
		"\2\u00f2\u00f3\7J\2\2\u00f3\u00f4\5\22\n\2\u00f4\u012b\3\2\2\2\u00f5\u00f6"+
		"\7Q\2\2\u00f6\u00f7\7S\2\2\u00f7\u00f8\5^\60\2\u00f8\u00f9\5\n\6\2\u00f9"+
		"\u012b\3\2\2\2\u00fa\u00fb\7Q\2\2\u00fb\u00fc\7S\2\2\u00fc\u00fe\5^\60"+
		"\2\u00fd\u00ff\5> \2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\7K\2\2\u0101\u0102\5,\27\2\u0102\u012b\3\2\2\2\u0103"+
		"\u0104\7i\2\2\u0104\u0107\7O\2\2\u0105\u0106\7\u0083\2\2\u0106\u0108\7"+
		"\35\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010c\5^\60\2\u010a\u010b\7R\2\2\u010b\u010d\7N\2\2\u010c\u010a\3\2\2"+
		"\2\u010c\u010d\3\2\2\2\u010d\u012b\3\2\2\2\u010e\u010f\7i\2\2\u010f\u0112"+
		"\7M\2\2\u0110\u0111\7\u0083\2\2\u0111\u0113\7\35\2\2\u0112\u0110\3\2\2"+
		"\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\5^\60\2\u0115\u0116"+
		"\7R\2\2\u0116\u0118\7N\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u012b\3\2\2\2\u0119\u011a\7i\2\2\u011a\u011b\7{\2\2\u011b\u012b\5\\/"+
		"\2\u011c\u011f\7W\2\2\u011d\u0120\5\b\5\2\u011e\u0120\5\\/\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u012b\3\2\2\2\u0121\u0122\7L\2\2\u0122"+
		"\u0123\7Y\2\2\u0123\u0124\5\\/\2\u0124\u0125\7\16\2\2\u0125\u0126\5T+"+
		"\2\u0126\u012b\3\2\2\2\u0127\u0128\7i\2\2\u0128\u0129\7Y\2\2\u0129\u012b"+
		"\5\\/\2\u012at\3\2\2\2\u012au\3\2\2\2\u012aw\3\2\2\2\u012a\177\3\2\2\2"+
		"\u012a\u0084\3\2\2\2\u012a\u0089\3\2\2\2\u012a\u008b\3\2\2\2\u012a\u0090"+
		"\3\2\2\2\u012a\u0092\3\2\2\2\u012a\u0097\3\2\2\2\u012a\u009a\3\2\2\2\u012a"+
		"\u009d\3\2\2\2\u012a\u00a3\3\2\2\2\u012a\u00a8\3\2\2\2\u012a\u00aa\3\2"+
		"\2\2\u012a\u00ac\3\2\2\2\u012a\u00b0\3\2\2\2\u012a\u00b2\3\2\2\2\u012a"+
		"\u00c1\3\2\2\2\u012a\u00d0\3\2\2\2\u012a\u00df\3\2\2\2\u012a\u00ee\3\2"+
		"\2\2\u012a\u00f5\3\2\2\2\u012a\u00fa\3\2\2\2\u012a\u0103\3\2\2\2\u012a"+
		"\u010e\3\2\2\2\u012a\u0119\3\2\2\2\u012a\u011c\3\2\2\2\u012a\u0121\3\2"+
		"\2\2\u012a\u0127\3\2\2\2\u012b\t\3\2\2\2\u012c\u012d\7\f\2\2\u012d\u0132"+
		"\5.\30\2\u012e\u012f\7\4\2\2\u012f\u0131\5.\30\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\r\2\2\u0136\u0139\5\60\31\2\u0137"+
		"\u0138\7\23\2\2\u0138\u013a\5\34\17\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u013c\7\21\2\2\u013c\u013e\5D#\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\3\2\2\2\u013f\u0140\7\24"+
		"\2\2\u0140\u0141\7\25\2\2\u0141\u0143\5&\24\2\u0142\u013f\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0147\3\2\2\2\u0144\u0145\7H\2\2\u0145\u0146\7\25"+
		"\2\2\u0146\u0148\5D#\2\u0147\u0144\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u014a\7\26\2\2\u014a\u014c\5D#\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014e\7\n\2\2\u014e\u0150\5\f"+
		"\7\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u0153\5\32\16\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\13\3\2"+
		"\2\2\u0154\u0155\7\13\2\2\u0155\r\3\2\2\2\u0156\u0157\7\5\2\2\u0157\u015c"+
		"\5\20\t\2\u0158\u0159\7\4\2\2\u0159\u015b\5\20\t\2\u015a\u0158\3\2\2\2"+
		"\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7\6\2\2\u0160\17\3\2\2\2\u0161"+
		"\u0162\5\\/\2\u0162\u0164\5T+\2\u0163\u0165\7z\2\2\u0164\u0163\3\2\2\2"+
		"\u0164\u0165\3\2\2\2\u0165\21\3\2\2\2\u0166\u0167\7\5\2\2\u0167\u016c"+
		"\5\24\13\2\u0168\u0169\7\4\2\2\u0169\u016b\5\24\13\2\u016a\u0168\3\2\2"+
		"\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\6\2\2\u0170\23\3\2\2\2\u0171"+
		"\u0174\5\\/\2\u0172\u0174\7\u0092\2\2\u0173\u0171\3\2\2\2\u0173\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\u0084\2\2\u0176\u0177\5b\62"+
		"\2\u0177\25\3\2\2\2\u0178\u0179\7\r\2\2\u0179\u017b\7u\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017e\5\30\r\2"+
		"\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0181"+
		"\5\32\16\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\27\3\2\2\2\u0182"+
		"\u0183\t\4\2\2\u0183\u0184\5`\61\2\u0184\31\3\2\2\2\u0185\u0186\7\27\2"+
		"\2\u0186\u0187\5`\61\2\u0187\33\3\2\2\2\u0188\u018a\7\u0096\2\2\u0189"+
		"\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018f\5\36"+
		"\20\2\u018c\u018f\5 \21\2\u018d\u018f\5\"\22\2\u018e\u018b\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\35\3\2\2\2\u0190\u0191\78\2\2"+
		"\u0191\u0192\7\5\2\2\u0192\u0193\7:\2\2\u0193\u0194\5`\61\2\u0194\u0195"+
		"\5$\23\2\u0195\u0196\7\6\2\2\u0196\37\3\2\2\2\u0197\u0198\79\2\2\u0198"+
		"\u0199\7\5\2\2\u0199\u019a\7:\2\2\u019a\u019b\5`\61\2\u019b\u019c\5$\23"+
		"\2\u019c\u019d\7\4\2\2\u019d\u019e\7;\2\2\u019e\u019f\7\25\2\2\u019f\u01a0"+
		"\5`\61\2\u01a0\u01a1\5$\23\2\u01a1\u01a2\7\6\2\2\u01a2!\3\2\2\2\u01a3"+
		"\u01a4\7p\2\2\u01a4\u01a5\7\5\2\2\u01a5\u01a6\5`\61\2\u01a6\u01a7\5$\23"+
		"\2\u01a7\u01a8\7\6\2\2\u01a8#\3\2\2\2\u01a9\u01aa\t\5\2\2\u01aa%\3\2\2"+
		"\2\u01ab\u01b0\5(\25\2\u01ac\u01ad\7\4\2\2\u01ad\u01af\5(\25\2\u01ae\u01ac"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\'\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\5*\26\2\u01b4)\3\2\2\2\u01b5"+
		"\u01be\7\5\2\2\u01b6\u01bb\5B\"\2\u01b7\u01b8\7\4\2\2\u01b8\u01ba\5B\""+
		"\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01b6\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3\7\6\2\2\u01c1\u01c3\5B"+
		"\"\2\u01c2\u01b5\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3+\3\2\2\2\u01c4\u01cd"+
		"\7\5\2\2\u01c5\u01ca\5J&\2\u01c6\u01c7\7\4\2\2\u01c7\u01c9\5J&\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01c5\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7\6\2\2\u01d0-\3\2\2\2"+
		"\u01d1\u01d6\5B\"\2\u01d2\u01d4\7\16\2\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\5\\/\2\u01d6\u01d3\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01de\3\2\2\2\u01d8\u01d9\5\\/\2\u01d9\u01da\7\7"+
		"\2\2\u01da\u01db\7\u008c\2\2\u01db\u01de\3\2\2\2\u01dc\u01de\7\u008c\2"+
		"\2\u01dd\u01d1\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de/"+
		"\3\2\2\2\u01df\u01e0\5<\37\2\u01e0\u01e1\5\62\32\2\u01e1\u01e2\7A\2\2"+
		"\u01e2\u01e4\5<\37\2\u01e3\u01e5\5\64\33\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5:\36\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01ea\5<\37\2\u01e9\u01df\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\61\3\2\2"+
		"\2\u01eb\u01ed\7D\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f7"+
		"\3\2\2\2\u01ee\u01f0\7B\2\2\u01ef\u01f1\7C\2\2\u01f0\u01ef\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f7\3\2\2\2\u01f2\u01f4\7E\2\2\u01f3\u01f5\7C\2"+
		"\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01ec"+
		"\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f7\63\3\2\2\2\u01f8"+
		"\u01f9\7\22\2\2\u01f9\u01fa\5\66\34\2\u01fa\65\3\2\2\2\u01fb\u01fc\7\5"+
		"\2\2\u01fc\u01fd\58\35\2\u01fd\u01fe\7\4\2\2\u01fe\u01ff\58\35\2\u01ff"+
		"\u0200\7\6\2\2\u0200\u0203\3\2\2\2\u0201\u0203\58\35\2\u0202\u01fb\3\2"+
		"\2\2\u0202\u0201\3\2\2\2\u0203\67\3\2\2\2\u0204\u0205\5`\61\2\u0205\u0206"+
		"\5$\23\2\u02069\3\2\2\2\u0207\u0208\7G\2\2\u0208\u0209\5D#\2\u0209;\3"+
		"\2\2\2\u020a\u020f\5@!\2\u020b\u020d\7\16\2\2\u020c\u020b\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\5^\60\2\u020f\u020c\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210=\3\2\2\2\u0211\u0212\7\5\2\2\u0212\u0217"+
		"\5\\/\2\u0213\u0214\7\4\2\2\u0214\u0216\5\\/\2\u0215\u0213\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u021a\u021b\7\6\2\2\u021b?\3\2\2\2\u021c\u021d"+
		"\5^\60\2\u021dA\3\2\2\2\u021e\u021f\5D#\2\u021fC\3\2\2\2\u0220\u0221\b"+
		"#\1\2\u0221\u0225\5F$\2\u0222\u0223\7\34\2\2\u0223\u0225\5D#\5\u0224\u0220"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u022e\3\2\2\2\u0226\u0227\f\4\2\2\u0227"+
		"\u0228\7\32\2\2\u0228\u022d\5D#\5\u0229\u022a\f\3\2\2\u022a\u022b\7\31"+
		"\2\2\u022b\u022d\5D#\4\u022c\u0226\3\2\2\2\u022c\u0229\3\2\2\2\u022d\u0230"+
		"\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022fE\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\5J&\2\u0232\u0234\5H%\2\u0233\u0232\3\2\2\2"+
		"\u0233\u0234\3\2\2\2\u0234G\3\2\2\2\u0235\u0236\5P)\2\u0236\u0237\5J&"+
		"\2\u0237\u0261\3\2\2\2\u0238\u023a\7\34\2\2\u0239\u0238\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\36\2\2\u023c\u023d\5"+
		"J&\2\u023d\u023e\7\32\2\2\u023e\u023f\5J&\2\u023f\u0261\3\2\2\2\u0240"+
		"\u0242\7\34\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3"+
		"\2\2\2\u0243\u0244\7\33\2\2\u0244\u0245\7\5\2\2\u0245\u024a\5B\"\2\u0246"+
		"\u0247\7\4\2\2\u0247\u0249\5B\"\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2"+
		"\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024d\u024e\7\6\2\2\u024e\u0261\3\2\2\2\u024f\u0251\7\34"+
		"\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\7\37\2\2\u0253\u0261\5J&\2\u0254\u0256\7 \2\2\u0255\u0257\7\34"+
		"\2\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0261\7!\2\2\u0259\u025b\7 \2\2\u025a\u025c\7\34\2\2\u025b\u025a\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7\20\2\2\u025e"+
		"\u025f\7\r\2\2\u025f\u0261\5J&\2\u0260\u0235\3\2\2\2\u0260\u0239\3\2\2"+
		"\2\u0260\u0241\3\2\2\2\u0260\u0250\3\2\2\2\u0260\u0254\3\2\2\2\u0260\u0259"+
		"\3\2\2\2\u0261I\3\2\2\2\u0262\u0263\b&\1\2\u0263\u0267\5L\'\2\u0264\u0265"+
		"\t\6\2\2\u0265\u0267\5J&\6\u0266\u0262\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0276\3\2\2\2\u0268\u0269\f\5\2\2\u0269\u026a\t\7\2\2\u026a\u0275\5J"+
		"&\6\u026b\u026c\f\4\2\2\u026c\u026d\t\6\2\2\u026d\u0275\5J&\5\u026e\u026f"+
		"\f\3\2\2\u026f\u0270\7\u008f\2\2\u0270\u0275\5J&\4\u0271\u0272\f\7\2\2"+
		"\u0272\u0273\7\30\2\2\u0273\u0275\5N(\2\u0274\u0268\3\2\2\2\u0274\u026b"+
		"\3\2\2\2\u0274\u026e\3\2\2\2\u0274\u0271\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277K\3\2\2\2\u0278\u0276\3\2\2\2"+
		"\u0279\u027a\b\'\1\2\u027a\u02ec\5b\62\2\u027b\u027c\5\\/\2\u027c\u027d"+
		"\7\u0092\2\2\u027d\u02ec\3\2\2\2\u027e\u027f\7<\2\2\u027f\u0281\5J&\2"+
		"\u0280\u0282\5Z.\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0286\7?\2\2\u0286"+
		"\u0288\5B\"\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2"+
		"\2\2\u0289\u028a\7@\2\2\u028a\u02ec\3\2\2\2\u028b\u028d\7<\2\2\u028c\u028e"+
		"\5Z.\2\u028d\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u028d\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u0292\7?\2\2\u0292\u0294\5B\""+
		"\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296"+
		"\7@\2\2\u0296\u02ec\3\2\2\2\u0297\u0298\7[\2\2\u0298\u0299\7\5\2\2\u0299"+
		"\u029a\5B\"\2\u029a\u029b\7\16\2\2\u029b\u029c\5T+\2\u029c\u029d\7\6\2"+
		"\2\u029d\u02ec\3\2\2\2\u029e\u029f\7l\2\2\u029f\u02a8\7\b\2\2\u02a0\u02a5"+
		"\5B\"\2\u02a1\u02a2\7\4\2\2\u02a2\u02a4\5B\"\2\u02a3\u02a1\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a9\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a0\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ec\7\t\2\2\u02ab\u02ac\7m\2\2\u02ac\u02ba\7\5"+
		"\2\2\u02ad\u02ae\5B\"\2\u02ae\u02af\7\u0090\2\2\u02af\u02b7\5B\"\2\u02b0"+
		"\u02b1\7\4\2\2\u02b1\u02b2\5B\"\2\u02b2\u02b3\7\u0090\2\2\u02b3\u02b4"+
		"\5B\"\2\u02b4\u02b6\3\2\2\2\u02b5\u02b0\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02ba\u02ad\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"\u02ec\7\6\2\2\u02bd\u02be\7I\2\2\u02be\u02cc\7\5\2\2\u02bf\u02c0\5\\"+
		"/\2\u02c0\u02c1\7\u0090\2\2\u02c1\u02c9\5B\"\2\u02c2\u02c3\7\4\2\2\u02c3"+
		"\u02c4\5\\/\2\u02c4\u02c5\7\u0090\2\2\u02c5\u02c6\5B\"\2\u02c6\u02c8\3"+
		"\2\2\2\u02c7\u02c2\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02bf\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02ec\7\6\2\2\u02cf"+
		"\u02d0\5\\/\2\u02d0\u02d1\7\5\2\2\u02d1\u02d2\7\u008c\2\2\u02d2\u02d3"+
		"\7\6\2\2\u02d3\u02ec\3\2\2\2\u02d4\u02d5\5\\/\2\u02d5\u02de\7\5\2\2\u02d6"+
		"\u02db\5B\"\2\u02d7\u02d8\7\4\2\2\u02d8\u02da\5B\"\2\u02d9\u02d7\3\2\2"+
		"\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df"+
		"\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02d6\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e1\7\6\2\2\u02e1\u02ec\3\2\2\2\u02e2\u02ec\5\\"+
		"/\2\u02e3\u02e4\5\\/\2\u02e4\u02e5\7\7\2\2\u02e5\u02e6\5\\/\2\u02e6\u02ec"+
		"\3\2\2\2\u02e7\u02e8\7\5\2\2\u02e8\u02e9\5B\"\2\u02e9\u02ea\7\6\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u0279\3\2\2\2\u02eb\u027b\3\2\2\2\u02eb\u027e\3\2"+
		"\2\2\u02eb\u028b\3\2\2\2\u02eb\u0297\3\2\2\2\u02eb\u029e\3\2\2\2\u02eb"+
		"\u02ab\3\2\2\2\u02eb\u02bd\3\2\2\2\u02eb\u02cf\3\2\2\2\u02eb\u02d4\3\2"+
		"\2\2\u02eb\u02e2\3\2\2\2\u02eb\u02e3\3\2\2\2\u02eb\u02e7\3\2\2\2\u02ec"+
		"\u02f7\3\2\2\2\u02ed\u02ee\f\7\2\2\u02ee\u02ef\7\b\2\2\u02ef\u02f0\5J"+
		"&\2\u02f0\u02f1\7\t\2\2\u02f1\u02f6\3\2\2\2\u02f2\u02f3\f\4\2\2\u02f3"+
		"\u02f4\7\u0091\2\2\u02f4\u02f6\5\\/\2\u02f5\u02ed\3\2\2\2\u02f5\u02f2"+
		"\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"M\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\7&\2\2\u02fb\u02fc\7\67\2\2"+
		"\u02fc\u02fd\7\u0092\2\2\u02fdO\3\2\2\2\u02fe\u02ff\t\b\2\2\u02ffQ\3\2"+
		"\2\2\u0300\u0301\t\t\2\2\u0301S\3\2\2\2\u0302\u0303\b+\1\2\u0303\u0304"+
		"\7l\2\2\u0304\u0305\7\u0086\2\2\u0305\u0306\5T+\2\u0306\u0307\7\u0088"+
		"\2\2\u0307\u0335\3\2\2\2\u0308\u0309\7m\2\2\u0309\u030a\7\u0086\2\2\u030a"+
		"\u030b\5T+\2\u030b\u030c\7\4\2\2\u030c\u030d\5T+\2\u030d\u030e\7\u0088"+
		"\2\2\u030e\u0335\3\2\2\2\u030f\u0310\7I\2\2\u0310\u031c\7\u0086\2\2\u0311"+
		"\u0312\5\\/\2\u0312\u0319\5T+\2\u0313\u0314\7\4\2\2\u0314\u0315\5\\/\2"+
		"\u0315\u0316\5T+\2\u0316\u0318\3\2\2\2\u0317\u0313\3\2\2\2\u0318\u031b"+
		"\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031d\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031c\u0311\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2"+
		"\2\2\u031e\u0335\7\u0088\2\2\u031f\u0320\7y\2\2\u0320\u0321\7\5\2\2\u0321"+
		"\u0322\5`\61\2\u0322\u0323\7\4\2\2\u0323\u0324\5`\61\2\u0324\u0325\7\6"+
		"\2\2\u0325\u0335\3\2\2\2\u0326\u0332\5X-\2\u0327\u0328\7\5\2\2\u0328\u032d"+
		"\5V,\2\u0329\u032a\7\4\2\2\u032a\u032c\5V,\2\u032b\u0329\3\2\2\2\u032c"+
		"\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2"+
		"\2\2\u032f\u032d\3\2\2\2\u0330\u0331\7\6\2\2\u0331\u0333\3\2\2\2\u0332"+
		"\u0327\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0302\3\2"+
		"\2\2\u0334\u0308\3\2\2\2\u0334\u030f\3\2\2\2\u0334\u031f\3\2\2\2\u0334"+
		"\u0326\3\2\2\2\u0335\u033a\3\2\2\2\u0336\u0337\f\b\2\2\u0337\u0339\7l"+
		"\2\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033bU\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0340\7\u0093"+
		"\2\2\u033e\u0340\5T+\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u0340W"+
		"\3\2\2\2\u0341\u0342\5\\/\2\u0342Y\3\2\2\2\u0343\u0344\7=\2\2\u0344\u0345"+
		"\5B\"\2\u0345\u0346\7>\2\2\u0346\u0347\5B\"\2\u0347[\3\2\2\2\u0348\u034e"+
		"\7\u0096\2\2\u0349\u034e\7\u0098\2\2\u034a\u034e\5d\63\2\u034b\u034e\7"+
		"\u0099\2\2\u034c\u034e\7\u0097\2\2\u034d\u0348\3\2\2\2\u034d\u0349\3\2"+
		"\2\2\u034d\u034a\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034c\3\2\2\2\u034e"+
		"]\3\2\2\2\u034f\u0350\5\\/\2\u0350_\3\2\2\2\u0351\u0355\7\u0094\2\2\u0352"+
		"\u0355\7\u0095\2\2\u0353\u0355\7\u0093\2\2\u0354\u0351\3\2\2\2\u0354\u0352"+
		"\3\2\2\2\u0354\u0353\3\2\2\2\u0355a\3\2\2\2\u0356\u035b\7!\2\2\u0357\u035b"+
		"\5`\61\2\u0358\u035b\5R*\2\u0359\u035b\7\u0092\2\2\u035a\u0356\3\2\2\2"+
		"\u035a\u0357\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035bc\3"+
		"\2\2\2\u035c\u035d\t\n\2\2\u035de\3\2\2\2giy}\u0082\u0087\u008d\u0094"+
		"\u00a0\u00a6\u00b7\u00bb\u00bf\u00c6\u00cb\u00d5\u00d9\u00dd\u00e4\u00e9"+
		"\u00fe\u0107\u010c\u0112\u0117\u011f\u012a\u0132\u0139\u013d\u0142\u0147"+
		"\u014b\u014f\u0152\u015c\u0164\u016c\u0173\u017a\u017d\u0180\u0189\u018e"+
		"\u01b0\u01bb\u01be\u01c2\u01ca\u01cd\u01d3\u01d6\u01dd\u01e4\u01e9\u01ec"+
		"\u01f0\u01f4\u01f6\u0202\u020c\u020f\u0217\u0224\u022c\u022e\u0233\u0239"+
		"\u0241\u024a\u0250\u0256\u025b\u0260\u0266\u0274\u0276\u0283\u0287\u028f"+
		"\u0293\u02a5\u02a8\u02b7\u02ba\u02c9\u02cc\u02db\u02de\u02eb\u02f5\u02f7"+
		"\u0319\u031c\u032d\u0332\u0334\u033a\u033f\u034d\u0354\u035a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}