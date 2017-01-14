package demo;

import com.fz.mapper.BookMapper;
import com.fz.mapper.MemberMapper;
import com.fz.mapper.RoleMapper;
import com.fz.model.Book;
import com.fz.model.Member;
import com.fz.model.Role;
import com.fz.mybatis.Mybatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by 易小白 on 2017/1/10.
 */
public class Hello {

    @Test
    public void u2r(){
        SqlSession s = Mybatis.getSqlSession();
        //UserMapper um = s.getMapper(UserMapper.class);
        //System.out.println(um.findById(3));

        //反向查询知道role找到对应user的所有role
        RoleMapper rm = s.getMapper(RoleMapper.class);
        Role r = rm.findById(2);
        System.out.println(r.getRname());
        System.out.println(r.getUser());

        s.commit();
        s.close();
    }


    @Test
    public void mem(){
        SqlSession s = Mybatis.getSqlSession();
        MemberMapper mm = s.getMapper(MemberMapper.class);

        Member m = mm.findById(3);
        System.out.println(m);

        //List<Map<String, Object>> ls = mm.query();
        //List<Map<String, Object>> ls = mm.queryAll();
        //System.out.println(ls.size());
        //for(Map<String,Object> m:ls){
        //    System.out.println(m.get("mname"));
        //    System.out.println(m.get("aname"));
        //}

        /* m4 */
        //AddressMapper am = s.getMapper(AddressMapper.class);
        //System.out.println(am.queryById(101));
        s.commit();
        s.close();
    }


    @Test
    public void mybook(){
        SqlSession s = Mybatis.getSqlSession();
        BookMapper bm = s.getMapper(BookMapper.class);
        //bm.mysave("mysql",69);
        //bm.mydel(6);
        bm.myupd(7,"mysql5.7.14",233);

        s.commit();
        s.close();
    }

    @Test
    public void book(){
        SqlSession s = Mybatis.getSqlSession();
        BookMapper bm = s.getMapper(BookMapper.class);
        //Book b = new Book();
        //b.setBname("JQ测试");
        //b.setBprice(55.00);
        //bm.save(b);
        System.out.println("-----------↓----------------");

        //List<Book> list = bm.query();
        //List<Book> list = bm.show();
        List<Book> list = bm.ss();
        for (Book bk : list){
            System.out.println(bk.getBname()+"--"+bk.getBprice());
        }

        s.commit();
        s.close();
    }




    @Test
    public void ok(){
        //SqlSession s = Mybatis.getSqlSession();
        //StudentMapper sm = s.getMapper(StudentMapper.class);
        //System.out.println("-----------↓----------------");
        ///System.out.println(s);
        ///System.out.println(sm.deleteById(3));

        //Student stu = new Student();
        //stu.setUname("andy");
        //stu.setAddress("上海");
        //System.out.println(sm.save(stu));
        //System.out.println(sm.insert("jack","北京"));
        //System.out.println("--------------");
        //List<Student> sss = sm.query();
        //sm.myupdate(5,"jack","深圳");

        //List<Student> sss = s.selectList("query");
        //for(Student st : sss){
        //  System.out.println(st.getUname()+"---"+st.getAddress());
        //}

        //List<String> ss = sm.queryNames();
        //System.out.println(ss.size());
        //for(String sn : ss){
        //    System.out.println(sn);
        //}


        //List<Map<String,Object>> ms = sm.queryName("%南%");
        //for(Map<String,Object> m : ms){
        //    System.out.println(m.get("uname"));
        //    System.out.println(m.get("address"));
        //}

        //System.out.println(sm.count());

        //s.commit();
        //s.close();

    }



}
