package br.com.fiap.pacman;

public class Player extends GameObject{
	
	int x;
	int y;
	int direction;
	int life = 0;
	boolean invencible = false;
	
	public Player() {
		
	}
	
	public Player(int x, int y, int direction ) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void setScreenSize(int size) {
		
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void move(int x, int y) {
		if(direction == 0) {
			if(y > 5) {
				this.y -= 10;
			}
		}
		if(direction == 180) {
			if(y < 610) {
				this.y += 10;
			}
		}
		if(direction == 90) {
			if(x < 630) {
				this.x += 10;
			}
		}
		if(direction == 270) {
			if(x > 5) {
				this.x -= 10;
			}
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
