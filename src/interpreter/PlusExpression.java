package interpreter;

/**
 * Created by jolly on 2017/4/25.
 */
public class PlusExpression extends Expression {
    @Override
    public void interpret(Context ctx) {
        System.out.println("++表达式");
        String input = ctx.getInput();
        int inputInt = Integer.parseInt(input);
        ++inputInt;

        ctx.setInput(String.valueOf(inputInt));
        ctx.setOutput(inputInt);
    }
}
