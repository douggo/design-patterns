package br.com.douggo.builder.useCase.spolleto.after.model.builders;

import br.com.douggo.builder.useCase.spolleto.after.model.Size;

import java.util.List;

public interface MealBuilder {

    void setSize(Size size);

    void setSauce(List<String> sauce);

    void setToppings(List<String> toppings);

    void setCheese(boolean cheese);

    void setPepper(boolean pepper);

}
