public enum SWSet {
        PREMIERE("Premiere"), 
        A_NEW_HOPE("A New Hope"),
        HOTH("Hoth"),
        DAGOBAH("Dagobah"),
        CLOUD_CITY("Cloud City"),
        JABBAS_PALACE("Jabba's Palace"),
        SPECIAL_EDITION("Special Edition"),
        ENDOR("Endor"),
        DEATH_STAR_II("Death Star II"),
        TATOOINE("Tatooine"),
        CORUSCANT("Coruscant"),
        THEED_PALACE("Theed Palace"),
        REFLECTIONS_I("Reflections I"),
        REFLECTIONS_II("Reflections II"),
        REFLECTIONS_III("Reflections III"),
        PREMIUM("Premium"),
        STARTER_BOX_1("Premiere Introductory Two-Player Game"),
        STARTER_BOX_2("The Empire Strikes Back Introductory Two-Player Game"),
        THIRD_ANTHOLOGY("Third Anthology"),
        ENHANCEDPREM("Enhanced Premiere"),
        ENHANCEDCC("Enhanced Cloud City"),
        ENHANCEDJP("Enhanced Jabba's Palace"),
        JEDI_PACK("Jedi Pack"),
        PROMO("Promo"),
        SEALEDJP("Jabba's Palace Sealed Deck"),
        SEALEDPREM("Tournament Sealed Deck");



        private String setString;

        private SWSet(String setString){
        	this.setString = setString;
        }

        public String toString(){
        	return this.setString;
        }
    }