package dao;

import java.util.ArrayList;

public interface DAO_Interface<T> {
    public int add(T t);
    public int update(T t);
    public int remove(T t);
    public ArrayList<T> selectAll();
    public T SelectById(T t);
    public ArrayList<T> selectByCondition(String condition);
}
