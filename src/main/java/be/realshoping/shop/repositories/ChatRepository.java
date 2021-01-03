package be.realshoping.shop.repositories;

import be.realshoping.shop.data.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Integer> {
}
