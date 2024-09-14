package com.B_LINK.board.service;

import com.B_LINK.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;



}
