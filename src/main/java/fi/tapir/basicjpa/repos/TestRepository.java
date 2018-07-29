package fi.tapir.basicjpa.repos;

import fi.tapir.basicjpa.entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long>{
}
