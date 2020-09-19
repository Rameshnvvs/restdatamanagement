package com.data.mining.mine.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.data.mining.mine.dao.DataLoadDAO;
import com.data.mining.mine.model.to.DataInputTO;
import com.data.mining.mine.model.to.DataOutputTO;

@Component
public class DataLoadAdapter {
	
	@Autowired
	private DataLoadDAO dataLoadDao;

	public List<DataOutputTO> getMyData() {
		return dataLoadDao.getMyData();
	}

	public int uploadData(DataInputTO input) {
		return dataLoadDao.uploadData(input);
	}

}
