package com.fz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by 易小白 on 2017/1/12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private int id;
    private String accout;
    private String mpass;
    private String mname;
    private Address address;
    private List<Order> orders;
}
