/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeJava;

/**
 *
 * @author geoguitar
 */
public class Cls_Calcular {
    
    private int valorCompra;
    private int percentualDesconto;
    private float valorDesconto;
    private float valorAPagar;
    
    public int calculoValorCompra(int quantidade){
    
        valorCompra = quantidade * 5;
        return valorCompra;
    }
    
    public float calculoValorDesconto(int quantidade ,int valorCompra){
    
        if(quantidade <= 20){
            percentualDesconto = 0;
        }else if((quantidade > 20)&&(quantidade <= 100)){
            percentualDesconto = 10;
    }else{
            percentualDesconto = 20;
         }
        
        valorDesconto = valorCompra * percentualDesconto/100;
        return valorDesconto;
    }
    
    public float calculoValorAPagar(int valorCompra,float valorDesconto){
    
        valorAPagar = valorCompra - valorDesconto;
        return valorAPagar;
    }
}
