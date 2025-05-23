package nhom27.itss.be.repository;

import nhom27.itss.be.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NotificationsRepository extends JpaRepository<Notification, Integer>, JpaSpecificationExecutor<Notification> {

}