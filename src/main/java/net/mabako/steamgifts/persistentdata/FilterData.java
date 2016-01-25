package net.mabako.steamgifts.persistentdata;

import java.io.Serializable;

/**
 * Giveaway filters.
 */
public class FilterData implements Serializable {
    private static final long serialVersionUID = 924136599147980741L;
    private static FilterData current = new FilterData();

    private int minEntries = -1, maxEntries = -1, minPoints = -1, maxPoints = -1, minLevel = -1, maxLevel = -1;
    private boolean hideEntered;

    public static FilterData getCurrent() {
        return current;
    }

    public static void clear() {
        current = new FilterData();
    }

    public int getMaxEntries() {
        return maxEntries;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public int getMinEntries() {
        return minEntries;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMinPoints() {
        return minPoints;
    }

    public void setMaxEntries(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public void setMinEntries(int minEntries) {
        this.minEntries = minEntries;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }

    public boolean isHideEntered() {
        return hideEntered;
    }

    public void setHideEntered(boolean hideEntered) {
        this.hideEntered = hideEntered;
    }

    public boolean isAnyActive() {
        return minEntries > -1 || maxEntries > -1 || minPoints > -1 || maxPoints > -1 || minLevel > -1 || maxLevel > -1 || hideEntered;
    }
}
