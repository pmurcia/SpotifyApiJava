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

	// Constructor method
	public SpotifyAudioFeatures(float acousticness, String analysisUrl, float danceability, int durationMs,
			float energy, String id, float instrumentalness, int key, float liveness, float loudness, int mode,
			float speechiness, float tempo, int timeSignature, String trackHref, String type, String uri,
			float valence) {
		this.setAcousticness(acousticness);
		this.setAnalysisUrl(analysisUrl);
		this.setDanceability(danceability);
		this.setDurationMs(durationMs);
		this.setEnergy(energy);
		this.setId(id);
		this.setInstrumentalness(instrumentalness);
		this.setKey(key);
		this.setLiveness(liveness);
		this.setLoudness(loudness);
		this.setMode(mode);
		this.setSpeechiness(speechiness);
		this.setTempo(tempo);
		this.setTimeSignature(timeSignature);
		this.setTrackHref(trackHref);
		this.setType(type);
		this.setUri(uri);
		this.setValence(valence);
	}

	public float getAcousticness() {
		return acousticness;
	}
	
	public void setAcousticness(float acousticness) {
		this.acousticness = acousticness;
	}
	
	public String getAnalysisUrl() {
		return analysisUrl;
	}
	
	public void setAnalysisUrl(String analysisUrl) {
		this.analysisUrl = analysisUrl;
	}
	
	public float getDanceability() {
		return danceability;
	}
	
	public void setDanceability(float danceability) {
		this.danceability = danceability;
	}
	
	public int getDurationMs() {
		return durationMs;
	}
	
	public void setDurationMs(int durationMs) {
		this.durationMs = durationMs;
	}
	
	public float getEnergy() {
		return energy;
	}
	
	public void setEnergy(float energy) {
		this.energy = energy;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public float getInstrumentalness() {
		return instrumentalness;
	}
	
	public void setInstrumentalness(float instrumentalness) {
		this.instrumentalness = instrumentalness;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public float getLiveness() {
		return liveness;
	}
	
	public void setLiveness(float liveness) {
		this.liveness = liveness;
	}
	
	public float getLoudness() {
		return loudness;
	}
	
	public void setLoudness(float loudness) {
		this.loudness = loudness;
	}
	
	public int getMode() {
		return mode;
	}
	
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	public float getSpeechiness() {
		return speechiness;
	}
	
	public void setSpeechiness(float speechiness) {
		this.speechiness = speechiness;
	}
	
	public float getTempo() {
		return tempo;
	}
	
	public void setTempo(float tempo) {
		this.tempo = tempo;
	}
	
	public int getTimeSignature() {
		return timeSignature;
	}
	
	public void setTimeSignature(int timeSignature) {
		this.timeSignature = timeSignature;
	}
	
	public String getTrackHref() {
		return trackHref;
	}
	
	public void setTrackHref(String trackHref) {
		this.trackHref = trackHref;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public float getValence() {
		return valence;
	}
	
	public void setValence(float valence) {
		this.valence = valence;
	}	
}
