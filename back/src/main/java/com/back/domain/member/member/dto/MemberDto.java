package com.back.domain.member.member.dto;

import com.back.domain.member.member.entity.Member;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record MemberDto(
        @NotNull int id,
        @NotNull LocalDateTime createDate,
        @NotNull LocalDateTime modifyDate,
        @NotNull String name,
        @NotNull boolean isAdmin,
        @NotNull String profileImgUrl
) {
    public MemberDto(Member member) {
        this(
                member.getId(),
                member.getCreateDate(),
                member.getModifyDate(),
                member.getName(),
                member.isAdmin(),
                member.getProfileImgUrlOrDefault()
        );
    }
}
