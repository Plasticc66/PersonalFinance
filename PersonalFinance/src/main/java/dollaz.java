import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class dollaz extends envelopes {

	@SuppressWarnings("static-access")
	public dollaz(String envelope) {
		super(envelope);
		this.currency = currency.usd;
		// TODO Auto-generated constructor stub
	}

// курс доллара__________________________________________________________________________________________________
	public static Document getSite() throws MalformedURLException, IOException {
		String url = "https://www.profinance.ru/currency_usd.asp";
		Document site = Jsoup.parse(new URL(url), 3000);
		return site;

	}

	private static Pattern numUsd = Pattern.compile("\\d{2}\\.\\d{4}");

	private static String getNumUsd(String strUsd) throws Exception {
		Matcher numMatcher = numUsd.matcher(strUsd);
		if (numMatcher.find()) {
			return numMatcher.group();
		}
		throw new Exception("can't extract date from this string");

	}

// доллары в рублях____________________________________________________________________________________________
	public double getRateUsd() throws Exception {

		Document site = getSite();
		Element tableUsd = site.select("table[width=948]").first();
		String moreExchangeRate = tableUsd.select("font[color]").first().text();
		String valuesUsd = getNumUsd(moreExchangeRate);
		double rateUsd = Double.parseDouble(valuesUsd);
		return rateUsd;

	}

	public double calculate() throws Exception {
		if ((boolean) ((this.value % getRateUsd() < getRateUsd() && this.value % getRateUsd() > getRateUsd() - 0.001))
				|| this.value % getRateUsd() == 0) {
			this.value /= getRateUsd();
		}
		value *= getRateUsd();

		return value;
	}

	public void getRateString() throws Exception {

		System.out.println("\ncurrent dollar exchange rate = " + getRateUsd() + "\n");

	}

	public double plus(double num) throws Exception {
		if ((boolean) ((this.value % getRateUsd() < getRateUsd() && this.value % getRateUsd() > getRateUsd() - 0.001))
				|| this.value % getRateUsd() == 0) {
			this.value /= getRateUsd();
		}
		this.value += num;
		return this.value;
	}

	public void getEnvelope() throws Exception {
		if ((boolean) ((this.value % getRateUsd() < getRateUsd() && this.value % getRateUsd() > getRateUsd() - 0.001))
				|| this.value % getRateUsd() == 0) {
			this.value /= getRateUsd();
		}

		try {
			System.out.println(envelope + " = " + value + " " + currency + " = " + calculate() + " in rub");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public double withdraw(double num) throws Exception {

		if ((boolean) (this.value % getRateUsd() < getRateUsd() && this.value % getRateUsd() > getRateUsd() - 0.001)) {
			this.value /= getRateUsd();
		}
		if (this.value - num > 0) {
			this.value -= num;
		} else {
			System.out.println("ATTENCION. bro, " + num + "$ its more then u have, life is shit,  sorry");
		}

		return value;

	}

}
