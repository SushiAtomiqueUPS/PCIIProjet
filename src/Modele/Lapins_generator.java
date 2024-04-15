package Modele;

import java.awt.Point;

import View.Constant_view;

public class Lapins_generator extends  Thread{
    public Lapins_generator(){}

    public Lapins generate_lapin(){
        return new Lapins(new Point(Constant_view.WIDTH_WINDOW, Constant_view.HEIGHT_WINDOW));
    }

    @Override
    public void run(){
        for (int i = 0; i < Constant_modele.LAPIN_GENERATION_DELAY; i++){
            try{
                Thread.sleep(1000);
                generate_lapin();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        while (true){
            try {
                Thread.sleep(Constant_modele.LAPIN_GENERATION_DELAY);
                generate_lapin();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
