package com.fz.mapper;

import com.fz.model.Role;

/**
 * Created by 易小白 on 2017/1/11.
 */
public interface RoleMapper {
    public Role findByUserId(int id);
    public Role findById(int id);

}
