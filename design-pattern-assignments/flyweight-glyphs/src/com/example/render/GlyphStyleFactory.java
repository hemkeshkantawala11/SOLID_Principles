package com.example.render;

import java.util.HashMap;
import java.util.Map;


public class GlyphStyleFactory {
    private Map<String, GlyphStyle> styles = new HashMap<>();

    public GlyphStyle getStyle(String key) {
        if (!styles.containsKey(key)) {
            String[] parts = key.split("-");
            String font = parts[0];
            int size = Integer.parseInt(parts[1]);
            boolean bold = Boolean.parseBoolean(parts[2]);
            styles.put(key, new GlyphStyle(font, size, bold));
        }
        return styles.get(key);
    }
}
