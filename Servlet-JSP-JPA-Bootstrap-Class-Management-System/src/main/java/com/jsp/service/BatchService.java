package com.jsp.service;

import java.util.List;

import com.jsp.dao.BatchDao;
import com.jsp.dto.Batch;

public class BatchService {
	
//	save batch
	public Batch saveBatch(Batch batch) {
		BatchDao batchDao = new BatchDao();
		return batchDao.saveBatch(batch);
	}
	
//	update batch
	public Batch updateBatch(Batch batch) {
		BatchDao batchDao = new BatchDao();
		return batchDao.updateBatch(batch);
	}
	
//	get batch by id
	public Batch getBatchById(int id) {
		BatchDao batchDao = new BatchDao();
		return batchDao.getBatchById(id);
	}
	
//	get all batch
	public List<Batch> getAllBatch(){
		BatchDao batchDao = new BatchDao();
		return batchDao.getAllBatch();
	}
	
//	delete batch
	public Batch deleteBatch(int id) {
		BatchDao batchDao = new BatchDao();
		return batchDao.deleteBatch(id);
	}
}