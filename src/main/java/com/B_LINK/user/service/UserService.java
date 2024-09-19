package com.B_LINK.user.service;

import com.B_LINK.user.domain.User;
import com.B_LINK.user.dto.UserSingUpDto;
import com.B_LINK.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public boolean canUseThisUserId(String userId) {
        return true; // DB 조회해서 구현 필요
    }

    public void joinUser(UserSingUpDto dto) {
        User user = new User();
        user = user.UserDtoToEntity(dto);
        userRepository.save(user);
    }

}
