import java.text.Normalizer.Form;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;


public class Market implements MarketBehaviour, QueueBehaviour{

    private static final String FromQueue = null;
    private List<Actor> queue; // хранит список акторов
    private List<Actor> market;

    @Override
    public void takeInQueue(Actor actor) { // добавляем покупателя в очередь
        queue.add(actor); 
    }

    @Override
    public Order takeOrder() {
        if (!queue.isEmpty()) {
            // Берем первого покупателя в очереди
            Actor actor = queue.remove(0);
            // Делаем заказ
            // ...
        }
        return null;
    }

    @Override
    public void giveOrder() {
        if (!queue.isEmpty()) { // проверяем пустая ли очередь и берем первого покупателя из очереди
            Actor actor = queue.remove(0);
            actor.isMakeOrder(); // Принимаем и делаем заказ
            actor.isTakeOrder(); // Отдаем готовый заказ покупателю
        }
    }

    @Override
    public void releaseFromQueue() {
        queue.clear();
        System.out.println("Очередь пуста: " + FromQueue);
    }

    @Override
    public void acceptToMarket(Actor actor, int marketSize) {
        if (market.size() < marketSize); // проверяем есть ли покупатель и его место в очереди
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) { // Проверяем список покупателей - пустой или нет 
        if (!actorList.isEmpty()) { // и удаляем покупателей
        }  
    }

    private boolean hasOrder() {
        throw new UnsupportedOperationException("Unimplemented method 'hasOrder'");
    }

    @Override
    public void Update() { // Обработка заказов
        if (hasOrder()) {
        Order order = takeOrder();  
        System.out.println("Обработан заказ: " + order.toString());
        } else 
        {
        System.out.println("Заказов для обработки нет!");
        }
    }
}