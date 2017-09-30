package eventmanager.ndcs.hackathon.app.sqlite.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import eventmanager.ndcs.hackathon.app.Constants;
import eventmanager.ndcs.hackathon.app.model.User;

/**
 * Created by miguel on 30/9/17.
 */

public class SQLiteController {

    private Context context;
    private SQLiteGestor bdg;
    private SQLiteDatabase bd;

    public SQLiteController(Context context){
        this.context = context;
    }

    public User getUserData(String email){
        openReadableBD();
        //Revisad esta consulta, no sé si es exactamente así
        Cursor rs = bd.rawQuery("SELECT * FROM USER WHERE email == "+email,null);
        if (rs.moveToNext())
            return new User.Builder().id(rs.getString(1)).nombre(rs.getString(2)).apellidos(rs.getString(3)).email(rs.getString(4)).telefono(rs.getString(5)).admin(rs.getInt(6)==1).pass(rs.getString(7)).build();
        else
            return null;
    }

    private void openReadableBD(){
        bdg = new SQLiteGestor(this.context, Constants.DATABASE_PATH, null, 1);
        bd = bdg.getReadableDatabase();
    }

    private void openWritableBD(){
        bdg = new SQLiteGestor(this.context, Constants.DATABASE_PATH, null, 1);
        bd = bdg.getWritableDatabase();
    }

}
