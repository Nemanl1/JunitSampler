package arg;

public class TestData {

    private int arg1;

    private int arg2;

    private int result;

    public TestData(int arg1, int arg2, int result) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }

    public int getArg1() {
        return arg1;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}