import java.util.List;

public class Order implements MarketBehaviour, QueueBehaviour{

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void takeInQueue(Actor actor) {
        throw new UnsupportedOperationException("Unimplemented method 'takeInQueue'");
    }

    @Override
    public Order takeOrder() {
        throw new UnsupportedOperationException("Unimplemented method 'takeOrder'");
    }

    @Override
    public void giveOrder() {
        throw new UnsupportedOperationException("Unimplemented method 'giveOrder'");
    }

    @Override
    public void releaseFromQueue() {
        throw new UnsupportedOperationException("Unimplemented method 'releaseFromQueue'");
    }

    @Override
    public void acceptToMarket(Actor acto, int marketSize) {
        throw new UnsupportedOperationException("Unimplemented method 'acceptToMarket'");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        throw new UnsupportedOperationException("Unimplemented method 'releaseFromMarket'");
    }
    
}
