package org.antwalk.classes;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("saving")
public class Saving implements Account{

	public void showAccount() {
		// TODO Auto-generated method stub
		System.out.println("SAVING ACCOUNT");
	}

}
