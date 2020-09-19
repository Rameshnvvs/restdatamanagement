package com.data.mining.mine.rowmapper;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.data.mining.mine.model.to.DataOutputTO;


@Component
public class DataLoadRowMapper implements RowMapper<DataOutputTO> {

	@Override
	public DataOutputTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		DataOutputTO dout = new DataOutputTO();
		dout.setDeptId(rs.getInt("ID"));
		dout.setDeptName(rs.getString("dept_name"));
		dout.setHeadOfDept(rs.getString("hod"));
		dout.setLocation(rs.getString("location"));
		
		 return dout;
	}

	
	
}
