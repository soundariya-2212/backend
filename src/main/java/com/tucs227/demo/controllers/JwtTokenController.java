package com.tucs227.demo.controllers;

import com.tucs227.demo.models.JwtToken;
import com.tucs227.demo.services.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tokens")
public class JwtTokenController {

    @Autowired
    private JwtTokenService jwtTokenService;

    @PostMapping
    public ResponseEntity<JwtToken> createToken(@RequestBody JwtToken jwtToken) {
        JwtToken savedToken = jwtTokenService.saveToken(jwtToken);
        return new ResponseEntity<>(savedToken, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JwtToken> getTokenById(@PathVariable Long id) {
        Optional<JwtToken> token = jwtTokenService.getTokenById(id);
        return token.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<JwtToken>> getAllTokens() {
        List<JwtToken> tokens = jwtTokenService.getAllTokens();
        return ResponseEntity.ok(tokens);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteToken(@PathVariable Long id) {
        jwtTokenService.deleteToken(id);
        return ResponseEntity.noContent().build();
    }
}
