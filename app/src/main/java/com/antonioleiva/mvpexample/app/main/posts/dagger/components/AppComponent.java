package com.antonioleiva.mvpexample.app.main.posts.dagger.components;



import com.antonioleiva.mvpexample.app.main.posts.PostDetailActivity;
import com.antonioleiva.mvpexample.app.main.posts.PostsListActivity;
import com.antonioleiva.mvpexample.app.main.posts.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;


@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(PostsListActivity activity);
 }
