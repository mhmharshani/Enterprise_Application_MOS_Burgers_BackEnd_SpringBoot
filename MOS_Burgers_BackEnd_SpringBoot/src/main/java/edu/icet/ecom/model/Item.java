package edu.icet.ecom.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Item {

    private String code;
    private String name;
    private Double unitPrice;
    private Double discount;
    private String category;

}
