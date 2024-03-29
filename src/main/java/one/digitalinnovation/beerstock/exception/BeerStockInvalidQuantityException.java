package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInvalidQuantityException extends Exception {

    public BeerStockInvalidQuantityException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID decrement by %s is an invalid number", id, quantityToDecrement));
    }
}
