
package ejer1;

public class ecuacion {
    private int x;
    private int y;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public ecuacion(int a, int b, int c, int d,int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public boolean tieneSolucion(){
        if(a*d-b*c != 0){
            return true; }
        else{
        return false;  }
        
    }
    public int getX(){
        int n=e*d-b*f;
        int de=a*d-b*c;
        x=n/de;
        return x;
    }

    public int getY() {
        int nom=a*f-e*c;
        int den=a*d-b*c;
        y=nom/den;
        return y;
    }
    
    
}
