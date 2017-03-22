package com.pmurmor.spotifyAPI;

import java.util.ArrayList;

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
		ArrayList<SpotifyRecommendationsSeed> seedsSearch = new ArrayList<SpotifyRecommendationsSeed>();
		
		object
			.getJSONArray("seeds")
			.forEach(seed -> seedsSearch.add(new SpotifyRecommendationsSeed((JSONObject) seed)));
		
		this.seeds = seedsSearch.toArray(new SpotifyRecommendationsSeed[seedsSearch.size()]);
	}

	private void setTracks(JSONObject object) {
		ArrayList<SpotifyTrackSimplified> seedsTracks = new ArrayList<SpotifyTrackSimplified>();
		
		object
			.getJSONArray("tracks")
			.forEach(track -> seedsTracks.add(new SpotifyTrackSimplified((JSONObject) track)));
		
		this.tracks = seedsTracks.toArray(new SpotifyTrackSimplified[seedsTracks.size()]);
	}

	public SpotifyRecommendationsSeed[] getSeeds() {
		return seeds;
	}

	public SpotifyTrackSimplified[] getTracks() {
		return tracks;
	}
}
