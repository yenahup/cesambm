package com.cesam.cesam.web.data.sport.competition.response;

import java.sql.Date;

import com.cesam.cesam.web.data.organisation.bureau.response.BureauResponse;
import com.cesam.cesam.web.data.sport.winner.response.WinnerResponse;

public class CompetitionResponse {


    private Long competitionId;

    private WinnerResponse winner;

    private String descriptions;

    private Date dateStart;

    private Date dateEnd;

    private BureauResponse bureau;

	public CompetitionResponse(Long competitionId, WinnerResponse winner, String descriptions, Date dateStart,
			Date dateEnd, BureauResponse bureau) {
		super();
		this.competitionId = competitionId;
		this.winner = winner;
		this.descriptions = descriptions;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.bureau = bureau;
	}

	public CompetitionResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getCompetitionId() {
		return competitionId;
	}

	public void setCompetitionId(Long competitionId) {
		this.competitionId = competitionId;
	}

	public WinnerResponse getWinner() {
		return winner;
	}

	public void setWinner(WinnerResponse winner) {
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

	public BureauResponse getBureau() {
		return bureau;
	}

	public void setBureau(BureauResponse bureau) {
		this.bureau = bureau;
	}
    
    
}
