package calculator;

public interface Calculate {
    Calculate sum(int arg);
    Calculate multi(int arg);
    Calculate min(int arg);
    Calculate del(int arg);
    int getResult();
}
