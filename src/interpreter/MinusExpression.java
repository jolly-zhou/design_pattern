package interpreter;

/**
 * Created by jolly on 2017/4/25.
 */
public class MinusExpression extends Expression {
    @Override
    public void interpret(Context ctx) {
        String input = ctx.getInput();
        int inputInt = Integer.parseInt(input);
        inputInt--;

        ctx.setInput(String.valueOf(inputInt));
        ctx.setOutput(inputInt);
    }
}
