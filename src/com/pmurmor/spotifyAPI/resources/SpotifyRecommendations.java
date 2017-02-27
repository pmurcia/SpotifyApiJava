package com.pmurmor.spotifyAPI.resources;

public class SpotifyRecommendations {
	private SpotifyRecommendationsSeed seeds[];
	private SpotifyTrackSimplified tracks[];
	
	public SpotifyRecommendations(SpotifyRecommendationsSeed[] seeds, SpotifyTrackSimplified[] tracks) {
		this.setSeeds(seeds);
		this.setTracks(tracks);
	}
	
	public SpotifyRecommendationsSeed[] getSeeds() {
		return seeds;
	}
	
	public void setSeeds(SpotifyRecommendationsSeed[] seeds) {
		this.seeds = seeds;
	}
	
	public SpotifyTrackSimplified[] getTracks() {
		return tracks;
	}
	
	public void setTracks(SpotifyTrackSimplified[] tracks) {
		this.tracks = tracks;
	}
}
