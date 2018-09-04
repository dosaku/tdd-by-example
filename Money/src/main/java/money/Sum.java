package money;

public class Sum implements Expression {

    private Expression augend;
    private Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount()
                + addend.reduce(bank, to).amount();
        return new Money(amount, to);
    }

    public Expression augend() {
        return augend;
    }

    public Expression addend() {
        return addend;
    }

}
