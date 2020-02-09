public interface Validator<T> {
    boolean validate(T o) throws Exception ;
}
