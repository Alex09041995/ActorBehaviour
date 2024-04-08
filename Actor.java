public abstract class Actor implements ActorBehaviour{  // Сам класс делаем абстрактным, так как будем реализовывать его наследника, и абстрактный класс Actor реализует интерфейс ActorBehaviour (implements). Это означает, что все подклассы Actor должны реализовывать все методы, объявленные в интерфейсе ActorBehaviour. 
    protected boolean isTakeOrder; // показывает принят заказ или нет 
    protected boolean isMakeOrder; // показывает создан заказ или нет
    protected final String name;

    public Actor(String name) { // метод принимает имя в качесвте аргумента и присваивает переменной
        this.name = name;
    }

    public abstract String getName(); //
}
