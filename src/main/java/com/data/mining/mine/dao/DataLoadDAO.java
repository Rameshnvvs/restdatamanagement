package com.data.mining.mine.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.data.mining.mine.model.to.DataInputTO;
import com.data.mining.mine.model.to.DataOutputTO;
import com.data.mining.mine.rowmapper.DataLoadRowMapper;

@Repository
public class DataLoadDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataLoadRowMapper rowMapper;
	
	String RETRIEVE_DATA = "select * from department";
	String UPLOAD_DATA = "insert into department(dept_name,hod,location) values(?,?,?)";
	
	public List<DataOutputTO> getMyData() {
		return jdbcTemplate.query(RETRIEVE_DATA, rowMapper);
	}

	public int uploadData(DataInputTO input) {
		Object[] args = {input.getDeptName(),input.getHeadOfDept(),input.getLocation()};
		return jdbcTemplate.update(UPLOAD_DATA, args);
	}

}
