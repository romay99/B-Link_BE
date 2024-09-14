package com.B_LINK.board.controller;

import com.B_LINK.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

}
