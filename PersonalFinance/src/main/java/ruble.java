
public class ruble extends envelopes {

	public ruble(String envelope) {
		super(envelope);
		this.currency = currency.rub;
		// TODO Auto-generated constructor stub
	}

	public void getEnvelope() {
		System.out.println(envelope + " = " + value + " " + currency);

	}

	public double withdraw(double num) {
		if (this.value - num > 0) {
			this.value -= num;

		} else {
			System.out.println("ATTENCION. bro, " + num + " rub its more then u have, life is shit,  sorry");
		}
		return value;
	}

}
