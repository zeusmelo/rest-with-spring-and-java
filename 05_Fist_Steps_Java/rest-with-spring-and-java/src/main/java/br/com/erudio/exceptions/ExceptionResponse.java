package br.com.erudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date timestampe;
	private String messagem;
	private String details;

	public ExceptionResponse(Date timestampe, String messagem, String details) {
		this.timestampe = timestampe;
		this.messagem = messagem;
		this.details = details;
	}

	public Date getTimestampe() {
		return timestampe;
	}


	public String getMessagem() {
		return messagem;
	}



	public String getDetails() {
		return details;
	}

	

}
