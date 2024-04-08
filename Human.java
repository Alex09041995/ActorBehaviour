public class Human extends Actor{

    public Human(String name) {
        super(name);
    }
    
    @Override // гарантирует, что сигнатура метода в подклассе совместима с сигнатурой метода в суперклассе. Это означает, что имена методов, типы параметров и типы возвращаемых значений должны совпадать.
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override 
    public String getName() { 
        return super.name; // возвращает имя, мод.cупер, так как находится в абстрактном классе
    }

}
