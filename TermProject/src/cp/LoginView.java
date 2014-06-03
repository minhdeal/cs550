package cp;

import vcs.UserManager;
import cp.HDVCS_UI.handleType;
import cp.HDVCS_UI.viewStyle;
import db.User;

public class LoginView extends HDVCS_UI {

	/** viewStyle */
	private viewStyle style;
	
	/** ID */
	private String id;
	
	/** password */
	private String pass;
	
	/** state of login (success or fail) */
	public boolean state;
	
	/**
	 * constructor to set style and type.
	 * 
	 * @param 
	 * @return 
	 */
	public LoginView() {
		
		this.style = viewStyle.LOGIN;
		
		//TODO:display initial view.
		
	}
	
	/**
	 * run authentication.
	 * 
	 * @param string id.
	 * @param string pass.
	 * @return 
	 */
	public void runAuthenticate(String i, String p) {
		
		//TODO: make login process.
		
	}
	
	/**
	 * run new user.
	 * 
	 * @param string id.
	 * @param string pass.
	 * @return 
	 */
	public void runNewUser(String i, String p) {
		
		//TODO: make new user in DB.
		
	}

	/**
	 * run delete user.
	 * 
	 * @param string id.
	 * @param string pass.
	 * @return 
	 */
	public void runDelUser(String i, String p) {
		
		//TODO: delete user in DB.
		
	}
	
}
