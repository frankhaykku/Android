package ru.strangeapps.quotesbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import ru.strangeapps.quotesbook.Utils.Module;

public class MainActivity extends AppCompatActivity {

    private Module mBashIm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, String> categories = new LinkedHashMap<String, String>();
        categories.put("Новые", "http://bash.im/");
        categories.put("Случайные", "http://bash.im/random");
        categories.put("Лучшие", "http://bash.im/best");
        categories.put("По рейтингу", "http://bash.im/byrating");
        categories.put("Бездна", "http://bash.im/abyss");
        categories.put("Топ Бездны", "http://bash.im/abysstop");
        categories.put("Лучшее Бездны", "http://bash.im/abyssbest");
        mBashIm = new Module("bash.im — Цитатник Рунета", categories);

        mBashIm.printCategories();
    }
}
