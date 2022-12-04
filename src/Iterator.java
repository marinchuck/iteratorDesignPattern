//Készíts egy interfészt, legyen a neve Iterator.
public interface Iterator {

    //Iterator interfészben csinálj egy metódus, hasNext ami nem kap semmilyen paramétert és a visszatérési érték boolean logikai. Ennek az implementálása fogja megvalósítani, hogy van-e még olyan eleme a tárolónak amit még nem láttunk.
    boolean hasNext();

    //Iterator interfészben csinálj egy metódus, next ami nem kap semmilyen paramétert és a visszatérési érték Object objekt. Ennek az implementálása fogja megvalósítani, hogy lekérdezzük azt az elemét a tárolónak amit még nem láttunk.
    Object next();

}
