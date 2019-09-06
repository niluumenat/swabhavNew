package com.techlabs.board;

public class NotValidPositionException extends RuntimeException {
	public NotValidPositionException(String s){
		super(s);
	}
}
