package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
public void add() {
	System.out.println("My Sql eklendi");
}
}
