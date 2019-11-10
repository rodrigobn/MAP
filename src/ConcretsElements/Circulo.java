/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcretsElements;

import Visitors.VisitorIF;
import exceptions.NumeroNegativoException;

/**
 *
 * @author usuario
 */
public class Circulo implements ElementoConcretoIF{
    
    private double raio;

    public Circulo(double raio) throws NumeroNegativoException {
    	if (raio < 0) {
			throw new NumeroNegativoException();
		}
		this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void Aceitarvisita(VisitorIF v) {
        v.visitaCirculo(this);
    }

  
    
    
}
