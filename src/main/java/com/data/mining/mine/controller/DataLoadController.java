package com.data.mining.mine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.mining.mine.adapter.DataLoadAdapter;
import com.data.mining.mine.model.to.DataInputTO;
import com.data.mining.mine.model.to.DataOutputTO;

@RestController
public class DataLoadController {
	
	@Autowired
	private DataLoadAdapter dataLoadAdapter;

	@GetMapping("/loadData/getData")
	public List<DataOutputTO> getMyData(){
		return dataLoadAdapter.getMyData();
	}
	
	@PostMapping("/loadData/insert")
	@ResponseBody

	public int uploadData(@RequestBody DataInputTO input){
		System.out.println("insert");
		return dataLoadAdapter.uploadData(input);
		
	}
}
