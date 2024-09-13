package com.B_LINK.user.controller;

import com.B_LINK.user.domain.User;
import com.B_LINK.user.domain.UserRole;
import com.B_LINK.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    public void saveUser() {
        userService.joinUser(new User()
                .builder()
                .userBirthDate(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")))
                .userSex(true)
                .userTel("29824829").build());
    }

}
