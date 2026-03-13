package fi.metropolia.patrikmg.project.repository;

import fi.metropolia.patrikmg.project.entity.Products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductsRepositoryCriteriaImpl implements ProductsRepositoryCriteria {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Products> findAllProductsByQuantity(int quantity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Products> cq = cb.createQuery(Products.class);
        Root<Products> root = cq.from(Products.class);
        cq.select(root)
        .where(cb.lessThanOrEqualTo(root.get("quantity"), quantity));
        return em.createQuery(cq).getResultList();
    }


    /*
    @Override
    public List<Products> findByQuantityIsAtMost(int quantity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Products> cq = cb.createQuery(Products.class);
        Root<Products> products = cq.from(Products.class);
        cq.select(products).
                where(cb.lessThanOrEqualTo(products.<Integer>get("quantity"), quantity));
        return em.createQuery(cq).getResultList();
    }

     */

}
