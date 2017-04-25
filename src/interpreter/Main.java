package interpreter;

/**
 * 解释器模式:<br/>
 * Interpreter模式也叫解释器模式，是行为模式之一，它是一种特殊的设计模式，它建立一个解释器，
 * 对于特定的计算机程序设计语言，用来解释预先定义的文法。
 * 简单地说，Interpreter模式是一种简单的语法解释器构架
 *
 * Created by jolly on 2017/4/25.
 */
public class Main {

    public static void main(String[] args) {

        Context ctx = new Context("10");
        Expression pe = new PlusExpression();
        pe.interpret(ctx);
        System.out.println(ctx.getOutput());

        Expression me = new MinusExpression();
        me.interpret(ctx);
        System.out.println(ctx.getOutput());
    }
}
