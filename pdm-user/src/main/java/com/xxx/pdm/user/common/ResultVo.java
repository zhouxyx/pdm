package com.xxx.pdm.user.common;

/**
 * @author zhou
 */
public class ResultVo {

	private String status;
	private String message;
	private Object data;

	public ResultVo(Builder builder) {
		this.status = builder.status;
		this.message = builder.message;
		this.data = builder.data;
	}
	
	public static class Builder{
		
		private String status;
		private String message;
		private Object data;
		
		public Builder status(String status) {
            this.status = status;
            return this;
        } 
		
		public Builder message(String message) {
            this.message = message;
            return this;
        } 
		public Builder data(Object data) {
            this.data = data;
            return this;
        } 
		
		public ResultVo build() {
            return new ResultVo(this);
        }
	}
	
	
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
