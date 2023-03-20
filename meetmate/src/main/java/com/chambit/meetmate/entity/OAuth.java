package com.chambit.meetmate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor
public class OAuth {
    @Id
    private String userId;
    private String nickname;
    private String email;

    @Builder
    public OAuth(String userId, String nickname, String email){
        this.userId = userId;
        this.nickname=nickname;
        this.email=email;
    }
}
