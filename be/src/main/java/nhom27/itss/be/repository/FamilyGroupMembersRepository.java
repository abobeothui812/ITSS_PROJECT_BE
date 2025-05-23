package nhom27.itss.be.repository;

import nhom27.itss.be.entity.FamilyGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FamilyGroupMembersRepository extends JpaRepository<FamilyGroupMember, Integer>, JpaSpecificationExecutor<FamilyGroupMember> {

}