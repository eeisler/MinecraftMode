package com.minemod.crazybelka.item;

import com.minemod.crazybelka.crazybelka;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //поставщик для регистрации объектов
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, crazybelka.MOD_ID);

    //метод регистрации в потоке событий
    public static  void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //добавление предмета
    public static final RegistryObject<Item> CRAZY_BELKA = ITEMS.register("crazy_belka",
            () -> new Item(new Item.Properties()));
}
