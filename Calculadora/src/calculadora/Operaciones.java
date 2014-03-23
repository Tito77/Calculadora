/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


/**
 *
 * @author pc
 */
public class Operaciones {
    public native double  getSuma(double uno, double dos);
    public native double  getResta(double uno, double dos);
    public native double  getMulplicacion(double uno, double dos);
    public native double  getDivision(double uno, double dos);
    static{
        System.loadLibrary("Operaciones");
    }
    
}
