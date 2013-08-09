package cs.mum.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.mum.dao.IEnglishProficiencyDAO;

@Service
public class EnglishProficiencyService {
	@Autowired
	private IEnglishProficiencyDAO englishProficiencyDAO;

	public void setEnglishProficiencyDAO(
			IEnglishProficiencyDAO englishProficiencyDAO) {
		this.englishProficiencyDAO = englishProficiencyDAO;
	}
	
	public List<Integer> toeflYearList() {
		Calendar date = Calendar.getInstance();
		List<Integer> list = new ArrayList<>();
		for(int i=1997; i<=date.get(Calendar.YEAR); i++) {
			list.add(i);
		}
		return list;
	}
}
