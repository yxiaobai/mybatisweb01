package com.fz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by 易小白 on 2017/1/11.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private int oid;
    private String ono;
    private double omoney;
}
