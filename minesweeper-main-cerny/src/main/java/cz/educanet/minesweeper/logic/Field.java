package cz.educanet.minesweeper.logic;

public class Field {
    private boolean bombs = false;
    private int mate;

    private int getMate(int mate){

        return mate;
    }

    public void setMate(int mate){

        this.mate = mate;
    }

    public boolean getBomby(){

        return bombs;
    }

    public void setBomby(boolean bomby){

        this.bombs = bomby;
    }
}
