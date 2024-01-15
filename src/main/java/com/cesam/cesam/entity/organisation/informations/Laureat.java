package com.cesam.cesam.entity.organisation.informations;

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
import lombok.Data;

@Entity
@Table(name = "laureats")
@Data
public class Laureat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "laureat_id")
	private Long laureat_id;
	@ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private Member member;

    @Column(name = "date_laureat")
    private Date dateLaureat;

    @Column(name = "cycle_laureat")
    private String cycleLaureat;

    @Column(name = "filliere_laureat")
    private String filliereLaureat;

    @Column(name = "subject_laureat")
    private String subjectLaureat;

	public Laureat(Long laureat_id, Member member, Date dateLaureat, String cycleLaureat, String filliereLaureat,
			String subjectLaureat) {
		super();
		this.laureat_id = laureat_id;
		this.member = member;
		this.dateLaureat = dateLaureat;
		this.cycleLaureat = cycleLaureat;
		this.filliereLaureat = filliereLaureat;
		this.subjectLaureat = subjectLaureat;
	}

	
	public Laureat() {
		// TODO Auto-generated constructor stub
	}


	public Long getLaureat_id() {
		return laureat_id;
	}


	public void setLaureat_id(Long laureat_id) {
		this.laureat_id = laureat_id;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	public Date getDateLaureat() {
		return dateLaureat;
	}

	public void setDateLaureat(Date dateLaureat) {
		this.dateLaureat = dateLaureat;
	}

	public String getCycleLaureat() {
		return cycleLaureat;
	}

	public void setCycleLaureat(String cycleLaureat) {
		this.cycleLaureat = cycleLaureat;
	}

	public String getFilliereLaureat() {
		return filliereLaureat;
	}

	public void setFilliereLaureat(String filliereLaureat) {
		this.filliereLaureat = filliereLaureat;
	}

	public String getSubjectLaureat() {
		return subjectLaureat;
	}

	public void setSubjectLaureat(String subjectLaureat) {
		this.subjectLaureat = subjectLaureat;
	}
    
    

}
