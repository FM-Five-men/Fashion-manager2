package fashionmanager.develop.repository;

import fashionmanager.develop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {

}
