package fi.metropolia.patrikmg.project.repository;

import fi.metropolia.patrikmg.project.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
}
