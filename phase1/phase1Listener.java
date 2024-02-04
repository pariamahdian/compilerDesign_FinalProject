// Generated from phase1.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link phase1Parser}.
 */
public interface phase1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link phase1Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(phase1Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(phase1Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#funcList}.
	 * @param ctx the parse tree
	 */
	void enterFuncList(phase1Parser.FuncListContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#funcList}.
	 * @param ctx the parse tree
	 */
	void exitFuncList(phase1Parser.FuncListContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#funcList2}.
	 * @param ctx the parse tree
	 */
	void enterFuncList2(phase1Parser.FuncList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#funcList2}.
	 * @param ctx the parse tree
	 */
	void exitFuncList2(phase1Parser.FuncList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(phase1Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(phase1Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(phase1Parser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(phase1Parser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#paramList2}.
	 * @param ctx the parse tree
	 */
	void enterParamList2(phase1Parser.ParamList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#paramList2}.
	 * @param ctx the parse tree
	 */
	void exitParamList2(phase1Parser.ParamList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(phase1Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(phase1Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(phase1Parser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(phase1Parser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(phase1Parser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(phase1Parser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(phase1Parser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(phase1Parser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(phase1Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(phase1Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2(phase1Parser.Stmt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2(phase1Parser.Stmt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#stmt3}.
	 * @param ctx the parse tree
	 */
	void enterStmt3(phase1Parser.Stmt3Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#stmt3}.
	 * @param ctx the parse tree
	 */
	void exitStmt3(phase1Parser.Stmt3Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(phase1Parser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(phase1Parser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#initStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitStmt(phase1Parser.InitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#initStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitStmt(phase1Parser.InitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#postStmt}.
	 * @param ctx the parse tree
	 */
	void enterPostStmt(phase1Parser.PostStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#postStmt}.
	 * @param ctx the parse tree
	 */
	void exitPostStmt(phase1Parser.PostStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#postStmt2}.
	 * @param ctx the parse tree
	 */
	void enterPostStmt2(phase1Parser.PostStmt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#postStmt2}.
	 * @param ctx the parse tree
	 */
	void exitPostStmt2(phase1Parser.PostStmt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(phase1Parser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(phase1Parser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#varList2}.
	 * @param ctx the parse tree
	 */
	void enterVarList2(phase1Parser.VarList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#varList2}.
	 * @param ctx the parse tree
	 */
	void exitVarList2(phase1Parser.VarList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(phase1Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(phase1Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#var2}.
	 * @param ctx the parse tree
	 */
	void enterVar2(phase1Parser.Var2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#var2}.
	 * @param ctx the parse tree
	 */
	void exitVar2(phase1Parser.Var2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(phase1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(phase1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(phase1Parser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(phase1Parser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(phase1Parser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(phase1Parser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(phase1Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(phase1Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#args2}.
	 * @param ctx the parse tree
	 */
	void enterArgs2(phase1Parser.Args2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#args2}.
	 * @param ctx the parse tree
	 */
	void exitArgs2(phase1Parser.Args2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(phase1Parser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(phase1Parser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prec1}.
	 * @param ctx the parse tree
	 */
	void enterPrec1(phase1Parser.Prec1Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prec1}.
	 * @param ctx the parse tree
	 */
	void exitPrec1(phase1Parser.Prec1Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prec2}.
	 * @param ctx the parse tree
	 */
	void enterPrec2(phase1Parser.Prec2Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prec2}.
	 * @param ctx the parse tree
	 */
	void exitPrec2(phase1Parser.Prec2Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prec3}.
	 * @param ctx the parse tree
	 */
	void enterPrec3(phase1Parser.Prec3Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prec3}.
	 * @param ctx the parse tree
	 */
	void exitPrec3(phase1Parser.Prec3Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prec4}.
	 * @param ctx the parse tree
	 */
	void enterPrec4(phase1Parser.Prec4Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prec4}.
	 * @param ctx the parse tree
	 */
	void exitPrec4(phase1Parser.Prec4Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prec5}.
	 * @param ctx the parse tree
	 */
	void enterPrec5(phase1Parser.Prec5Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prec5}.
	 * @param ctx the parse tree
	 */
	void exitPrec5(phase1Parser.Prec5Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prec6}.
	 * @param ctx the parse tree
	 */
	void enterPrec6(phase1Parser.Prec6Context ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prec6}.
	 * @param ctx the parse tree
	 */
	void exitPrec6(phase1Parser.Prec6Context ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(phase1Parser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(phase1Parser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(phase1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(phase1Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(phase1Parser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(phase1Parser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(phase1Parser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(phase1Parser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(phase1Parser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(phase1Parser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(phase1Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(phase1Parser.IdContext ctx);
}