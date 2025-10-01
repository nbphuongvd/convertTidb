package vn.com.payment.gateway.database.home;

import org.springframework.stereotype.Repository;
import vn.com.payment.gateway.database.entities.Isomessage; 

@Repository
public class TblIsomessageHome extends BaseHome<Isomessage> {

	public TblIsomessageHome() {
		super(Isomessage.class);
	}

}
