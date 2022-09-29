package site.metacoding.firstapp.domain.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductDaoTest {

    @Autowired
    private ProductDao productDao;

    @Test
    public void findbyId_test() {
        // given (받아야 될 것)
        Integer productId = 1;

        // when (테스트)
        Product productPS = productDao.findById(productId);

        // then (검증)
        assertEquals("바나나", productPS.getProductName());
    }
}
