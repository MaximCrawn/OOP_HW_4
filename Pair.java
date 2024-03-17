package hw_4;

class Pair<T, U > {
    T first;
    U second;

    // Конструктор класса Pair, принимающий два объекта совместимых типов.
    Pair(T a, U b) {
        first = a;
        second = b;
    }

    // Методы для получения первого и второго объектов.
    T getFirst() {
        return first;
    }

    U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

}
