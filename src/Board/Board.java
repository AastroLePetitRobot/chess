package Board;

import Piece.Piece;
import Player.Player;
import Piece.*;

public class Board {
    Piece[][] tab;

    public Board(Player p1, Player p2){
        tab = new Piece[7][7];
        for (int i=0; i<8; i++){
            tab[1][i] = new Pawn(p1);
            tab[6][i] = new Pawn(p2);
        }
        tab[0][0] = new Rook(p1);
        tab[0][7] = new Rook(p1);
        tab[7][0] = new Rook(p2);
        tab[7][7] = new Rook(p2);

        tab[0][1] = new Knight(p1);
        tab[0][6] = new Knight(p1);
        tab[7][1] = new Knight(p2);
        tab[7][6] = new Knight(p2);

        tab[0][2] = new Bishop(p1);
        tab[0][5] = new Bishop(p1);
        tab[7][2] = new Bishop(p2);
        tab[7][5] = new Bishop(p2);

        tab[0][3] = new Queen(p1);
        tab[7][3] = new Queen(p2);

        tab[0][4] = new King(p1);
        tab[7][4] = new King(p2);
    }
    public void move(int x , int y, int x1, int y1){
        if (tab[x][y].canMove(this,x,y,x1,y1)){
            tab[x1][y1] = tab[x][y];
            tab[x][y] = null;
        }
    }
}
