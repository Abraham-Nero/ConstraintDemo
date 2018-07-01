package com.nero.constraintdemo;

import android.util.SparseArray;

import java.util.HashMap;
import java.util.Map;

public class IdUtils {
    private SparseArray<String> map;

    private IdUtils(){
        map = new SparseArray<>();
        map.put(R.id.container, "container");
        map.put(R.id.imageview_singapore, "imageview_singapore");
        map.put(R.id.favorite, "favorite");
        map.put(R.id.title, "title");
        map.put(R.id.camera_area, "camera_area");
        map.put(R.id.cameraLabel, "cameraLabel");
        map.put(R.id.cameraType, "cameraType");
        map.put(R.id.setings_area, "setings_area");
        map.put(R.id.settingsLabel, "settingsLabel");
        map.put(R.id.settings, "settings");
        map.put(R.id.description, "description");
        map.put(R.id.upload, "upload");
        map.put(R.id.discard, "discard");
        map.put(R.id.header, "header");
        map.put(R.id.relative_1, "relative_0");
        map.put(R.id.relative_1, "relative_1");
        map.put(R.id.relative_2, "relative_2");
        map.put(R.id.relative_3, "relative_3");
    }

    private static class SingletonHolder {
        private static final IdUtils INSTANCE = new IdUtils();
    }



    public static IdUtils getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public String id2str(int id){
        return map.get(id, "UNKNOWN");
    }

}
