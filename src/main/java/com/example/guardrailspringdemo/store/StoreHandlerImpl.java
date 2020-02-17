package com.example.guardrailspringdemo.store;

import org.springframework.stereotype.Component;
import java.util.concurrent.CompletionStage;

@Component
class StoreHandlerImpl implements StoreHandler {
    public CompletionStage<StoreHandler.GetInventoryResponse> getInventory() {
        return null;
    }

    public CompletionStage<StoreHandler.PlaceOrderResponse> placeOrder(
            final com.example.guardrailspringdemo.definitions.Order body) {
        return null;
    }

    public CompletionStage<StoreHandler.GetOrderByIdResponse> getOrderById(final long orderId) {
        return null;
    }

    public CompletionStage<StoreHandler.DeleteOrderResponse> deleteOrder(final long orderId) {
        return null;
    }
}
