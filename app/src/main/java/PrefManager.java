import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by SAWE PETER on 3/19/2018.
 */

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    //shared pref mode
    int PRIVATE_MODE = 0;

    //Shared preferences file name
    private static final String PREF_NAME = "WELCOME";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context){
        
    }
}
