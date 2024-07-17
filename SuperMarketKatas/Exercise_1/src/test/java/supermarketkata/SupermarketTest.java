package supermarketkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

import supermarketKata.PricedProduct;
import supermarketKata.Supermarket;

class SupermarketTest {

    @Test
    public void priceSummary() {
        PricedProduct pricedProduct = new PricedProduct("water", 20);
        assertEquals(Supermarket.calculateSummary(List.of(pricedProduct)), 0);
    }
}