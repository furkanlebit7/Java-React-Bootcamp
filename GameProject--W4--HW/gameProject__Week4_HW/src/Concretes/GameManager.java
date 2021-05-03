package Concretes;

import Abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Yeni oyun eklendi : "+game.getName());
		
	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyun kald�r�ld� : "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi : "+game.getName());
		
	}

}
