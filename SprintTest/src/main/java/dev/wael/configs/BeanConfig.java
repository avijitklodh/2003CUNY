package dev.wael.configs;

import java.security.PublicKey;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dev.wael.beans.Box;

@Component
@Configuration
public class BeanConfig {

	public BeanConfig() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Box getSingletonBox() {
		return new Box(100);

	}
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Box getProtoBean() {
		return new Box(100);

	}
}
