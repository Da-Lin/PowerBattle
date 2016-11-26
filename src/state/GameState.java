/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import entity.creature.Player;
import graphics.Assets;
import java.awt.Graphics;
import powerbattle.Game;
import tiles.Tile;

// Entity - anything that is not a tile
// Item, enemy and player are entity
// Entity wil contain all the entity

public class GameState extends State{
    
    private Player player;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 498);
    }

    
    @Override
    public void update() {
        
        player.update();
        
    }

    @Override
    public void render(Graphics g) {
        
        player.render(g);
        //g.drawImage(Assets.run, 0, 0, null);
        Tile.tiles[1].render(g, -10, 600);
        
    }
    
    
    
}