package Piece;

import Board.Board;
import Player.Player;

public class Rook extends Piece{
    public Player player;
    public Rook(Player player){
        this.player = player;
    }
    @Override
    public boolean canMove(Board board, int x, int y, int x1, int y1) {
        return true;
    }
}
