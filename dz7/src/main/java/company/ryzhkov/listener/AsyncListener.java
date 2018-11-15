package company.ryzhkov.listener;

import company.ryzhkov.event.AsyncEvent;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class AsyncListener {

    @Asynchronous
    public void observe(@Observes final AsyncEvent asyncEvent) {
        System.out.println("Запуск асинхронной задачи");
    }
}
