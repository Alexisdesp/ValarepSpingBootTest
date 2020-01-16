package valarep.springbootstarterparent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import valarep.springbootstarterparent.components.ExempleComponent;

@SpringBootApplication
public class SpringBootStarterParentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootStarterParentApplication.class, args);

		ExempleComponent comp = (ExempleComponent) ctx.getBean("exempleComponent");
		comp.bonjour();
	}

}
