Проект представляет собой примитивнейшую систему бронирования. Тут используются три шаблона проектирования, такие как Singleton, Factory Method, Observer.
Синглтоном является класс, который управляет всеми бронированиями. Это дает нам одну точку входа в программу, делает ее централизированной. Также обьект класса
BookingManager не нудно передавать между другими классами так как обьект всегда используется один и тот же.
Следующий использующийся паттерн - это Fzctory Method. У нас есть несколько типов бронирования - это бронирования отеля, полета и билета в кино.
Мы можем сделать программу более гибкой, так как при добавлении нового типа бронирования, например бронирование столика в ресторане, нам приется только 
изменить фабричный метод и не менять логику в самом приложении, так как в бизнес логике мы не взаимодействуем с логикой создания самих обьектов напрямую, а лишь 
вызываем метод где указываем, что и с какими параметрами мы хотим создать.
Последний паттерн - это Наблюдатель. Он используется, когда у нас есть много сущностей и при изменении одной из них нужно уведомить остальные об изменениях. При этом 
паттерн позволяет сделать это и избежать сильной связанности между данными сущностями. В данном примере всем пользователи уведомляются о новых бронированиях. 
