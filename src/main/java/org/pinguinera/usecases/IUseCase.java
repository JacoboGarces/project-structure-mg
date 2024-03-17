package org.pinguinera.usecases;

public interface IUseCase<T> {
    T execute(T value);
    void adapt();
}
