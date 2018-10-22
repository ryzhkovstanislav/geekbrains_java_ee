package company.ryzhkov.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractRepositoryBean {

    @PersistenceContext
    EntityManager em;
}
