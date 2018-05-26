package carbon.autos;
public class SalesBean {
    private int Id;
    private int UserId;
    private int CarId;
    private String Date;

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    
    public int getUserId(){
        return UserId;
    }
    public void setUserId(int UserId){
        this.UserId = UserId;
    }
    
    public int getCarId(){
        return CarId;
    }
    public void setCarId(int CarId){
        this.CarId = CarId;
    }
    
    public String getDate(){
        return Date;
    }
    public void setDate(String Date){
        this.Date = Date;
    }
    
    
}
