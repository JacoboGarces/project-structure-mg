package org.pinguinera.menus.assistant;

import org.pinguinera.menus.book.BookMenu;
import org.pinguinera.usecases.IUseCase;
import org.pinguinera.usecases.book.CreateBookUseCase;
import org.pinguinera.usecases.book.UpdateBookUseCase;

import java.util.HashMap;
import java.util.Map;

public class MenuAssistant {
    public void showAssistantsMenu () {
        BookMenu bookMenu = new BookMenu();
        Map<Integer, IUseCase> useCases = new HashMap<>();
        useCases.put(1,  new CreateBookUseCase());
        useCases.put(2,  new UpdateBookUseCase());

        Integer option = bookMenu.showBooksMenu();

        useCases.get(option).adapt();
    }
}
