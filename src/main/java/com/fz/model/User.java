package com.fz.model;

import lombok.Data;

import java.util.List;

/**
 * Created by 易小白 on 2017/1/11.
 */
@Data
//    @Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class User {
    private int id;
    private String uname;
    private String upass;
    private List<Role> roles;
}
