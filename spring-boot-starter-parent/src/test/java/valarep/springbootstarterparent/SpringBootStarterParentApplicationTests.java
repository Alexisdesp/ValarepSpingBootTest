package valarep.springbootstarterparent;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import valarep.springbootstarterparent.components.InjectionAvecSetterComponent;
import valarep.springbootstarterparent.components.InjectionDirectComponent;
import valarep.springbootstarterparent.components.InjectionParConstructeurComponent;
import valarep.springbootstarterparent.services.ServiceBonjourImpl;

@SpringBootTest
class SpringBootStarterParentApplicationTests {

	@Test
	public void testInjectionDirect(){
		InjectionDirectComponent comp = new InjectionDirectComponent();
		comp.serviceBonjour = new ServiceBonjourImpl();

		assertEquals("Salut tertous !", comp.direBonjour());
		
	}

	@Test
	public void testInjectionAvecSetter() {
		InjectionAvecSetterComponent comp = new InjectionAvecSetterComponent();
		comp.setServiceBonjour( new ServiceBonjourImpl());

		assertEquals("Salut tertous !", comp.direBonjour());

	}

	@Test
	public void testInjectionParConstructeur() {
		InjectionParConstructeurComponent comp = new InjectionParConstructeurComponent(new ServiceBonjourImpl());
		
		assertEquals("Salut tertous !", comp.direBonjour());

	}

}
