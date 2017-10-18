package myapp.webservice;

import javax.jws.WebService;

@WebService
public class HelloWorldService implements IHelloWorldService {

	public HelloWorldService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String helloWorldFunc(String name) {
		return "Hello World "+name;
	}

}
