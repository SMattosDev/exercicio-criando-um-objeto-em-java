public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 12;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        // volume = volume = 1;

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
        // volume = volume - 1;

    }

    public void aumentarCanal(){
        canal = canal + 1;
    }

    public void diminuirCanal(){
        canal = canal - 1;
    }

    public void mudarCanal (int novoCanal ){
        canal = novoCanal;
    }
}
