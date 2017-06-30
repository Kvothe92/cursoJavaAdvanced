
package Banco;


public class Banco {
    int getTazaDeInteres(){
        return 0;
    }
}

class Bancomer extends Banco{
    @Override
    int getTazaDeInteres(){
        return 8;
    }
}

class HSBC extends Banco{
    @Override
    int getTazaDeInteres(){
        return 7;
    }
}

class BanCoppel extends Banco{
    @Override
    int getTazaDeInteres(){
        return 9;
    }
}

class PruebaBanco {
    public static void main(String[] args) {
        Bancomer b = new Bancomer();
        HSBC h = new HSBC();
        BanCoppel bc = new BanCoppel();
        
        System.out.println("Bancomer taza de interes: "+ b.getTazaDeInteres());
        System.out.println("HSBC taza de interes: "+h.getTazaDeInteres());
        System.out.println("BanCoppel taza de interes: "+bc.getTazaDeInteres());
    }
}