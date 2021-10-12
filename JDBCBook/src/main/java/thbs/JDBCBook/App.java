package thbs.JDBCBook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
       BookDAO1 da=(BookDAO1)context.getBean("bookDAO");
//       Book b=new Book();
//       b.setBookId(211);
//       b.setBookName("Ram");
//       b.setBookPrice(3211);
//       da.insert(b);
       
//       for(Book ba:da.selectAll()) {
//    	   System.out.println(ba.getBookId()+" "+ba.getBookName()+" "+ba.getBookPrice());
//       }
       
       Book b=da.select(10);
       System.out.println(b.getBookId()+" "+b.getBookName()+" "+b.getBookPrice());
       
    } 
}
