package CodeAbstract;

public abstract class User {
	private String userName;
	private int userID;
	public abstract void inputData(String usreName,int userID);
	public abstract void inputData(String userName);
	public abstract void inputData(int userID);
	public User() {
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
	
}
