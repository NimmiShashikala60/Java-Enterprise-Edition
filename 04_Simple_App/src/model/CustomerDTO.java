package model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class CustomerDTO {
    String id;
    String name;
    String address;
    int salary;
}