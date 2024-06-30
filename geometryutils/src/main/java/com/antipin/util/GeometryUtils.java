package com.antipin.util;

import com.antipin.Figure;

public class GeometryUtils {

    public static int compareAreas(Figure f1, Figure f2) {
        return Double.compare(f1.getArea(), f2.getArea());
    }

    public static int comparePerimeters(Figure f1, Figure f2) {
        return Double.compare(f1.getPerimeter(), f2.getPerimeter());
    }
}
