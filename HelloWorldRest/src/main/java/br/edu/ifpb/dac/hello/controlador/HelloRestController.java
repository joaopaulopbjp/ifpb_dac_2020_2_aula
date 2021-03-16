package br.edu.ifpb.dac.hello.controlador;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("hello")
	public List<String> hello() {
		return Arrays.asList("Hello","Hello2","Hello3");
	}
}
