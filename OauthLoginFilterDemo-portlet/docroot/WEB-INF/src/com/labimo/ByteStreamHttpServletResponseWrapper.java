package com.labimo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ByteStreamHttpServletResponseWrapper extends HttpServletResponseWrapper{
	private ByteArrayOutputStream baos= new ByteArrayOutputStream();
	private PrintWriter pw;
	public ByteStreamHttpServletResponseWrapper(HttpServletResponse response) {
		super(response);
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		System.out.println("getOutputStream:"+ isCommitted());
		return new MyServletOutputStream(baos);
	}
	
	

	@Override
	public PrintWriter getWriter() throws IOException {
		pw = new PrintWriter(new OutputStreamWriter(baos,super.getCharacterEncoding()));
		return pw;
	}


	public byte[] getOldBytes(){
		try {
			if(pw!=null)
				pw.close();
			baos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return baos.toByteArray();
	}

	/*@Override
	public ServletResponse getResponse() {

//		System.out.println("getResponse:"+ isCommitted());
		return super.getResponse();
	}

	@Override
	public void setResponse(ServletResponse response) {
		System.out.println("ServletResponse:"+ isCommitted());
		super.setResponse(response);
	}

	@Override
	public void flushBuffer() throws IOException {
//		super.flushBuffer();
		System.out.println("flushBuffer:"+ isCommitted());
//		return;
	}

	@Override
	public void sendRedirect(String location) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("sendRedirect:" + location + "     "+ isCommitted());
		super.sendRedirect(location);
	}
	*/
	
	
	
}