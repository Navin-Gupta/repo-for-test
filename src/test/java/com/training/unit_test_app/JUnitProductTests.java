package com.training.unit_test_app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


//add support of JUnit Test runner
@RunWith(SpringJUnit4ClassRunner.class)
//1. config class   2. annotation based resource access
@ContextConfiguration(classes=AppConfig.class, loader=AnnotationConfigContextLoader.class)
public class JUnitProductTests {
	
	//add dependency injection
	@Autowired
	private ProductService productService;
	
	//test case : every test case is a seperate method
	//2 special methods (pre | post ) process : static methods 
	
	@BeforeClass //pre process (exceute before any test cases)
	public static void setUp() {
		
	}
	
	@Test
	public void testProductService() {
		//test if service is appropriate
		//assert method to perform checks
		assertEquals("class com.training.unit_test_app.ProductServiceImpl",this.productService.getClass().toString());
	}
	
	@Test
	public void testDescription() {
		assertTrue(this.productService.getProductDescription(3).contains("FDescription"));
	}
	
	
	
	@AfterClass //post process (exceute after all test cases)
	public static void afterTest() {
		
	}
	
	
	
	
	
	
	
	
	
}
