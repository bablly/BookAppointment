package Test_Dao;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.appoint.dao.AdminDao;
import com.imooc.appoint.dao.AppointmentDao;
import com.imooc.appoint.dao.BookDao;
import com.imooc.appoint.dao.StudentDao;
import com.imooc.appoint.entiy.Admin;
import com.imooc.appoint.entiy.Book;
import com.imooc.appoint.entiy.Student;
import com.imooc.appoint.service.BookService;
import com.imooc.appoint.service.Impl.BookServiceImpl;

import Util.BaseDAoTestClass;

public class test extends BaseDAoTestClass {
	@Autowired    //Autowired 按类型匹配
	private BookDao bookdao;
//	@Test
//	public void Test_admindao(){
//		Admin admin=admindao.quaryAdmin(151855,620081);
//		System.out.println(admin.toString());
//	}
	@Test
	public void test(){
		bookdao.addBook("从你的世界路过", 11, "文艺小说");
	}
}
