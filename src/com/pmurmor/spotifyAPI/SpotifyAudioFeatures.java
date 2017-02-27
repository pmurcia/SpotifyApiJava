package com.pmurmor.spotifyAPI;

public class SpotifyAudioFeatures {
	
	// Instance attributes
	private float acousticness;
	private String analysisUrl;
	private float danceability;
	private int durationMs;
	private float energy;
	private String id;
	private float instrumentalness;
	private int key;
	private float liveness;
	private float loudness;
	private int mode;
	private float speechiness;
	private float tempo;
	private int timeSignature;
	private String trackHref;
	private String type;
	private String uri;
	private float valence;
	
	public SpotifyAudioFeatures(float acousticness, String analysisUrl, float danceability, int durationMs,
			float energy, String id, float instrumentalness, int key, float liveness, float loudness, int mode,
			float speechiness, float tempo, int timeSignature, String trackHref, String type, String uri,
			float valence) {
		this.acousticness = acousticness;
		this.analysisUrl = analysisUrl;
		this.danceability = danceability;
		this.durationMs = durationMs;
		this.energy = energy;
		this.id = id;
		this.instrumentalness = instrumentalness;
		this.key = key;
		this.liveness = liveness;
		this.loudness = loudness;
		this.mode = mode;
		this.speechiness = speechiness;
		this.tempo = tempo;
		this.timeSignature = timeSignature;
		this.trackHref = trackHref;
		this.type = type;
		this.uri = uri;
		this.valence = valence;
	}

	public float getAcousticness() {
		return acousticness;
	}

	public String getAnalysisUrl() {
		return analysisUrl;
	}

	public float getDanceability() {
		return danceability;
	}

	public int getDurationMs() {
		return durationMs;
	}

	public float getEnergy() {
		return energy;
	}

	public String getId() {
		return id;
	}

	public float getInstrumentalness() {
		return instrumentalness;
	}

	public int getKey() {
		return key;
	}

	public float getLiveness() {
		return liveness;
	}

	public float getLoudness() {
		return loudness;
	}

	public int getMode() {
		return mode;
	}

	public float getSpeechiness() {
		return speechiness;
	}

	public float getTempo() {
		return tempo;
	}

	public int getTimeSignature() {
		return timeSignature;
	}

	public String getTrackHref() {
		return trackHref;
	}

	public String getType() {
		return type;
	}

	public String getUri() {
		return uri;
	}

	public float getValence() {
		return valence;
	}
}
