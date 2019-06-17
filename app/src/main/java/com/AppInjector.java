package com;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppInjector {

    private final Context context;
    public AppInjector(Context context){
        this.context=context;
    }
    @Provides
    public Context providesContext(){
        return context;
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharePreferences(Context context){
        return context.getSharedPreferences("",0);

    }


}
