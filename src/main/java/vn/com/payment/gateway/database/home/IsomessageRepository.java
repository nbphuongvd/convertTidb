package vn.com.payment.gateway.database.home;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.payment.gateway.database.entities.Isomessage;

@Repository
public interface IsomessageRepository extends JpaRepository<Isomessage, Long> {
}
