package com.assignment.functional;

public class LambDemo {

	public static void main(String[] args) {
	      IGames igame=(games)->{
			for(String gameList:games) {
			  System.out.println(gameList);
			}
		};
		String[] games= {"chess","carroms","treasureHunt","Ludo","table tennis"};
				igame.printGames(games);
	}
}
