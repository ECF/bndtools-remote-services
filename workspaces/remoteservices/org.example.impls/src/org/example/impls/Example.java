package org.example.impls;

import org.example.api.Greeting;
import org.osgi.service.component.annotations.Component;

@Component(property= {"service.exported.interfaces=*", "service.exported.configs=ecf.generic.server"})
public class Example implements Greeting {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
