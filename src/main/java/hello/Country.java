/*

package hello;

import java.util.TreeSet;


 * Created by Administrator on 2017-03-28.

public class Country {

    countries = new Country[37];
    countries[1] = new Country("Columbia");
    countries[2] = new Country("Russian America");
    countries[3] = new Country("Northwest Territories");
    countries[4] = new Country("Alberta");
    countries[5] = new Country("Nunavut");
    countries[6] = new Country("Quebec");
    countries[7] = new Country("Ontario");
    countries[8] = new Country("Eastern USA");
    countries[9] = new Country("Central USA");
    countries[10] = new Country("Western USA");
    countries[11] = new Country("Southern USA");
    countries[12] = new Country("Mexico");
    countries[13] = new Country("Cuba");
    countries[14] = new Country("Jamaica");
    countries[15] = new Country("Haiti");
    countries[16] = new Country("Puerto Rico");
    countries[17] = new Country("Guatemala");
    countries[18] = new Country("Belize");
    countries[19] = new Country("El Salavador");
    countries[20] = new Country("Honduras");
    countries[21] = new Country("Nicaragua");
    countries[22] = new Country("Costa Rica");
    countries[23] = new Country("Granada");
    countries[24] = new Country("Venezuela");
    countries[25] = new Country("Guiana");
    countries[26] = new Country("Brazil");
    countries[27] = new Country("Ecuador");
    countries[28] = new Country("Peru");
    countries[29] = new Country("Bolivia");
    countries[30] = new Country("Paraguay");
    countries[31] = new Country("Chile");
    countries[32] = new Country("Argentine Republic");
    countries[33] = new Country("Uruguay");
    countries[34] = new Country("Patagonia");
    countries[35] = new Country("Tierra del Fuego");
    countries[36] = new Country("Falkland Isles");
    countries[202] = new Country("Hawaii");


    countries[1].adjacentCountries = new TreeSet<Country>();
    countries[1].adjacentCountries.add(countries[10]);
    countries[1].adjacentCountries.add(countries[4]);
    countries[1].adjacentCountries.add(countries[3]);

    countries[2].adjacentCountries = new TreeSet<Country>();
    countries[2].adjacentCountries.add(countries[1]);

    countries[3].adjacentCountries = new TreeSet<Country>();
    countries[3].adjacentCountries.add(countries[1]);
    countries[3].adjacentCountries.add(countries[4]);
    countries[3].adjacentCountries.add(countries[5]);

    countries[4].adjacentCountries = new TreeSet<Country>();
    countries[4].adjacentCountries.add(countries[1]);
    countries[4].adjacentCountries.add(countries[10]);
    countries[4].adjacentCountries.add(countries[9]);
    countries[4].adjacentCountries.add(countries[7]);
    countries[4].adjacentCountries.add(countries[5]);
    countries[4].adjacentCountries.add(countries[3]);

    countries[5].adjacentCountries = new TreeSet<Country>();
    countries[5].adjacentCountries.add(countries[3]);
    countries[5].adjacentCountries.add(countries[4]);
    countries[5].adjacentCountries.add(countries[7]);

    countries[6].adjacentCountries = new TreeSet<Country>();
    countries[6].adjacentCountries.add(countries[7]);
    countries[6].adjacentCountries.add(countries[8]);

    countries[7].adjacentCountries = new TreeSet<Country>();
    countries[7].adjacentCountries.add(countries[4]);
    countries[7].adjacentCountries.add(countries[5]);
    countries[7].adjacentCountries.add(countries[6]);
    countries[7].adjacentCountries.add(countries[8]);
    countries[7].adjacentCountries.add(countries[9]);

    countries[8].adjacentCountries = new TreeSet<Country>();
    countries[8].adjacentCountries.add(countries[6]);
    countries[8].adjacentCountries.add(countries[7]);
    countries[8].adjacentCountries.add(countries[9]);
    countries[8].adjacentCountries.add(countries[11]);

    countries[9].adjacentCountries = new TreeSet<Country>();
    countries[9].adjacentCountries.add(countries[10]);
    countries[9].adjacentCountries.add(countries[4]);
    countries[9].adjacentCountries.add(countries[7]);
    countries[9].adjacentCountries.add(countries[8]);
    countries[9].adjacentCountries.add(countries[11]);

    countries[10].adjacentCountries = new TreeSet<Country>();
    countries[10].adjacentCountries.add(countries[1]);
    countries[10].adjacentCountries.add(countries[4]);
    countries[10].adjacentCountries.add(countries[9]);
    countries[10].adjacentCountries.add(countries[11]);
    countries[10].adjacentCountries.add(countries[12]);

    countries[11].adjacentCountries = new TreeSet<Country>();
    countries[11].adjacentCountries.add(countries[8]);
    countries[11].adjacentCountries.add(countries[9]);
    countries[11].adjacentCountries.add(countries[10]);
    countries[11].adjacentCountries.add(countries[12]);

    countries[12].adjacentCountries = new TreeSet<Country>();
    countries[12].adjacentCountries.add(countries[10]);
    countries[12].adjacentCountries.add(countries[11]);
    countries[12].adjacentCountries.add(countries[17]);
    countries[12].adjacentCountries.add(countries[18]);

    countries[13].adjacentCountries = new TreeSet<Country>();

    countries[14].adjacentCountries = new TreeSet<Country>();

    countries[15].adjacentCountries = new TreeSet<Country>();

    countries[16].adjacentCountries = new TreeSet<Country>();

    countries[17].adjacentCountries = new TreeSet<Country>();
    countries[17].adjacentCountries.add(countries[12]);
    countries[17].adjacentCountries.add(countries[18]);
    countries[17].adjacentCountries.add(countries[20]);
    countries[17].adjacentCountries.add(countries[19]);

    countries[18].adjacentCountries = new TreeSet<Country>();
    countries[18].adjacentCountries.add(countries[12]);
    countries[18].adjacentCountries.add(countries[17]);

    countries[19].adjacentCountries = new TreeSet<Country>();
    countries[19].adjacentCountries.add(countries[17]);
    countries[19].adjacentCountries.add(countries[20]);

    countries[20].adjacentCountries = new TreeSet<Country>();
    countries[20].adjacentCountries.add(countries[17]);
    countries[20].adjacentCountries.add(countries[19]);
    countries[20].adjacentCountries.add(countries[21]);

    countries[21].adjacentCountries = new TreeSet<Country>();
    countries[21].adjacentCountries.add(countries[20]);
    countries[21].adjacentCountries.add(countries[22]);

    countries[22].adjacentCountries = new TreeSet<Country>();
    countries[22].adjacentCountries.add(countries[21]);
    countries[22].adjacentCountries.add(countries[23]);

    countries[23].adjacentCountries = new TreeSet<Country>();
    countries[23].adjacentCountries.add(countries[22]);
    countries[23].adjacentCountries.add(countries[24]);
    countries[23].adjacentCountries.add(countries[26]);
    countries[23].adjacentCountries.add(countries[27]);

    countries[24].adjacentCountries = new TreeSet<Country>();
    countries[24].adjacentCountries.add(countries[23]);
    countries[24].adjacentCountries.add(countries[25]);
    countries[24].adjacentCountries.add(countries[26]);

    countries[25].adjacentCountries = new TreeSet<Country>();
    countries[25].adjacentCountries.add(countries[24]);
    countries[25].adjacentCountries.add(countries[26]);

    countries[26].adjacentCountries = new TreeSet<Country>();
    countries[26].adjacentCountries.add(countries[23]);
    countries[26].adjacentCountries.add(countries[24]);
    countries[26].adjacentCountries.add(countries[25]);
    countries[26].adjacentCountries.add(countries[27]);
    countries[26].adjacentCountries.add(countries[28]);
    countries[26].adjacentCountries.add(countries[29]);
    countries[26].adjacentCountries.add(countries[30]);
    countries[26].adjacentCountries.add(countries[32]);
    countries[26].adjacentCountries.add(countries[33]);

    countries[27].adjacentCountries = new TreeSet<Country>();
    countries[27].adjacentCountries.add(countries[28]);
    countries[27].adjacentCountries.add(countries[26]);
    countries[27].adjacentCountries.add(countries[23]);

    countries[28].adjacentCountries = new TreeSet<Country>();
    countries[28].adjacentCountries.add(countries[27]);
    countries[28].adjacentCountries.add(countries[26]);
    countries[28].adjacentCountries.add(countries[29]);

    countries[29].adjacentCountries = new TreeSet<Country>();
    countries[29].adjacentCountries.add(countries[28]);
    countries[29].adjacentCountries.add(countries[26]);
    countries[29].adjacentCountries.add(countries[30]);
    countries[29].adjacentCountries.add(countries[32]);
    countries[29].adjacentCountries.add(countries[31]);

    countries[30].adjacentCountries = new TreeSet<Country>();
    countries[30].adjacentCountries.add(countries[26]);
    countries[30].adjacentCountries.add(countries[29]);
    countries[30].adjacentCountries.add(countries[32]);

    countries[31].adjacentCountries = new TreeSet<Country>();
    countries[31].adjacentCountries.add(countries[29]);
    countries[31].adjacentCountries.add(countries[32]);
    countries[31].adjacentCountries.add(countries[34]);

    countries[32].adjacentCountries = new TreeSet<Country>();
    countries[32].adjacentCountries.add(countries[31]);
    countries[32].adjacentCountries.add(countries[29]);
    countries[32].adjacentCountries.add(countries[30]);
    countries[32].adjacentCountries.add(countries[26]);
    countries[32].adjacentCountries.add(countries[33]);
    countries[32].adjacentCountries.add(countries[34]);

    countries[33].adjacentCountries = new TreeSet<Country>();
    countries[33].adjacentCountries.add(countries[26]);
    countries[33].adjacentCountries.add(countries[32]);

    countries[34].adjacentCountries = new TreeSet<Country>();
    countries[34].adjacentCountries.add(countries[32]);
    countries[34].adjacentCountries.add(countries[31]);
    countries[34].adjacentCountries.add(countries[35]);

    countries[35].adjacentCountries = new TreeSet<Country>();
    countries[35].adjacentCountries.add(countries[34]);

    countries[36].adjacentCountries = new TreeSet<Country>();

    countries[202].adjacentCountries = new TreeSet<Country>();

}
*/