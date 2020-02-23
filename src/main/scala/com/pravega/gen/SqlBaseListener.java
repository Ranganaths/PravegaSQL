// Generated from /home/ranganaths/IdeaProjects/PravegaSQL/src/main/scala/com/pravega/antlr/SqlBase.g4 by ANTLR 4.8
package .;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlBaseParser}.
 */
public interface SqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SqlBaseParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SqlBaseParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(SqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(SqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterQueryStatement(SqlBaseParser.QueryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitQueryStatement(SqlBaseParser.QueryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListProperties(SqlBaseParser.ListPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListProperties(SqlBaseParser.ListPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listTopics}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListTopics(SqlBaseParser.ListTopicsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listTopics}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListTopics(SqlBaseParser.ListTopicsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listStreams}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListStreams(SqlBaseParser.ListStreamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listStreams}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListStreams(SqlBaseParser.ListStreamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listTables}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListTables(SqlBaseParser.ListTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listTables}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListTables(SqlBaseParser.ListTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listFunctions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListFunctions(SqlBaseParser.ListFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listFunctions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListFunctions(SqlBaseParser.ListFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listConnectors}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListConnectors(SqlBaseParser.ListConnectorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listConnectors}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListConnectors(SqlBaseParser.ListConnectorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listTypes}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListTypes(SqlBaseParser.ListTypesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listTypes}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListTypes(SqlBaseParser.ListTypesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeConnector}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeConnector(SqlBaseParser.DescribeConnectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeConnector}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeConnector(SqlBaseParser.DescribeConnectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printTopic}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintTopic(SqlBaseParser.PrintTopicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printTopic}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintTopic(SqlBaseParser.PrintTopicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listQueries}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterListQueries(SqlBaseParser.ListQueriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listQueries}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitListQueries(SqlBaseParser.ListQueriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code terminateQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTerminateQuery(SqlBaseParser.TerminateQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code terminateQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTerminateQuery(SqlBaseParser.TerminateQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setProperty}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetProperty(SqlBaseParser.SetPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setProperty}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetProperty(SqlBaseParser.SetPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetProperty}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetProperty(SqlBaseParser.UnsetPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetProperty}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetProperty(SqlBaseParser.UnsetPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createStream}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStream(SqlBaseParser.CreateStreamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createStream}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStream(SqlBaseParser.CreateStreamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createStreamAs}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStreamAs(SqlBaseParser.CreateStreamAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createStreamAs}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStreamAs(SqlBaseParser.CreateStreamAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SqlBaseParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SqlBaseParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableAs}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableAs(SqlBaseParser.CreateTableAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableAs}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableAs(SqlBaseParser.CreateTableAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createConnector}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateConnector(SqlBaseParser.CreateConnectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createConnector}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateConnector(SqlBaseParser.CreateConnectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(SqlBaseParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(SqlBaseParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertValues}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertValues(SqlBaseParser.InsertValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertValues}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertValues(SqlBaseParser.InsertValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropStream}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropStream(SqlBaseParser.DropStreamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropStream}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropStream(SqlBaseParser.DropStreamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SqlBaseParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SqlBaseParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropConnector}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropConnector(SqlBaseParser.DropConnectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropConnector}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropConnector(SqlBaseParser.DropConnectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SqlBaseParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SqlBaseParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code registerType}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRegisterType(SqlBaseParser.RegisterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code registerType}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRegisterType(SqlBaseParser.RegisterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropType}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropType(SqlBaseParser.DropTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropType}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropType(SqlBaseParser.DropTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#resultMaterialization}.
	 * @param ctx the parse tree
	 */
	void enterResultMaterialization(SqlBaseParser.ResultMaterializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#resultMaterialization}.
	 * @param ctx the parse tree
	 */
	void exitResultMaterialization(SqlBaseParser.ResultMaterializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableElements}.
	 * @param ctx the parse tree
	 */
	void enterTableElements(SqlBaseParser.TableElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableElements}.
	 * @param ctx the parse tree
	 */
	void exitTableElements(SqlBaseParser.TableElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(SqlBaseParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(SqlBaseParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void enterTableProperties(SqlBaseParser.TablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void exitTableProperties(SqlBaseParser.TablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(SqlBaseParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(SqlBaseParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#printClause}.
	 * @param ctx the parse tree
	 */
	void enterPrintClause(SqlBaseParser.PrintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#printClause}.
	 * @param ctx the parse tree
	 */
	void exitPrintClause(SqlBaseParser.PrintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#intervalClause}.
	 * @param ctx the parse tree
	 */
	void enterIntervalClause(SqlBaseParser.IntervalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#intervalClause}.
	 * @param ctx the parse tree
	 */
	void exitIntervalClause(SqlBaseParser.IntervalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlBaseParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlBaseParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#windowExpression}.
	 * @param ctx the parse tree
	 */
	void enterWindowExpression(SqlBaseParser.WindowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#windowExpression}.
	 * @param ctx the parse tree
	 */
	void exitWindowExpression(SqlBaseParser.WindowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tumblingWindowExpression}.
	 * @param ctx the parse tree
	 */
	void enterTumblingWindowExpression(SqlBaseParser.TumblingWindowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tumblingWindowExpression}.
	 * @param ctx the parse tree
	 */
	void exitTumblingWindowExpression(SqlBaseParser.TumblingWindowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#hoppingWindowExpression}.
	 * @param ctx the parse tree
	 */
	void enterHoppingWindowExpression(SqlBaseParser.HoppingWindowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#hoppingWindowExpression}.
	 * @param ctx the parse tree
	 */
	void exitHoppingWindowExpression(SqlBaseParser.HoppingWindowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#sessionWindowExpression}.
	 * @param ctx the parse tree
	 */
	void enterSessionWindowExpression(SqlBaseParser.SessionWindowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#sessionWindowExpression}.
	 * @param ctx the parse tree
	 */
	void exitSessionWindowExpression(SqlBaseParser.SessionWindowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#windowUnit}.
	 * @param ctx the parse tree
	 */
	void enterWindowUnit(SqlBaseParser.WindowUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#windowUnit}.
	 * @param ctx the parse tree
	 */
	void exitWindowUnit(SqlBaseParser.WindowUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void enterGroupBy(SqlBaseParser.GroupByContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void exitGroupBy(SqlBaseParser.GroupByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link SqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterSingleGroupingSet(SqlBaseParser.SingleGroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link SqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitSingleGroupingSet(SqlBaseParser.SingleGroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#groupingExpressions}.
	 * @param ctx the parse tree
	 */
	void enterGroupingExpressions(SqlBaseParser.GroupingExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#groupingExpressions}.
	 * @param ctx the parse tree
	 */
	void exitGroupingExpressions(SqlBaseParser.GroupingExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link SqlBaseParser#statementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementgroupingElementselectItemselectItemrelationrelationjoinTypejoinTypejoinTypewithinExpressionwithinExpressionrelationPrimarybooleanExpressionbooleanExpressionbooleanExpressionpredicatepredicatepredicatepredicatepredicatepredicatevalueExpressionvalueExpressionvalueExpressionvalueExpressionvalueExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressiontimeZoneSpecifieridentifieridentifieridentifieridentifiernumbernumbernumberliteralliteralliteralliteral}.
	 * @param ctx the parse tree
	 */
	void enterValues(SqlBaseParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link SqlBaseParser#statementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementstatementgroupingElementselectItemselectItemrelationrelationjoinTypejoinTypejoinTypewithinExpressionwithinExpressionrelationPrimarybooleanExpressionbooleanExpressionbooleanExpressionpredicatepredicatepredicatepredicatepredicatepredicatevalueExpressionvalueExpressionvalueExpressionvalueExpressionvalueExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressionprimaryExpressiontimeZoneSpecifieridentifieridentifieridentifieridentifiernumbernumbernumberliteralliteralliteralliteral}.
	 * @param ctx the parse tree
	 */
	void exitValues(SqlBaseParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectSingle(SqlBaseParser.SelectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectSingle(SqlBaseParser.SelectSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(SqlBaseParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(SqlBaseParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(SqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(SqlBaseParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(SqlBaseParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(SqlBaseParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(SqlBaseParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(SqlBaseParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(SqlBaseParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(SqlBaseParser.OuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftJoin}
	 * labeled alternative in {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterLeftJoin(SqlBaseParser.LeftJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftJoin}
	 * labeled alternative in {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitLeftJoin(SqlBaseParser.LeftJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinWindow}.
	 * @param ctx the parse tree
	 */
	void enterJoinWindow(SqlBaseParser.JoinWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinWindow}.
	 * @param ctx the parse tree
	 */
	void exitJoinWindow(SqlBaseParser.JoinWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinWindowWithBeforeAndAfter}
	 * labeled alternative in {@link SqlBaseParser#withinExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinWindowWithBeforeAndAfter(SqlBaseParser.JoinWindowWithBeforeAndAfterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinWindowWithBeforeAndAfter}
	 * labeled alternative in {@link SqlBaseParser#withinExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinWindowWithBeforeAndAfter(SqlBaseParser.JoinWindowWithBeforeAndAfterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleJoinWindow}
	 * labeled alternative in {@link SqlBaseParser#withinExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleJoinWindow(SqlBaseParser.SingleJoinWindowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleJoinWindow}
	 * labeled alternative in {@link SqlBaseParser#withinExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleJoinWindow(SqlBaseParser.SingleJoinWindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinWindowSize}.
	 * @param ctx the parse tree
	 */
	void enterJoinWindowSize(SqlBaseParser.JoinWindowSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinWindowSize}.
	 * @param ctx the parse tree
	 */
	void exitJoinWindowSize(SqlBaseParser.JoinWindowSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#aliasedRelation}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(SqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#aliasedRelation}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(SqlBaseParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(SqlBaseParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(SqlBaseParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(SqlBaseParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetween(SqlBaseParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetween(SqlBaseParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInList(SqlBaseParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInList(SqlBaseParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLike(SqlBaseParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLike(SqlBaseParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(SqlBaseParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(SqlBaseParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterDistinctFrom(SqlBaseParser.DistinctFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitDistinctFrom(SqlBaseParser.DistinctFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(SqlBaseParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(SqlBaseParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeZone(SqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeZone(SqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SqlBaseParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStructConstructor(SqlBaseParser.StructConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStructConstructor(SqlBaseParser.StructConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualifiedColumnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColumnReference(SqlBaseParser.QualifiedColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualifiedColumnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColumnReference(SqlBaseParser.QualifiedColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(SqlBaseParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(SqlBaseParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(SqlBaseParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(SqlBaseParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterMapConstructor(SqlBaseParser.MapConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitMapConstructor(SqlBaseParser.MapConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(SqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(SqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SqlBaseParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SqlBaseParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneString(SqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneString(SqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SqlBaseParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SqlBaseParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(SqlBaseParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(SqlBaseParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(SqlBaseParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(SqlBaseParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(SqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(SqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterDigitIdentifier(SqlBaseParser.DigitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitDigitIdentifier(SqlBaseParser.DigitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#sourceName}.
	 * @param ctx the parse tree
	 */
	void enterSourceName(SqlBaseParser.SourceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#sourceName}.
	 * @param ctx the parse tree
	 */
	void exitSourceName(SqlBaseParser.SourceNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(SqlBaseParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(SqlBaseParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SqlBaseParser.NonReservedContext ctx);
}