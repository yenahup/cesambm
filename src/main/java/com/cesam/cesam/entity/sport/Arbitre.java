package com.cesam.cesam.entity.sport;

import com.cesam.cesam.entity.organisation.humain.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lieu")
public class Arbitre {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arbitre_id")
    private Long arbitreId;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @Column(name = "descriptions")
    private String descriptions;
	public Arbitre(Long arbitreId, Member member, String descriptions) {
		super();
		this.arbitreId = arbitreId;
		this.member = member;
		this.descriptions = descriptions;
	}
	public Long getArbitreId() {
		return arbitreId;
	}
	public void setArbitreId(Long arbitreId) {
		this.arbitreId = arbitreId;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
    
    
}
