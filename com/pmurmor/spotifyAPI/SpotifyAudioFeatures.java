package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyAudioFeatures {
	
	// Instance attributes
	private double acousticness;
	private String analysisUrl;
	private double danceability;
	private int durationMs;
	private double energy;
	private String id;
	private double instrumentalness;
	private int key;
	private double liveness;
	private double loudness;
	private int mode;
	private double speechiness;
	private double tempo;
	private int timeSignature;
	private String trackHref;
	private String type;
	private String uri;
	private double valence;
	
	/*public SpotifyAudioFeatures(float acousticness, String analysisUrl, float danceability, int durationMs,
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
	}*/
	
	public SpotifyAudioFeatures(JSONObject object)
	{
		this.setAcousticness(object);
		this.setAnalysisUrl(object);
		this.setDanceability(object);
		this.setDurationMs(object);
		this.setEnergy(object);
		this.setId(object);
		this.setInstrumentalness(object);
		this.setKey(object);
		this.setLiveness(object);
		this.setLoudness(object);
		this.setMode(object);
		this.setSpeechiness(object);
		this.setTempo(object);
		this.setTimeSignature(object);
		this.setTrackHref(object);
		this.setType(object);
		this.setUri(object);
		this.setValence(object);
	}

	private void setAcousticness(JSONObject object) {
		this.acousticness = object.getDouble("acousticness");
	}

	private void setAnalysisUrl(JSONObject object) {
		this.analysisUrl = object.getString("analysis_url");
	}

	private void setDanceability(JSONObject object) {
		this.danceability = object.getDouble("danceability");
	}

	private void setDurationMs(JSONObject object) {
		this.durationMs = object.getInt("duration_ms");
	}

	private void setEnergy(JSONObject object) {
		this.energy = object.getDouble("energy");
	}

	private void setId(JSONObject object) {
		this.id = object.getString("id");
	}

	private void setInstrumentalness(JSONObject object) {
		this.instrumentalness = object.getDouble("instrumentalness");
	}

	private void setKey(JSONObject object) {
		this.key = object.getInt("key");
	}

	private void setLiveness(JSONObject object) {
		this.liveness = object.getDouble("liveness");
	}

	private void setLoudness(JSONObject object) {
		this.loudness = object.getDouble("loudness");
	}

	private void setMode(JSONObject object) {
		this.mode = object.getInt("mode");
	}

	private void setSpeechiness(JSONObject object) {
		this.speechiness = object.getDouble("speechiness");
	}

	private void setTempo(JSONObject object) {
		this.tempo = object.getDouble("tempo");
	}

	private void setTimeSignature(JSONObject object) {
		this.timeSignature = object.getInt("time_signature");
	}

	private void setTrackHref(JSONObject object) {
		this.trackHref = object.getString("track_href");
	}

	private void setType(JSONObject object) {
		this.type = object.getString("type");
	}

	private void setUri(JSONObject object) {
		this.uri = object.getString("uri");
	}

	private void setValence(JSONObject object) {
		this.valence = object.getDouble("valence");
	}

	public double getAcousticness() {
		return acousticness;
	}

	public String getAnalysisUrl() {
		return analysisUrl;
	}

	public double getDanceability() {
		return danceability;
	}

	public int getDurationMs() {
		return durationMs;
	}

	public double getEnergy() {
		return energy;
	}

	public String getId() {
		return id;
	}

	public double getInstrumentalness() {
		return instrumentalness;
	}

	public int getKey() {
		return key;
	}

	public double getLiveness() {
		return liveness;
	}

	public double getLoudness() {
		return loudness;
	}

	public int getMode() {
		return mode;
	}

	public double getSpeechiness() {
		return speechiness;
	}

	public double getTempo() {
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

	public double getValence() {
		return valence;
	}
}
