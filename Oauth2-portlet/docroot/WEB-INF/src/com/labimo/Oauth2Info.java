package com.labimo;

public class Oauth2Info {
	private String userId;
	private String redirect_uri;
	private String client_id;
	private String response_type;
	private long time;
	
	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	private String code;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRedirect_uri() {
		return redirect_uri;
	}

	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getResponse_type() {
		return response_type;
	}

	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public Oauth2Info() {
		super();
	}
	
	
	
	

}
