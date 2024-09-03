package br.com.erudio;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String contant) {
		this.id = id;
		this.content = contant;
	}

	public long getId() {
		return id;
	}

	public String getContant() {
		return content;
	}

	
	
}
