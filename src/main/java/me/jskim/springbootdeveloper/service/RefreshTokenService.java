package me.jskim.springbootdeveloper.service;


import lombok.RequiredArgsConstructor;
import me.jskim.springbootdeveloper.domain.RefreshToken;
import me.jskim.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository RefreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return RefreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected Token"));
    }
}
