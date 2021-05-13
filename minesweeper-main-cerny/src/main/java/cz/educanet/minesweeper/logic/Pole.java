package cz.educanet.minesweeper.logic;

public class Pole {

    private boolean bomby = false;
    private int mate;

    private int getMate(int mate){
        return mate;
    }

    public void setMate(int mate){
        this.mate = mate;
    }

    public boolean getBomby(){
        return bomby;
    }

    public void setBomby(boolean bomby){
        this.bomby = bomby;
    }
}
