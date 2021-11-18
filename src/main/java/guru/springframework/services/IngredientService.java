package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Créé par dab4926 le 2021-07-11.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
