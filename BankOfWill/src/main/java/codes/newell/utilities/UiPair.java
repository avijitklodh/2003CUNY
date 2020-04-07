package codes.newell.utilities;

public class UiPair {
	String text;
	NextUi method;

	public UiPair(String text, NextUi method) {
		this.text = text;
		this.method = method;
	}
}
