package com.writeme.system.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;

import sun.misc.BASE64Encoder;


/**
 * @author Administrator <br/>
 * 使用md5加密算法对用户的密码进行md5加密存储
 */
public class EncodeByMD5 {
	
	private static  Logger  logger = Logger.getLogger(EncodeByMD5.class);
	 
	/**
	 * 对字符串进行md5加密
	 * @param str 待加密字符串
	 * @return 返回经md5加密以及 BASE64编码的字串
	 */
	@SuppressWarnings("finally")
	public static String getMD5String(String str){
		String secretyKey = null;
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			BASE64Encoder encoder = new BASE64Encoder();
			byte[]	key = md5.digest(str.getBytes("utf-8"));
			secretyKey=encoder.encode(key);
			return secretyKey;
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			logger.error(e);
		} catch(Exception e1){
			logger.error("md5加密错误！",e1);
		}finally{
			return secretyKey;
		}
	}
	
	public static void main(String[] args){
		
		String str = "123456";
		String result = getMD5String(str);
		System.out.println(result);
				
	}
}
