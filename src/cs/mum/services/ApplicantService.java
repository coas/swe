package cs.mum.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IApplicantDAO;
import cs.mum.mb.Helper;
import cs.mum.model.User;
@Service
public class ApplicantService {
	@Autowired
	private IApplicantDAO applicantDao;

	public void setApplicantDao(IApplicantDAO applicantDao) {
		this.applicantDao = applicantDao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public List<User> getApplicants() {
		return applicantDao.getAllApplicant();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User getApplicantById(long id) {
		return applicantDao.getApplicantById(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertApplicant(User applicant) {
		applicant.setCreationDate(new Date());
		applicant.setRegVerification(Helper.md5((String.valueOf(applicant.getCreationDate()))));
		applicantDao.insert(applicant);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateApplicant(User applicant) {
		applicantDao.insert(applicant);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User getApplicantByRegVerify(String regVerify) {
		return applicantDao.getApplicantByRegVerify(regVerify);
	}
}
