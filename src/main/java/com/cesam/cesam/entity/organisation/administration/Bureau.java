package com.cesam.cesam.entity.organisation.administration;

import java.io.Serializable;
import java.sql.Date;

import com.cesam.cesam.entity.organisation.humain.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bureau")
public class Bureau implements Serializable {
	
	private static final long serialVersionUID = 5373220032387929724L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bureau_id")
    private Long bureauId;
	
	@Column(name = "member_id")
	private Long memberId;

	@Column(name = "responsability_id")
	private Long responsabilityId;

    @ManyToOne
    @JoinColumn(name = "member")
    private Member member;
    
    @ManyToOne
    @JoinColumn(name = "responsability")
    private Responsability responsability;

    @Column(name = "mots")
    private String mots; 
    
    @Column(name = "mandat_start")
    private Date mandatStart; 
    
    @Column(name = "mandat_end")
    private Date mandatEnd;
    
    @Column(name = "is_current")
    private boolean isCurrent;
    


	public Bureau(Long bureauId, Member member, Responsability responsability, String mots, Date mandatStart,
			Date mandatEnd, boolean isCurrent) {
		super();
		this.bureauId = bureauId;
		this.member = member;
		this.responsability = responsability;
		this.mots = mots;
		this.mandatStart = mandatStart;
		this.mandatEnd = mandatEnd;
		this.isCurrent = isCurrent;
	}

	public Bureau() {
		// TODO Auto-generated constructor stub
	}

	public Long getBureauId() {
		return bureauId;
	}

	public void setBureauId(Long bureauId) {
		this.bureauId = bureauId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Responsability getResponsability() {
		return responsability;
	}

	public void setResponsability(Responsability responsability) {
		this.responsability = responsability;
	}

	public String getMots() {
		return mots;
	}

	public void setMots(String mots) {
		this.mots = mots;
	}

	public Date getMandatStart() {
		return mandatStart;
	}

	public void setMandatStart(Date mandatStart) {
		this.mandatStart = mandatStart;
	}

	public Date getMandatEnd() {
		return mandatEnd;
	}

	public void setMandatEnd(Date mandatEnd) {
		this.mandatEnd = mandatEnd;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}
}
