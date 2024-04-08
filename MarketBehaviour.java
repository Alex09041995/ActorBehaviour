import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor acto, int marketSize);// метод добавления посетителя в магазин
    void releaseFromMarket(List<Actor> actorList); //метод выхода из магазина, в котором мы передаём списко Акторов (посетителей)

}
