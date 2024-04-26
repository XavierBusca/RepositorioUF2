package PacMan;

class Pacman{

    private int newPosX;
    private int newPosY;
    private int vidas;
    private int puntuacion;

    public int move(int newPosX, int newPosY);
    
    public int moveY;
    public int moveX;

    public moureadalt(int moveY){
        this.moveY += 1;
    }

    public moureabaix(int moveY){
        this.moveY -= 1;
    }

    public mouredreta(int moveX){
        this.moveY += 1;
    }
    public moureesquerra(int moveX){
        this.moveX -= 1;
    }

    public pickupbola(){

    }
    public pickupBolaEspecial(){
        
    }
    public loseLife(){
        
    }
    public detectColisionFantasma(Fantasma fantasma){
        
    }

}