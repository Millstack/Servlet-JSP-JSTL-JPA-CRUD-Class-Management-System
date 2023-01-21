package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Batch;

public class BatchDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("milind");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//	save batch
	public Batch saveBatch(Batch batch) {
		batch.setStatus("inactive");
		entityTransaction.begin();
		entityManager.persist(batch);
		entityTransaction.commit();
		return batch;
	}
	
//	update batch
	public Batch updateBatch(Batch batch) {
		Batch b = entityManager.find(Batch.class , batch.getId());
		b.setName(batch.getName());
		b.setCode(batch.getCode());
		b.setType(batch.getType());
		b.setStatus(batch.getStatus());
		b.setActive_course(batch.getActive_course());
		entityTransaction.begin();
		entityManager.merge(batch);
		entityTransaction.commit();
		return batch;
	}
	
//	get batch by id
	public Batch getBatchById(int id) {
		Batch batch = entityManager.find(Batch.class , id);
		return batch;
	}
	
//	get all batch
	public List<Batch> getAllBatch(){
		String sql = "SELECT batch FROM Batch batch";
		Query query = entityManager.createQuery(sql);
		List<Batch> batch = query.getResultList();
		return batch;
	}
	
//	delete batch
	public Batch deleteBatch(int id) {
		Batch batch = entityManager.find(Batch.class , id);
		entityTransaction.begin();
		entityManager.remove(batch);
		entityTransaction.commit();
		return batch;
	}
}