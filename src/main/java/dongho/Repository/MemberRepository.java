package dongho.Repository;

import dongho.Domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public String save(Member member) {
        em.persist(member);
        return "saved " + member.getId();
    }

    public Member findById(Long id) {
        Member findMember = em.find(Member.class, id);
        return findMember;
    }
}
