package com.example.enchere.ControllerClient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enchere.ModelClient.Surencherir;

@RestController
@RequestMapping("/Surencherir")
public class SurencherirController {
	@PostMapping
	public boolean surenchere(@RequestBody Surencherir surenchere) throws Exception
	{
		return new Surencherir().insertion(surenchere);
	}
}
