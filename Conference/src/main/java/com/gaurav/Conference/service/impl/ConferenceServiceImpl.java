package com.gaurav.Conference.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gaurav.Conference.model.ConferenceModel;
import com.gaurav.Conference.service.ConfrenceService;

@Service
public class ConferenceServiceImpl implements ConfrenceService {

	static List<ConferenceModel> FakeDataBase = new ArrayList<ConferenceModel>();

	static {
		FakeDataBase.add(new ConferenceModel("RM001", "RM-PHYSIC", "200", "1001", "1ST FLOOR", new Date(), "Conference",
				"Active"));
		
			FakeDataBase.add(new ConferenceModel("RM002", "RM-CHEM", "200", "1002", "1ST FLOOR", new Date() , "Conference",
					"In Active"));
		
	}

//	simple return all database records
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	public Map getData() {
		Map map = new HashMap();
		try {
			map.put("conferenceRoom", this.FakeDataBase);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	@Override
	public void deleteData(String id) {
		Map map = new HashMap();
		try {
			this.FakeDataBase= this.FakeDataBase.stream().filter(e->!e.getRoomCode().equals(id)).collect(Collectors.toList());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
