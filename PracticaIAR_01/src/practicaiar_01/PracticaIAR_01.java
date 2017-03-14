/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaiar_01;

import java.util.ArrayList;
import practicaiar_01.State.Position;

/**
 *
 * @author cristel
 */
public class PracticaIAR_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        State initial = new State();
        initial.oveja = Position.DERECHA;
        initial.repollos = Position.DERECHA;
        initial.lobo = Position.DERECHA;
        initial.granjero = Position.DERECHA;
        System.out.println("Estado inicial: " + initial);
        
        ArrayList<Transition> next = initial.validTransitions();
        System.out.println("Transiciones: " + next.size());
        
        for (Transition t: next) {
            System.out.println("Acción: " + t.action);
            System.out.println("Resultado: " + t.doTransition());
        }
    }
    
}
