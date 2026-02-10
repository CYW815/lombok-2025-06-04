package com.back;

import lombok.*;


@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class WiseSaying {
    private final int id;
    private final String content;
    private String author;

}
