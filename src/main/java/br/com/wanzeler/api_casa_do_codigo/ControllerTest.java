package br.com.wanzeler.api_casa_do_codigo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	@GetMapping(value = "/api/test")
	public String teste() {
		return "Esta configurado";
	}

}
