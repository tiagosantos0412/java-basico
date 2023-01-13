package me.dio.metodos;

public class Metodos1 {
    public static void main(String[] args) {
       boolean ligada = false;
       int canal = 3;
       int volume = 3;

       ligada = ligarTv(ligada);
       
       canal = trocarCanal(8);
       volume = aumentarVolume(volume);
       canal = trocarCanalBaixo(canal);
       displayTv(ligada, volume, canal);
       
       ligada = desligarTv(ligada);
       displayTv(ligada, volume, canal);
       
    }

    /*
     * Métodos do exercício Smart TV
     */

    public static boolean ligarTv(boolean ligada){
        ligada = true;
        return ligada;
    }

    public static boolean desligarTv(boolean ligada){
        ligada = false;
        return ligada;
    }

    public static int aumentarVolume(int volume){
        volume ++;
        if(volume > 10){
            volume = 10;
        }
        return volume;
    }

    public static int diminuirVolume(int volume){
        volume --;
        if(volume < 1){
            volume = 0;
        }
        return volume;
    }

    public static int trocarCanal(int canal){
        return canal;
    }

    public static int trocarCanalCima(int canal){
        canal ++;
        if(canal > 10){
            canal = 1;
        }
        return canal;
    }

    public static int trocarCanalBaixo(int canal){
        canal --;
        if(canal < 1){
            canal = 10;
        }
        return canal;
    }

    public static void verificarVolume(int volume){
        if(volume >= 10){
            System.out.println("Volume máximo " + volume);
        }else if(volume <= 0){
            System.out.println("Mudo " + volume);
        }else {
            System.out.println("Volume " + volume);
        }
    }

    public static void displayTv(boolean ligada, int volume, int canal){
        if(ligada == true){
            System.out.println("A TV está ligada....");
        }else {
            System.out.println("A TV está desligada...");
        }
        verificarVolume(volume);
        System.out.println("Canal " + canal);
    }

    public static void apagarDisplayTv(){
        desligarTv(false);
    }
}
