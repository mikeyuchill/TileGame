package tilegame.states;

import java.awt.Graphics;

import tilegame.Game;
import tilegame.Handler;
import tilegame.entities.creatures.Player;
import tilegame.graphix.Assets;
import tilegame.tiles.Tile;
import tilegame.worlds.World;

public class GameState extends State{

	private Player player;
	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 100);
		
		
		//game.getGameCamera().move(0, 0);
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
		//game.getGameCamera().move(xAmt, yAmt);
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
		//Tile.tiles[1].render(g, 0, 0);
	}
	
}
