package hello;

public class Greeter {
	private String format;
	
	
	
	public Greeter() {
	}

	public Greeter(String format) {
		this.format = format;
	}
	
	public String greet(String guest) {
		return String.format(format,guest);
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
