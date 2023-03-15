package userAccountManagment;

import java.sql.*;


public class Update  {

    Connect connect = new Connect();


    // If we write a insert method in this way, a security vulnerability may occur.
    public void insert(int id , String ad , String soyad){
        try {
        Connection c = connect.connect();
        Statement st = c.createStatement();
            st.executeUpdate("INSERT INTO musteri (id, ad, soyad) VALUES " + "('" + id + "', '" + ad + "', '" + soyad + "')");
        }
        catch (Exception e ){
        System.out.println(e.getMessage());
        }
    }

  //  This insert method is more safe!
    public void insert2(int id, String ad, String soyad) {
        try {
            Connection conn = connect.connect();
            String query = "INSERT INTO musteri (id, ad, soyad) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, ad);
            pstmt.setString(3, soyad);
            pstmt.executeUpdate();
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
    }



    //This delete method is more safe!
    public void delete(int id) {
        try {
            Connection c = connect.connect();
            PreparedStatement st = c.prepareStatement("DELETE FROM musteri WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    // If we write a delete method in this way, a security vulnerability may occur.
    public  void delete2(int id) {
        try {
            Connection c = connect.connect();
            Statement st = c.createStatement();
            st.executeUpdate("DELETE FROM musteri WHERE id = '" + id + "'");
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }


        public void list() {
            try {
                Connection c = connect.connect();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM  musteri");
                while ( rs.next() ) {
                    System.out.println("ID : " + rs.getInt("id") +
                                       " Name : " + rs.getString("ad") +
                                       " Surname : " + rs.getString("soyad") );
                }
            }
            catch (Exception E) {
                System.out.println(E.getMessage());
            }
        }
}
