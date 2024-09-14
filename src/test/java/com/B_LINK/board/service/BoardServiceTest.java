package com.B_LINK.board.service;

import com.B_LINK.board.domain.Board;
import com.B_LINK.board.repository.BoardRepository;
import com.B_LINK.user.domain.User;
import com.B_LINK.user.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {
    @Autowired
    BoardRepository boardRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("글 작성")
    public void postBoard() throws Exception{
        //given
        User user = new User().builder().userName("수빈").build();
        userRepository.save(user);

        //when
        Board board = new Board().builder().user(userRepository.findByUsername("수빈")).boardTitle("테스트").build();
        boardRepository.save(board);
        //then
        Board result = boardRepository.findByBoardTitle("테스트");
        assertEquals("테스트",result.getBoardTitle());
        System.out.println("result = " + result.getUser().getUserName());

    }

}