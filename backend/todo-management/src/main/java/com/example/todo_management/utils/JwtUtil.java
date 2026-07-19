package com.example.todo_management.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JwtUtil {
    private static final int expireInMs = 300 * 1000;
    private final static Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);


    public String generate(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuer("organisation.com")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expireInMs))
                .signWith(key)
                .compact();
    }

    public static void main(String[] args) {
//        System.out.println(generate("john"));
    }


    public boolean validate(String token) {
        return getUsername(token) != null && isNotExpired(token);
    }

    public boolean isNotExpired(String token) {
        Claims claims = getClaims(token);
        return claims.getExpiration().after(new Date(System.currentTimeMillis()));
    }

    public Claims getClaims(String token) {
        Claims claims = Jwts.parser().setSigningKey(key).build()
                .parseClaimsJws(token).getBody();
        return claims;
    }

    public String getUsername(String token) {
        Claims claims = getClaims(token);
        return claims.getSubject().toString();
    }


}
