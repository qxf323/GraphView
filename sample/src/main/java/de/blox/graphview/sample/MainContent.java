package de.blox.graphview.sample;

import java.util.ArrayList;
import java.util.List;

import de.blox.graphview.sample.Algorithms.BuchheimWalkerActivity;
import de.blox.graphview.sample.Algorithms.FruchtermanReingoldActivity;

public class MainContent {


    public static final List<GraphItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new GraphItem("BuchheimWalker", "Algorithm for drawing tree structures", BuchheimWalkerActivity.class));
        ITEMS.add(new GraphItem("FruchtermanReingold", "Directed graph drawing by simulating attraction/repulsion forces", FruchtermanReingoldActivity.class));
    }

    public static class GraphItem {
        public final String title;
        public final String description;
        public final Class<?> clazz;

        public GraphItem(String title, String description, Class<?> clazz) {
            this.clazz = clazz;
            this.title = title;
            this.description = description;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
