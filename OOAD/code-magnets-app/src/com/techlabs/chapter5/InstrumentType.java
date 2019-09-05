package com.techlabs.chapter5;

public enum InstrumentType {
	GUITAR,BANJO,DOBRO,FIDDLE,BASS,MANDOLIN,VIOLIN;
	
	public String toString(){
		switch(this){
		case GUITAR: return "Guitar";
		case VIOLIN: return "Violin";
		case BANJO: return "Banjo";
		case DOBRO: return "Dobro";
		default: return "Unspecified"; 
		}
	}

}
