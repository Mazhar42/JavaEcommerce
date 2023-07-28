package dev.ecommerce;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import dev.ecommerce.db.StaticDB;
import dev.ecommerce.model.Product;
import dev.ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@AutoConfigureMockMvc
public class ProductRestControllerTest {

    @Autowired
    private MockMvc mockMvc;


//    @MockBean
//    ProductService productService;
    @Test
    public void testGetAllProducts() throws Exception {

//        List<Product> products = new ArrayList<>();
//        products.add(new Product(1L,"1011001","Product 1","Laptop", 10.99));
//        products.add(new Product(2L,"1011002","Product 2","Laptop", 20.99));

//        when(productService.getAllProducts()).thenReturn(products);
        StaticDB.initDB();
        mockMvc.perform(get("/api/v1/products").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());

        mockMvc.perform(get("/api/v1/products").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].sku").value("101001"))
                .andExpect(jsonPath("$[0].name").value("Hp elitebook G5"))
                .andExpect(jsonPath("$[0].categories").value("Laptop"))
                .andExpect(jsonPath("$[0].price").value(500.00));

    }
}

