package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.sport.Competition;
import com.cesam.cesam.web.data.sport.competition.response.CompetitionResponse;

public class BuildCompetion {

	public static CompetitionResponse buildCompetition(Competition competition) {
		CompetitionResponse competitionResponse = new CompetitionResponse();
		
		return competitionResponse;
	}
	
	public static List<CompetitionResponse> buildCommunity(List<Competition> competitions) {
		ArrayList<CompetitionResponse> competitionResponses = new ArrayList<CompetitionResponse>();
		for (Competition competition : competitions) {
			competitionResponses.add(buildCompetition(competition));
		}
		return competitionResponses;
	}
}
