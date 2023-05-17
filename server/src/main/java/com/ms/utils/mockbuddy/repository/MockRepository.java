package com.ms.utils.mockbuddy.repository;

import com.ms.utils.mockbuddy.domain.Mock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MockRepository extends JpaRepository<Mock, Long> {

    Page<Mock> findByRouteContaining(String route, Pageable pageable);

    Optional<Mock> findByRoute(String route);
}

