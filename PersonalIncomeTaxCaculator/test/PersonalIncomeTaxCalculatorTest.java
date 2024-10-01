/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import personalincometaxcaculator.PersonalIncomeTaxCalculator;

/**
 *
 * @author Admin
 */
public class PersonalIncomeTaxCalculatorTest {
    private static final float DELTA = 0.001f;
    public PersonalIncomeTaxCalculatorTest() {
    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testNegativeSalary() {
        assertEquals(-1, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(-10000, 0, 0), DELTA);
    }

    @Test
    public void testNegativeTax() {
        assertEquals(0, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(10000000, -1000, 0), DELTA);
    }

    @Test
    public void testNegativeNod() {
        assertEquals(-1, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(10000000, 0, -1), DELTA);
    }

    @Test
    public void testZeroTaxableIncome() {
        assertEquals(0, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(9000000, 0, 0), DELTA);
    }

    @Test
    public void testTaxBracket5Percent() {
        assertEquals(50000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(10000000, 0, 0), DELTA);
    }

    @Test
    public void testTaxBracket10Percent() {
        assertEquals(350000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(15000000, 0, 0), DELTA);
    }

    @Test
    public void testTaxBracket15Percent() {
        assertEquals(1250000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(25000000, 0, 0), DELTA);
    }

    @Test
    public void testTaxBracket20Percent() {
        assertEquals(3250000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(45000000, 0, 0), DELTA);
    }

    @Test
    public void testTaxBracket25Percent() {
        assertEquals(11250000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(85000000, 0, 0), DELTA);
    }

    @Test
    public void testTaxBracket30Percent() {
        assertEquals(23250000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(125000000, 0, 0), DELTA);
    }

    @Test
    public void testWithDependents() {
        assertEquals(250000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(20000000, 0, 1), DELTA);
    }

    @Test
    public void testWithTaxExemption() {
        assertEquals(200000, PersonalIncomeTaxCalculator.fncPersonalIncomeTax(20000000, 1000000, 0), DELTA);
}}
