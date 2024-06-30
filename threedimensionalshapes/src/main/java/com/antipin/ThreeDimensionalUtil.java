package com.antipin;

public class ThreeDimensionalUtil {

    public static int compareVolumes(ThreeDimensionalFigure f1, ThreeDimensionalFigure f2) {
        return Double.compare(f1.getVolume(), f2.getVolume());
    }

    public static int compareSurfaceAreas(ThreeDimensionalFigure f1, ThreeDimensionalFigure f2) {
        return Double.compare(f1.getSurfaceArea(), f2.getSurfaceArea());
    }
}
