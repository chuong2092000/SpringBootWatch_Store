package com.example.springbootwatch_store.ultils.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.domain.Pageable;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Responses extends Response {

    private PageableResponses meta;

    public record PageableResponses(Integer totalPage, Pageable pageable) {
    }
}
