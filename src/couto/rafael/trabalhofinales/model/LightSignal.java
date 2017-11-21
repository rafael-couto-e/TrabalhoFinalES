/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couto.rafael.trabalhofinales.model;

/**
 *
 * @author developer
 */
public class LightSignal extends Signal{
    public LightSignal(){
        super();
    }

    @Override
    public String getMessage() {
        String message = "";
        
        switch(state){
            case STOP:
                message = "Sinal vermelho - PARE!";
                break;
            case CAUTION:
                message = "Sinal amarelo - ATENÇÃO!";
                break;
            case GO:
                message = "Sinal verde - SIGA!";
                break;
        }
        
        return message;
    }
    
}
