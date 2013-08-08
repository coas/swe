package cs.mum.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FinalSection extends Section {
	private String programType;
	private TargetEntry targetEntry;
	private HearAboutUs hearAboutUs;
	private String notOnhearAboutUs;
	private String agentCode;
	private String signature;

	public FinalSection() {

	}

	public FinalSection(String programType, TargetEntry targetEntry,
			HearAboutUs hearAboutUs, String notOnhearAboutUs, String agentCode,
			String signature) {
		this.programType = programType;
		this.targetEntry = targetEntry;
		this.hearAboutUs = hearAboutUs;
		this.notOnhearAboutUs = notOnhearAboutUs;
		this.agentCode = agentCode;
		this.signature = signature;

	}

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}
	@ManyToOne
	@JoinColumn(name="targetEntry")
	public TargetEntry getTargetEntry() {
		return targetEntry;
	}

	public void setTargetEntry(TargetEntry targetEntry) {
		this.targetEntry = targetEntry;
	}
	
	@ManyToOne
	@JoinColumn(name="hearAboutUs")
	public HearAboutUs getHearAboutUs() {
		return hearAboutUs;
	}

	public void setHearAboutUs(HearAboutUs hearAboutUs) {
		this.hearAboutUs = hearAboutUs;
	}

	public String getNotOnhearAboutUs() {
		return notOnhearAboutUs;
	}

	public void setNotOnhearAboutUs(String notOnhearAboutUs) {
		this.notOnhearAboutUs = notOnhearAboutUs;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
}
