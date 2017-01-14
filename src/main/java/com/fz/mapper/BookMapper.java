package com.fz.mapper;

import com.fz.model.Book;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

/**
 * Created by 易小白 on 2017/1/11.
 */
public interface BookMapper {

    public int save(Book book);
    public List<Book> query();
    public List<Book> show();

    @Select("call myshow") @Options(statementType = StatementType.CALLABLE)
    public List<Book> ss();

    @Insert("call mysave(#{bname},#{bprice})") @Options(statementType = StatementType.CALLABLE)
    public int mysave(@Param("bname") String n ,@Param("bprice") double d);

    // @Delete("call mydel(#{id})") @Options(statementType = StatementType.CALLABLE)
    public int mydel(int id);

    // @Update("call myupd(#{1},#{2},#{0})") @Options(statementType = StatementType.CALLABLE)
    public int myupd(int id , String bname , double bprice);
}
