package com.example.enchere.ControllerClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enchere.ModelClient.Utilisateur;
import com.example.enchere.Util.Token;

@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
	@PostMapping("/login")
	public Token login(@RequestBody Utilisateur user) throws Exception
	{
		Token token = new Utilisateur().login(user);
		return token;
	}
	
	@PostMapping
	public boolean incription(@RequestBody Utilisateur user) throws Exception
	{
		boolean bool = new Utilisateur().inscription(user);
		return bool;
	}
	
	@GetMapping("/solde/{token}")
	public float solde_utilisateur(@PathVariable("token") String token) throws Exception
	{
		return new Utilisateur().solde(token);
	}
}
