package com.B_LINK.user.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigInteger;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "USER")
@Builder
public class User {
    @Id
    private BigInteger userCode;
    private String userId;
    private String userPassWord;
    private String userName;
    private String userEmail;
    private String userTel;
    private UserRole userRole; // USER_STUDENT , USER_PROFESSOR, ADMIN
    private String userStudentNumber ;
    private String userRegDate;
    private String userBirthDate;
    private boolean userSex; // 1 man , 0 woman
}
