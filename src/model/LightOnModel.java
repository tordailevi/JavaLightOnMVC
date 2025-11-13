package model; 

public class LightOnModel { 
    private int allapot;
    private int id; 
    public LightOnModel(int allapot, int id) {
        this.allapot = allapot; 
        this.id = id; 
    }
    
    public void kapcsolo() {
        this.allapot = (this.allapot == 0) ? 1 : 0; 
    }
    
    public int getAllapot() { return allapot; 
    }
    
    public void setAllapot(int allapot) {
        this.allapot = allapot; 
    }
    
    public int getId() {
        return id; 
    } 
}
