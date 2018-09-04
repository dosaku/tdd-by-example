package money;

public interface Expression {

    public Expression plus(Expression addend);

    public Expression times(int multiplier);

    public Money reduce(Bank bank, String to);

}
