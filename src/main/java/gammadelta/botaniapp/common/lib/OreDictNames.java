package gammadelta.botaniapp.common.lib;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public final class OreDictNames {

    public static final String PIXIE_DUST = "elvenPixieDust";

    //Because why fudge around with indices when you can make inner classes?
    public static final class PETALS {
        //Public so everyone can see it. Static because there's only one. Final because it can't be modified later.
        public static final String WHITE   = "petalWhite";
        public static final String ORANGE  = "petalOrange";
        public static final String MAGENTA = "petalMagenta";
        public static final String LBLUE   = "petalLightBlue";
        public static final String YELLOW  = "petalYellow";
        public static final String LIME    = "petalLime";
        public static final String PINK    = "petalPink";
        public static final String GRAY    = "petalGray"; // /gr[ae]y/
        public static final String LGRAY   = "petalLightGray";
        public static final String CYAN    = "petalCyan";
        public static final String PURPLE  = "petalPurple";
        public static final String BLUE    = "petalBlue";
        public static final String BROWN   = "petalBrown";
        public static final String GREEN   = "petalGreen";
        public static final String RED     = "petalRed";
        public static final String BLACK   = "petalBlack";
    }

    public static final class RUNES {
        public static final String WATER = "runeWaterB"; //Long ago, four nations ruled the earth
        public static final String FIRE = "runeFireB"; // Water, earth, fire, and air
        public static final String EARTH = "runeEarthB"; // Then the fire nation attacked!
        public static final String AIR = "runeAirB"; // 'n B

        public static final String SPRING = "runeSpringB";
        public static final String SUMMER = "runeSummerB";
        public static final String FALL = "runeAutumnB";
        public static final String WINTER = "runeWinterB";

        public static final String MANA = "runeManaB";

        public static final String LUST = "runeLustB"; // Mustang... killed... LUST
        public static final String GLUTTONY = "runeGluttonyB";
        public static final String GREED = "runeGreedB";
        public static final String SLOTH = "runeSlothB";
        public static final String WRATH = "runeWrathB";
        public static final String ENVY = "runeEnvyB"; //and not just the envy, but the womenvy and childrenvy too
        public static final String PRIDE = "runePrideB";
    }
}
