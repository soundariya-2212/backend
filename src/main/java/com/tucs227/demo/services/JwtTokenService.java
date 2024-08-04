package com.tucs227.demo.services;

import com.tucs227.demo.models.JwtToken;
import com.tucs227.demo.repo.JwtTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JwtTokenService {

    @Autowired
    private JwtTokenRepo jwtTokenRepository;

    public JwtToken saveToken(JwtToken token) {
        return jwtTokenRepository.save(token);
    }

    public Optional<JwtToken> getTokenById(Long id) {
        return jwtTokenRepository.findById(id);
    }

    public void deleteToken(Long id) {
        jwtTokenRepository.deleteById(id);
    }

    public List<JwtToken> getAllTokens() {
        return jwtTokenRepository.findAll();
    }
}
