
package projekti;


public class VaistettavaObjekti implements Liikutettava{
    
    private int paikkaX;
    private int paikkaY;
    private boolean suunta;
    
    public VaistettavaObjekti(int x, int y){
        this.paikkaX = x;
        this.paikkaY = y;
        this.suunta = true;
        
    }

    @Override
    public void liikuta() {
        if (paikkaY >= 0 && paikkaY < 500 && suunta == true){
            this.paikkaY = this.paikkaY + 50;
        }
        
        else if (this.paikkaY == 500){
            this.suunta = false;
            this.paikkaY = this.paikkaY -50 ;
        }
        
        else if (this.paikkaY <= 500 && this.paikkaY > 0 && this.suunta == false){
            this.paikkaY = this.paikkaY - 50;
        }
        
        else if(this.paikkaY == 0 && this.suunta == false){
            this.suunta = true;
            this.paikkaY = this.paikkaY + 50;
        }
       
    }


    @Override
    public int haePaikkaX() {
        return this.paikkaX;
    }

    @Override
    public int haePaikkaY() {
        return this.paikkaY;
    }
    
    
    
}
