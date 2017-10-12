package Producto;

/**
 *
 * @author Sergio Cañas
 */
public class ProductoPunto {
    
    public double Producto(double magnitud1, double magnitud2, double angulo){
        double resultado = 0;
        
        resultado = magnitud1 * magnitud2 * Math.cos(angulo);
        return resultado;
    }
}
