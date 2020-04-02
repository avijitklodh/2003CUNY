package codes.newell.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class BankCurrency {
	private static NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
	static {
		usnf.setMinimumFractionDigits(1);
		usnf.setMaximumFractionDigits(2);
	}
	private BigDecimal value = new BigDecimal(0).setScale(2, RoundingMode.HALF_EVEN);

	public BankCurrency() {
	}

	public BankCurrency(String value) {
		setValue(value);
	}

	public BigDecimal getRawValue() {
		return value;
	}

	public String getFomattedValue() {
		return usnf.format(this.value.doubleValue());
	}

	public void setRawValue(BigDecimal value) {
		this.value = value.setScale(2, RoundingMode.HALF_EVEN);
	}

	public void setValue(String value) {
		setRawValue(new BigDecimal(value));
	}

	public void add(BankCurrency amount) {
		BigDecimal val = this.value.add(amount.getRawValue());
		this.setRawValue(val);
	}
}
