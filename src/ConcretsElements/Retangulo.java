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
public class Retangulo implements ElementoConcretoIF{
    double altura;
    double largura;

    public Retangulo(double altura, double largura) throws NumeroNegativoException {
    	if (altura < 0 || largura < 0) {
			throw new NumeroNegativoException();
		}
		this.altura = altura;
		this.largura = largura;
    }
    
    
    @Override
    public void Aceitarvisita(VisitorIF v) {
        v.visitaRetangulo(this);
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
    
    
    
    
}
