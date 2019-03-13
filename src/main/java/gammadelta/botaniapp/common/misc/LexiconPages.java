package gammadelta.botaniapp.common.misc;

import gammadelta.botaniapp.common.lib.BlockNames;
import gammadelta.botaniapp.common.recipe.ApothecaryRecipes;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.recipe.RecipePetals;
import vazkii.botania.common.lexicon.AlfheimLexiconEntry;
import vazkii.botania.common.lexicon.BasicLexiconEntry;
import vazkii.botania.common.lexicon.page.PagePetalRecipe;
import vazkii.botania.common.lexicon.page.PageText;

public class LexiconPages {
    public static LexiconEntry concreteSpectrolus;

    public static void init() {
        concreteSpectrolus = new AlfheimLexiconEntry(BlockNames.F_SPECTROLUS_CONCRETE, BotaniaAPI.categoryGenerationFlowers);
        concreteSpectrolus.setLexiconPages(new PageText("0"), new PageText("1"),
                new PagePetalRecipe<>("2", ApothecaryRecipes.spectrolusConcreteRecipe));
    }
}
