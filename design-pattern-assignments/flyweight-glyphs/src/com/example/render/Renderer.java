package com.example.render;

public class Renderer {
    private final GlyphStyleFactory styleFactory = new GlyphStyleFactory();

    public int render(String text) {
        int cost = 0;
        for (char c : text.toCharArray()) {
            GlyphStyle style = styleFactory.getStyle("Inter-14-" + (c % 7 == 0));
            Glyph g = new Glyph(c, style);
            cost += g.drawCost();
        }
        return cost;
    }
}
