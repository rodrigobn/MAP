/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcretsElements;

import Visitors.VisitorIF;

/**
 *
 * @author usuario
 */
public interface ElementoConcretoIF {
    
   public void Aceitarvisita(VisitorIF v);
}
