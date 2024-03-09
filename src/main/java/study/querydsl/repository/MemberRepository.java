package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Member;

import java.util.List;

interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsername(String username);
}
