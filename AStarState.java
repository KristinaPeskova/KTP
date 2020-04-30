import  java.util.Comparator ;
import  java.util.HashMap ;
импорт  java.util.Map ;

/ **
 * Этот класс хранит базовое состояние, необходимое для алгоритма A * для вычисления
* путь по карте. Это состояние включает в себя коллекцию «открытых путевых точек» и
* другая коллекция "закрытых путевых точек". Кроме того, этот класс обеспечивает
 * основные операции, необходимые алгоритму поиска пути A * для его
 * обработка.
* * /
открытый  класс  AStarState {
    / **
     * Это ссылка на карту, по которой движется алгоритм A *.
     * * /
    частная  карта Map2D ;

    приватная  карта < Location , Waypoint > open =  new  HashMap <> ();
    приватная  карта < Location , Waypoint > closed =  new  HashMap <> ();


    / **
     * Инициализируйте новый объект состояния для алгоритма поиска пути A *.
     * * /
    public  AStarState ( карта Map2D  ) {
        if (map ==  null )
            бросить  новое  NullPointerException ( « карта не может быть нулевой » );

        это . карта = карта;
    }

    / **
     * Возвращает карту, по которой перемещается указатель A *.
     * * /
    public  Map2D  getMap () {
        карта возврата ;
    }

    / **
     * Этот метод просматривает все открытые путевые точки и возвращает путевую точку
     * с минимальной общей стоимостью. Если нет открытых путевых точек, этот метод
     * возвращает < code > ноль </ code>.
     * * /
    public  Waypoint  getMinOpenWaypoint () {
        вернись открыто . ценности()
                .поток()
                .min ( Сравнение . Сравнение ( Waypoint :: getTotalCost))
                .orElse ( null );
    }

    / **
     * Этот метод добавляет путевую точку к (или потенциально обновляет путевую точку уже
     * в) коллекция "открытых путевых точек". Если там уже нет открытого
     * путевая точка на месте новой путевой точки, тогда новая путевая точка просто
     * добавлено в коллекцию. Однако, если уже есть путевая точка на
     * местоположение новой путевой точки, новая путевая точка заменяет только старую < em >
     * если </ em> значение "предыдущей стоимости" новой путевой точки меньше текущей
     * значение «предыдущей стоимости» путевой точки.
     * * /
    public  boolean  addOpenWaypoint ( Waypoint  newWP ) {
        if ( ! open . containsKey (newWP . loc) || (open . get (newWP . loc) . getRemainingCost () > newWP . getRemainingCost ())) {
            открыт . положить (newWP . loc, newWP);
            вернуть  истину ;
        }
        вернуть  ложь ;
    }


    / **
     * Возвращает текущее количество открытых путевых точек.
     * * /
    public  int  numOpenWaypoints () {
        вернись открыто . размер();
    }


    / **
     * Этот метод перемещает путевую точку в указанном месте из
     * открыть список к закрытому списку.
     * * /
    public  void  closeWaypoint ( Местоположение  loc ) {
        закрыто . положить (loc, open . get (loc));
        открыт . удалить (LOC);
    }

    / **
     * Возвращает true, если коллекция закрытых путевых точек содержит путевую точку
     * для указанного места.
     * * /
    public  boolean  isLocationClosed ( Location  loc ) {
        возвращение закрыто . ContainsKey (LOC);
    }
}