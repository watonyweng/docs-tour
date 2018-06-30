package me.weitao.spring.docs.dao;

import me.weitao.spring.docs.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 会员注册接口
 * @author Watony Weng
 * @see org.springframework.data.jpa.repository.JpaRepository
 */

public interface MemberRepository extends JpaRepository<Member, Long> {

}
