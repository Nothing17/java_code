package oop_day4.interfacedemo1;

public interface Comparable {
    /**
     *
     * @param obj
     * @return
     * =0 相等
     * >0 正树
     * <0 负数
     */
    public int compareTo(Object obj);
}
