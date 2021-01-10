/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author felix
 */
public class Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int inteiro = 345;
        float decimalPeq = 1234.8765f; //"f" no final do valor double para coloca-lo em variável float
        double decimalGrande = 1234.7654;
        String numeros = "1234";
        
        //Conversão implicita:
        decimalPeq = inteiro;
        
        //Conversão explicita:
        inteiro = (int)decimalPeq;
        
        //Converter de String para int (wrapper)
        inteiro = Integer.parseInt(numeros);
        
        //Converter de int para String (wrapper)
        numeros = Integer.toString(inteiro);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        //Criar uma variável para Matematica:
        Matematica mat;
        
        //Criar um objeto e fazer com que mat se referencie a este objeto:
        mat = new Matematica();
        
        //Ou criar a variável eo objeto ao mesmo tempo:
        Matematica mat2 = new Matematica();
        
        //Atribuir dados para nossos atributos do objeto
        mat.setNumero1(-123);
        mat.setNumero2(765);
        
        //Atribuir dados para outro objeto da mesma classe Matemática
        mat2.setNumero1(888);
        mat2.setNumero2(999);
        
        System.out.println("A soma dos números é: " + mat.soma());
        System.out.println("Os números somados foram: " + mat.getNumero1() + " e " + mat.getNumero2());
    }
    
}
