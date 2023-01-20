package com.example.enchere.ControllerClient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enchere.ModelAdmin.Rechargement;

@RestController
@RequestMapping("/Rechargement")
public class RechargementClient {
	
	@PostMapping
	public boolean insertion(@RequestBody Rechargement recharge) throws Exception
	{
		boolean rech = new Rechargement().create(recharge);
		return rech;
	}
}
