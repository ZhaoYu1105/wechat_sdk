package com.dw.ccm.wechat.base.exception;

/**
 * 微信异常
 * 
 * @author xingkong1221
 * @date 2014年7月3日
 */
public class WeChatException extends Exception {

	static final long serialVersionUID = 8113968853148840285L;

	/**
	 * 构造一个新的微信异常
	 */
	public WeChatException() {
		super();
	}
	
	/**
	 * 根据指定的异常信息构造一个新的微信异常
	 * @param message 异常信息
	 */
	public WeChatException(String message) {
		super(message);
	}
	
	/**
	 * 根据指定的异常原因构造一个新的微信异常
	 * @param cause 导致异常发生的原因
	 */
	public WeChatException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * 根据指定的异常信息和异常原因构造一个新的微信异常
	 * @param message 异常信息
	 * @param cause 导致异常发生的原因
	 */
	public WeChatException(String message, Throwable cause) {
		super(message, cause);
	}
}
