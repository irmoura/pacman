package br.com.fiap.pacman;

public class Bomb extends GameObject{
	
	int x;
	int y;
	
	public Bomb() {
		
	}
	
	public Bomb(int x, int y) {
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
