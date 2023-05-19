/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package pruebasunitarias;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author alumno
 */
public class OperacionesNumerosNGTest {
    
    public OperacionesNumerosNGTest() {
    }

    static Integer[] prueba;
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        prueba = new Integer[]{10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
    }

    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void constructor1(){
        System.out.println("Constructor null");
        OperacionesNumeros instance = new OperacionesNumeros(null);
    }
    
    @Test
    public void constructor2(){
        try {
            System.out.println("Constructor vacio");
            Integer[] vacio = {};
            OperacionesNumeros instance = new OperacionesNumeros(vacio);
            fail("La excepción no ha saltado");
        } catch (IllegalArgumentException ex) {
        }
    }
    
    @Test
    public void constructor3(){
        System.out.println("Constructor prueba");
        OperacionesNumeros instance = new OperacionesNumeros(prueba);
    }
    
    /**
     * Test of getMaximo method, of class OperacionesNumeros.
     */
    @Test
    public void testGetMaximo() {
        System.out.println("getMaximo");
        OperacionesNumeros instance = new OperacionesNumeros(prueba);
        int expResult = 125;
        int result = instance.getMaximo();
        assertEquals(result, expResult);
    }

    /**
     * Test of getMinimo method, of class OperacionesNumeros.
     */
    @Test
    public void testGetMinimo() {
        System.out.println("getMinimo");
        OperacionesNumeros instance = new OperacionesNumeros(prueba);
        int expResult = 1;
        int result = instance.getMinimo();
        assertEquals(result, expResult);
    }

    /**
     * Test of getSuma method, of class OperacionesNumeros.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        OperacionesNumeros instance = new OperacionesNumeros(prueba);
        int expResult = 834;
        int result = instance.getSuma();
        assertEquals(result, expResult);
    }

    /**
     * Test of getIndiceDe method, of class OperacionesNumeros.
     */
    @Test
    public void testGetIndiceDe() {
        System.out.println("getIndiceDe");
        int numero = 2;
        OperacionesNumeros instance = new OperacionesNumeros(prueba);
        int expResult = 3;
        int result = instance.getIndiceDe(numero);
        assertEquals(result, expResult);
    }
    
    /**
     * Test of getIndiceDe method, of class OperacionesNumeros.
     */
    @Test(expectedExceptions = {java.util.NoSuchElementException.class})
    public void testGetIndiceDe2() {
        System.out.println("getIndiceDe");
        int numero = 169;
        OperacionesNumeros instance = new OperacionesNumeros(prueba);
        int expResult = 0;
        int result = instance.getIndiceDe(numero);
        assertEquals(result, expResult);
    }
    
}
