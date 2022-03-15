
public enum currency {

	usd("usd"),
	rub("rub");

	private String curStr;

	currency(String curStr2) {
		this.curStr = curStr2;
	}

	public String toString() {
		return curStr;
	}
}
