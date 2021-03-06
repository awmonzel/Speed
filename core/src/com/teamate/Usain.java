package com.teamate;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class Usain extends PhysicsSprite {
	
	private boolean jumping = false;
	
	public Usain(String image, World world) {
		super(image, world);
	}
	
	public Usain(Texture tex, World world) {
		super(tex, world);
	}
	
	public boolean isJumping() {
		return jumping;
	}
	
	public void jump() {
		if (!jumping) {
			jumping = true;
			applyImpulse(new Vector2(0, 1000));
		}
	}
	
	public void notifyLanded() {
		jumping = false;
	}

}
