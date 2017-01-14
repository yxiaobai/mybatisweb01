package com.fz.model;

import lombok.*;

/**
 * Created by 易小白 on 2017/1/11.
 */
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private int rid;
    private String rname;
    private User user;
}
