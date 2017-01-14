package com.fz.mapper;

import com.fz.model.Member;

import java.util.List;
import java.util.Map;

/**
 * Created by 易小白 on 2017/1/12.
 */
public interface MemberMapper {
    public Member queryById(int id);

    public List<Map<String,Object>> query();

    public List<Map<String,Object>> queryAll();

    public Member findById(int id);
}
