/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_s;

/**
 *
 * @author NAeeM
 */
public class Calculator {
    double result;

    double calculaton(String operations, double firstnum,double secondnum){
        
        if(operations=="+"){
            result = firstnum + secondnum; 
        }else if(operations=="-"){
            result = firstnum - secondnum;
        }else if(operations=="*"){
            result = firstnum * secondnum;
        }else if(operations=="/"){
            result = firstnum / secondnum;
        }else if(operations=="%"){
            result = firstnum % secondnum;
        }
        return result;
    }
}
