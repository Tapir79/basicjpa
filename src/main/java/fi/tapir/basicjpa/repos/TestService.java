
package fi.tapir.basicjpa.repos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public List<TestEntity> getAll() {
        return testRepository.findAll();
    }
}


