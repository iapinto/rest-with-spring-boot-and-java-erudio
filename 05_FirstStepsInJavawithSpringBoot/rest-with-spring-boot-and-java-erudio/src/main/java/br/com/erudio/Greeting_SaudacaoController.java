package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting_SaudacaoController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting_Saudacao greeting(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		return new Greeting_Saudacao(counter.incrementAndGet(),String.format(template, name));
	}
}
