package interpreter;

/**
 * 上下文环境,用来保存文法
 *
 * Created by jolly on 2017/4/25.
 */
public class Context {

    public Context(String input) {
        this.input = input;
    }

    private String input;

    private int output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
