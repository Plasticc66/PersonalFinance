
public class envelopes {

	String envelope;
	double value;
	currency currency;

	public envelopes(String envelope) {
		super();
		this.envelope = envelope;
		this.value = 0;

	}

	public void getEnvelope() throws Exception {
	}

	public double plus(double num) throws Exception {
		if (num > 0) {
			this.value += num;

		} else {
			System.out.println("a negative number");
		}
		return this.value;
	}

	public double withdraw(double num) throws Exception {
		if (num > 0) {
		} else {
			System.out.println("a negative number");
		}

		return num;

	}

	public double change(double newValue) {
		if (newValue > 0) {
			this.value = newValue;
		} else {
			System.out.println("a negative number");
		}
		return value;
	}

}
