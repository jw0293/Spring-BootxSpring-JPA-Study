package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    public void 회원가입() throws Exception{
        // given
        Member member = new Member();
        member.setName("김중원");
        
        // when
        Long saveId = memberService.join(member);

        // then
        // Assertions.assertThat(saveId).isEqualTo(memberRepository.findOne(member.getId()));
        assertEquals(member, memberRepository.findOne(saveId));
     }

     @Test
     public void 중복_회원_예외() throws Exception{
         // given
         Member member1 = new Member();
         member1.setName("정재우");

         Member member2 = new Member();
         member2.setName("정재우");
         // when
         memberService.join(member1);

         try{
             memberService.join(member2);
         }
         catch (IllegalStateException e){
             return;
         }

         // then
        fail("예외가 발생했어야 합니다.");
      }
}