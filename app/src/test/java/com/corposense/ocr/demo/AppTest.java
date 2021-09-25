package com.corposense.ocr.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

// import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.corposense.ocr.demo.App;

import ratpack.http.client.ReceivedResponse;
import ratpack.test.MainClassApplicationUnderTest;

@RunWith(JUnit4.class)
public class AppTest {

    MainClassApplicationUnderTest app = new MainClassApplicationUnderTest(App.class);

    // @Before
    // public final void setUp() {
    //
    // }

    // @After
    // public void tearDown() {
    //
    // }

    @Test
    public void testUploadFile(){
      // Call to get request for all uploaded files
      // Make sure that uploaded files equals to existing files in DB
      assertEquals(1, App.CONSTANT_VALUE);
    }

    // @Test
    // public void staticHandler() {
    	// assertEquals("text asset\n", get("static/test.txt"));
    	// final ReceivedResponse response = app.getHttpClient().get();
    	// assertEquals(404, response.getStatusCode());
    	// assertThat(response.getBody().getText(), CoreMatchers.containsString("{ message: \"Unauthorised\" }"));
    // }

    // @Test
    // public void staticHandlerTest() {
    	// final ReceivedResponse response = app.getHttpClient().get("static/test.txt");
    	// assertEquals(200, response.getStatusCode());
    	// assertThat(response.getBody().getText(), CoreMatchers.containsString("text asset"));
    // }

    // @Test
    // public void checkNoTokenForBalance() {
    	// final ReceivedResponse response = app.getHttpClient().get("balance");
    	// assertEquals(500, response.getStatusCode());
    	// assertThat(response.getBody().getText(), CoreMatchers.containsString("Token Not Present"));
    // }

    // @Test
    // public void checkNoTokenForTransactions() {
    	// final ReceivedResponse response = app.getHttpClient().get("transactions");
    	// assertEquals(500, response.getStatusCode());
    	// assertThat(response.getBody().getText(), CoreMatchers.containsString("Token Not Present"));
    // }

}
