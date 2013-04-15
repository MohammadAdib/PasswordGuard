
package passwordguard;

public class PasswordGuard
{
    public PasswordGuard()
    {}
    public void run()
    {
        LoginGUI PG = new  LoginGUI();
        PG.setVisible(true);        
        if(!PG.isLoggedIn())
        {
            System.exit(0);
        }
    }
}
