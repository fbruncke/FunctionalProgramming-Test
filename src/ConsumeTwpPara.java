@FunctionalInterface
public interface ConsumeTwpPara<T, E > {

    void accept(T t, E e);

}
