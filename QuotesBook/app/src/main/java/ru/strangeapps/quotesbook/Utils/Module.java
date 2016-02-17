package ru.strangeapps.quotesbook.Utils;

import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Module {
    private String mModuleName;
    private Map<String, String> mCategories = new LinkedHashMap<String, String>();
    private String mCurrentCategoryName;
    private Integer mCurrentIndex;
    private Integer mMinIndex;
    private Integer mMaxIndex;
    List<Quote> mQuotes = new ArrayList<Quote>();

    public Module(String moduleName, Map<String, String> categories) {
        mModuleName = moduleName;
        mCategories = categories;
    }

    public void printCategories() {
        for(Map.Entry<String, String> map : mCategories.entrySet()) {
            Log.d("Module", map.getKey() + " -> " + map.getValue());
        }
    }
}
