package api.endpoints;

	/* 
	  
	 	Swagger URI : "https://petstore.swagger.io/";

	 	Create user(POST) : petstore.swagger.io/v2/user
	 	Read user(GET) : petstore.swagger.io/v2/user/{username}
		Update user(Put) : petstore.swagger.io/v2/user/{username}
		Delete user(Delete) : petstore.swagger.io/v2/{username}
		
	*/

public class Routes {

	public static String base_url ="https://petstore.swagger.io/v2";
	
	// User module

	public static String post_url =base_url + "/user";
	public static String get_url =base_url + "/user/{username}";
	public static String update_url =base_url + "/user/{username}";
	public static String delete_url =base_url + "/user/{username}";

	// Store module

	// Pet module

}
