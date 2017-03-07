package com.pmurmor.spotifyAPI;

import com.pmurmor.spotifyAPI.resources.SpotifyRecommendationsSeed;

public class SpotifyRecommendations {
	private SpotifyRecommendationsSeed seeds[];
	private SpotifyTrackSimplified tracks[];
	
	public SpotifyRecommendations(SpotifyRecommendationsSeed[] seeds, SpotifyTrackSimplified[] tracks) {
		this.seeds = seeds;
		this.tracks = tracks;
	}

	public SpotifyRecommendationsSeed[] getSeeds() {
		return seeds;
	}

	public SpotifyTrackSimplified[] getTracks() {
		return tracks;
	}
}
