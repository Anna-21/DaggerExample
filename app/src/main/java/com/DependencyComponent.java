package com;

import android.support.constraint.Placeholder;

import com.example.tae.daggerexample.MainActivity;
import com.example.tae.daggerexample.secondactivity;

import javax.inject.Singleton;

import dagger.Component;


    @Singleton
    @Component(modules = {AppInjector.class})
    public interface DependencyComponent{

        void inject (MainActivity mainActivity);

        void inject(secondactivity secondactivity);
    }


