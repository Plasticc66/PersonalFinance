
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class PersonalFinance {

	public static void main(String[] args) throws Exception {

		List<envelopes> envelopesList = new ArrayList<envelopes>();
//		List dataList = new ArrayList();
		dollaz forRate = new dollaz(null);
		forRate.plus(1);
//		forRate.calculate();

		dollaz usd = new dollaz("Usd");
		envelopesList.add(usd);
		usd.plus(80);
		usd.withdraw(300);

		ruble gas = new ruble("Gas");
		envelopesList.add(gas);
		gas.plus(3811.06);

		ruble gift = new ruble("Gift");
		envelopesList.add(gift);
		gift.plus(1400);

		ruble rub = new ruble("Rub");
		envelopesList.add(rub);
		rub.plus(10250);
		rub.withdraw(1000000);

		ruble broker = new ruble("Broker");
		envelopesList.add(broker);
		broker.plus(5809.68);

		ruble temp = new ruble("Temp");
		envelopesList.add(temp);
		temp.plus(13000);

		forRate.getRateString();

		for (envelopes envelopes : envelopesList) {
			envelopes.getEnvelope();

		}
		double totally = 0;
		for (envelopes envelopes : envelopesList) {

			totally += envelopes.value;
		}
		System.out.println("\ntotally = " + totally);
		System.out.println("totally \"freemoney\" = " + (rub.value + usd.value) + "\n");
//____________________________________________________________________________________________calendar
//		Calendar calendar = Calendar.getInstance();
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		String now = dateFormat.format(calendar.getTime());
//		ArrayList<String> dates = new ArrayList<String>();
//		int n = 0;
//
//		String way = "C:\\repository\\PersonalFinance\\numForSave.txt";
//		File numFile = new File(way);
//		Scanner scanNum = new Scanner(numFile);
//
//		while (scanNum.hasNextLine()) {
//			n = Integer.parseInt(scanNum.nextLine());
//
//		}
//
//		if (n == 0)
//			n++;
//		System.out.println(n++);
//		scanNum.close();
//
//		if (n > 1) {
//			if (dates.get(n - 1) != now) {
//				dates.add(now);
//				n++;
//			}
//		} else {
//			if (n == 0) {
//				dates.add(now);
//				n++;
//			} else {
//
//			}
//
//		}
//
//		File num = new File("numForSave.txt");
//		try {
//			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(num, true)));
////			тут создать сканер тхт и ести число там равно нынешнему n то не записывать
////			тут создать сканер тхт и ести число там равно нынешнему n то не записывать
////			тут создать сканер тхт и ести число там равно нынешнему n то не записывать
//
//			writer.println(n);
//			writer.flush();
//			writer.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
//
//		System.out.println(dates.get(n - 1));

//		________________________________________________________________________________________23 02 2022

		gas.change(6919.62);
		gift.change(1553.47);
		rub.change(10868.84);
		broker.change(11146.64);
		envelopes Iis = new envelopes("Iis");
		envelopesList.add(Iis);
		Iis.plus(1892.65);
		usd.change(100);
		

		for (envelopes envelopes : envelopesList) {
			envelopes.getEnvelope();
		}

		totally = 0;
		for (envelopes envelopes : envelopesList) {

			totally += envelopes.value;
		}
		System.out.println("\ntotally = " + totally);
		System.out.println("totally \"freemoney\" = " + (rub.value + usd.value) + "\n");

//		File historyDemo = new File("historyDemo.txt");
//		try {
//			PrintWriter writer = new PrintWriter(new BufferedWriter (new FileWriter (historyDemo, true)));
//			writer.println("1111111111111111");   
//			writer.flush();
//			writer.close();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

//		
//		теперь хочу сделать так чтобы каждое пополнение конвертов сопровождалось датой
// придется еще и запоминать курс доллара на каждое число-изменение
//		+сделать проценты
//		+что делать с брокером?

//		json(?)
//	
//		медоты мейн || методы класса обджект
//		линкедин
//		гугление
//		getinstance() java
