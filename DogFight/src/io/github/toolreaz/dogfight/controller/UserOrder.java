package io.github.toolreaz.dogfight.controller;

public class UserOrder implements IUserOrder {

    private int player;
    private Order order;

    public UserOrder(int player, Order order) {
        this.player = player;
        this.order = order;
    }

    public Order getOrder() {
        return this.order;
    }

    public int getPlayer() {
        return this.player;
    }
}
