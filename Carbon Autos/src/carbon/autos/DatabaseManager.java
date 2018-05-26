package carbon.autos;
import java.sql.*;
import java.util.*;
public class DatabaseManager {

    public static Connection con = null;
    
    static{
        try {
            
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://UZAIR-PC\\SQLEXPRESS;databaseName=CarbonAutos;integratedSecurity=true;";
            con = DriverManager.getConnection(url,"","");
            
            
           }
        catch
            (Exception exe){exe.printStackTrace();}
    }
    
    public static ArrayList getUsers() throws Exception{
            Statement st = con.createStatement();
            String query = "select * from Users";
            ResultSet rs = st.executeQuery(query);
            ArrayList list = new ArrayList();
            while(rs.next()){
               
               int User_Id = rs.getInt("Id"); 
               String Type = rs.getString("Type");
               String First_name = rs.getString("First_name");
               String Last_name = rs.getString("Last_name");
               String User_name = rs.getString("User_name");
               String Email_id = rs.getString("Email_id");
               String Password = rs.getString("Password");
               String Country = rs.getString("Country");
               String City = rs.getString("City");
               String State = rs.getString("State");
               String Address = rs.getString("Address");
               String Card_type = rs.getString("Card_type");
               String Card_owner = rs.getString("Card_owner");
               String Card_number = rs.getString("Card_number");
               String CSC = rs.getString("CSC");
               String CNIC = rs.getString("CNIC");
               String Expiry = rs.getString("Expiry");
               String Gender = rs.getString("Gender");
               int Zip_code = rs.getInt("Zip_code");
               String Img =  rs.getString("Img");
               
               UserBean bean = new UserBean();
               bean.setId(User_Id);
               bean.setType(Type);
               bean.setFirst_name(First_name);
               bean.setLast_name(Last_name);
               bean.setUser_name(User_name);
               bean.setEmail_id(Email_id);
               bean.setPassword(Password);
               bean.setCountry(Country);
               bean.setCity(City);
               bean.setState(State);
               bean.setCard_type(Card_type);
               bean.setAddress(Address);
               bean.setCard_owner(Card_owner);
               bean.setCard_number(Card_number);
               bean.setCSC(CSC);
               bean.setCNIC(CNIC);
               bean.setExpiry(Expiry);
               bean.setGender(Gender);
               bean.setZip_code(Zip_code);
               bean.setImg(Img);
               
               
               list.add(bean);
             
           }
            
            return list;
            
    }
    
    public static ArrayList getCars() throws Exception{
            Statement st = con.createStatement();
            String query = "select * from Cars";
            ResultSet rs = st.executeQuery(query);
            ArrayList list = new ArrayList();
            while(rs.next()){
               
               int Car_Id = rs.getInt("Id"); 
               String Make = rs.getString("Make");
               String Model = rs.getString("Model");
               int Year = rs.getInt("Year");
               String Body_type = rs.getString("Body_type");
               String Fuel_Type = rs.getString("Fuel_type");
               String Drive_Type = rs.getString("Drive_type");
               int Cylinder = rs.getInt("Cylinder");
               int Price = rs.getInt("Price");
               int Km = rs.getInt("Km");
               int Engine_size = rs.getInt("Engine_size");
               int Doors = rs.getInt("Doors");
               int Seats = rs.getInt("Seats");
               String Transmission = rs.getString("Transmission");
               String Color = rs.getString("Color");
               boolean Air_conditioning = rs.getBoolean("Air_conditioning");
               boolean Anti_lock_braking = rs.getBoolean("Anti_lock_braking");
               boolean Brake_assist = rs.getBoolean("Brake_assist");
               boolean Power_steering = rs.getBoolean("Power_steering");
               boolean Power_mirror = rs.getBoolean("Power_mirror");
               boolean Mobile_phone_con = rs.getBoolean("Mobile_phone_con");
               boolean Trip_comp = rs.getBoolean("Trip_comp");
               boolean Central_lock = rs.getBoolean("Central_lock");
               boolean Rear_spoiler = rs.getBoolean("Rear_spoiler");
               boolean Parking_distance_cont = rs.getBoolean("Parking_distance_cont");
               boolean Hill_holder = rs.getBoolean("Hill_holder");
               boolean Engine_immobilizer = rs.getBoolean("Engine_immobilizer");
               boolean Cloth_trim = rs.getBoolean("Cloth_trim");
               boolean Dual_airbag = rs.getBoolean("Dual_airbag");
               boolean Usb_input = rs.getBoolean("Usb_input");
               boolean Intermittent_wipers = rs.getBoolean("Intermittent_wipers");
               boolean Map_reading_lamps = rs.getBoolean("Map_reading_lamps");
               boolean Leather_steering_wheel = rs.getBoolean("Leather_steering_wheel");
               boolean Halogen_headlights = rs.getBoolean("Halogen_headlights");
               String Img = rs.getString("Img");
               
               
               CarBean bean = new CarBean();
               bean.setId(Car_Id);
               bean.setMake(Make);
               bean.setModel(Model);
               bean.setYear(Year);
               bean.setBodytype(Body_type);
               bean.setFueltype(Fuel_Type);
               bean.setDrivetype(Drive_Type);
               bean.setCylinder(Cylinder);
               bean.setPrice(Price);
               bean.setKm(Km);
               bean.setEnginesize(Engine_size);
               bean.setDoors(Doors);
               bean.setSeats(Seats);
               bean.setTrans(Transmission);
               bean.setColors(Color);
               bean.setAirconditioning(Air_conditioning);
               bean.setAntilock(Anti_lock_braking);
               bean.setBrakeassist(Brake_assist);
               bean.setPowersteering(Power_steering);
               bean.setPowermirror(Power_mirror);
               bean.setMobcon(Mobile_phone_con);
               bean.setTripcomp(Trip_comp);
               bean.setCentrallock(Central_lock);
               bean.setRearspoiler(Rear_spoiler);
               bean.setParkdist(Parking_distance_cont);
               bean.setHillholder(Hill_holder);
               bean.setEngineimmobilizer(Engine_immobilizer);
               bean.setClothtrim(Cloth_trim);
               bean.setDualairbag(Dual_airbag);
               bean.setUsb(Usb_input);
               bean.setWipers(Intermittent_wipers);
               bean.setMap(Map_reading_lamps);
               bean.setLeathersteering(Leather_steering_wheel);
               bean.sethalogen(Halogen_headlights);
               bean.setImg(Img);
               
               
               list.add(bean);
             
           }
            
            return list;
            
    }
    
    public static ArrayList getSales() throws Exception{
            Statement st = con.createStatement();
            String query = "select * from Sales";
            ResultSet rs = st.executeQuery(query);
            ArrayList list = new ArrayList();
            while(rs.next()){
               
               int Sales_Id = rs.getInt("Id");
               int User_Id = rs.getInt("User_id");
               int Car_Id = rs.getInt("Car_Id");
               String Date = rs.getString("Date");
               
               
               SalesBean bean = new SalesBean();
               bean.setId(Sales_Id);
               bean.setUserId(User_Id);
               bean.setCarId(Car_Id);
               bean.setDate(Date);
               
               list.add(bean);
             
           }
            
            return list;
    }
}


