package com.cognizant.springlearn.controller;

import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

import java.util.Base64;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);


    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("START");

        LOGGER.debug("Authorization Header : {}", authHeader);

        String user = getUser(authHeader);

        LOGGER.debug("Authenticated User : {}", user);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();

        map.put("token", token);

        LOGGER.info("END");

        return map;
    }
    private String getUser(String authHeader) {

        LOGGER.info("START");

        // Remove "Basic "
        String encodedCredentials = authHeader.substring("Basic ".length());

        LOGGER.debug("Encoded Credentials : {}", encodedCredentials);

        // Decode Base64
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);

        String credentials = new String(decodedBytes);

        LOGGER.debug("Decoded Credentials : {}", credentials);

        // Extract username before ':'
        String user = credentials.substring(0, credentials.indexOf(":"));

        LOGGER.debug("User : {}", user);

        LOGGER.info("END");

        return user;
    }
    private String generateJwt(String user) {

        LOGGER.info("START");

        JwtBuilder builder = Jwts.builder();

        // Username
        builder.setSubject(user);

        // Current time
        builder.setIssuedAt(new Date());

        // Expiry after 20 minutes
        builder.setExpiration(new Date(new Date().getTime() + 1200000));

        // Secret key
        Key key = Keys.hmacShaKeyFor(
                "12345678901234567890123456789012"
                        .getBytes(StandardCharsets.UTF_8));

        String token = Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+1200000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

         token = builder.compact();

        LOGGER.debug("Generated Token : {}", token);

        LOGGER.info("END");

        return token;
    }
}