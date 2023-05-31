package vignesh;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

@WebServlet("/success")
public class success extends HttpServlet {
	private static final long serialVersionUID = 1L;	
    public success() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	int Id =Integer.parseInt(request.getParameter("Id"));
	try {
		Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "Vignesh@2411");
      PreparedStatement ps= con.prepareStatement("Select * from details where Id = ?");
      ps.setInt(1, Id);
      out.print("<table width=75% border=1>");
      out.print("<caption>Sutdents Details :</caption>");
      
      ResultSet rs= ps.executeQuery();
      ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();		
      int totalcolumn = rsmd.getColumnCount();
      out.print("<tr>");
      for(int i=1; i<=totalcolumn; i++) 	{
    	  out.print("<th>"+rsmd.getColumnName(i)+"</th>");
      }
      out.print("</tr>");
      while(rs.next()) {
    	  out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td><td>"+rs.getString(12)+"</td><td>");
      }
      out.print("</table>");
	} catch (Exception e) {
	}
	}
}
