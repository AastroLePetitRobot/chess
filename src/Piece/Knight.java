package Piece;

import Board.Board;
import Player.Player;

public class Knight extends Piece{
    public Player player;
    public Knight(Player player){
        this.player = player;
    }
    @Override
    public boolean canMove(Board board, int x, int y, int x1, int y1) {
        return true;
    }
}
