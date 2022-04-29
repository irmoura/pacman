package br.com.fiap.pacman;

import java.util.Random;

public class Ghost extends GameObject{
	
	int x;
	int y;
	int direction;
	int [] directions = {-1, 0, 90, 180, 270};
	
	public Ghost() {
		
	}
	
	public Ghost(int x, int y, int direction ) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void setScreenSize(int size) {
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void randomDirection() {
		this.direction = directions[(int)(Math.random() * 4 ) + 1];
	}
	
	public void move(int x, int y) {
		if(direction == 0) {
			if(y > 5) {
				this.y -= 10;
			}else {
				randomDirection();
			}
		}
		if(direction == 180) {
			if(y < 610) {
				this.y += 10;
			}else {
				randomDirection();
			}
		}
		if(direction == 90) {
			if(x < 630) {
				this.x += 10;
			}else {
				randomDirection();
			}
		}
		if(direction == 270) {
			if(x > 5) {
				this.x -= 10;
			}else {
				randomDirection();
			}
		}
	}
}
