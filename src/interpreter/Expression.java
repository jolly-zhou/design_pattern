package interpreter;

/**
 * 抽象解释器
 * Created by jolly on 2017/4/25.
 */
public abstract  class Expression {

    /**
     * 解释方法
     *
     * @param ctx
     */
    public abstract void interpret(Context ctx);
}
