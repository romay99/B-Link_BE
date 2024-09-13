package com.B_LINK.user.service;

import com.B_LINK.user.domain.User;
import com.B_LINK.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void joinUser(User user) {
        userRepository.save(user);
    }

}
