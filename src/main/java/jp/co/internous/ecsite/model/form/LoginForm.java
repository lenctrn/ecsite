package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable {
	
	private String userName;
	private String password;
//	ログイン時、ユーザーの入力した情報を受け取るためのフィールド
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
//	ログイン情報（userName,password）それぞれのsetter/getterを作成。

}
