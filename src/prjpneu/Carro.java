
package prjpneu;
public class Carro {
    private Pneu p1;
    private Pneu p2;
    private Pneu p3;
    private Pneu p4;
    
    public void liga(){
        System.out.println("Carro Ligado..");
        System.out.println("Pneu 1 - " + p1.getPressao());
        p1.rodar();
        System.out.println("Pneu 2 - " + p2.getPressao());
        p2.rodar();
        System.out.println("Pneu 3 - " + p3.getPressao());
        p3.rodar();
        System.out.println("Pneu 4 - " + p4.getPressao());
        p4.rodar();
    }
    
    public void desliga(){
        System.out.println("Carro desligado..");
    }

    public Pneu getP1() {
        return p1;
    }

    public void setP1(Pneu p1) {
        this.p1 = p1;
    }

    public Pneu getP2() {
        return p2;
    }

    public void setP2(Pneu p2) {
        this.p2 = p2;
    }

    public Pneu getP3() {
        return p3;
    }

    public void setP3(Pneu p3) {
        this.p3 = p3;
    }

    public Pneu getP4() {
        return p4;
    }

    public void setP4(Pneu p4) {
        this.p4 = p4;
    }
    
    
    
    
}
