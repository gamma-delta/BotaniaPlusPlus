package gammadelta.botaniapp.common.recipe;

import gammadelta.botaniapp.common.lib.BlockNames;
import gammadelta.botaniapp.common.lib.OreDictNames;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.recipe.RecipePetals;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;

public final class ApothecaryRecipes {
    public static RecipePetals spectrolusConcreteRecipe;

    public static void init() {
        spectrolusConcreteRecipe = BotaniaAPI.registerPetalRecipe(ItemBlockSpecialFlower.ofType(BlockNames.F_SPECTROLUS_CONCRETE),
                OreDictNames.PETALS.RED, OreDictNames.PETALS.RED, OreDictNames.PETALS.GREEN, OreDictNames.PETALS.GREEN, OreDictNames.PETALS.BLUE, OreDictNames.PETALS.BLUE,
                OreDictNames.PETALS.GRAY, OreDictNames.PETALS.GRAY, OreDictNames.RUNES.EARTH, OreDictNames.RUNES.WATER, OreDictNames.RUNES.SUMMER, OreDictNames.RUNES.PRIDE, OreDictNames.PIXIE_DUST);


    }
}
