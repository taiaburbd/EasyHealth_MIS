package it.unicas.app.pojo;

public class App {
	private String totalValues;

	public App() {
		// TODO Auto-generated constructor stub
	}

	public App(String totalValues) {
		super();
		this.totalValues = totalValues;
	}

	public String getTotalValues() {
		return totalValues;
	}

	public void setTotalValues(String totalValues) {
		this.totalValues = totalValues;
	}

	@Override
	public String toString() {
		return "App{" +
				"totalValues='" + totalValues + '\'' +
				'}';
	}
}
