import java.util.Scanner;

public class newEnvelopeIsNotUsing extends envelopes {

	public newEnvelopeIsNotUsing(String envelope) {
		super(envelope);

	}

	int n = 0;

	@SuppressWarnings("static-access")
	public envelopes createEnvelope() {
		n++;
		@SuppressWarnings("resource")
		envelopes newEnvelope = new envelopes("");
		Scanner scan = new Scanner(System.in);
		System.out.println("ruble or dollaz?");
		newEnvelope.currency = currency.valueOf(scan.nextLine().replace(" ", "").toLowerCase());
		System.out.println("name envelopes:");
		newEnvelope.envelope = scan.next(toString());
		System.out.println("add? (y/n)");
		char answer = (scan.next(toString())).charAt(0);
		switch (answer) {
		case ('y'):
			System.out.println("how much)");
		newEnvelope.value = scan.nextDouble();
			break;
		case ('n'):
			break;
		default:
			System.out.println("error: non-correct data");
		}
		
//		¿ «¿◊≈Ã ŒÕ Õ”∆≈Õ

		return newEnvelope;

	}

}
