public interface QueueBehaviour {

    void takeInQueue(Actor actor); // метод - забарть из очереди, в котормо мы пеердаёт Актора
    Order takeOrder(); // забрать заказ
    void giveOrder(); // отдать заказ
    void releaseFromQueue(); // выйти из очередь
}
