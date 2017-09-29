package eventmanager.ndcs.hackathon.myapplication.application;

import android.app.Application;

import eventmanager.ndcs.hackathon.myapplication.model.User;

/**
 * Created by miguel on 30/9/17.
 */

public class EventmanagerApplication extends Application {

    private static EventmanagerApplication instance = null;

    private User user;

    EventmanagerApplication(){

    }

    public static  EventmanagerApplication getInstance(){
        if(instance == null){
            instance = new EventmanagerApplication();
        }
        return instance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
