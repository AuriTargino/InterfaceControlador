
package com.mycompany.interfacecontrolador;

public class ClassControle implements ControleRemoto {
    private int  volume;
    private boolean ligado;
    private boolean tocando;
    
    public ClassControle(){
        this.volume = 10;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
       this.setLigado(true);
       
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void abrirMenu() {
        this.getLigado();
        System.out.println("Ligado " + this.getLigado());
        System.out.println("Tocando " + this.getTocando());
        System.out.println("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=5 );{
        System.out.println("|  " + this.getVolume());
    }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando  Menu ");
    }

    @Override
    public void maisVolume() {
        this.getLigado();
        this.setVolume(this.getVolume() + 2); 
    }

    @Override
    public void menosVolume() {
       this.getLigado();
       this.setVolume(this.getVolume() - 2);
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && (this.getVolume()>0)){
                 this.setVolume(0);
        }
    }
     @Override
     public void desligarMudo(){
        if(this.getLigado() && (this.getVolume() == 0)){
            this.setVolume(10);
        }
    }
    @Override
     public void play() {
         if(this.getLigado() && (this.getTocando() == false)){
            this.setTocando(true);
     }
    }

    @Override
     public void pause() {
         if(this.getLigado() && (this.getTocando())){
             this.setTocando(false);
         }
    }
    
    
}
