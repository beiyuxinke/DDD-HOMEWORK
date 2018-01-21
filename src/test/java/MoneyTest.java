import java.math.BigDecimal;

import org.fest.assertions.internal.BigDecimals;
import org.junit.Test;

import Money.Money;
import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MoneyTest {
    @Test
    public void money_equal_test() {
        //given
        Money money1 = new Money(2);
        Money money2 = new Money(3);

        boolean isEqual = money1.equal(money2);

        //then
        assertThat(isEqual).isEqualTo(false);
    }

    @Test
    public void money_add_test() {
        //given
        Money money1 = new Money(2);
        Money money2 = new Money(3);

        BigDecimal addAmount = money1.add(money2);

        //then
        assertThat(addAmount).isEqualTo(new BigDecimal(5));
    }

    @Test
    public void money_minor_test() {
        //given
        Money money1 = new Money(2);
        Money money2 = new Money(3);

        BigDecimal minorAmount = money1.minor(money2);

        //then
        assertThat(minorAmount).isEqualTo(new BigDecimal(-1));
    }

    @Test
    public void money_precision_test() {
        //given
        Money money1 = new Money(2.22);
       // Money money2 = new Money(3.33);

        boolean isPrecision = money1.certifyPrecision();

        //then
        assertThat(isPrecision).isEqualTo(true);
    }

}
