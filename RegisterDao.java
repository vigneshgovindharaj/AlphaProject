package vignesh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	


		static Connection getConnection(){
		     Connection con = null;
		     try{
		        Class.forName("com.mysql.jdbc.Driver");
		        con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "Vignesh@2411");
		        
		    }
		    catch(Exception ex){
		        System.out.print(ex.getMessage());
		        
		        
		    }
		return con;
		   }
	
	
	
	public Connection insert(Member details)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		@SuppressWarnings("unused")
		String result = "Register Successfully";
		String sql = "insert into details values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, details.getId());
			ps.setString(2, details.getFname());
			ps.setString(3, details.getBirthday());
			ps.setString(4, details.getGender());
			ps.setString(5, details.getPname());
			ps.setString(6, details.getFather());
			ps.setString(7, details.getMother());
			ps.setString(8, details.getAddress());
			ps.setString(9, details.getEmail());
			ps.setString(10, details.getCollege());
			ps.setString(11, details.getQulification());
			ps.setString(12, details.getLag());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			result = "Data not Enterd";
		}
		
		return con ;
	}
}
