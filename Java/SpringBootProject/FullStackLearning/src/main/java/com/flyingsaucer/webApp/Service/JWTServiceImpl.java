package com.flyingsaucer.webApp.Service;

import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.flyingsaucer.webApp.Models.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.lang.Function;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
@SuppressWarnings("deprecation")
public class JWTServiceImpl implements JWTService {

	@Value("${jwt.secretkey}")
	private String secretKey;

	private String generateToken(User user) {

		return Jwts.builder().setSubject(user.getUsername()).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
				.signWith(getSigninKey(), SignatureAlgorithm.HS256).compact();
	}


	public String extractUserName(String token) {
		
		return extractClaim(token, Claims::getSubject);
		
	}
	
	private <T> T extractClaim(String token, Function<Claims, T> claimsResolvers){
		final Claims claims = extractAllClaims(token);
		return claimsResolvers.apply(claims);
		
		
	} 
	
	private Claims extractAllClaims(String token) {
		// TODO Auto-generated method stub
		return Jwts.parser().setSigningKey(getSigninKey()).build().parseClaimsJws(token).getBody();
	}


	private Key getSigninKey() {
		// TODO Auto-generated method stub
		byte[] key = Decoders.BASE64.decode(secretKey);

		return Keys.hmacShaKeyFor(key);
	}

}
