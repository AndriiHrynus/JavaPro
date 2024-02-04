package com.example.di;
import com.example.service.OrderRepository;
import com.example.service.OrderRepositoryI;
import jakarta.inject.Singleton;
import jakarta.ws.rs.ext.Provider;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
@Provider
public class CustomDependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(OrderRepository.class)
                .to(OrderRepositoryI.class)
                .in(Singleton.class);
    }
}
