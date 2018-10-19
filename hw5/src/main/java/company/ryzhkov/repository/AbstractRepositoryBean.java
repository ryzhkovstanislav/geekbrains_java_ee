package company.ryzhkov.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

abstract class AbstractRepositoryBean {

    @PersistenceContext
    EntityManager em;
}
