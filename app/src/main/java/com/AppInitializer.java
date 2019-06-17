package com;

import android.app.Application;

public class AppInitializer extends Application {

    private DependencyComponent dependencyComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dependencyComponent=DaggerDependencyComponent
                .builder()
                .appInjector(new AppInjector(getApplicationContext()))
                .build();

    }

    public DependencyComponent getDependencyComponent() {
        return dependencyComponent;
    }
}
