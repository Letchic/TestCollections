# TestCollections

Как видно из теста, LinkedList быстрее, чем ArrayList,  добавляет элементы в начало списка и в середину списка, чем больше элементов тем существеннее разница в скорости. При этом добавление элементов в конец списка занимает одинаковое время. Удаление из середины списка быстрее осуществляется в ArrayList, при этом удаление из начала списка LinkedList осуществляет быстрее и за постоянное время. ArrayList реализован как массив с изменяемым размером. При добавлении элементов в ArrayList, его размер динамически увеличивается. К его элементам можно получить доступ напрямую, используя get и set методы, так как ArrayList по сути является массивом. LinkedList реализован в виде связанного списка. Поэтому его производительность при добавлении и удалении должна быть лучше, чем у ArrayList, но хуже в методах get и set. 


По результатам теста, при добавлении элементов HashSet дает лучшую производительность, чем LinkedHashSet и TreeSet. Производительность LinkedHashSet близка к HashSet. А на удалении элементов LinkedHashSet показывает лучший результат. HashSet реализован с использованием хеш-таблицы. Элементы не упорядочены. Add, remove и contains  методы имеет постоянную сложность по времени O (1). TreeSet реализован с использованием древовидной структуры (красно-черное дерево). Элементы в наборе отсортированы, но методы add, remove и contains методы имеют временную сложность: O (log (n)). TreeSet предлагает несколько методов для работы с набором упорядоченных элементов, например first (), last (), headSet (), tailSet () и т. д. LinkedHashSet находится между HashSet и TreeSet. Он реализован в виде хеш-таблицы со связанным списком, поэтому он обеспечивает порядок вставки. Временная сложность основных методов O (1).


Представлены следующие реалицации интерфейса Map: HashMap, TreeMap и LinkedHashMap.  
HashMap реализована в виде хеш-таблицы, и не упорядочена по ключам или значениям.
TreeMap реализована на основе красно-черного дерева и упорядочена по ключу.
LinkedHashMap сохраняет порядок вставки.
Исходя из результатов теста HashMap имеет самую высокую производительностью при добавлении элементов. 
При удалении и получении элементов самую высокую скорость показала LinkedHashMap.  

-------------------------- 
![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/List_1.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/List_2.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/List_3.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/List_4.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/List_5.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/List_6.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/List_7.png)

-------------------------- 

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/Set_1.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/Set_2.png)

-------------------------- 

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/Map_1.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/Map_2.png)

![Image](https://github.com/Letchic/TestCollections/blob/master/datafiles/graphics/Map_3.png)

