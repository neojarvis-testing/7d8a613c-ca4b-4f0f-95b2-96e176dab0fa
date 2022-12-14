// package com.example;

// import static org.junit.Assert.assertEquals;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// import java.util.List;

// //import org.junit.jupiter.api.Test;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.MediaType;
// import org.springframework.test.context.junit4.SpringRunner;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.MvcResult;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// import com.example.demo.repository.ProductsRepository;
// import com.example.model.ProductModel;

// @SpringBootTest
// @AutoConfigureMockMvc
// @RunWith(SpringRunner.class)
// public class BookstoreApplicationTests {
	
// 	@Autowired
//     private MockMvc mockMvc;	
	 
// 	//Testing Login and Sign Up 
// 	@Test
//     public void TestCase1() throws Exception {
		 
// 		//Sign Up
// 	 	String userOne = "{\"email\":\"test@iamneo.ai\",\"username\":\"TestUser\",\"mobileNumber\":\"1234598760\",\"password\":\"neo\"}";
// 	 	mockMvc.perform(MockMvcRequestBuilders.post("/signup")
// 	 			.contentType(MediaType.APPLICATION_JSON)
// 	 			.content(userOne)
// 	 			.accept(MediaType.APPLICATION_JSON))
// 	        	.andExpect(status().isOk())
// 	        	.andExpect(jsonPath("$").value("true"))
// 	        	.andReturn();
	    
// 	 	//Login
// 	    String dataOne = "{\"email\":\"test@iamneo.com\",\"password\":\"neo\"}";
// 	    mockMvc.perform(MockMvcRequestBuilders.post("/login")
// 	    		.contentType(MediaType.APPLICATION_JSON)
// 	    		.content(dataOne)
// 	    		.accept(MediaType.APPLICATION_JSON))
// 	        	.andExpect(status().isOk())
// 	        	.andExpect(jsonPath("$").value("true"))
// 	        	.andReturn();
//     }
	 
	 
// 	//Add Product
// 	@Test
// 	public void TestCase2() throws Exception {
// //		String prodOne = "{\"productId\":\"12345\",\"imageUrl\":\"TestingURL\",\"productName\":\"FixedOne2\",\"price\":\"100\",\"description\":\"TestingDescription\",\"quantity\":10}";
// //	    mockMvc.perform(MockMvcRequestBuilders.post("/admin/addProduct")
// //	    		.contentType(MediaType.APPLICATION_JSON)
// //	    		.content(prodOne)
// //	    		.accept(MediaType.APPLICATION_JSON))
// //	        	.andExpect(status().isOk())
// //	        	.andReturn();
	    
// 	    mockMvc.perform(MockMvcRequestBuilders.get("/admin/deleteByName/FixedOne2")
// 	    		.accept(MediaType.APPLICATION_JSON))
// 	        	.andExpect(status().isOk())
// 	        	.andReturn();
	    
//     }
	 
	 
// 	 //Home
// 	 @Test
// 	 public void TestCase3() throws Exception {
		 
// 		 String prodOne = "{\"productId\":\"123\",\"imageUrl\":\"TestingURL1\",\"productName\":\"TestingName1\",\"price\":\"100\",\"description\":\"TestingDescription1\",\"quantity\":10}";
// 		 mockMvc.perform(MockMvcRequestBuilders.post("/admin/addProduct")
// 				.contentType(MediaType.APPLICATION_JSON)
// 				.content(prodOne)
// 				.accept(MediaType.APPLICATION_JSON))
// 		 		.andExpect(status().isOk())
// 		 		.andReturn();
		 
// 		 mockMvc.perform(MockMvcRequestBuilders.get("/home")
// 				.accept(MediaType.APPLICATION_JSON))
// 	        	.andExpect(status().isOk())
// 	        	.andDo(print())
// 	        	.andExpect(MockMvcResultMatchers.jsonPath("$[*].productName").exists())
// 	        	.andReturn();
// 	 }
	 
	 
// 	 @Test
// 	 public void TestCase4() throws Exception {
		 
// 		 String prodOne = "{\"productId\":\"123\",\"imageUrl\":\"TestingURL1\",\"productName\":\"TestingName1\",\"price\":\"100\",\"description\":\"TestingDescription1\",\"quantity\":10}";
// 		 mockMvc.perform(MockMvcRequestBuilders.post("/admin/addProduct")
// 		 		.contentType(MediaType.APPLICATION_JSON)
// 		        .content(prodOne)
// 		        .accept(MediaType.APPLICATION_JSON))
// 		        .andExpect(status().isOk())
// 		        .andReturn();
		 
// 		 mockMvc.perform(MockMvcRequestBuilders.get("/admin")
// 				.accept(MediaType.APPLICATION_JSON))
// 	        	.andExpect(status().isOk())
// 	        	.andDo(print())
// 	        	.andExpect(MockMvcResultMatchers.jsonPath("$[*].productName").exists())
// 	        	.andReturn();		    
// 	 }
	 
	 
// 	 @Test
// 	 public void TestCase5() throws Exception {
		 
// 		 mockMvc.perform(MockMvcRequestBuilders.get("/admin/orders")
// 				.accept(MediaType.APPLICATION_JSON))
// 	        	.andExpect(status().isOk())
// 	        	.andReturn();
// 	 }
	 
// }
