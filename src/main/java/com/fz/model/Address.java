package com.fz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by 易小白 on 2017/1/12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    private int aid;
    private String aname;
    private String aphone;
}
