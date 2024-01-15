package com.cesam.cesam.entity.sport;

import java.sql.Date;

import com.cesam.cesam.entity.organisation.administration.Bureau;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "competition")
public class Competition {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "competition_id")
	    private Long competitionId;

	    @ManyToOne
	    @JoinColumn(name = "winner_id")
	    private Winner winner;

	    private String descriptions;

	    @Column(name = "date_start")
	    private Date dateStart;

	    @Column(name = "date_end")
	    private Date dateEnd;

	    @ManyToOne
	    @JoinColumns({
	    	@JoinColumn(name = "bureau_id", referencedColumnName = "bureau_id"),
	        @JoinColumn(name = "member_id", referencedColumnName = "member_id"),
	        @JoinColumn(name = "responsability_id", referencedColumnName = "responsability_id")
	    })
	    private Bureau bureau;

		public Competition(Long competitionId, Winner winner, String descriptions, Date dateStart, Date dateEnd,
				Bureau bureau) {
			super();
			this.competitionId = competitionId;
			this.winner = winner;
			this.descriptions = descriptions;
			this.dateStart = dateStart;
			this.dateEnd = dateEnd;
			this.bureau = bureau;
		}

		public Long getCompetitionId() {
			return competitionId;
		}

		public void setCompetitionId(Long competitionId) {
			this.competitionId = competitionId;
		}

		public Winner getWinner() {
			return winner;
		}

		public void setWinner(Winner winner) {
			this.winner = winner;
		}

		public String getDescriptions() {
			return descriptions;
		}

		public void setDescriptions(String descriptions) {
			this.descriptions = descriptions;
		}

		public Date getDateStart() {
			return dateStart;
		}

		public void setDateStart(Date dateStart) {
			this.dateStart = dateStart;
		}

		public Date getDateEnd() {
			return dateEnd;
		}

		public void setDateEnd(Date dateEnd) {
			this.dateEnd = dateEnd;
		}

		public Bureau getBureau() {
			return bureau;
		}

		public void setBureau(Bureau bureau) {
			this.bureau = bureau;
		}
	    
	    
	    
	    
}
