package br.com.fiap.pacman;

public class Booster extends GameObject{
	
	int x;
	int y;
	
	public Booster() {
		
	}
	
	public Booster(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
