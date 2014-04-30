package app.zelper;

import java.util.List;

public interface GenericDAO<T> {

    public List<T> listDAO();

    public T getDAO(T t);

    public void saveDAO(T t);

    public void updateDAO(T t);

    public void deleteDAO(T t);

}