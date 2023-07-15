package me.jskim.springbootdeveloper.service;


import lombok.RequiredArgsConstructor;
import me.jskim.springbootdeveloper.domain.User;
import me.jskim.springbootdeveloper.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService {
    private final UserRepository userRepository;

    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email));
    }
}

