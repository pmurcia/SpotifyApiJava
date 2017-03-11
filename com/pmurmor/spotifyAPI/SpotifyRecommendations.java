package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyRecommendations {
	private SpotifyRecommendationsSeed seeds[];
	private SpotifyTrackSimplified tracks[];
	
	/*public SpotifyRecommendations(SpotifyRecommendationsSeed[] seeds, SpotifyTrackSimplified[] tracks) {
		this.seeds = seeds;
		this.tracks = tracks;
	}*/
	
	public SpotifyRecommendations(JSONObject object)
	{
		this.setSeeds(object);
		this.setTracks(object);
	}

	private void setSeeds(JSONObject object) {
		this.seeds = object
						.getJSONArray("seeds")
						.toList()
						.stream()
						.toArray(SpotifyRecommendationsSeed[]::new);
	}

	private void setTracks(JSONObject object) {
		this.tracks = object
						.getJSONArray("tracks")
						.toList()
						.stream()
						.toArray(SpotifyTrackSimplified[]::new);
	}

	public SpotifyRecommendationsSeed[] getSeeds() {
		return seeds;
	}

	public SpotifyTrackSimplified[] getTracks() {
		return tracks;
	}
}
