public interface ActorBehaviour {

    void setMakeOrder(boolean makeOrder);  //setMakeOrder устанавливает значение логического поля makeOrder класса. Поле makeOrder определяет, должен ли исполняться заказ.
    void setTakeOrder(boolean takeOrder); // указывает забрал посетитель заказ или нет
    boolean isMakeOrder(); // возвращает значения - создан заказ или нет
    boolean isTakeOrder(); // возвращает значения - забрал посетитель заказ или нет
}