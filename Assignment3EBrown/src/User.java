package CodersCampusAssignment3;

public class User {
    //POJO
    // Should contain username, password, name
    private String username;
    private String password;
    private String name;
    private int invalidLogInAttempts;

    /**
     * @return the invalidLogInAttempts
     */
    public int getInvalidLogInAttempts() {
        return invalidLogInAttempts;
    }

    /**
     * @param invalidLogInAttempts the invalidLogInAttempts to set
     */
    public void setInvalidLogInAttempts(int invalidLogInAttempts) {
        this.invalidLogInAttempts = invalidLogInAttempts;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    // TODO Auto-generated method stub
}