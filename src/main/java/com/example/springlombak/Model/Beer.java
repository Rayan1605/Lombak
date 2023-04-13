package com.example.springlombak.Model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data // this is the annotation that will generate the getters and setters also tostring and equals
// and hashcode and Constructor with NO paramaters
//Lombok will generate around 200 lines of code for us without it we would have to write all that
// code
@Builder
// this is the annotation that will generate the builder pattern for us
//Without this annotation we would have to write the builder pattern for us which is all together is
//300 lines of code without it you would be make a new build class and then you would have to
// to write the setters for it then need to return it

//If you wish to see what Lombok is doing for you go to refactor and then click on the Lombok
//and delombok and it will show you what it is doing for you
public class Beer {
    private UUID id;
    private Integer version;
    private String beerName;
    private String beerStyle;
    private Long upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdatedDate;

    Beer(UUID id, Integer version, String beerName, String beerStyle, Long upc, Integer quantityOnHand, BigDecimal price, LocalDateTime createdDate, LocalDateTime lastUpdatedDate) {
        this.id = id;
        this.version = version;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }


}
