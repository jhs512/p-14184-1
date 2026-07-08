package com.back.domain.member.member.dto;

import com.back.domain.member.member.entity.Member;

import java.time.LocalDateTime;

public record MemberWithUsernameDto(
        int id,
        LocalDateTime createDate,
        LocalDateTime modifyDate,
        String name,
        String username,
        boolean isAdmin,
        String profileImgUrl
) {
    public MemberWithUsernameDto(Member member) {
        this(
                member.getId(),
                member.getCreateDate(),
                member.getModifyDate(),
                member.getName(),
                member.getUsername(),
                member.isAdmin(),
                member.getProfileImgUrlOrDefault()
        );
    }
}
